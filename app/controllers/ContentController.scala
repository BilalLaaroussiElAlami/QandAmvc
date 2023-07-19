package controllers

import akka.actor.typed.PostStop
import models.Content.{Answer, AnswerDao, Post, PostDao}
import play.api.data.{Form, Mapping}
import play.api.data.Forms.{default, list, longNumber, mapping, nonEmptyText, number, tuple}
import play.api.i18n.MessagesProvider
import play.api.mvc.{AbstractController, Action, AnyContent, ControllerComponents, Flash, Request}

import javax.inject.{Inject, Singleton}
import play.api.data.Form
import play.api.data.Forms._

@Singleton
class ContentController  @Inject()(cc: ControllerComponents, postDao: PostDao, answerDao: AnswerDao) extends AbstractController(cc) with play.api.i18n.I18nSupport {

  def upvote(id:Int): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    postDao.upvote(id)
    Ok(views.html.indexSTOF("POSTS", postDao.posts))
  }
  def downvote(id:Int): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    postDao.downvote(id)
    Ok(views.html.indexSTOF("POSTS", postDao.posts))
  }
  def upvoteAnswer(id:Int) =  {
    println(s"called upvoteAnswer with id $id")
    answerDao.upvote(id)
    postWithAnswers(answerDao.findById(id).post)
  }
  def downvoteAnswer(id:Int) = {
    answerDao.downvote(id)
    postWithAnswers(answerDao.findById(id).post)
  }

  def sortByDate(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    println("called sortbydate")
    Ok(views.html.indexSTOF("POSTS", postDao.sortPostsByDate()))
  }
  def searchByTag(tag:String): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    println("called search by tag")
    val posts = postDao.searchByTag(tag)
    Ok(views.html.indexSTOF("POSTS", posts))
  }
  def sortByVotes(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    println("called sortbyvotes")
    Ok(views.html.indexSTOF("POSTS", postDao.sortPostsByUpvotes()))
  }


  private val postForm: Form[Post] =
    Form(
      mapping(
        "title" -> nonEmptyText,
        "text" -> nonEmptyText,
        "code" -> nonEmptyText,
        "date" -> default(number, 2023),
        "votes" -> default(number,0),
        "tags" ->  nonEmptyText.transform(f,g).verifying("maximum 3 tags", l => l.length < 4)
      )
      (Post.apply)(Post.unapply))
  def f(s:String):List[String] = s.split(",").toList
  def g(l:List[String]):String = l.mkString(",")
  def newPost(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    println("called newProduct")
    val form =
      if (request.flash.get("error").isDefined)
        postForm.bind(request.flash.data)  //if previous submission has errors we don't clear all fields -> more user friendly
      else
        postForm
    Ok(views.html.addPostSTOF(form))
  }
  def savePost() = Action { implicit request =>
    print("called save")
    val newPostForm = postForm.bindFromRequest()

    newPostForm.fold(
      hasErrors = { form =>
        Redirect(routes.ContentController.newPost()).flashing(
          Flash(form.data) +
            ("error" -> "Please correct the errors in the form.")
        )
      },
      success = { newPost =>
         print("newProduct: ",newPost)
        postDao.add(newPost)
        Ok(views.html.indexSTOF("POSTS", postDao.posts))  //redirect to posts page
      }
    )
  }

  def postWithAnswers(postid:Int): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    val post = postDao.findbyId(postid)
    val answerIDs = post.answers
    val answers = answerIDs.map(id => answerDao.findById(id))
    Ok(views.html.postWithAnswers("", post, answers))
  }

  private val answerForm: Form[Answer] =
    Form(
      mapping(
        "text" -> nonEmptyText,
        "code" -> nonEmptyText,
        "date" -> default(number, 2023),
        "votes"-> default(number,0),
        "post" -> default(number,0)
      )
      (Answer.apply)(Answer.unapply))

  def newAnswer(postid:Int): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    println("called new answer")
    val form =
      if (request.flash.get("error").isDefined)
        answerForm.bind(request.flash.data)  //if previous submission has errors we don't clear all fields -> more user friendly
      else
        answerForm
    Ok(views.html.addAnswerSTOF(form,  postid))
  }
  def saveAnswer(postId: Int) = Action { implicit request =>
    print(s"called save answer with postid $postId")
    val newAnswerForm = answerForm.bindFromRequest()

    newAnswerForm.fold(
      hasErrors = { form =>
        Redirect(routes.ContentController.newAnswer(postId)).flashing(
          Flash(form.data) +
            ("error" -> "Please correct the errors in the form.")
        )
      },
      success = { newAnswer =>
        print("succesfull form ",newAnswer)
        answerDao.add(newAnswer)
        postDao.addAnswer(postId, newAnswer.id)
        val post = postDao.findbyId(postId)
        val answerIDs = post.answers
        val answers = answerIDs.map(id => answerDao.findById(id))
        Ok(views.html.postWithAnswers("", post, answers))
      }
    )
  }

}

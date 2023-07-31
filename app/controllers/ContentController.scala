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
  def upvotePostFromPostWithAnswerPage(id:Int) = {
    postDao.upvote(id)
    postWithAnswers(id)
  }
  def downvotePostFromPostWithAnswerPage(id:Int) = {
    postDao.downvote(id)
    postWithAnswers(id)
  }

  def upvoteAnswer(id:Int) =  {
    answerDao.upvote(id)
    val postId = answerDao.findById(id).post
    postWithAnswers(postId)
  }
  def downvoteAnswer(id:Int) = {
    answerDao.downvote(id)
    postWithAnswers(answerDao.findById(id).post)
  }

  def sortByDate(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.indexSTOF("POSTS", postDao.sortPostsByDate()))
  }
  def searchByTag(tag:String): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    val posts = postDao.searchByTag(tag)
    Ok(views.html.indexSTOF("POSTS", posts))
  }
  def sortByVotes(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
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
    val form =
      if (request.flash.get("error").isDefined)
        postForm.bind(request.flash.data)  //if previous submission has errors we don't clear all fields -> more user friendly
      else
        postForm
    Ok(views.html.addPostSTOF(form))
  }
  def savePost() = Action { implicit request =>
    val newPostForm = postForm.bindFromRequest()

    newPostForm.fold(
      hasErrors = { form =>
        Redirect(routes.ContentController.newPost()).flashing(
          Flash(form.data) +
            ("error" -> "Please correct the errors in the form.")
        )
      },
      success = { newPost =>
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
        "post" -> default(number,0)  //postid is temporary 0, but this will be changed once whe add the answer object to the answerdai
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
        newAnswer.post = postId
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

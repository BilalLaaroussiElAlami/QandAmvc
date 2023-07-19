package controllers

import models.{PostDaoSTOF, PostSTOF}
import play.api.data.{Form, Mapping}
import play.api.data.Forms.{default, list, longNumber, mapping, nonEmptyText, number, tuple}
import play.api.i18n.MessagesProvider
import play.api.mvc.{AbstractController, Action, AnyContent, ControllerComponents, Flash, Request}

import javax.inject.{Inject, Singleton}

@Singleton
class PostControllerSTOF  @Inject()(cc: ControllerComponents, postDao: PostDaoSTOF) extends AbstractController(cc) with play.api.i18n.I18nSupport {

  def upvote(id:Int): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    println("called upvote")
    postDao.upvote(id)
    Ok(views.html.indexSTOF("POSTS", postDao.posts))
  }
  def downvote(id:Int): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    println("called downvote")
    postDao.downvote(id)
    Ok(views.html.indexSTOF("POSTS", postDao.posts))
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

  import play.api.data.Form
  import play.api.data.Forms._

      //TODO verify user input
    private val postForm: Form[PostSTOF] =
      Form(
        mapping(
          "title" -> nonEmptyText,
          "text" -> nonEmptyText,
          "code" -> nonEmptyText,
          "date" -> default(number, 2023),
          "votes" -> default(number,0),
          "tags" ->  nonEmptyText.transform(f,g).verifying("maximum 3 tags", l => l.length < 4)
        )
        (PostSTOF.apply)(PostSTOF.unapply)
      )

  def f(s:String):List[String] = s.split(",").toList
  def g(l:List[String]):String = l.mkString(",")


  def newProduct(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    println("called newProduct")
    val form =
      if (request.flash.get("error").isDefined)
        postForm.bind(request.flash.data)  //if previous submission has errors we don't clear all fields -> more user friendly
      else
        postForm
    Ok(views.html.addPostSTOF(form))
  }


  def save() = Action { implicit request =>
    print("called save")
    val newProductForm = postForm.bindFromRequest()

    newProductForm.fold(
      hasErrors = { form =>
        Redirect(routes.PostControllerSTOF.newProduct()).flashing(
          Flash(form.data) +
            ("error" -> "Please correct the errors in the form.")
        )
      },
      success = { newProduct =>
         print("newProduct: ",newProduct)
        postDao.add(newProduct)
        Ok(views.html.indexSTOF("POSTS", postDao.posts))  //redirect to posts page
      }
    )
  }



}

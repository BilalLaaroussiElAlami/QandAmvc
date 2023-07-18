package controllers

import models.{PostDaoSTOF, PostSTOF}
import play.api.data.Form
import play.api.data.Forms.{default, list, longNumber, mapping, nonEmptyText, number, tuple}
import play.api.i18n.Messages.implicitMessagesProviderToMessages
import play.api.i18n.MessagesProvider
import play.api.mvc.{AbstractController, Action, AnyContent, ControllerComponents, Request}

import javax.inject.{Inject, Singleton}

@Singleton
class PostControllerSTOF  @Inject()(cc: ControllerComponents, postDao: PostDaoSTOF) extends AbstractController(cc) with play.api.i18n.I18nSupport {

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


  private val postForm: Form[Product] =
    Form(
      mapping(
        "text" -> nonEmptyText,
        "code" -> nonEmptyText,
        "date" -> default(number, 2023),
        "votes" -> default(number,0),
        "tags" ->  list(nonEmptyText)
      )
      (PostSTOF.apply)(PostSTOF.unapply)
    )
  import play.api.data.Form
  import play.api.data.Forms._

  def newProduct(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    /*println("called newProduct")
    Ok(views.html.indexSTOF("POSTS", postDao.posts)) //TODO change to real implementation*/
    val form =
      if (request.flash.get("error").isDefined)
        postForm.bind(request.flash.data)
      else
        postForm
     val messagesProvider: MessagesProvider = messagesApi.preferred(request)
    Ok(views.html.addPostSTOF(form)(messagesProvider = messagesProvider, session )
  }



}

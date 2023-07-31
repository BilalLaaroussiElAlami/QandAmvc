package controllers

import models.Content.PostDao

import javax.inject._
import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */

// Maybe rename to PostsPageController?
@Singleton
class HomeControllerSTOF @Inject()(cc: ControllerComponents, postDao: PostDao) extends AbstractController(cc) {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.indexSTOF("POSTS", postDao.posts ))
  }






}

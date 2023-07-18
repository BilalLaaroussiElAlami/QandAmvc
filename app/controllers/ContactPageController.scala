package controllers

import models.ContactDao
import play.api.mvc._
import javax.inject._

@Singleton
class ContactPageController @Inject()(cc: ControllerComponents, authenticatedUserAction: AuthenticatedUserAction) extends AbstractController(cc) {
  // this is where the user comes immediately after logging in.
  // notice that this uses `authenticatedUserAction`.

  def listContacts: Action[AnyContent] = authenticatedUserAction {
    implicit request: Request[AnyContent] =>

    val contacts = ContactDao.findAll
    Ok(views.html.contacts(contacts))
  }
}

// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_7: controllers.HomeController,
  // @LINE:10
  Assets_6: controllers.Assets,
  // @LINE:13
  UserController_5: controllers.UserController,
  // @LINE:17
  AuthenticatedUserController_0: controllers.AuthenticatedUserController,
  // @LINE:18
  LandingPageController_2: controllers.LandingPageController,
  // @LINE:21
  ContactPageController_3: controllers.ContactPageController,
  // @LINE:26
  HomeControllerSTOF_1: controllers.HomeControllerSTOF,
  // @LINE:27
  PostControllerSTOF_4: controllers.PostControllerSTOF,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_7: controllers.HomeController,
    // @LINE:10
    Assets_6: controllers.Assets,
    // @LINE:13
    UserController_5: controllers.UserController,
    // @LINE:17
    AuthenticatedUserController_0: controllers.AuthenticatedUserController,
    // @LINE:18
    LandingPageController_2: controllers.LandingPageController,
    // @LINE:21
    ContactPageController_3: controllers.ContactPageController,
    // @LINE:26
    HomeControllerSTOF_1: controllers.HomeControllerSTOF,
    // @LINE:27
    PostControllerSTOF_4: controllers.PostControllerSTOF
  ) = this(errorHandler, HomeController_7, Assets_6, UserController_5, AuthenticatedUserController_0, LandingPageController_2, ContactPageController_3, HomeControllerSTOF_1, PostControllerSTOF_4, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_7, Assets_6, UserController_5, AuthenticatedUserController_0, LandingPageController_2, ContactPageController_3, HomeControllerSTOF_1, PostControllerSTOF_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.UserController.showLoginForm"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """doLogin""", """controllers.UserController.processLoginAttempt"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.AuthenticatedUserController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """landingPage""", """controllers.LandingPageController.showLandingPage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contacts""", """controllers.ContactPageController.listContacts"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """frontpage""", """controllers.HomeControllerSTOF.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """frontpage/sortedByDate""", """controllers.PostControllerSTOF.sortByDate"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """frontpage/sortedByVotes""", """controllers.PostControllerSTOF.sortByVotes"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """frontpage/searchByTag""", """controllers.PostControllerSTOF.searchByTag(tag:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """frontpage/new""", """controllers.PostControllerSTOF.newProduct()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_7.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
    Assets_6.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_UserController_showLoginForm2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_UserController_showLoginForm2_invoker = createInvoker(
    UserController_5.showLoginForm,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "showLoginForm",
      Nil,
      "GET",
      this.prefix + """login""",
      """ user/admin login""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_UserController_processLoginAttempt3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("doLogin")))
  )
  private[this] lazy val controllers_UserController_processLoginAttempt3_invoker = createInvoker(
    UserController_5.processLoginAttempt,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "processLoginAttempt",
      Nil,
      "POST",
      this.prefix + """doLogin""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_AuthenticatedUserController_logout4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_AuthenticatedUserController_logout4_invoker = createInvoker(
    AuthenticatedUserController_0.logout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthenticatedUserController",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout""",
      """ pages for authenticated users""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_LandingPageController_showLandingPage5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("landingPage")))
  )
  private[this] lazy val controllers_LandingPageController_showLandingPage5_invoker = createInvoker(
    LandingPageController_2.showLandingPage,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LandingPageController",
      "showLandingPage",
      Nil,
      "GET",
      this.prefix + """landingPage""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_ContactPageController_listContacts6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contacts")))
  )
  private[this] lazy val controllers_ContactPageController_listContacts6_invoker = createInvoker(
    ContactPageController_3.listContacts,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ContactPageController",
      "listContacts",
      Nil,
      "GET",
      this.prefix + """contacts""",
      """ show contacts""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_HomeControllerSTOF_index7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("frontpage")))
  )
  private[this] lazy val controllers_HomeControllerSTOF_index7_invoker = createInvoker(
    HomeControllerSTOF_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeControllerSTOF",
      "index",
      Nil,
      "GET",
      this.prefix + """frontpage""",
      """ ROUTES CONCERNING THE PROJCET:
TODO change frontpage with posts""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_PostControllerSTOF_sortByDate8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("frontpage/sortedByDate")))
  )
  private[this] lazy val controllers_PostControllerSTOF_sortByDate8_invoker = createInvoker(
    PostControllerSTOF_4.sortByDate,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostControllerSTOF",
      "sortByDate",
      Nil,
      "GET",
      this.prefix + """frontpage/sortedByDate""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_PostControllerSTOF_sortByVotes9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("frontpage/sortedByVotes")))
  )
  private[this] lazy val controllers_PostControllerSTOF_sortByVotes9_invoker = createInvoker(
    PostControllerSTOF_4.sortByVotes,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostControllerSTOF",
      "sortByVotes",
      Nil,
      "GET",
      this.prefix + """frontpage/sortedByVotes""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_PostControllerSTOF_searchByTag10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("frontpage/searchByTag")))
  )
  private[this] lazy val controllers_PostControllerSTOF_searchByTag10_invoker = createInvoker(
    PostControllerSTOF_4.searchByTag(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostControllerSTOF",
      "searchByTag",
      Seq(classOf[String]),
      "GET",
      this.prefix + """frontpage/searchByTag""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_PostControllerSTOF_newProduct11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("frontpage/new")))
  )
  private[this] lazy val controllers_PostControllerSTOF_newProduct11_invoker = createInvoker(
    PostControllerSTOF_4.newProduct(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostControllerSTOF",
      "newProduct",
      Nil,
      "GET",
      this.prefix + """frontpage/new""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_7.index)
      }
  
    // @LINE:10
    case controllers_Assets_versioned1_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_6.versioned(path, file))
      }
  
    // @LINE:13
    case controllers_UserController_showLoginForm2_route(params@_) =>
      call { 
        controllers_UserController_showLoginForm2_invoker.call(UserController_5.showLoginForm)
      }
  
    // @LINE:14
    case controllers_UserController_processLoginAttempt3_route(params@_) =>
      call { 
        controllers_UserController_processLoginAttempt3_invoker.call(UserController_5.processLoginAttempt)
      }
  
    // @LINE:17
    case controllers_AuthenticatedUserController_logout4_route(params@_) =>
      call { 
        controllers_AuthenticatedUserController_logout4_invoker.call(AuthenticatedUserController_0.logout)
      }
  
    // @LINE:18
    case controllers_LandingPageController_showLandingPage5_route(params@_) =>
      call { 
        controllers_LandingPageController_showLandingPage5_invoker.call(LandingPageController_2.showLandingPage)
      }
  
    // @LINE:21
    case controllers_ContactPageController_listContacts6_route(params@_) =>
      call { 
        controllers_ContactPageController_listContacts6_invoker.call(ContactPageController_3.listContacts)
      }
  
    // @LINE:26
    case controllers_HomeControllerSTOF_index7_route(params@_) =>
      call { 
        controllers_HomeControllerSTOF_index7_invoker.call(HomeControllerSTOF_1.index)
      }
  
    // @LINE:27
    case controllers_PostControllerSTOF_sortByDate8_route(params@_) =>
      call { 
        controllers_PostControllerSTOF_sortByDate8_invoker.call(PostControllerSTOF_4.sortByDate)
      }
  
    // @LINE:28
    case controllers_PostControllerSTOF_sortByVotes9_route(params@_) =>
      call { 
        controllers_PostControllerSTOF_sortByVotes9_invoker.call(PostControllerSTOF_4.sortByVotes)
      }
  
    // @LINE:29
    case controllers_PostControllerSTOF_searchByTag10_route(params@_) =>
      call(params.fromQuery[String]("tag", None)) { (tag) =>
        controllers_PostControllerSTOF_searchByTag10_invoker.call(PostControllerSTOF_4.searchByTag(tag))
      }
  
    // @LINE:30
    case controllers_PostControllerSTOF_newProduct11_route(params@_) =>
      call { 
        controllers_PostControllerSTOF_newProduct11_invoker.call(PostControllerSTOF_4.newProduct())
      }
  }
}

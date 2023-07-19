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
  Assets_5: controllers.Assets,
  // @LINE:13
  UserController_4: controllers.UserController,
  // @LINE:17
  AuthenticatedUserController_0: controllers.AuthenticatedUserController,
  // @LINE:18
  LandingPageController_2: controllers.LandingPageController,
  // @LINE:21
  ContactPageController_3: controllers.ContactPageController,
  // @LINE:26
  HomeControllerSTOF_1: controllers.HomeControllerSTOF,
  // @LINE:27
  ContentController_6: controllers.ContentController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_7: controllers.HomeController,
    // @LINE:10
    Assets_5: controllers.Assets,
    // @LINE:13
    UserController_4: controllers.UserController,
    // @LINE:17
    AuthenticatedUserController_0: controllers.AuthenticatedUserController,
    // @LINE:18
    LandingPageController_2: controllers.LandingPageController,
    // @LINE:21
    ContactPageController_3: controllers.ContactPageController,
    // @LINE:26
    HomeControllerSTOF_1: controllers.HomeControllerSTOF,
    // @LINE:27
    ContentController_6: controllers.ContentController
  ) = this(errorHandler, HomeController_7, Assets_5, UserController_4, AuthenticatedUserController_0, LandingPageController_2, ContactPageController_3, HomeControllerSTOF_1, ContentController_6, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_7, Assets_5, UserController_4, AuthenticatedUserController_0, LandingPageController_2, ContactPageController_3, HomeControllerSTOF_1, ContentController_6, prefix)
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """frontpage/sortedByDate""", """controllers.ContentController.sortByDate"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """frontpage/sortedByVotes""", """controllers.ContentController.sortByVotes"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """frontpage/searchByTag""", """controllers.ContentController.searchByTag(tag:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """frontpage/new""", """controllers.ContentController.newPost()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """frontpage""", """controllers.ContentController.savePost()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """frontpage/upvote""", """controllers.ContentController.upvote(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """frontpage/downvote""", """controllers.ContentController.downvote(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """frontpage/upvoteAnswer""", """controllers.ContentController.upvoteAnswer(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """frontpage/downvoteAnswer""", """controllers.ContentController.downvoteAnswer(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """frontpage/newAnswer""", """controllers.ContentController.newAnswer(postId:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """postsWithAnswers""", """controllers.ContentController.postWithAnswers(postid:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """frontpage/saveAnswer""", """controllers.ContentController.saveAnswer(postId:Int)"""),
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
    Assets_5.versioned(fakeValue[String], fakeValue[Asset]),
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
    UserController_4.showLoginForm,
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
    UserController_4.processLoginAttempt,
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
  private[this] lazy val controllers_ContentController_sortByDate8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("frontpage/sortedByDate")))
  )
  private[this] lazy val controllers_ContentController_sortByDate8_invoker = createInvoker(
    ContentController_6.sortByDate,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ContentController",
      "sortByDate",
      Nil,
      "GET",
      this.prefix + """frontpage/sortedByDate""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_ContentController_sortByVotes9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("frontpage/sortedByVotes")))
  )
  private[this] lazy val controllers_ContentController_sortByVotes9_invoker = createInvoker(
    ContentController_6.sortByVotes,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ContentController",
      "sortByVotes",
      Nil,
      "GET",
      this.prefix + """frontpage/sortedByVotes""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_ContentController_searchByTag10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("frontpage/searchByTag")))
  )
  private[this] lazy val controllers_ContentController_searchByTag10_invoker = createInvoker(
    ContentController_6.searchByTag(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ContentController",
      "searchByTag",
      Seq(classOf[String]),
      "GET",
      this.prefix + """frontpage/searchByTag""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_ContentController_newPost11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("frontpage/new")))
  )
  private[this] lazy val controllers_ContentController_newPost11_invoker = createInvoker(
    ContentController_6.newPost(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ContentController",
      "newPost",
      Nil,
      "GET",
      this.prefix + """frontpage/new""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_ContentController_savePost12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("frontpage")))
  )
  private[this] lazy val controllers_ContentController_savePost12_invoker = createInvoker(
    ContentController_6.savePost(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ContentController",
      "savePost",
      Nil,
      "POST",
      this.prefix + """frontpage""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_ContentController_upvote13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("frontpage/upvote")))
  )
  private[this] lazy val controllers_ContentController_upvote13_invoker = createInvoker(
    ContentController_6.upvote(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ContentController",
      "upvote",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """frontpage/upvote""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_ContentController_downvote14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("frontpage/downvote")))
  )
  private[this] lazy val controllers_ContentController_downvote14_invoker = createInvoker(
    ContentController_6.downvote(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ContentController",
      "downvote",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """frontpage/downvote""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_ContentController_upvoteAnswer15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("frontpage/upvoteAnswer")))
  )
  private[this] lazy val controllers_ContentController_upvoteAnswer15_invoker = createInvoker(
    ContentController_6.upvoteAnswer(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ContentController",
      "upvoteAnswer",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """frontpage/upvoteAnswer""",
      """""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_ContentController_downvoteAnswer16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("frontpage/downvoteAnswer")))
  )
  private[this] lazy val controllers_ContentController_downvoteAnswer16_invoker = createInvoker(
    ContentController_6.downvoteAnswer(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ContentController",
      "downvoteAnswer",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """frontpage/downvoteAnswer""",
      """""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_ContentController_newAnswer17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("frontpage/newAnswer")))
  )
  private[this] lazy val controllers_ContentController_newAnswer17_invoker = createInvoker(
    ContentController_6.newAnswer(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ContentController",
      "newAnswer",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """frontpage/newAnswer""",
      """""",
      Seq()
    )
  )

  // @LINE:38
  private[this] lazy val controllers_ContentController_postWithAnswers18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("postsWithAnswers")))
  )
  private[this] lazy val controllers_ContentController_postWithAnswers18_invoker = createInvoker(
    ContentController_6.postWithAnswers(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ContentController",
      "postWithAnswers",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """postsWithAnswers""",
      """""",
      Seq()
    )
  )

  // @LINE:39
  private[this] lazy val controllers_ContentController_saveAnswer19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("frontpage/saveAnswer")))
  )
  private[this] lazy val controllers_ContentController_saveAnswer19_invoker = createInvoker(
    ContentController_6.saveAnswer(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ContentController",
      "saveAnswer",
      Seq(classOf[Int]),
      "POST",
      this.prefix + """frontpage/saveAnswer""",
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
        controllers_Assets_versioned1_invoker.call(Assets_5.versioned(path, file))
      }
  
    // @LINE:13
    case controllers_UserController_showLoginForm2_route(params@_) =>
      call { 
        controllers_UserController_showLoginForm2_invoker.call(UserController_4.showLoginForm)
      }
  
    // @LINE:14
    case controllers_UserController_processLoginAttempt3_route(params@_) =>
      call { 
        controllers_UserController_processLoginAttempt3_invoker.call(UserController_4.processLoginAttempt)
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
    case controllers_ContentController_sortByDate8_route(params@_) =>
      call { 
        controllers_ContentController_sortByDate8_invoker.call(ContentController_6.sortByDate)
      }
  
    // @LINE:28
    case controllers_ContentController_sortByVotes9_route(params@_) =>
      call { 
        controllers_ContentController_sortByVotes9_invoker.call(ContentController_6.sortByVotes)
      }
  
    // @LINE:29
    case controllers_ContentController_searchByTag10_route(params@_) =>
      call(params.fromQuery[String]("tag", None)) { (tag) =>
        controllers_ContentController_searchByTag10_invoker.call(ContentController_6.searchByTag(tag))
      }
  
    // @LINE:30
    case controllers_ContentController_newPost11_route(params@_) =>
      call { 
        controllers_ContentController_newPost11_invoker.call(ContentController_6.newPost())
      }
  
    // @LINE:31
    case controllers_ContentController_savePost12_route(params@_) =>
      call { 
        controllers_ContentController_savePost12_invoker.call(ContentController_6.savePost())
      }
  
    // @LINE:32
    case controllers_ContentController_upvote13_route(params@_) =>
      call(params.fromQuery[Int]("id", None)) { (id) =>
        controllers_ContentController_upvote13_invoker.call(ContentController_6.upvote(id))
      }
  
    // @LINE:33
    case controllers_ContentController_downvote14_route(params@_) =>
      call(params.fromQuery[Int]("id", None)) { (id) =>
        controllers_ContentController_downvote14_invoker.call(ContentController_6.downvote(id))
      }
  
    // @LINE:34
    case controllers_ContentController_upvoteAnswer15_route(params@_) =>
      call(params.fromQuery[Int]("id", None)) { (id) =>
        controllers_ContentController_upvoteAnswer15_invoker.call(ContentController_6.upvoteAnswer(id))
      }
  
    // @LINE:35
    case controllers_ContentController_downvoteAnswer16_route(params@_) =>
      call(params.fromQuery[Int]("id", None)) { (id) =>
        controllers_ContentController_downvoteAnswer16_invoker.call(ContentController_6.downvoteAnswer(id))
      }
  
    // @LINE:37
    case controllers_ContentController_newAnswer17_route(params@_) =>
      call(params.fromQuery[Int]("postId", None)) { (postId) =>
        controllers_ContentController_newAnswer17_invoker.call(ContentController_6.newAnswer(postId))
      }
  
    // @LINE:38
    case controllers_ContentController_postWithAnswers18_route(params@_) =>
      call(params.fromQuery[Int]("postid", None)) { (postid) =>
        controllers_ContentController_postWithAnswers18_invoker.call(ContentController_6.postWithAnswers(postid))
      }
  
    // @LINE:39
    case controllers_ContentController_saveAnswer19_route(params@_) =>
      call(params.fromQuery[Int]("postId", None)) { (postId) =>
        controllers_ContentController_saveAnswer19_invoker.call(ContentController_6.saveAnswer(postId))
      }
  }
}

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
  HomeControllerSTOF_1: controllers.HomeControllerSTOF,
  // @LINE:10
  Assets_4: controllers.Assets,
  // @LINE:13
  UserController_3: controllers.UserController,
  // @LINE:17
  AuthenticatedUserController_0: controllers.AuthenticatedUserController,
  // @LINE:18
  LandingPageController_2: controllers.LandingPageController,
  // @LINE:25
  ContentController_5: controllers.ContentController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeControllerSTOF_1: controllers.HomeControllerSTOF,
    // @LINE:10
    Assets_4: controllers.Assets,
    // @LINE:13
    UserController_3: controllers.UserController,
    // @LINE:17
    AuthenticatedUserController_0: controllers.AuthenticatedUserController,
    // @LINE:18
    LandingPageController_2: controllers.LandingPageController,
    // @LINE:25
    ContentController_5: controllers.ContentController
  ) = this(errorHandler, HomeControllerSTOF_1, Assets_4, UserController_3, AuthenticatedUserController_0, LandingPageController_2, ContentController_5, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeControllerSTOF_1, Assets_4, UserController_3, AuthenticatedUserController_0, LandingPageController_2, ContentController_5, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeControllerSTOF.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.UserController.showLoginForm"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """doLogin""", """controllers.UserController.processLoginAttempt"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.AuthenticatedUserController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """landingPage""", """controllers.LandingPageController.showLandingPage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """posts""", """controllers.HomeControllerSTOF.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """posts/sortedByDate""", """controllers.ContentController.sortByDate"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """posts/sortedByVotes""", """controllers.ContentController.sortByVotes"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """posts/searchByTag""", """controllers.ContentController.searchByTag(tag:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """posts/new""", """controllers.ContentController.newPost()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """posts""", """controllers.ContentController.savePost()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """posts/upvote""", """controllers.ContentController.upvote(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """posts/downvote""", """controllers.ContentController.downvote(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """posts/upvoteAnswer""", """controllers.ContentController.upvoteAnswer(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """posts/downvoteAnswer""", """controllers.ContentController.downvoteAnswer(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """posts/upvotePostFromPostWithAnswerPage""", """controllers.ContentController.upvotePostFromPostWithAnswerPage(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """posts/downvotePostFromPostWithAnswerPage""", """controllers.ContentController.downvotePostFromPostWithAnswerPage(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """posts/newAnswer""", """controllers.ContentController.newAnswer(postId:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """postsWithAnswers""", """controllers.ContentController.postWithAnswers(postid:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """posts/saveAnswer""", """controllers.ContentController.saveAnswer(postId:Int)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeControllerSTOF_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeControllerSTOF_index0_invoker = createInvoker(
    HomeControllerSTOF_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeControllerSTOF",
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
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
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
    UserController_3.showLoginForm,
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
    UserController_3.processLoginAttempt,
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

  // @LINE:24
  private[this] lazy val controllers_HomeControllerSTOF_index6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts")))
  )
  private[this] lazy val controllers_HomeControllerSTOF_index6_invoker = createInvoker(
    HomeControllerSTOF_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeControllerSTOF",
      "index",
      Nil,
      "GET",
      this.prefix + """posts""",
      """ ROUTES CONCERNING THE PROJCET:
TODO change frontpage with posts""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_ContentController_sortByDate7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts/sortedByDate")))
  )
  private[this] lazy val controllers_ContentController_sortByDate7_invoker = createInvoker(
    ContentController_5.sortByDate,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ContentController",
      "sortByDate",
      Nil,
      "GET",
      this.prefix + """posts/sortedByDate""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_ContentController_sortByVotes8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts/sortedByVotes")))
  )
  private[this] lazy val controllers_ContentController_sortByVotes8_invoker = createInvoker(
    ContentController_5.sortByVotes,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ContentController",
      "sortByVotes",
      Nil,
      "GET",
      this.prefix + """posts/sortedByVotes""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_ContentController_searchByTag9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts/searchByTag")))
  )
  private[this] lazy val controllers_ContentController_searchByTag9_invoker = createInvoker(
    ContentController_5.searchByTag(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ContentController",
      "searchByTag",
      Seq(classOf[String]),
      "GET",
      this.prefix + """posts/searchByTag""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_ContentController_newPost10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts/new")))
  )
  private[this] lazy val controllers_ContentController_newPost10_invoker = createInvoker(
    ContentController_5.newPost(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ContentController",
      "newPost",
      Nil,
      "GET",
      this.prefix + """posts/new""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_ContentController_savePost11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts")))
  )
  private[this] lazy val controllers_ContentController_savePost11_invoker = createInvoker(
    ContentController_5.savePost(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ContentController",
      "savePost",
      Nil,
      "POST",
      this.prefix + """posts""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_ContentController_upvote12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts/upvote")))
  )
  private[this] lazy val controllers_ContentController_upvote12_invoker = createInvoker(
    ContentController_5.upvote(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ContentController",
      "upvote",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """posts/upvote""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_ContentController_downvote13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts/downvote")))
  )
  private[this] lazy val controllers_ContentController_downvote13_invoker = createInvoker(
    ContentController_5.downvote(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ContentController",
      "downvote",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """posts/downvote""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_ContentController_upvoteAnswer14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts/upvoteAnswer")))
  )
  private[this] lazy val controllers_ContentController_upvoteAnswer14_invoker = createInvoker(
    ContentController_5.upvoteAnswer(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ContentController",
      "upvoteAnswer",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """posts/upvoteAnswer""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_ContentController_downvoteAnswer15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts/downvoteAnswer")))
  )
  private[this] lazy val controllers_ContentController_downvoteAnswer15_invoker = createInvoker(
    ContentController_5.downvoteAnswer(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ContentController",
      "downvoteAnswer",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """posts/downvoteAnswer""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_ContentController_upvotePostFromPostWithAnswerPage16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts/upvotePostFromPostWithAnswerPage")))
  )
  private[this] lazy val controllers_ContentController_upvotePostFromPostWithAnswerPage16_invoker = createInvoker(
    ContentController_5.upvotePostFromPostWithAnswerPage(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ContentController",
      "upvotePostFromPostWithAnswerPage",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """posts/upvotePostFromPostWithAnswerPage""",
      """""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_ContentController_downvotePostFromPostWithAnswerPage17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts/downvotePostFromPostWithAnswerPage")))
  )
  private[this] lazy val controllers_ContentController_downvotePostFromPostWithAnswerPage17_invoker = createInvoker(
    ContentController_5.downvotePostFromPostWithAnswerPage(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ContentController",
      "downvotePostFromPostWithAnswerPage",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """posts/downvotePostFromPostWithAnswerPage""",
      """""",
      Seq()
    )
  )

  // @LINE:38
  private[this] lazy val controllers_ContentController_newAnswer18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts/newAnswer")))
  )
  private[this] lazy val controllers_ContentController_newAnswer18_invoker = createInvoker(
    ContentController_5.newAnswer(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ContentController",
      "newAnswer",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """posts/newAnswer""",
      """""",
      Seq()
    )
  )

  // @LINE:39
  private[this] lazy val controllers_ContentController_postWithAnswers19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("postsWithAnswers")))
  )
  private[this] lazy val controllers_ContentController_postWithAnswers19_invoker = createInvoker(
    ContentController_5.postWithAnswers(fakeValue[Int]),
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

  // @LINE:40
  private[this] lazy val controllers_ContentController_saveAnswer20_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts/saveAnswer")))
  )
  private[this] lazy val controllers_ContentController_saveAnswer20_invoker = createInvoker(
    ContentController_5.saveAnswer(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ContentController",
      "saveAnswer",
      Seq(classOf[Int]),
      "POST",
      this.prefix + """posts/saveAnswer""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeControllerSTOF_index0_route(params@_) =>
      call { 
        controllers_HomeControllerSTOF_index0_invoker.call(HomeControllerSTOF_1.index)
      }
  
    // @LINE:10
    case controllers_Assets_versioned1_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_4.versioned(path, file))
      }
  
    // @LINE:13
    case controllers_UserController_showLoginForm2_route(params@_) =>
      call { 
        controllers_UserController_showLoginForm2_invoker.call(UserController_3.showLoginForm)
      }
  
    // @LINE:14
    case controllers_UserController_processLoginAttempt3_route(params@_) =>
      call { 
        controllers_UserController_processLoginAttempt3_invoker.call(UserController_3.processLoginAttempt)
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
  
    // @LINE:24
    case controllers_HomeControllerSTOF_index6_route(params@_) =>
      call { 
        controllers_HomeControllerSTOF_index6_invoker.call(HomeControllerSTOF_1.index)
      }
  
    // @LINE:25
    case controllers_ContentController_sortByDate7_route(params@_) =>
      call { 
        controllers_ContentController_sortByDate7_invoker.call(ContentController_5.sortByDate)
      }
  
    // @LINE:26
    case controllers_ContentController_sortByVotes8_route(params@_) =>
      call { 
        controllers_ContentController_sortByVotes8_invoker.call(ContentController_5.sortByVotes)
      }
  
    // @LINE:27
    case controllers_ContentController_searchByTag9_route(params@_) =>
      call(params.fromQuery[String]("tag", None)) { (tag) =>
        controllers_ContentController_searchByTag9_invoker.call(ContentController_5.searchByTag(tag))
      }
  
    // @LINE:28
    case controllers_ContentController_newPost10_route(params@_) =>
      call { 
        controllers_ContentController_newPost10_invoker.call(ContentController_5.newPost())
      }
  
    // @LINE:29
    case controllers_ContentController_savePost11_route(params@_) =>
      call { 
        controllers_ContentController_savePost11_invoker.call(ContentController_5.savePost())
      }
  
    // @LINE:30
    case controllers_ContentController_upvote12_route(params@_) =>
      call(params.fromQuery[Int]("id", None)) { (id) =>
        controllers_ContentController_upvote12_invoker.call(ContentController_5.upvote(id))
      }
  
    // @LINE:31
    case controllers_ContentController_downvote13_route(params@_) =>
      call(params.fromQuery[Int]("id", None)) { (id) =>
        controllers_ContentController_downvote13_invoker.call(ContentController_5.downvote(id))
      }
  
    // @LINE:32
    case controllers_ContentController_upvoteAnswer14_route(params@_) =>
      call(params.fromQuery[Int]("id", None)) { (id) =>
        controllers_ContentController_upvoteAnswer14_invoker.call(ContentController_5.upvoteAnswer(id))
      }
  
    // @LINE:33
    case controllers_ContentController_downvoteAnswer15_route(params@_) =>
      call(params.fromQuery[Int]("id", None)) { (id) =>
        controllers_ContentController_downvoteAnswer15_invoker.call(ContentController_5.downvoteAnswer(id))
      }
  
    // @LINE:34
    case controllers_ContentController_upvotePostFromPostWithAnswerPage16_route(params@_) =>
      call(params.fromQuery[Int]("id", None)) { (id) =>
        controllers_ContentController_upvotePostFromPostWithAnswerPage16_invoker.call(ContentController_5.upvotePostFromPostWithAnswerPage(id))
      }
  
    // @LINE:35
    case controllers_ContentController_downvotePostFromPostWithAnswerPage17_route(params@_) =>
      call(params.fromQuery[Int]("id", None)) { (id) =>
        controllers_ContentController_downvotePostFromPostWithAnswerPage17_invoker.call(ContentController_5.downvotePostFromPostWithAnswerPage(id))
      }
  
    // @LINE:38
    case controllers_ContentController_newAnswer18_route(params@_) =>
      call(params.fromQuery[Int]("postId", None)) { (postId) =>
        controllers_ContentController_newAnswer18_invoker.call(ContentController_5.newAnswer(postId))
      }
  
    // @LINE:39
    case controllers_ContentController_postWithAnswers19_route(params@_) =>
      call(params.fromQuery[Int]("postid", None)) { (postid) =>
        controllers_ContentController_postWithAnswers19_invoker.call(ContentController_5.postWithAnswers(postid))
      }
  
    // @LINE:40
    case controllers_ContentController_saveAnswer20_route(params@_) =>
      call(params.fromQuery[Int]("postId", None)) { (postId) =>
        controllers_ContentController_saveAnswer20_invoker.call(ContentController_5.saveAnswer(postId))
      }
  }
}

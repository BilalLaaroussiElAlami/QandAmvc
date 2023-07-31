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
  Assets_3: controllers.Assets,
  // @LINE:13
  UserController_2: controllers.UserController,
  // @LINE:17
  AuthenticatedUserController_0: controllers.AuthenticatedUserController,
  // @LINE:24
  ContentController_4: controllers.ContentController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeControllerSTOF_1: controllers.HomeControllerSTOF,
    // @LINE:10
    Assets_3: controllers.Assets,
    // @LINE:13
    UserController_2: controllers.UserController,
    // @LINE:17
    AuthenticatedUserController_0: controllers.AuthenticatedUserController,
    // @LINE:24
    ContentController_4: controllers.ContentController
  ) = this(errorHandler, HomeControllerSTOF_1, Assets_3, UserController_2, AuthenticatedUserController_0, ContentController_4, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeControllerSTOF_1, Assets_3, UserController_2, AuthenticatedUserController_0, ContentController_4, prefix)
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
    Assets_3.versioned(fakeValue[String], fakeValue[Asset]),
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
    UserController_2.showLoginForm,
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
    UserController_2.processLoginAttempt,
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

  // @LINE:23
  private[this] lazy val controllers_HomeControllerSTOF_index5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts")))
  )
  private[this] lazy val controllers_HomeControllerSTOF_index5_invoker = createInvoker(
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

  // @LINE:24
  private[this] lazy val controllers_ContentController_sortByDate6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts/sortedByDate")))
  )
  private[this] lazy val controllers_ContentController_sortByDate6_invoker = createInvoker(
    ContentController_4.sortByDate,
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

  // @LINE:25
  private[this] lazy val controllers_ContentController_sortByVotes7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts/sortedByVotes")))
  )
  private[this] lazy val controllers_ContentController_sortByVotes7_invoker = createInvoker(
    ContentController_4.sortByVotes,
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

  // @LINE:26
  private[this] lazy val controllers_ContentController_searchByTag8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts/searchByTag")))
  )
  private[this] lazy val controllers_ContentController_searchByTag8_invoker = createInvoker(
    ContentController_4.searchByTag(fakeValue[String]),
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

  // @LINE:27
  private[this] lazy val controllers_ContentController_newPost9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts/new")))
  )
  private[this] lazy val controllers_ContentController_newPost9_invoker = createInvoker(
    ContentController_4.newPost(),
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

  // @LINE:28
  private[this] lazy val controllers_ContentController_savePost10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts")))
  )
  private[this] lazy val controllers_ContentController_savePost10_invoker = createInvoker(
    ContentController_4.savePost(),
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

  // @LINE:29
  private[this] lazy val controllers_ContentController_upvote11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts/upvote")))
  )
  private[this] lazy val controllers_ContentController_upvote11_invoker = createInvoker(
    ContentController_4.upvote(fakeValue[Int]),
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

  // @LINE:30
  private[this] lazy val controllers_ContentController_downvote12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts/downvote")))
  )
  private[this] lazy val controllers_ContentController_downvote12_invoker = createInvoker(
    ContentController_4.downvote(fakeValue[Int]),
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

  // @LINE:31
  private[this] lazy val controllers_ContentController_upvoteAnswer13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts/upvoteAnswer")))
  )
  private[this] lazy val controllers_ContentController_upvoteAnswer13_invoker = createInvoker(
    ContentController_4.upvoteAnswer(fakeValue[Int]),
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

  // @LINE:32
  private[this] lazy val controllers_ContentController_downvoteAnswer14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts/downvoteAnswer")))
  )
  private[this] lazy val controllers_ContentController_downvoteAnswer14_invoker = createInvoker(
    ContentController_4.downvoteAnswer(fakeValue[Int]),
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

  // @LINE:33
  private[this] lazy val controllers_ContentController_upvotePostFromPostWithAnswerPage15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts/upvotePostFromPostWithAnswerPage")))
  )
  private[this] lazy val controllers_ContentController_upvotePostFromPostWithAnswerPage15_invoker = createInvoker(
    ContentController_4.upvotePostFromPostWithAnswerPage(fakeValue[Int]),
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

  // @LINE:34
  private[this] lazy val controllers_ContentController_downvotePostFromPostWithAnswerPage16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts/downvotePostFromPostWithAnswerPage")))
  )
  private[this] lazy val controllers_ContentController_downvotePostFromPostWithAnswerPage16_invoker = createInvoker(
    ContentController_4.downvotePostFromPostWithAnswerPage(fakeValue[Int]),
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

  // @LINE:37
  private[this] lazy val controllers_ContentController_newAnswer17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts/newAnswer")))
  )
  private[this] lazy val controllers_ContentController_newAnswer17_invoker = createInvoker(
    ContentController_4.newAnswer(fakeValue[Int]),
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

  // @LINE:38
  private[this] lazy val controllers_ContentController_postWithAnswers18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("postsWithAnswers")))
  )
  private[this] lazy val controllers_ContentController_postWithAnswers18_invoker = createInvoker(
    ContentController_4.postWithAnswers(fakeValue[Int]),
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
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts/saveAnswer")))
  )
  private[this] lazy val controllers_ContentController_saveAnswer19_invoker = createInvoker(
    ContentController_4.saveAnswer(fakeValue[Int]),
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
        controllers_Assets_versioned1_invoker.call(Assets_3.versioned(path, file))
      }
  
    // @LINE:13
    case controllers_UserController_showLoginForm2_route(params@_) =>
      call { 
        controllers_UserController_showLoginForm2_invoker.call(UserController_2.showLoginForm)
      }
  
    // @LINE:14
    case controllers_UserController_processLoginAttempt3_route(params@_) =>
      call { 
        controllers_UserController_processLoginAttempt3_invoker.call(UserController_2.processLoginAttempt)
      }
  
    // @LINE:17
    case controllers_AuthenticatedUserController_logout4_route(params@_) =>
      call { 
        controllers_AuthenticatedUserController_logout4_invoker.call(AuthenticatedUserController_0.logout)
      }
  
    // @LINE:23
    case controllers_HomeControllerSTOF_index5_route(params@_) =>
      call { 
        controllers_HomeControllerSTOF_index5_invoker.call(HomeControllerSTOF_1.index)
      }
  
    // @LINE:24
    case controllers_ContentController_sortByDate6_route(params@_) =>
      call { 
        controllers_ContentController_sortByDate6_invoker.call(ContentController_4.sortByDate)
      }
  
    // @LINE:25
    case controllers_ContentController_sortByVotes7_route(params@_) =>
      call { 
        controllers_ContentController_sortByVotes7_invoker.call(ContentController_4.sortByVotes)
      }
  
    // @LINE:26
    case controllers_ContentController_searchByTag8_route(params@_) =>
      call(params.fromQuery[String]("tag", None)) { (tag) =>
        controllers_ContentController_searchByTag8_invoker.call(ContentController_4.searchByTag(tag))
      }
  
    // @LINE:27
    case controllers_ContentController_newPost9_route(params@_) =>
      call { 
        controllers_ContentController_newPost9_invoker.call(ContentController_4.newPost())
      }
  
    // @LINE:28
    case controllers_ContentController_savePost10_route(params@_) =>
      call { 
        controllers_ContentController_savePost10_invoker.call(ContentController_4.savePost())
      }
  
    // @LINE:29
    case controllers_ContentController_upvote11_route(params@_) =>
      call(params.fromQuery[Int]("id", None)) { (id) =>
        controllers_ContentController_upvote11_invoker.call(ContentController_4.upvote(id))
      }
  
    // @LINE:30
    case controllers_ContentController_downvote12_route(params@_) =>
      call(params.fromQuery[Int]("id", None)) { (id) =>
        controllers_ContentController_downvote12_invoker.call(ContentController_4.downvote(id))
      }
  
    // @LINE:31
    case controllers_ContentController_upvoteAnswer13_route(params@_) =>
      call(params.fromQuery[Int]("id", None)) { (id) =>
        controllers_ContentController_upvoteAnswer13_invoker.call(ContentController_4.upvoteAnswer(id))
      }
  
    // @LINE:32
    case controllers_ContentController_downvoteAnswer14_route(params@_) =>
      call(params.fromQuery[Int]("id", None)) { (id) =>
        controllers_ContentController_downvoteAnswer14_invoker.call(ContentController_4.downvoteAnswer(id))
      }
  
    // @LINE:33
    case controllers_ContentController_upvotePostFromPostWithAnswerPage15_route(params@_) =>
      call(params.fromQuery[Int]("id", None)) { (id) =>
        controllers_ContentController_upvotePostFromPostWithAnswerPage15_invoker.call(ContentController_4.upvotePostFromPostWithAnswerPage(id))
      }
  
    // @LINE:34
    case controllers_ContentController_downvotePostFromPostWithAnswerPage16_route(params@_) =>
      call(params.fromQuery[Int]("id", None)) { (id) =>
        controllers_ContentController_downvotePostFromPostWithAnswerPage16_invoker.call(ContentController_4.downvotePostFromPostWithAnswerPage(id))
      }
  
    // @LINE:37
    case controllers_ContentController_newAnswer17_route(params@_) =>
      call(params.fromQuery[Int]("postId", None)) { (postId) =>
        controllers_ContentController_newAnswer17_invoker.call(ContentController_4.newAnswer(postId))
      }
  
    // @LINE:38
    case controllers_ContentController_postWithAnswers18_route(params@_) =>
      call(params.fromQuery[Int]("postid", None)) { (postid) =>
        controllers_ContentController_postWithAnswers18_invoker.call(ContentController_4.postWithAnswers(postid))
      }
  
    // @LINE:39
    case controllers_ContentController_saveAnswer19_route(params@_) =>
      call(params.fromQuery[Int]("postId", None)) { (postId) =>
        controllers_ContentController_saveAnswer19_invoker.call(ContentController_4.saveAnswer(postId))
      }
  }
}

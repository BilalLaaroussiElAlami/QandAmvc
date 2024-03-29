// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {

  // @LINE:10
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:17
  class ReverseAuthenticatedUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthenticatedUserController.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
  }

  // @LINE:24
  class ReverseContentController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def downvoteAnswer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ContentController.downvoteAnswer",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "posts/downvoteAnswer" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:39
    def saveAnswer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ContentController.saveAnswer",
      """
        function(postId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "posts/saveAnswer" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("postId", postId0)])})
        }
      """
    )
  
    // @LINE:28
    def savePost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ContentController.savePost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "posts"})
        }
      """
    )
  
    // @LINE:37
    def newAnswer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ContentController.newAnswer",
      """
        function(postId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "posts/newAnswer" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("postId", postId0)])})
        }
      """
    )
  
    // @LINE:33
    def upvotePostFromPostWithAnswerPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ContentController.upvotePostFromPostWithAnswerPage",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "posts/upvotePostFromPostWithAnswerPage" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:25
    def sortByVotes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ContentController.sortByVotes",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "posts/sortedByVotes"})
        }
      """
    )
  
    // @LINE:38
    def postWithAnswers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ContentController.postWithAnswers",
      """
        function(postid0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "postsWithAnswers" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("postid", postid0)])})
        }
      """
    )
  
    // @LINE:30
    def downvote: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ContentController.downvote",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "posts/downvote" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:27
    def newPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ContentController.newPost",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "posts/new"})
        }
      """
    )
  
    // @LINE:26
    def searchByTag: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ContentController.searchByTag",
      """
        function(tag0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "posts/searchByTag" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("tag", tag0)])})
        }
      """
    )
  
    // @LINE:34
    def downvotePostFromPostWithAnswerPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ContentController.downvotePostFromPostWithAnswerPage",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "posts/downvotePostFromPostWithAnswerPage" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:31
    def upvoteAnswer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ContentController.upvoteAnswer",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "posts/upvoteAnswer" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:24
    def sortByDate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ContentController.sortByDate",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "posts/sortedByDate"})
        }
      """
    )
  
    // @LINE:29
    def upvote: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ContentController.upvote",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "posts/upvote" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
  }

  // @LINE:13
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def showLoginForm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.showLoginForm",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:14
    def processLoginAttempt: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.processLoginAttempt",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "doLogin"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeControllerSTOF(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeControllerSTOF.index",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + """"})
          }
        
        }
      """
    )
  
  }


}

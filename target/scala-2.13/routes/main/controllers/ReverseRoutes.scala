// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

  // @LINE:10
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:17
  class ReverseAuthenticatedUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def logout: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
  }

  // @LINE:25
  class ReverseContentController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:33
    def downvoteAnswer(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "posts/downvoteAnswer" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("id", id)))))
    }
  
    // @LINE:37
    def saveAnswer(postId:Int): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "posts/saveAnswer" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("postId", postId)))))
    }
  
    // @LINE:29
    def savePost(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "posts")
    }
  
    // @LINE:35
    def newAnswer(postId:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "posts/newAnswer" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("postId", postId)))))
    }
  
    // @LINE:26
    def sortByVotes: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "posts/sortedByVotes")
    }
  
    // @LINE:36
    def postWithAnswers(postid:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "postsWithAnswers" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("postid", postid)))))
    }
  
    // @LINE:31
    def downvote(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "posts/downvote" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("id", id)))))
    }
  
    // @LINE:28
    def newPost(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "posts/new")
    }
  
    // @LINE:27
    def searchByTag(tag:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "posts/searchByTag" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("tag", tag)))))
    }
  
    // @LINE:32
    def upvoteAnswer(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "posts/upvoteAnswer" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("id", id)))))
    }
  
    // @LINE:25
    def sortByDate: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "posts/sortedByDate")
    }
  
    // @LINE:30
    def upvote(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "posts/upvote" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("id", id)))))
    }
  
  }

  // @LINE:13
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def showLoginForm: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:14
    def processLoginAttempt: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "doLogin")
    }
  
  }

  // @LINE:18
  class ReverseLandingPageController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def showLandingPage: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "landingPage")
    }
  
  }

  // @LINE:6
  class ReverseHomeControllerSTOF(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: Call = {
    
      () match {
      
        // @LINE:6
        case ()  =>
          
          Call("GET", _prefix)
      
      }
    
    }
  
  }


}

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

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:27
  class ReversePostControllerSTOF(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:28
    def sortByVotes: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "frontpage/sortedByVotes")
    }
  
    // @LINE:33
    def downvote(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "frontpage/downvote" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("id", id)))))
    }
  
    // @LINE:31
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "frontpage")
    }
  
    // @LINE:29
    def searchByTag(tag:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "frontpage/searchByTag" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("tag", tag)))))
    }
  
    // @LINE:27
    def sortByDate: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "frontpage/sortedByDate")
    }
  
    // @LINE:32
    def upvote(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "frontpage/upvote" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("id", id)))))
    }
  
    // @LINE:30
    def newProduct(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "frontpage/new")
    }
  
  }

  // @LINE:21
  class ReverseContactPageController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def listContacts: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "contacts")
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

  // @LINE:26
  class ReverseHomeControllerSTOF(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def index: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "frontpage")
    }
  
  }


}

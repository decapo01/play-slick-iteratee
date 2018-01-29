
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/decapo/apps/play-slick-iteratee/conf/routes
// @DATE:Sun Jan 28 21:05:25 CST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

  // @LINE:15
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def at(file:String): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def listComet(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "list.comet")
    }
  
    // @LINE:12
    def list(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "list.json")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }


}

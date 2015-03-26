// @SOURCE:C:/Users/momomomomo/Documents/WORK/SoftSpec/project/Team2Big2Slim/conf/routes
// @HASH:5d8ffdbe6f59884e3694b910587f51db57805f3e
// @DATE:Thu Mar 26 21:40:52 ICT 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:27
// @LINE:26
// @LINE:24
// @LINE:23
// @LINE:20
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:6
package controllers {

// @LINE:27
// @LINE:26
class ReverseQuicknote {


// @LINE:27
def addNote(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "quicknote")
}
                        

// @LINE:26
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "quicknote")
}
                        

}
                          

// @LINE:24
// @LINE:23
class ReverseLogin {


// @LINE:24
def authenticate(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                        

// @LINE:23
def login(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                        

}
                          

// @LINE:20
class ReverseAssets {


// @LINE:20
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:6
class ReverseApplication {


// @LINE:17
def group1(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "group1")
}
                        

// @LINE:9
def addProject(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "create")
}
                        

// @LINE:14
def getVoteResult(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "voteResult")
}
                        

// @LINE:16
def profile(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "profile")
}
                        

// @LINE:8
def createProject(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "creater")
}
                        

// @LINE:11
def vote(String:String): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "vote" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("String", String)))))
}
                        

// @LINE:12
def voting(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "voting")
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

}
                          
}
                  


// @LINE:27
// @LINE:26
// @LINE:24
// @LINE:23
// @LINE:20
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:27
// @LINE:26
class ReverseQuicknote {


// @LINE:27
def addNote : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Quicknote.addNote",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "quicknote"})
      }
   """
)
                        

// @LINE:26
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Quicknote.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "quicknote"})
      }
   """
)
                        

}
              

// @LINE:24
// @LINE:23
class ReverseLogin {


// @LINE:24
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Login.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:23
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Login.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

}
              

// @LINE:20
class ReverseAssets {


// @LINE:20
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:6
class ReverseApplication {


// @LINE:17
def group1 : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.group1",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "group1"})
      }
   """
)
                        

// @LINE:9
def addProject : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.addProject",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "create"})
      }
   """
)
                        

// @LINE:14
def getVoteResult : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getVoteResult",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "voteResult"})
      }
   """
)
                        

// @LINE:16
def profile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.profile",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile"})
      }
   """
)
                        

// @LINE:8
def createProject : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.createProject",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "creater"})
      }
   """
)
                        

// @LINE:11
def vote : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.vote",
   """
      function(String) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "vote" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("String", String)])})
      }
   """
)
                        

// @LINE:12
def voting : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.voting",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "voting"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

}
              
}
        


// @LINE:27
// @LINE:26
// @LINE:24
// @LINE:23
// @LINE:20
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.ref {


// @LINE:27
// @LINE:26
class ReverseQuicknote {


// @LINE:27
def addNote(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Quicknote.addNote(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Quicknote", "addNote", Seq(), "POST", """""", _prefix + """quicknote""")
)
                      

// @LINE:26
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Quicknote.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Quicknote", "index", Seq(), "GET", """""", _prefix + """quicknote""")
)
                      

}
                          

// @LINE:24
// @LINE:23
class ReverseLogin {


// @LINE:24
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Login.authenticate(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Login", "authenticate", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:23
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Login.login(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Login", "login", Seq(), "GET", """""", _prefix + """login""")
)
                      

}
                          

// @LINE:20
class ReverseAssets {


// @LINE:20
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:6
class ReverseApplication {


// @LINE:17
def group1(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.group1(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "group1", Seq(), "GET", """""", _prefix + """group1""")
)
                      

// @LINE:9
def addProject(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.addProject(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addProject", Seq(), "GET", """""", _prefix + """create""")
)
                      

// @LINE:14
def getVoteResult(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getVoteResult(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getVoteResult", Seq(), "GET", """""", _prefix + """voteResult""")
)
                      

// @LINE:16
def profile(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.profile(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "profile", Seq(), "GET", """""", _prefix + """profile""")
)
                      

// @LINE:8
def createProject(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.createProject(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "createProject", Seq(), "POST", """""", _prefix + """creater""")
)
                      

// @LINE:11
def vote(String:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.vote(String), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "vote", Seq(classOf[String]), "POST", """""", _prefix + """vote""")
)
                      

// @LINE:12
def voting(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.voting(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "voting", Seq(), "GET", """""", _prefix + """voting""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          
}
        
    
// @SOURCE:C:/Team2Big2Slim/conf/routes
// @HASH:7207d4d01593320d9b6626f1c24fc743d20b88cf
// @DATE:Fri Mar 27 19:11:21 ICT 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:30
// @LINE:29
// @LINE:27
// @LINE:26
// @LINE:24
// @LINE:23
// @LINE:21
// @LINE:20
// @LINE:17
// @LINE:14
// @LINE:13
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:6
package controllers {

// @LINE:27
// @LINE:26
class ReverseRate {


// @LINE:27
def submitRate(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "rate")
}
                        

// @LINE:26
def rate(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "rate")
}
                        

}
                          

// @LINE:17
class ReverseAssets {


// @LINE:17
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:24
// @LINE:23
class ReverseQuicknote {


// @LINE:24
def addNote(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "quicknote")
}
                        

// @LINE:23
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "quicknote")
}
                        

}
                          

// @LINE:21
// @LINE:20
class ReverseLogin {


// @LINE:21
def authenticate(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                        

// @LINE:20
def login(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                        

}
                          

// @LINE:30
// @LINE:29
class ReverseVote {


// @LINE:29
def vote(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "vote")
}
                        

// @LINE:30
def submitVote(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "vote")
}
                        

}
                          

// @LINE:14
// @LINE:13
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:6
class ReverseApplication {


// @LINE:14
def group1(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "group1")
}
                        

// @LINE:9
def addProject(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "create")
}
                        

// @LINE:11
def getVoteResult(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "voteResult")
}
                        

// @LINE:13
def profile(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "profile")
}
                        

// @LINE:8
def createProject(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "creater")
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

}
                          
}
                  


// @LINE:30
// @LINE:29
// @LINE:27
// @LINE:26
// @LINE:24
// @LINE:23
// @LINE:21
// @LINE:20
// @LINE:17
// @LINE:14
// @LINE:13
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:27
// @LINE:26
class ReverseRate {


// @LINE:27
def submitRate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Rate.submitRate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "rate"})
      }
   """
)
                        

// @LINE:26
def rate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Rate.rate",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rate"})
      }
   """
)
                        

}
              

// @LINE:17
class ReverseAssets {


// @LINE:17
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:24
// @LINE:23
class ReverseQuicknote {


// @LINE:24
def addNote : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Quicknote.addNote",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "quicknote"})
      }
   """
)
                        

// @LINE:23
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Quicknote.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "quicknote"})
      }
   """
)
                        

}
              

// @LINE:21
// @LINE:20
class ReverseLogin {


// @LINE:21
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Login.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:20
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Login.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

}
              

// @LINE:30
// @LINE:29
class ReverseVote {


// @LINE:29
def vote : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Vote.vote",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "vote"})
      }
   """
)
                        

// @LINE:30
def submitVote : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Vote.submitVote",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "vote"})
      }
   """
)
                        

}
              

// @LINE:14
// @LINE:13
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:6
class ReverseApplication {


// @LINE:14
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
                        

// @LINE:11
def getVoteResult : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getVoteResult",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "voteResult"})
      }
   """
)
                        

// @LINE:13
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
        


// @LINE:30
// @LINE:29
// @LINE:27
// @LINE:26
// @LINE:24
// @LINE:23
// @LINE:21
// @LINE:20
// @LINE:17
// @LINE:14
// @LINE:13
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.ref {


// @LINE:27
// @LINE:26
class ReverseRate {


// @LINE:27
def submitRate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Rate.submitRate(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Rate", "submitRate", Seq(), "POST", """""", _prefix + """rate""")
)
                      

// @LINE:26
def rate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Rate.rate(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Rate", "rate", Seq(), "GET", """""", _prefix + """rate""")
)
                      

}
                          

// @LINE:17
class ReverseAssets {


// @LINE:17
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:24
// @LINE:23
class ReverseQuicknote {


// @LINE:24
def addNote(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Quicknote.addNote(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Quicknote", "addNote", Seq(), "POST", """""", _prefix + """quicknote""")
)
                      

// @LINE:23
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Quicknote.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Quicknote", "index", Seq(), "GET", """""", _prefix + """quicknote""")
)
                      

}
                          

// @LINE:21
// @LINE:20
class ReverseLogin {


// @LINE:21
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Login.authenticate(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Login", "authenticate", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:20
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Login.login(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Login", "login", Seq(), "GET", """""", _prefix + """login""")
)
                      

}
                          

// @LINE:30
// @LINE:29
class ReverseVote {


// @LINE:29
def vote(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Vote.vote(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Vote", "vote", Seq(), "GET", """""", _prefix + """vote""")
)
                      

// @LINE:30
def submitVote(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Vote.submitVote(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Vote", "submitVote", Seq(), "POST", """""", _prefix + """vote""")
)
                      

}
                          

// @LINE:14
// @LINE:13
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:6
class ReverseApplication {


// @LINE:14
def group1(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.group1(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "group1", Seq(), "GET", """""", _prefix + """group1""")
)
                      

// @LINE:9
def addProject(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.addProject(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addProject", Seq(), "GET", """""", _prefix + """create""")
)
                      

// @LINE:11
def getVoteResult(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getVoteResult(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getVoteResult", Seq(), "GET", """""", _prefix + """voteResult""")
)
                      

// @LINE:13
def profile(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.profile(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "profile", Seq(), "GET", """""", _prefix + """profile""")
)
                      

// @LINE:8
def createProject(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.createProject(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "createProject", Seq(), "POST", """""", _prefix + """creater""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          
}
        
    
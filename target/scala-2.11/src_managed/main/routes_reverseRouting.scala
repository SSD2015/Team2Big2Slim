// @SOURCE:/Users/nutkaewnak/Desktop/untitled folder 2/Team2Big2Slim/conf/routes
// @HASH:902ccbfd5b1afc2c7b81c2226d42ac838564771e
// @DATE:Fri Apr 17 14:19:57 ICT 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:42
// @LINE:40
// @LINE:38
// @LINE:36
// @LINE:33
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:27
// @LINE:26
// @LINE:24
// @LINE:23
// @LINE:20
// @LINE:17
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:6
package controllers {

// @LINE:31
// @LINE:30
// @LINE:29
class ReverseRate {


// @LINE:30
def submitRate(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "rate")
}
                        

// @LINE:31
def showRateResult(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "rateResult")
}
                        

// @LINE:29
def rate(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "rate")
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
                          

// @LINE:42
// @LINE:40
// @LINE:38
// @LINE:36
class ReverseProjectList {


// @LINE:36
def index(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "profile/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:40
def sc2(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "screenshot2/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:38
def sc1(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "screenshot1/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:42
def sc3(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "screenshot3/" + implicitly[PathBindable[Integer]].unbind("id", id))
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
                          

// @LINE:14
// @LINE:12
// @LINE:11
class ReverseVote {


// @LINE:12
def vote(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "vote")
}
                        

// @LINE:14
def showVoteResult(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "voteResult")
}
                        

// @LINE:11
def submitVote(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "vote")
}
                        

}
                          

// @LINE:33
// @LINE:17
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
                        

// @LINE:33
def mockDatabase(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "install")
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
                  


// @LINE:42
// @LINE:40
// @LINE:38
// @LINE:36
// @LINE:33
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:27
// @LINE:26
// @LINE:24
// @LINE:23
// @LINE:20
// @LINE:17
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:31
// @LINE:30
// @LINE:29
class ReverseRate {


// @LINE:30
def submitRate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Rate.submitRate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "rate"})
      }
   """
)
                        

// @LINE:31
def showRateResult : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Rate.showRateResult",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rateResult"})
      }
   """
)
                        

// @LINE:29
def rate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Rate.rate",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rate"})
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
              

// @LINE:42
// @LINE:40
// @LINE:38
// @LINE:36
class ReverseProjectList {


// @LINE:36
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProjectList.index",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:40
def sc2 : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProjectList.sc2",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "screenshot2/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:38
def sc1 : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProjectList.sc1",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "screenshot1/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:42
def sc3 : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProjectList.sc3",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "screenshot3/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
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
              

// @LINE:14
// @LINE:12
// @LINE:11
class ReverseVote {


// @LINE:12
def vote : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Vote.vote",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "vote"})
      }
   """
)
                        

// @LINE:14
def showVoteResult : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Vote.showVoteResult",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "voteResult"})
      }
   """
)
                        

// @LINE:11
def submitVote : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Vote.submitVote",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "vote"})
      }
   """
)
                        

}
              

// @LINE:33
// @LINE:17
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
                        

// @LINE:33
def mockDatabase : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.mockDatabase",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "install"})
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
        


// @LINE:42
// @LINE:40
// @LINE:38
// @LINE:36
// @LINE:33
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:27
// @LINE:26
// @LINE:24
// @LINE:23
// @LINE:20
// @LINE:17
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.ref {


// @LINE:31
// @LINE:30
// @LINE:29
class ReverseRate {


// @LINE:30
def submitRate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Rate.submitRate(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Rate", "submitRate", Seq(), "POST", """""", _prefix + """rate""")
)
                      

// @LINE:31
def showRateResult(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Rate.showRateResult(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Rate", "showRateResult", Seq(), "GET", """""", _prefix + """rateResult""")
)
                      

// @LINE:29
def rate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Rate.rate(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Rate", "rate", Seq(), "GET", """""", _prefix + """rate""")
)
                      

}
                          

// @LINE:20
class ReverseAssets {


// @LINE:20
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

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
                          

// @LINE:42
// @LINE:40
// @LINE:38
// @LINE:36
class ReverseProjectList {


// @LINE:36
def index(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProjectList.index(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectList", "index", Seq(classOf[Integer]), "GET", """""", _prefix + """profile/$id<[^/]+>""")
)
                      

// @LINE:40
def sc2(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProjectList.sc2(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectList", "sc2", Seq(classOf[Integer]), "GET", """""", _prefix + """screenshot2/$id<[^/]+>""")
)
                      

// @LINE:38
def sc1(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProjectList.sc1(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectList", "sc1", Seq(classOf[Integer]), "GET", """""", _prefix + """screenshot1/$id<[^/]+>""")
)
                      

// @LINE:42
def sc3(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProjectList.sc3(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectList", "sc3", Seq(classOf[Integer]), "GET", """""", _prefix + """screenshot3/$id<[^/]+>""")
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
                          

// @LINE:14
// @LINE:12
// @LINE:11
class ReverseVote {


// @LINE:12
def vote(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Vote.vote(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Vote", "vote", Seq(), "GET", """""", _prefix + """vote""")
)
                      

// @LINE:14
def showVoteResult(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Vote.showVoteResult(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Vote", "showVoteResult", Seq(), "GET", """""", _prefix + """voteResult""")
)
                      

// @LINE:11
def submitVote(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Vote.submitVote(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Vote", "submitVote", Seq(), "POST", """""", _prefix + """vote""")
)
                      

}
                          

// @LINE:33
// @LINE:17
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
                      

// @LINE:33
def mockDatabase(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.mockDatabase(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "mockDatabase", Seq(), "GET", """""", _prefix + """install""")
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
        
    
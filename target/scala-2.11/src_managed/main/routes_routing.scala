// @SOURCE:/Users/Punpikorn/Desktop/2Big2Slim/Team2Big2Slim/conf/routes
// @HASH:cb0009d9e93c7efe6c7b13818543dccad347ceb1
// @DATE:Tue Mar 31 19:59:51 ICT 2015


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String): Unit = {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:8
private[this] lazy val controllers_Application_createProject1_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("creater"))))
private[this] lazy val controllers_Application_createProject1_invoker = createInvoker(
controllers.Application.createProject(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "createProject", Nil,"POST", """""", Routes.prefix + """creater"""))
        

// @LINE:9
private[this] lazy val controllers_Application_addProject2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("create"))))
private[this] lazy val controllers_Application_addProject2_invoker = createInvoker(
controllers.Application.addProject(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addProject", Nil,"GET", """""", Routes.prefix + """create"""))
        

// @LINE:11
private[this] lazy val controllers_Vote_vote3_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("vote"))))
private[this] lazy val controllers_Vote_vote3_invoker = createInvoker(
controllers.Vote.vote(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Vote", "vote", Nil,"POST", """""", Routes.prefix + """vote"""))
        

// @LINE:12
private[this] lazy val controllers_Vote_submitVote4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("vote"))))
private[this] lazy val controllers_Vote_submitVote4_invoker = createInvoker(
controllers.Vote.submitVote(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Vote", "submitVote", Nil,"GET", """""", Routes.prefix + """vote"""))
        

// @LINE:14
private[this] lazy val controllers_Application_getVoteResult5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("voteResult"))))
private[this] lazy val controllers_Application_getVoteResult5_invoker = createInvoker(
controllers.Application.getVoteResult(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getVoteResult", Nil,"GET", """""", Routes.prefix + """voteResult"""))
        

// @LINE:16
private[this] lazy val controllers_Application_profile6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("profile"))))
private[this] lazy val controllers_Application_profile6_invoker = createInvoker(
controllers.Application.profile(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "profile", Nil,"GET", """""", Routes.prefix + """profile"""))
        

// @LINE:17
private[this] lazy val controllers_Application_group17_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("group1"))))
private[this] lazy val controllers_Application_group17_invoker = createInvoker(
controllers.Application.group1(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "group1", Nil,"GET", """""", Routes.prefix + """group1"""))
        

// @LINE:20
private[this] lazy val controllers_Assets_at8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at8_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        

// @LINE:23
private[this] lazy val controllers_Login_login9_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
private[this] lazy val controllers_Login_login9_invoker = createInvoker(
controllers.Login.login(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Login", "login", Nil,"GET", """""", Routes.prefix + """login"""))
        

// @LINE:24
private[this] lazy val controllers_Login_authenticate10_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
private[this] lazy val controllers_Login_authenticate10_invoker = createInvoker(
controllers.Login.authenticate(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Login", "authenticate", Nil,"POST", """""", Routes.prefix + """login"""))
        

// @LINE:26
private[this] lazy val controllers_Quicknote_index11_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("quicknote"))))
private[this] lazy val controllers_Quicknote_index11_invoker = createInvoker(
controllers.Quicknote.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Quicknote", "index", Nil,"GET", """""", Routes.prefix + """quicknote"""))
        

// @LINE:27
private[this] lazy val controllers_Quicknote_addNote12_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("quicknote"))))
private[this] lazy val controllers_Quicknote_addNote12_invoker = createInvoker(
controllers.Quicknote.addNote(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Quicknote", "addNote", Nil,"POST", """""", Routes.prefix + """quicknote"""))
        

// @LINE:29
private[this] lazy val controllers_Rate_rate13_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("rate"))))
private[this] lazy val controllers_Rate_rate13_invoker = createInvoker(
controllers.Rate.rate(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Rate", "rate", Nil,"GET", """""", Routes.prefix + """rate"""))
        

// @LINE:30
private[this] lazy val controllers_Rate_submitRate14_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("rate"))))
private[this] lazy val controllers_Rate_submitRate14_invoker = createInvoker(
controllers.Rate.submitRate(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Rate", "submitRate", Nil,"POST", """""", Routes.prefix + """rate"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """creater""","""controllers.Application.createProject()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """create""","""controllers.Application.addProject()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """vote""","""controllers.Vote.vote()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """vote""","""controllers.Vote.submitVote()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """voteResult""","""controllers.Application.getVoteResult()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """profile""","""controllers.Application.profile()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """group1""","""controllers.Application.group1()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Login.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Login.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """quicknote""","""controllers.Quicknote.index()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """quicknote""","""controllers.Quicknote.addNote()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """rate""","""controllers.Rate.rate()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """rate""","""controllers.Rate.submitRate()""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index())
   }
}
        

// @LINE:8
case controllers_Application_createProject1_route(params) => {
   call { 
        controllers_Application_createProject1_invoker.call(controllers.Application.createProject())
   }
}
        

// @LINE:9
case controllers_Application_addProject2_route(params) => {
   call { 
        controllers_Application_addProject2_invoker.call(controllers.Application.addProject())
   }
}
        

// @LINE:11
case controllers_Vote_vote3_route(params) => {
   call { 
        controllers_Vote_vote3_invoker.call(controllers.Vote.vote())
   }
}
        

// @LINE:12
case controllers_Vote_submitVote4_route(params) => {
   call { 
        controllers_Vote_submitVote4_invoker.call(controllers.Vote.submitVote())
   }
}
        

// @LINE:14
case controllers_Application_getVoteResult5_route(params) => {
   call { 
        controllers_Application_getVoteResult5_invoker.call(controllers.Application.getVoteResult())
   }
}
        

// @LINE:16
case controllers_Application_profile6_route(params) => {
   call { 
        controllers_Application_profile6_invoker.call(controllers.Application.profile())
   }
}
        

// @LINE:17
case controllers_Application_group17_route(params) => {
   call { 
        controllers_Application_group17_invoker.call(controllers.Application.group1())
   }
}
        

// @LINE:20
case controllers_Assets_at8_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at8_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:23
case controllers_Login_login9_route(params) => {
   call { 
        controllers_Login_login9_invoker.call(controllers.Login.login())
   }
}
        

// @LINE:24
case controllers_Login_authenticate10_route(params) => {
   call { 
        controllers_Login_authenticate10_invoker.call(controllers.Login.authenticate())
   }
}
        

// @LINE:26
case controllers_Quicknote_index11_route(params) => {
   call { 
        controllers_Quicknote_index11_invoker.call(controllers.Quicknote.index())
   }
}
        

// @LINE:27
case controllers_Quicknote_addNote12_route(params) => {
   call { 
        controllers_Quicknote_addNote12_invoker.call(controllers.Quicknote.addNote())
   }
}
        

// @LINE:29
case controllers_Rate_rate13_route(params) => {
   call { 
        controllers_Rate_rate13_invoker.call(controllers.Rate.rate())
   }
}
        

// @LINE:30
case controllers_Rate_submitRate14_route(params) => {
   call { 
        controllers_Rate_submitRate14_invoker.call(controllers.Rate.submitRate())
   }
}
        
}

}
     
// @SOURCE:/Users/nutkaewnak/Desktop/untitled folder 2/Team2Big2Slim/conf/routes
// @HASH:902ccbfd5b1afc2c7b81c2226d42ac838564771e
// @DATE:Fri Apr 17 14:19:57 ICT 2015


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
private[this] lazy val controllers_Vote_submitVote3_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("vote"))))
private[this] lazy val controllers_Vote_submitVote3_invoker = createInvoker(
controllers.Vote.submitVote(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Vote", "submitVote", Nil,"POST", """""", Routes.prefix + """vote"""))
        

// @LINE:12
private[this] lazy val controllers_Vote_vote4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("vote"))))
private[this] lazy val controllers_Vote_vote4_invoker = createInvoker(
controllers.Vote.vote(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Vote", "vote", Nil,"GET", """""", Routes.prefix + """vote"""))
        

// @LINE:14
private[this] lazy val controllers_Vote_showVoteResult5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("voteResult"))))
private[this] lazy val controllers_Vote_showVoteResult5_invoker = createInvoker(
controllers.Vote.showVoteResult(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Vote", "showVoteResult", Nil,"GET", """""", Routes.prefix + """voteResult"""))
        

// @LINE:17
private[this] lazy val controllers_Application_group16_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("group1"))))
private[this] lazy val controllers_Application_group16_invoker = createInvoker(
controllers.Application.group1(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "group1", Nil,"GET", """""", Routes.prefix + """group1"""))
        

// @LINE:20
private[this] lazy val controllers_Assets_at7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at7_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        

// @LINE:23
private[this] lazy val controllers_Login_login8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
private[this] lazy val controllers_Login_login8_invoker = createInvoker(
controllers.Login.login(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Login", "login", Nil,"GET", """""", Routes.prefix + """login"""))
        

// @LINE:24
private[this] lazy val controllers_Login_authenticate9_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
private[this] lazy val controllers_Login_authenticate9_invoker = createInvoker(
controllers.Login.authenticate(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Login", "authenticate", Nil,"POST", """""", Routes.prefix + """login"""))
        

// @LINE:26
private[this] lazy val controllers_Quicknote_index10_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("quicknote"))))
private[this] lazy val controllers_Quicknote_index10_invoker = createInvoker(
controllers.Quicknote.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Quicknote", "index", Nil,"GET", """""", Routes.prefix + """quicknote"""))
        

// @LINE:27
private[this] lazy val controllers_Quicknote_addNote11_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("quicknote"))))
private[this] lazy val controllers_Quicknote_addNote11_invoker = createInvoker(
controllers.Quicknote.addNote(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Quicknote", "addNote", Nil,"POST", """""", Routes.prefix + """quicknote"""))
        

// @LINE:29
private[this] lazy val controllers_Rate_rate12_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("rate"))))
private[this] lazy val controllers_Rate_rate12_invoker = createInvoker(
controllers.Rate.rate(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Rate", "rate", Nil,"GET", """""", Routes.prefix + """rate"""))
        

// @LINE:30
private[this] lazy val controllers_Rate_submitRate13_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("rate"))))
private[this] lazy val controllers_Rate_submitRate13_invoker = createInvoker(
controllers.Rate.submitRate(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Rate", "submitRate", Nil,"POST", """""", Routes.prefix + """rate"""))
        

// @LINE:31
private[this] lazy val controllers_Rate_showRateResult14_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("rateResult"))))
private[this] lazy val controllers_Rate_showRateResult14_invoker = createInvoker(
controllers.Rate.showRateResult(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Rate", "showRateResult", Nil,"GET", """""", Routes.prefix + """rateResult"""))
        

// @LINE:33
private[this] lazy val controllers_Application_mockDatabase15_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("install"))))
private[this] lazy val controllers_Application_mockDatabase15_invoker = createInvoker(
controllers.Application.mockDatabase(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "mockDatabase", Nil,"GET", """""", Routes.prefix + """install"""))
        

// @LINE:36
private[this] lazy val controllers_ProjectList_index16_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("profile/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ProjectList_index16_invoker = createInvoker(
controllers.ProjectList.index(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectList", "index", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """profile/$id<[^/]+>"""))
        

// @LINE:38
private[this] lazy val controllers_ProjectList_sc117_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("screenshot1/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ProjectList_sc117_invoker = createInvoker(
controllers.ProjectList.sc1(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectList", "sc1", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """screenshot1/$id<[^/]+>"""))
        

// @LINE:40
private[this] lazy val controllers_ProjectList_sc218_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("screenshot2/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ProjectList_sc218_invoker = createInvoker(
controllers.ProjectList.sc2(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectList", "sc2", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """screenshot2/$id<[^/]+>"""))
        

// @LINE:42
private[this] lazy val controllers_ProjectList_sc319_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("screenshot3/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ProjectList_sc319_invoker = createInvoker(
controllers.ProjectList.sc3(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectList", "sc3", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """screenshot3/$id<[^/]+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """creater""","""controllers.Application.createProject()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """create""","""controllers.Application.addProject()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """vote""","""controllers.Vote.submitVote()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """vote""","""controllers.Vote.vote()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """voteResult""","""controllers.Vote.showVoteResult()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """group1""","""controllers.Application.group1()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Login.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Login.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """quicknote""","""controllers.Quicknote.index()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """quicknote""","""controllers.Quicknote.addNote()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """rate""","""controllers.Rate.rate()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """rate""","""controllers.Rate.submitRate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """rateResult""","""controllers.Rate.showRateResult()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """install""","""controllers.Application.mockDatabase()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """profile/$id<[^/]+>""","""controllers.ProjectList.index(id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """screenshot1/$id<[^/]+>""","""controllers.ProjectList.sc1(id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """screenshot2/$id<[^/]+>""","""controllers.ProjectList.sc2(id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """screenshot3/$id<[^/]+>""","""controllers.ProjectList.sc3(id:Integer)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
case controllers_Vote_submitVote3_route(params) => {
   call { 
        controllers_Vote_submitVote3_invoker.call(controllers.Vote.submitVote())
   }
}
        

// @LINE:12
case controllers_Vote_vote4_route(params) => {
   call { 
        controllers_Vote_vote4_invoker.call(controllers.Vote.vote())
   }
}
        

// @LINE:14
case controllers_Vote_showVoteResult5_route(params) => {
   call { 
        controllers_Vote_showVoteResult5_invoker.call(controllers.Vote.showVoteResult())
   }
}
        

// @LINE:17
case controllers_Application_group16_route(params) => {
   call { 
        controllers_Application_group16_invoker.call(controllers.Application.group1())
   }
}
        

// @LINE:20
case controllers_Assets_at7_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at7_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:23
case controllers_Login_login8_route(params) => {
   call { 
        controllers_Login_login8_invoker.call(controllers.Login.login())
   }
}
        

// @LINE:24
case controllers_Login_authenticate9_route(params) => {
   call { 
        controllers_Login_authenticate9_invoker.call(controllers.Login.authenticate())
   }
}
        

// @LINE:26
case controllers_Quicknote_index10_route(params) => {
   call { 
        controllers_Quicknote_index10_invoker.call(controllers.Quicknote.index())
   }
}
        

// @LINE:27
case controllers_Quicknote_addNote11_route(params) => {
   call { 
        controllers_Quicknote_addNote11_invoker.call(controllers.Quicknote.addNote())
   }
}
        

// @LINE:29
case controllers_Rate_rate12_route(params) => {
   call { 
        controllers_Rate_rate12_invoker.call(controllers.Rate.rate())
   }
}
        

// @LINE:30
case controllers_Rate_submitRate13_route(params) => {
   call { 
        controllers_Rate_submitRate13_invoker.call(controllers.Rate.submitRate())
   }
}
        

// @LINE:31
case controllers_Rate_showRateResult14_route(params) => {
   call { 
        controllers_Rate_showRateResult14_invoker.call(controllers.Rate.showRateResult())
   }
}
        

// @LINE:33
case controllers_Application_mockDatabase15_route(params) => {
   call { 
        controllers_Application_mockDatabase15_invoker.call(controllers.Application.mockDatabase())
   }
}
        

// @LINE:36
case controllers_ProjectList_index16_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_ProjectList_index16_invoker.call(controllers.ProjectList.index(id))
   }
}
        

// @LINE:38
case controllers_ProjectList_sc117_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_ProjectList_sc117_invoker.call(controllers.ProjectList.sc1(id))
   }
}
        

// @LINE:40
case controllers_ProjectList_sc218_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_ProjectList_sc218_invoker.call(controllers.ProjectList.sc2(id))
   }
}
        

// @LINE:42
case controllers_ProjectList_sc319_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_ProjectList_sc319_invoker.call(controllers.ProjectList.sc3(id))
   }
}
        
}

}
     
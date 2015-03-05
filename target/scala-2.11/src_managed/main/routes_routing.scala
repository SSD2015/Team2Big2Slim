// @SOURCE:/Users/nutkaewnak/Documents/SoftSpec/Team2Big2Slim/conf/routes
// @HASH:4f0af4ac2807590ac75228f235176f803d6ee1b4
// @DATE:Thu Mar 05 23:19:25 ICT 2015


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
private[this] lazy val controllers_Application_vote3_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("vote"))))
private[this] lazy val controllers_Application_vote3_invoker = createInvoker(
controllers.Application.vote(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "vote", Seq(classOf[String]),"POST", """""", Routes.prefix + """vote"""))
        

// @LINE:12
private[this] lazy val controllers_Application_voting4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("voting"))))
private[this] lazy val controllers_Application_voting4_invoker = createInvoker(
controllers.Application.voting(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "voting", Nil,"GET", """""", Routes.prefix + """voting"""))
        

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
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """creater""","""controllers.Application.createProject()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """create""","""controllers.Application.addProject()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """vote""","""controllers.Application.vote(String:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """voting""","""controllers.Application.voting()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """voteResult""","""controllers.Application.getVoteResult()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """profile""","""controllers.Application.profile()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """group1""","""controllers.Application.group1()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
case controllers_Application_vote3_route(params) => {
   call(params.fromQuery[String]("String", None)) { (String) =>
        controllers_Application_vote3_invoker.call(controllers.Application.vote(String))
   }
}
        

// @LINE:12
case controllers_Application_voting4_route(params) => {
   call { 
        controllers_Application_voting4_invoker.call(controllers.Application.voting())
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
        
}

}
     
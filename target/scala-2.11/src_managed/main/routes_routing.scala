// @SOURCE:/Users/nathakorn/Documents/Team2Big2Slim/conf/routes
// @HASH:f7096a25efa7e03bc0e091c695e73592fc672496
// @DATE:Wed Apr 01 22:21:45 ICT 2015


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
        

// @LINE:9
private[this] lazy val controllers_Assets_at1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at1_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        

// @LINE:11
private[this] lazy val controllers_Application_mockDatabase2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("install"))))
private[this] lazy val controllers_Application_mockDatabase2_invoker = createInvoker(
controllers.Application.mockDatabase(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "mockDatabase", Nil,"GET", """""", Routes.prefix + """install"""))
        

// @LINE:13
private[this] lazy val controllers_ProjectList_index3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("profile/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ProjectList_index3_invoker = createInvoker(
controllers.ProjectList.index(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectList", "index", Seq(classOf[Long]),"GET", """""", Routes.prefix + """profile/$id<[^/]+>"""))
        

// @LINE:15
private[this] lazy val controllers_ProjectList_sc14_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("screenshot1/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ProjectList_sc14_invoker = createInvoker(
controllers.ProjectList.sc1(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectList", "sc1", Seq(classOf[Long]),"GET", """""", Routes.prefix + """screenshot1/$id<[^/]+>"""))
        

// @LINE:17
private[this] lazy val controllers_ProjectList_sc25_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("screenshot2/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ProjectList_sc25_invoker = createInvoker(
controllers.ProjectList.sc2(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectList", "sc2", Seq(classOf[Long]),"GET", """""", Routes.prefix + """screenshot2/$id<[^/]+>"""))
        

// @LINE:19
private[this] lazy val controllers_ProjectList_sc36_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("screenshot3/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ProjectList_sc36_invoker = createInvoker(
controllers.ProjectList.sc3(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectList", "sc3", Seq(classOf[Long]),"GET", """""", Routes.prefix + """screenshot3/$id<[^/]+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """install""","""controllers.Application.mockDatabase()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """profile/$id<[^/]+>""","""controllers.ProjectList.index(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """screenshot1/$id<[^/]+>""","""controllers.ProjectList.sc1(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """screenshot2/$id<[^/]+>""","""controllers.ProjectList.sc2(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """screenshot3/$id<[^/]+>""","""controllers.ProjectList.sc3(id:Long)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
        

// @LINE:9
case controllers_Assets_at1_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at1_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:11
case controllers_Application_mockDatabase2_route(params) => {
   call { 
        controllers_Application_mockDatabase2_invoker.call(controllers.Application.mockDatabase())
   }
}
        

// @LINE:13
case controllers_ProjectList_index3_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProjectList_index3_invoker.call(controllers.ProjectList.index(id))
   }
}
        

// @LINE:15
case controllers_ProjectList_sc14_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProjectList_sc14_invoker.call(controllers.ProjectList.sc1(id))
   }
}
        

// @LINE:17
case controllers_ProjectList_sc25_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProjectList_sc25_invoker.call(controllers.ProjectList.sc2(id))
   }
}
        

// @LINE:19
case controllers_ProjectList_sc36_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProjectList_sc36_invoker.call(controllers.ProjectList.sc3(id))
   }
}
        
}

}
     
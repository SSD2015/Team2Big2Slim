// @SOURCE:/Users/nathakorn/Documents/Team2Big2Slim/conf/routes
// @HASH:b92c794a0d6781fcc6113878d82c498ec8101193
// @DATE:Fri Mar 27 11:29:04 ICT 2015


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
private[this] lazy val controllers_Application_hello2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("hello"))))
private[this] lazy val controllers_Application_hello2_invoker = createInvoker(
controllers.Application.hello(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "hello", Nil,"GET", """""", Routes.prefix + """hello"""))
        

// @LINE:13
private[this] lazy val controllers_ProjectList_index3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("profile"))))
private[this] lazy val controllers_ProjectList_index3_invoker = createInvoker(
controllers.ProjectList.index(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectList", "index", Seq(classOf[Long]),"GET", """""", Routes.prefix + """profile"""))
        

// @LINE:15
private[this] lazy val controllers_Application_screenshot14_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("screenshot1"))))
private[this] lazy val controllers_Application_screenshot14_invoker = createInvoker(
controllers.Application.screenshot1(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "screenshot1", Nil,"GET", """""", Routes.prefix + """screenshot1"""))
        

// @LINE:17
private[this] lazy val controllers_Application_screenshot25_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("screenshot2"))))
private[this] lazy val controllers_Application_screenshot25_invoker = createInvoker(
controllers.Application.screenshot2(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "screenshot2", Nil,"GET", """""", Routes.prefix + """screenshot2"""))
        

// @LINE:19
private[this] lazy val controllers_Application_screenshot36_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("screenshot3"))))
private[this] lazy val controllers_Application_screenshot36_invoker = createInvoker(
controllers.Application.screenshot3(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "screenshot3", Nil,"GET", """""", Routes.prefix + """screenshot3"""))
        

// @LINE:21
private[this] lazy val controllers_Application_test7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("test"))))
private[this] lazy val controllers_Application_test7_invoker = createInvoker(
controllers.Application.test(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "test", Nil,"GET", """""", Routes.prefix + """test"""))
        

// @LINE:23
private[this] lazy val controllers_Application_mockDatabase8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("install"))))
private[this] lazy val controllers_Application_mockDatabase8_invoker = createInvoker(
controllers.Application.mockDatabase(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "mockDatabase", Nil,"GET", """""", Routes.prefix + """install"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """hello""","""controllers.Application.hello()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """profile""","""controllers.ProjectList.index(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """screenshot1""","""controllers.Application.screenshot1()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """screenshot2""","""controllers.Application.screenshot2()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """screenshot3""","""controllers.Application.screenshot3()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """test""","""controllers.Application.test()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """install""","""controllers.Application.mockDatabase()""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
case controllers_Application_hello2_route(params) => {
   call { 
        controllers_Application_hello2_invoker.call(controllers.Application.hello())
   }
}
        

// @LINE:13
case controllers_ProjectList_index3_route(params) => {
   call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_ProjectList_index3_invoker.call(controllers.ProjectList.index(id))
   }
}
        

// @LINE:15
case controllers_Application_screenshot14_route(params) => {
   call { 
        controllers_Application_screenshot14_invoker.call(controllers.Application.screenshot1())
   }
}
        

// @LINE:17
case controllers_Application_screenshot25_route(params) => {
   call { 
        controllers_Application_screenshot25_invoker.call(controllers.Application.screenshot2())
   }
}
        

// @LINE:19
case controllers_Application_screenshot36_route(params) => {
   call { 
        controllers_Application_screenshot36_invoker.call(controllers.Application.screenshot3())
   }
}
        

// @LINE:21
case controllers_Application_test7_route(params) => {
   call { 
        controllers_Application_test7_invoker.call(controllers.Application.test())
   }
}
        

// @LINE:23
case controllers_Application_mockDatabase8_route(params) => {
   call { 
        controllers_Application_mockDatabase8_invoker.call(controllers.Application.mockDatabase())
   }
}
        
}

}
     

package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object profile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE HTML>
<html lang = "en">
    <head>
        <title>Profile:GTA</title>
        <meta charset = "UTF-8" />
    </head>
    <body>
        <h1>Profile: </h1>
        <p>
            <img src = "http://static.sportskeeda.com/wp-content/uploads/2014/08/gta-v-1409058623.jpg"
            alt = "Description" />
        </p>
        <h2>Description</h2>
        <p>Project name: GTA</p>
        <p>Type of project: Game</p>
        <p>Member: Korn , PP ,Mo , Sompat , Nut</p>
    </body>
    <button type="button" onclick="getElementById('content').innerHTML ='asdasdasd'">Read more!</button>
    <div id="content"></div>
</html>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Mar 05 13:30:00 ICT 2015
                  SOURCE: /Users/nathakorn/Documents/Team2Big2Slim/app/views/profile.scala.html
                  HASH: 35392fe7ff92e78f7b2f146a857116cfef374e5a
                  MATRIX: 800->0
                  LINES: 29->1
                  -- GENERATED --
              */
          
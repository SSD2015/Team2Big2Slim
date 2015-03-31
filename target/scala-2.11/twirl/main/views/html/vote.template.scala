
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
object vote extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*1.2*/main("Project Vote")/*1.22*/ {_display_(Seq[Any](format.raw/*1.24*/("""
    """),format.raw/*2.5*/("""<h1>Please vote which project is the best</h1>

	<h1>Application</h1>
    <form action="/vote" method="post">
	GGWP<input type="radio" name="projectName" value="GGWP" checked> LOL<input type="radio" name="projectName" value="LOL">
	<br>
	<button type="submit" name="action">Submit</button>
	</form>
""")))}))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Mar 31 20:10:00 ICT 2015
                  SOURCE: /Users/Punpikorn/Desktop/2Big2Slim/Team2Big2Slim/app/views/vote.scala.html
                  HASH: ec05060e25d31f348f9186205851a945f72761e8
                  MATRIX: 797->1|825->21|864->23|895->28
                  LINES: 29->1|29->1|29->1|30->2
                  -- GENERATED --
              */
          
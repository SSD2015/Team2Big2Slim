
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
	    <input type="radio" name="projectName" value="GGWP"> GGWP <br>

        <input type="radio" name="projectName" value="LOL"> LOL
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
<<<<<<< HEAD
                  DATE: Fri Apr 17 12:46:51 ICT 2015
                  SOURCE: C:/Team2Big2Slim/app/views/vote.scala.html
                  HASH: c20f01e710574565ca3a36d35741591a128ca100
                  MATRIX: 797->1|825->21|864->23|896->29
=======
                  DATE: Fri Apr 17 14:19:59 ICT 2015
                  SOURCE: /Users/nutkaewnak/Desktop/untitled folder 2/Team2Big2Slim/app/views/vote.scala.html
                  HASH: f8c59eb0b53c0115fb6c08d70527c8502ab79cc1
                  MATRIX: 797->1|825->21|864->23|895->28
>>>>>>> c353ba6c7af9280be2b53018f6dcb419a8c0ae6d
                  LINES: 29->1|29->1|29->1|30->2
                  -- GENERATED --
              */
          
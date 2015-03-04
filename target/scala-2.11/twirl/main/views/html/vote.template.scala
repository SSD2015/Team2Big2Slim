
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

Seq[Any](_display_(/*1.2*/main("Voting")/*1.16*/ {_display_(Seq[Any](format.raw/*1.18*/("""
    """),format.raw/*2.5*/("""<h> Who is the best ?</h>
    <br>
    <br>
    <input type="radio" name="group" value="check">PP<br>
    <input type="radio" name="group" value="check">Momo<br>
    <input type="radio" name="group" value="check">Patbu<br>
    <input type="radio" name="group" value="check">Korn<br>
    <input type="radio" name="group" value="check">KeawNak
    <br>
    <br>
    <button> submit </button>
""")))}))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 04 17:54:46 ICT 2015
                  SOURCE: /Users/Punpikorn/Desktop/2Big2Slim/Team2Big2Slim/app/views/vote.scala.html
                  HASH: 8dbf3d54393ca436a8492549493ca00fa17b44a6
                  MATRIX: 797->1|819->15|858->17|889->22
                  LINES: 29->1|29->1|29->1|30->2
                  -- GENERATED --
              */
          
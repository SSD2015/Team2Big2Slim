
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*2.2*/main("Main Menu")/*2.19*/ {_display_(Seq[Any](format.raw/*2.21*/("""
    """),format.raw/*3.5*/("""<image src = "assets/option_bar.jpg" title = "option"></image>

    <br>
    <br>
    <br>
    <br>


    <image src = "assets/template_g1.jpg" title = "group1"></image>

    <br>
    <br>

    <image src = "assets/template_g2.jpg" title = "group2"></image>

    <br>
    <br>

    <image src = "assets/template_g3.jpg" title = "group3"></image>

    <br>
    <br>

    <image src = "assets/template_g4.jpg" title = "group4"></image>

    <br>
    <br>

                                    .
                                    .
                                    .
""")))}),format.raw/*34.2*/("""
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 04 16:32:29 ICT 2015
                  SOURCE: /Users/Punpikorn/Desktop/2Big2Slim/Team2Big2Slim/app/views/index.scala.html
                  HASH: 11eb876b257d371415eb25fb41d0ffb9f7100a2b
                  MATRIX: 798->2|823->19|862->21|893->26|1492->595
                  LINES: 29->2|29->2|29->2|30->3|61->34
                  -- GENERATED --
              */
          
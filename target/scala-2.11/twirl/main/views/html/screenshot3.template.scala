
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
object screenshot3 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
    <title>Bootstrap Grand Theft Auto V</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
        <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
        <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">
    <style>
    .Picture"""),format.raw/*14.13*/("""{"""),format.raw/*14.14*/("""
    """),format.raw/*15.5*/("""position:absolute;
    top:0px;
    left:0px;
    """),format.raw/*18.5*/("""}"""),format.raw/*18.6*/("""
    """),format.raw/*19.5*/(""".Button"""),format.raw/*19.12*/("""{"""),format.raw/*19.13*/("""
    """),format.raw/*20.5*/("""position:absolute;
    top:370px;
    left:250px;
    """),format.raw/*23.5*/("""}"""),format.raw/*23.6*/("""

    """),format.raw/*25.5*/("""</style>

    <head lang="en">
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <div class="row">
            <div class="col-sm-12">
                <div class = "Picture">
                    <p> <img src = "http://i.ytimg.com/vi/lAdBJQXoCpc/maxresdefault.jpg" style="width:600px;height:350px"> </p>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-12">
                <div class = "Button">
                <button type="button" class="btn btn-default -lg" onclick="location.href='http://localhost:9000/profile'"> <span class="glyphicon glyphicon-arrow-left" aria-hidden="true" ></span> Go Back</button>
                </div>
            </div>
        </div>
    </body>
</html>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 25 21:15:42 ICT 2015
                  SOURCE: /Users/nathakorn/Documents/Team2Big2Slim/app/views/screenshot3.scala.html
                  HASH: 2837c50783bb7d6d1f59a826f2a969ba810c11de
                  MATRIX: 804->0|1618->786|1647->787|1679->792|1756->842|1784->843|1816->848|1851->855|1880->856|1912->861|1993->915|2021->916|2054->922
                  LINES: 29->1|42->14|42->14|43->15|46->18|46->18|47->19|47->19|47->19|48->20|51->23|51->23|53->25
                  -- GENERATED --
              */
          
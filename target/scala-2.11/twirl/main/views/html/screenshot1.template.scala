
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
object screenshot1 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Project,List[Member],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(project : Project )(member : List[Member]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.45*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <style>

    </style>

    <head lang="en">
        <title>Grand Theft Auto V</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>

            <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
            <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">
        <meta charset="UTF-8">

    </head>
    <body>
        <div class="container-fluid">
            <div class="row">
                <clock></clock>
            </div>
            <div class="row">
                <div class = "col-xs-2"> </div>
                <div class="col-xs-8">
                    <div class = "Picture">
                        <p> <img src = """),_display_(/*32.41*/project/*32.48*/.sc1),format.raw/*32.52*/(""" """),format.raw/*32.53*/("""style="width:600px;height:350px"> </p>
                    </div>
                </div>
                <div class = "col-xs-2"> </div>
            </div>
            <div class="row">
                <div class = "col-xs-2"> </div>
                <div class="col-xs-8">
                    <div class = "Button">
                        <button type="button" class="btn btn-default -lg" onclick="location.href='http://localhost:9000/profile/' + """),_display_(/*41.134*/project/*41.141*/.id),format.raw/*41.144*/(""" """),format.raw/*41.145*/("""">
                            <span class="glyphicon glyphicon-arrow-left" aria-hidden="true" ></span> Go Back
                        </button>
                    </div>
                </div>
                <div class = "col-xs-2"> </div>
            </div>
        </div>
    </body>
    """),format.raw/*50.17*/("""
        """),format.raw/*51.32*/("""
            """),format.raw/*52.40*/("""
            """),format.raw/*53.42*/("""
            """),format.raw/*54.44*/("""
            """),format.raw/*55.44*/("""
            """),format.raw/*56.26*/("""
            """),format.raw/*57.27*/("""
        """),format.raw/*58.14*/("""
        """),format.raw/*59.48*/("""
        """),format.raw/*60.35*/("""
            """),format.raw/*61.34*/("""
        """),format.raw/*62.14*/("""
        """),format.raw/*63.23*/("""
    """),format.raw/*64.18*/("""
"""),format.raw/*65.1*/("""</html>
"""))}
  }

  def render(project:Project,member:List[Member]): play.twirl.api.HtmlFormat.Appendable = apply(project)(member)

  def f:((Project) => (List[Member]) => play.twirl.api.HtmlFormat.Appendable) = (project) => (member) => apply(project)(member)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Apr 01 20:55:20 ICT 2015
                  SOURCE: /Users/nathakorn/Documents/Team2Big2Slim/app/views/screenshot1.scala.html
                  HASH: 8cad11820039a84eff439d4d5aa0eab0b03558e5
                  MATRIX: 743->1|874->44|901->45|2144->1261|2160->1268|2185->1272|2214->1273|2691->1722|2708->1729|2733->1732|2763->1733|3085->2039|3122->2071|3163->2111|3204->2153|3245->2197|3286->2241|3327->2267|3368->2294|3405->2308|3442->2356|3479->2391|3520->2425|3557->2439|3594->2462|3627->2480|3655->2481
                  LINES: 26->1|29->1|30->2|60->32|60->32|60->32|60->32|69->41|69->41|69->41|69->41|78->50|79->51|80->52|81->53|82->54|83->55|84->56|85->57|86->58|87->59|88->60|89->61|90->62|91->63|92->64|93->65
                  -- GENERATED --
              */
          
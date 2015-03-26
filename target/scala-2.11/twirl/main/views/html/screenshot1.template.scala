
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
object screenshot1 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
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
                        <p> <img src = "http://i.ytimg.com/vi/1gnbUusxRks/maxresdefault.jpg" style="width:600px;height:350px"> </p>
                    </div>
                </div>
                <div class = "col-xs-2"> </div>
            </div>
            <div class="row">
                <div class = "col-xs-2"> </div>
                <div class="col-xs-8">
                    <div class = "Button">
                        <button type="button" class="btn btn-default -lg" onclick="location.href='http://localhost:9000/profile'">
                            <span class="glyphicon glyphicon-arrow-left" aria-hidden="true" ></span> Go Back
                        </button>
                    </div>
                </div>
                <div class = "col-xs-2"> </div>
            </div>
        </div>
    </body>
    <script>
        function getdate()"""),format.raw/*50.27*/("""{"""),format.raw/*50.28*/("""
            """),format.raw/*51.13*/("""var today = new Date();
            var h = today.getHours();
            var m = today.getMinutes();
            var s = today.getSeconds();
            if(s<10)"""),format.raw/*55.21*/("""{"""),format.raw/*55.22*/("""
            """),format.raw/*56.13*/("""s = "0"+s;
        """),format.raw/*57.9*/("""}"""),format.raw/*57.10*/("""
        """),format.raw/*58.9*/("""$("clock").text(h+" : "+m+" : "+s);
        setTimeout(function()"""),format.raw/*59.30*/("""{"""),format.raw/*59.31*/("""
            """),format.raw/*60.13*/("""getdate()"""),format.raw/*60.22*/("""}"""),format.raw/*60.23*/(""", 500);
        """),format.raw/*61.9*/("""}"""),format.raw/*61.10*/("""
        """),format.raw/*62.9*/("""getdate();

    </script>
</html>
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Mar 26 13:22:33 ICT 2015
                  SOURCE: /Users/nathakorn/Documents/Team2Big2Slim/app/views/screenshot1.scala.html
                  HASH: a165ee0b8d1c1a89cbc8b765e873408dea9a235b
                  MATRIX: 804->0|2874->2042|2903->2043|2944->2056|3134->2218|3163->2219|3204->2232|3250->2251|3279->2252|3315->2261|3408->2326|3437->2327|3478->2340|3515->2349|3544->2350|3587->2366|3616->2367|3652->2376
                  LINES: 29->1|78->50|78->50|79->51|83->55|83->55|84->56|85->57|85->57|86->58|87->59|87->59|88->60|88->60|88->60|89->61|89->61|90->62
                  -- GENERATED --
              */
          
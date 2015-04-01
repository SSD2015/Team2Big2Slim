
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
    <script>
        function getdate()"""),format.raw/*51.27*/("""{"""),format.raw/*51.28*/("""
            """),format.raw/*52.13*/("""var today = new Date();
            var h = today.getHours();
            var m = today.getMinutes();
            var s = today.getSeconds();
            if(s<10)"""),format.raw/*56.21*/("""{"""),format.raw/*56.22*/("""
            """),format.raw/*57.13*/("""s = "0"+s;
        """),format.raw/*58.9*/("""}"""),format.raw/*58.10*/("""
        """),format.raw/*59.9*/("""$("clock").text(h+" : "+m+" : "+s);
        setTimeout(function()"""),format.raw/*60.30*/("""{"""),format.raw/*60.31*/("""
            """),format.raw/*61.13*/("""getdate()"""),format.raw/*61.22*/("""}"""),format.raw/*61.23*/(""", 500);
        """),format.raw/*62.9*/("""}"""),format.raw/*62.10*/("""
        """),format.raw/*63.9*/("""getdate();

    </script>
</html>
"""))}
  }

  def render(project:Project,member:List[Member]): play.twirl.api.HtmlFormat.Appendable = apply(project)(member)

  def f:((Project) => (List[Member]) => play.twirl.api.HtmlFormat.Appendable) = (project) => (member) => apply(project)(member)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Apr 01 20:42:02 ICT 2015
                  SOURCE: /Users/nathakorn/Documents/Team2Big2Slim/app/views/screenshot1.scala.html
                  HASH: b0f599d5a23715b235e01ab81b4680d8e24f5619
                  MATRIX: 743->1|874->44|901->45|2144->1261|2160->1268|2185->1272|2214->1273|2691->1722|2708->1729|2733->1732|2763->1733|3120->2062|3149->2063|3190->2076|3380->2238|3409->2239|3450->2252|3496->2271|3525->2272|3561->2281|3654->2346|3683->2347|3724->2360|3761->2369|3790->2370|3833->2386|3862->2387|3898->2396
                  LINES: 26->1|29->1|30->2|60->32|60->32|60->32|60->32|69->41|69->41|69->41|69->41|79->51|79->51|80->52|84->56|84->56|85->57|86->58|86->58|87->59|88->60|88->60|89->61|89->61|89->61|90->62|90->62|91->63
                  -- GENERATED --
              */
          
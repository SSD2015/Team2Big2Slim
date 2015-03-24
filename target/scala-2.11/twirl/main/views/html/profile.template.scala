
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
    <title>Bootstrap Example</title>
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
        .NameProject"""),format.raw/*15.21*/("""{"""),format.raw/*15.22*/("""
            """),format.raw/*16.13*/("""font-size : 300%;
            color : mediumvioletred;
        """),format.raw/*18.9*/("""}"""),format.raw/*18.10*/("""
        """),format.raw/*19.9*/(""".Description"""),format.raw/*19.21*/("""{"""),format.raw/*19.22*/("""
            """),format.raw/*20.13*/("""font-size : 250%;
            color : green;
        """),format.raw/*22.9*/("""}"""),format.raw/*22.10*/("""
        """),format.raw/*23.9*/(""".ScreenShot"""),format.raw/*23.20*/("""{"""),format.raw/*23.21*/("""
            """),format.raw/*24.13*/("""font-size : 250%;
            color : green;
        """),format.raw/*26.9*/("""}"""),format.raw/*26.10*/("""
        """),format.raw/*27.9*/("""body1"""),format.raw/*27.14*/("""{"""),format.raw/*27.15*/("""
            """),format.raw/*28.13*/("""position:absolute;
            top:0px;
            left:300px;
        """),format.raw/*31.9*/("""}"""),format.raw/*31.10*/("""
        """),format.raw/*32.9*/("""p"""),format.raw/*32.10*/("""{"""),format.raw/*32.11*/("""
            """),format.raw/*33.13*/("""font-style: oblique;
        """),format.raw/*34.9*/("""}"""),format.raw/*34.10*/("""

        """),format.raw/*36.9*/(""".carousel-inner > .item > img,
        .carousel-inner > .item > a > img """),format.raw/*37.43*/("""{"""),format.raw/*37.44*/("""
        """),format.raw/*38.9*/("""width: 160%;
        margin: auto;
        """),format.raw/*40.9*/("""}"""),format.raw/*40.10*/("""
        """),format.raw/*41.9*/(""".container"""),format.raw/*41.19*/("""{"""),format.raw/*41.20*/("""
            """),format.raw/*42.13*/("""width : 600px;
            height : 400px;
        """),format.raw/*44.9*/("""}"""),format.raw/*44.10*/("""
    """),format.raw/*45.5*/("""</style>

    <head>
        <title>Profile:GTA</title>
        <meta charset = "UTF-8" />
    </head>

    <body1>
        <div class = "NameProject">
            <h style="font-family:verdana" >Grand Theft Auto V </h>
        </div>
        <div class = "PictureProject">
            <p> <img src = "http://static.sportskeeda.com/wp-content/uploads/2014/08/gta-v-1409058623.jpg" style="width:600px;height:350px"> </p>
        </div>
        <div class = "Description">
            <h style="font-family:verdana" >Description:</h>
        </div>
        <div class = "Information">
            <p>Project name: GTA</p>
            <p>Type of project: Game</p>
            <p>Member: Korn , PP ,Mo , Sompat , Nut</p>
        </div>
        <div class = ScreenShot>
            <h style="font-family:verdana" >ScreenShot:</h>
        </div>

        <div class="container">
            <br>
            <div id="myCarousel" class="carousel slide" data-ride="carousel">
                    <!-- Indicators -->
                <ol class="carousel-indicators">
                    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                    <li data-target="#myCarousel" data-slide-to="1"></li>
                    <li data-target="#myCarousel" data-slide-to="2"></li>

                </ol>

                    <!-- Wrapper for slides -->
                <div class="carousel-inner" role="listbox">
                    <div class="item active">
                        <button > <img src="http://i.ytimg.com/vi/1gnbUusxRks/maxresdefault.jpg" alt="Chania" width="553.5" height="345" onclick="location.href='http://localhost:9000/screenshot1'"> </button>
                    </div>

                    <div class="item">
                        <button> <img src="http://i.ytimg.com/vi/0YEY4PVbg0E/maxresdefault.jpg" alt="Chania" width="553.5" height="345" onclick="location.href='http://localhost:9000/screenshot2'"> </button>
                    </div>

                    <div class="item">
                        <button> <img src="http://i.ytimg.com/vi/lAdBJQXoCpc/maxresdefault.jpg" alt="Flower" width="553.5" height="345" onclick="location.href='http://localhost:9000/screenshot3'"> </button>
                    </div>
                </div>

                    <!-- Left and right controls -->
                <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
                    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
                    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>
        </div>
    </body1>
    <div id="content"></div>
</html>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Mar 24 21:30:34 ICT 2015
                  SOURCE: /Users/nathakorn/Documents/Team2Big2Slim/app/views/profile.scala.html
                  HASH: dbcf6f176fb308933da207d01488573dd37bc5f3
                  MATRIX: 800->0|1624->796|1653->797|1694->810|1784->873|1813->874|1849->883|1889->895|1918->896|1959->909|2039->962|2068->963|2104->972|2143->983|2172->984|2213->997|2293->1050|2322->1051|2358->1060|2391->1065|2420->1066|2461->1079|2560->1151|2589->1152|2625->1161|2654->1162|2683->1163|2724->1176|2780->1205|2809->1206|2846->1216|2947->1289|2976->1290|3012->1299|3082->1342|3111->1343|3147->1352|3185->1362|3214->1363|3255->1376|3333->1427|3362->1428|3394->1433
                  LINES: 29->1|43->15|43->15|44->16|46->18|46->18|47->19|47->19|47->19|48->20|50->22|50->22|51->23|51->23|51->23|52->24|54->26|54->26|55->27|55->27|55->27|56->28|59->31|59->31|60->32|60->32|60->32|61->33|62->34|62->34|64->36|65->37|65->37|66->38|68->40|68->40|69->41|69->41|69->41|70->42|72->44|72->44|73->45
                  -- GENERATED --
              */
          
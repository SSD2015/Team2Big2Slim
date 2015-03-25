
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
    <style>
        .NameProject"""),format.raw/*15.21*/("""{"""),format.raw/*15.22*/("""
            """),format.raw/*16.13*/("""font-size : 250%;
            color : black;
        """),format.raw/*18.9*/("""}"""),format.raw/*18.10*/("""
        """),format.raw/*19.9*/(""".Description"""),format.raw/*19.21*/("""{"""),format.raw/*19.22*/("""
            """),format.raw/*20.13*/("""font-size : 250%;
            color : black;
        """),format.raw/*22.9*/("""}"""),format.raw/*22.10*/("""
        """),format.raw/*23.9*/(""".ScreenShot"""),format.raw/*23.20*/("""{"""),format.raw/*23.21*/("""
            """),format.raw/*24.13*/("""font-size : 250%;
            color : black;
        """),format.raw/*26.9*/("""}"""),format.raw/*26.10*/("""
        """),format.raw/*27.9*/("""p"""),format.raw/*27.10*/("""{"""),format.raw/*27.11*/("""
            """),format.raw/*28.13*/("""font-style: normal;
        """),format.raw/*29.9*/("""}"""),format.raw/*29.10*/("""
       """),format.raw/*30.8*/(""".Line"""),format.raw/*30.13*/("""{"""),format.raw/*30.14*/("""
            """),format.raw/*31.13*/("""border-bottom: 1px dashed;
        """),format.raw/*32.9*/("""}"""),format.raw/*32.10*/("""

        """),format.raw/*34.9*/(""".carousel-inner > .item > img,
        .carousel-inner > .item > a > img """),format.raw/*35.43*/("""{"""),format.raw/*35.44*/("""
        """),format.raw/*36.9*/("""width: auto;
        margin: auto;
        """),format.raw/*38.9*/("""}"""),format.raw/*38.10*/("""
        """),format.raw/*39.9*/(""".container"""),format.raw/*39.19*/("""{"""),format.raw/*39.20*/("""
            """),format.raw/*40.13*/("""width : 600px;
            height : 400px;
        """),format.raw/*42.9*/("""}"""),format.raw/*42.10*/("""
    """),format.raw/*43.5*/("""</style>

    <head>
        <title>Profile:GTA</title>
        <meta charset = "UTF-8" />
    </head>

    <body>
        <div class="container-fluid">
            <div class="row">
                <div class = "col-xs-2"> </div>
                <div class="col-xs-8">
                    <div class = "NameProject">
                        <h style="font-family:verdana" >Grand Theft Auto V</h>
                    </div>
                </div>
                <div class = "col-xs-2"> </div>
            </div>
            <div class="row">
                <div class = "col-xs-2"> </div>
                <div class="col-xs-8">
                    <div class = "PictureProject">
                        <p> <img src = "http://static.sportskeeda.com/wp-content/uploads/2014/08/gta-v-1409058623.jpg" style="width:700px;height:450px"> </p>
                    </div>
                </div>
                <div class = "col-xs-2"> </div>
            </div>
            <div class="row">
                <div class="col-xs-12">
                    <div class = "Line"></div>
                </div>
            </div>
            <div class="row">
                <div class = "col-xs-2"> </div>
                <div class="col-xs-8">
                    <div class = "Description">
                        <h style="font-family:verdana" >Description</h>
                    </div>
                </div>
                <div class = "col-xs-2"> </div>
            </div>
            <div class="row">
                <div class = "col-xs-2"> </div>
                <div class="col-xs-8">
                    <div class = "Information">
                        <p>Project name: GTA</p>
                        <p>Type of project: Game</p>
                        <p>Member: Korn , PP ,Mo , Sompat , Nut</p>
                    </div>
                </div>
                <div class = "col-xs-2"> </div>
            </div>
            <div class="row">
                <div class="col-xs-12">
                    <div class = "Line"></div>
                </div>
            </div>
            <div class="row">
                <div class = "col-xs-2"> </div>
                <div class="col-xs-8">
                    <div class = ScreenShot>
                        <h style="font-family:verdana" >Screenshot</h>
                    </div>
                </div>
                <div class = "col-xs-2"> </div>
            </div>
            <div class="row">
                <div class = "col-xs-2"> </div>
                <div class="col-xs-8">
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
                                    <button class = "Picture"> <img src="http://i.ytimg.com/vi/1gnbUusxRks/maxresdefault.jpg" alt="Chania" width="553.5" height="345" onclick="location.href='http://localhost:9000/screenshot1'"> </button>
                                </div>
                                <div class="item">
                                    <button class = "Picture"> <img src="http://i.ytimg.com/vi/0YEY4PVbg0E/maxresdefault.jpg" alt="Chania" width="553.5" height="345" onclick="location.href='http://localhost:9000/screenshot2'"> </button>
                                </div>

                                <div class="item">
                                    <button class = "Picture"> <img src="http://i.ytimg.com/vi/lAdBJQXoCpc/maxresdefault.jpg" alt="Flower" width="553.5" height="345" onclick="location.href='http://localhost:9000/screenshot3'"> </button>
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
                </div>
                <div class = "col-xs-2"> </div>
            </div>
        </div>
        <div class="row">
            <div class="col-xs-12">
                <div class = "Line"></div>
            </div>
        </div>
        <div class="row">
            <div class = "col-xs-2"> </div>
            <div class="col-xs-8">
                <div class = ScreenShot>
                    <h style="font-family:verdana" >Rate</h>
                </div>
            </div>
            <div class = "col-xs-2"> </div>
        </div>
    </body>
    <div id="content"></div>
</html>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 25 23:49:06 ICT 2015
                  SOURCE: /Users/nathakorn/Documents/Team2Big2Slim/app/views/profile.scala.html
                  HASH: ae4c609326ad48b80c4832630083375b4852026f
                  MATRIX: 800->0|1625->797|1654->798|1695->811|1775->864|1804->865|1840->874|1880->886|1909->887|1950->900|2030->953|2059->954|2095->963|2134->974|2163->975|2204->988|2284->1041|2313->1042|2349->1051|2378->1052|2407->1053|2448->1066|2503->1094|2532->1095|2567->1103|2600->1108|2629->1109|2670->1122|2732->1157|2761->1158|2798->1168|2899->1241|2928->1242|2964->1251|3034->1294|3063->1295|3099->1304|3137->1314|3166->1315|3207->1328|3285->1379|3314->1380|3346->1385
                  LINES: 29->1|43->15|43->15|44->16|46->18|46->18|47->19|47->19|47->19|48->20|50->22|50->22|51->23|51->23|51->23|52->24|54->26|54->26|55->27|55->27|55->27|56->28|57->29|57->29|58->30|58->30|58->30|59->31|60->32|60->32|62->34|63->35|63->35|64->36|66->38|66->38|67->39|67->39|67->39|68->40|70->42|70->42|71->43
                  -- GENERATED --
              */
          
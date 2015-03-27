
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
object profile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Project,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(projects : Project):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.22*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE HTML>
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
        .NameProject"""),format.raw/*16.21*/("""{"""),format.raw/*16.22*/("""
            """),format.raw/*17.13*/("""font-size : 250%;
            color : black;
        """),format.raw/*19.9*/("""}"""),format.raw/*19.10*/("""
        """),format.raw/*20.9*/(""".Description"""),format.raw/*20.21*/("""{"""),format.raw/*20.22*/("""
            """),format.raw/*21.13*/("""font-size : 250%;
            color : black;
        """),format.raw/*23.9*/("""}"""),format.raw/*23.10*/("""
        """),format.raw/*24.9*/(""".ScreenShot"""),format.raw/*24.20*/("""{"""),format.raw/*24.21*/("""
            """),format.raw/*25.13*/("""font-size : 250%;
            color : black;
        """),format.raw/*27.9*/("""}"""),format.raw/*27.10*/("""
        """),format.raw/*28.9*/("""p"""),format.raw/*28.10*/("""{"""),format.raw/*28.11*/("""
            """),format.raw/*29.13*/("""font-style: normal;
        """),format.raw/*30.9*/("""}"""),format.raw/*30.10*/("""
       """),format.raw/*31.8*/(""".Line"""),format.raw/*31.13*/("""{"""),format.raw/*31.14*/("""
            """),format.raw/*32.13*/("""border-bottom: 1px dashed;
        """),format.raw/*33.9*/("""}"""),format.raw/*33.10*/("""

        """),format.raw/*35.9*/(""".carousel-inner > .item > img,
        .carousel-inner > .item > a > img """),format.raw/*36.43*/("""{"""),format.raw/*36.44*/("""
        """),format.raw/*37.9*/("""width: auto;
        margin: auto;
        """),format.raw/*39.9*/("""}"""),format.raw/*39.10*/("""
        """),format.raw/*40.9*/(""".container"""),format.raw/*40.19*/("""{"""),format.raw/*40.20*/("""
            """),format.raw/*41.13*/("""width : 600px;
            height : 400px;
        """),format.raw/*43.9*/("""}"""),format.raw/*43.10*/("""
    """),format.raw/*44.5*/("""</style>

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
                        <h style="font-family:verdana" >"""),_display_(/*57.58*/projects/*57.66*/.projectName),format.raw/*57.78*/("""</h>
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
                <div class = "col-xs-1"> </div>
                <div class="col-xs-9">
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

  def render(projects:Project): play.twirl.api.HtmlFormat.Appendable = apply(projects)

  def f:((Project) => play.twirl.api.HtmlFormat.Appendable) = (projects) => apply(projects)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Mar 27 11:37:23 ICT 2015
                  SOURCE: /Users/nathakorn/Documents/Team2Big2Slim/app/views/profile.scala.html
                  HASH: eb83be5600b3bd24b3aee762c5310714f317c61e
                  MATRIX: 726->1|834->21|861->22|1686->819|1715->820|1756->833|1836->886|1865->887|1901->896|1941->908|1970->909|2011->922|2091->975|2120->976|2156->985|2195->996|2224->997|2265->1010|2345->1063|2374->1064|2410->1073|2439->1074|2468->1075|2509->1088|2564->1116|2593->1117|2628->1125|2661->1130|2690->1131|2731->1144|2793->1179|2822->1180|2859->1190|2960->1263|2989->1264|3025->1273|3095->1316|3124->1317|3160->1326|3198->1336|3227->1337|3268->1350|3346->1401|3375->1402|3407->1407|3809->1782|3826->1790|3859->1802
                  LINES: 26->1|29->1|30->2|44->16|44->16|45->17|47->19|47->19|48->20|48->20|48->20|49->21|51->23|51->23|52->24|52->24|52->24|53->25|55->27|55->27|56->28|56->28|56->28|57->29|58->30|58->30|59->31|59->31|59->31|60->32|61->33|61->33|63->35|64->36|64->36|65->37|67->39|67->39|68->40|68->40|68->40|69->41|71->43|71->43|72->44|85->57|85->57|85->57
                  -- GENERATED --
              */
          
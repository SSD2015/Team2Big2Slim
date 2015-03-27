
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
  def apply/*1.2*/(project : Project):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.21*/("""
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
                        <h style="font-family:verdana" >"""),_display_(/*57.58*/project/*57.65*/.projectName),format.raw/*57.77*/("""</h>
                    </div>
                </div>
                <div class = "col-xs-2"> </div>
            </div>
            <div class="row">
                <div class = "col-xs-2"> </div>
                <div class="col-xs-8">
                    <div class = "PictureProject">
                        <p> <img src = """),_display_(/*66.41*/project/*66.48*/.PicProject),format.raw/*66.59*/(""" """),format.raw/*66.60*/("""style="width:700px;height:450px"> </p>
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
                        <p>Project name: """),_display_(/*89.43*/project/*89.50*/.projectName),format.raw/*89.62*/("""</p>
                        <p>Type of project: """),_display_(/*90.46*/project/*90.53*/.typeApp),format.raw/*90.61*/("""</p>
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

  def render(project:Project): play.twirl.api.HtmlFormat.Appendable = apply(project)

  def f:((Project) => play.twirl.api.HtmlFormat.Appendable) = (project) => apply(project)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Mar 27 15:23:24 ICT 2015
                  SOURCE: /Users/nathakorn/Documents/Team2Big2Slim/app/views/profile.scala.html
                  HASH: b3fdb5460e34334eba557af432265e6da31be7f8
                  MATRIX: 726->1|833->20|860->21|1685->818|1714->819|1755->832|1835->885|1864->886|1900->895|1940->907|1969->908|2010->921|2090->974|2119->975|2155->984|2194->995|2223->996|2264->1009|2344->1062|2373->1063|2409->1072|2438->1073|2467->1074|2508->1087|2563->1115|2592->1116|2627->1124|2660->1129|2689->1130|2730->1143|2792->1178|2821->1179|2858->1189|2959->1262|2988->1263|3024->1272|3094->1315|3123->1316|3159->1325|3197->1335|3226->1336|3267->1349|3345->1400|3374->1401|3406->1406|3808->1781|3824->1788|3857->1800|4214->2130|4230->2137|4262->2148|4291->2149|5194->3025|5210->3032|5243->3044|5320->3094|5336->3101|5365->3109
                  LINES: 26->1|29->1|30->2|44->16|44->16|45->17|47->19|47->19|48->20|48->20|48->20|49->21|51->23|51->23|52->24|52->24|52->24|53->25|55->27|55->27|56->28|56->28|56->28|57->29|58->30|58->30|59->31|59->31|59->31|60->32|61->33|61->33|63->35|64->36|64->36|65->37|67->39|67->39|68->40|68->40|68->40|69->41|71->43|71->43|72->44|85->57|85->57|85->57|94->66|94->66|94->66|94->66|117->89|117->89|117->89|118->90|118->90|118->90
                  -- GENERATED --
              */
          
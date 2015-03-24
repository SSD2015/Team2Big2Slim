
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
        <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
        <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">
    <style>
        .NameProject"""),format.raw/*8.21*/("""{"""),format.raw/*8.22*/("""
            """),format.raw/*9.13*/("""font-size : 300%;
            color : mediumvioletred;
        """),format.raw/*11.9*/("""}"""),format.raw/*11.10*/("""
        """),format.raw/*12.9*/(""".Description"""),format.raw/*12.21*/("""{"""),format.raw/*12.22*/("""
            """),format.raw/*13.13*/("""font-size : 250%;
            color : green;
        """),format.raw/*15.9*/("""}"""),format.raw/*15.10*/("""
        """),format.raw/*16.9*/(""".ScreenShot"""),format.raw/*16.20*/("""{"""),format.raw/*16.21*/("""
            """),format.raw/*17.13*/("""font-size : 250%;
            color : green;
        """),format.raw/*19.9*/("""}"""),format.raw/*19.10*/("""
        """),format.raw/*20.9*/("""body1
        """),format.raw/*21.9*/("""{"""),format.raw/*21.10*/("""
            """),format.raw/*22.13*/("""position:absolute;
            top:0px;
            left:300px;
        """),format.raw/*25.9*/("""}"""),format.raw/*25.10*/("""
        """),format.raw/*26.9*/("""body2
        """),format.raw/*27.9*/("""{"""),format.raw/*27.10*/("""
            """),format.raw/*28.13*/("""position:absolute;
            top:825px;
            left:300px;
        """),format.raw/*31.9*/("""}"""),format.raw/*31.10*/("""
        """),format.raw/*32.9*/("""p
        """),format.raw/*33.9*/("""{"""),format.raw/*33.10*/("""
            """),format.raw/*34.13*/("""font-style: oblique;
        """),format.raw/*35.9*/("""}"""),format.raw/*35.10*/("""
    """),format.raw/*36.5*/("""</style>

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
        <div class = "PictureScreenShot">
            <p>
                <button> <img src="http://i.ytimg.com/vi/1gnbUusxRks/maxresdefault.jpg" style="width:180px;height:128px" onclick="location.href='http://i.ytimg.com/vi/1gnbUusxRks/maxresdefault.jpg'"> </button>
                <button> <img src="http://i.ytimg.com/vi/0YEY4PVbg0E/maxresdefault.jpg" style="width:180px;height:128px" onclick="location.href='http://i.ytimg.com/vi/0YEY4PVbg0E/maxresdefault.jpg'"> </button>
                <button> <img src="http://i.ytimg.com/vi/lAdBJQXoCpc/maxresdefault.jpg" style="width:180px;height:128px" onclick="location.href='http://i.ytimg.com/vi/lAdBJQXoCpc/maxresdefault.jpg'"> </button>
            </p>
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
                  DATE: Tue Mar 24 18:38:16 ICT 2015
                  SOURCE: /Users/nathakorn/Documents/Team2Big2Slim/app/views/profile.scala.html
                  HASH: f262cb6d2734dca19a3c90dab2523feee3b1bce4
                  MATRIX: 800->0|1192->365|1220->366|1260->379|1350->442|1379->443|1415->452|1455->464|1484->465|1525->478|1605->531|1634->532|1670->541|1709->552|1738->553|1779->566|1859->619|1888->620|1924->629|1965->643|1994->644|2035->657|2134->729|2163->730|2199->739|2240->753|2269->754|2310->767|2411->841|2440->842|2476->851|2513->861|2542->862|2583->875|2639->904|2668->905|2700->910
                  LINES: 29->1|36->8|36->8|37->9|39->11|39->11|40->12|40->12|40->12|41->13|43->15|43->15|44->16|44->16|44->16|45->17|47->19|47->19|48->20|49->21|49->21|50->22|53->25|53->25|54->26|55->27|55->27|56->28|59->31|59->31|60->32|61->33|61->33|62->34|63->35|63->35|64->36
                  -- GENERATED --
              */
          
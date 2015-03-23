
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

    <style>
        h1,h2
        """),format.raw/*6.9*/("""{"""),format.raw/*6.10*/("""
            """),format.raw/*7.13*/("""color : green
        """),format.raw/*8.9*/("""}"""),format.raw/*8.10*/("""
        """),format.raw/*9.9*/("""body1
        """),format.raw/*10.9*/("""{"""),format.raw/*10.10*/("""
            """),format.raw/*11.13*/("""position:absolute;
            top:0px;
            left:300px;
        """),format.raw/*14.9*/("""}"""),format.raw/*14.10*/("""
        """),format.raw/*15.9*/("""body2
        """),format.raw/*16.9*/("""{"""),format.raw/*16.10*/("""
            """),format.raw/*17.13*/("""position:absolute;
            top:825px;
            left:300px;
        """),format.raw/*20.9*/("""}"""),format.raw/*20.10*/("""
        """),format.raw/*21.9*/("""p1
        """),format.raw/*22.9*/("""{"""),format.raw/*22.10*/("""
            """),format.raw/*23.13*/("""position:absolute;
            top:850px;
            left:300px;
        """),format.raw/*26.9*/("""}"""),format.raw/*26.10*/("""
    """),format.raw/*27.5*/("""</style>
    <head>
        <title>Profile:GTA</title>
        <meta charset = "UTF-8" />
        </head>
            <body1 style="background-color: pink">
                <h1 style="font-family:verdana" >Profile: </h1>
                <p> <img src = "http://static.sportskeeda.com/wp-content/uploads/2014/08/gta-v-1409058623.jpg" style="width:600px;height:350px"> </p>
                <h2 style="font-family:verdana" >Description:</h2>
                <p>Project name: GTA</p>
                <p>Type of project: Game</p>
                <p>Member: Korn , PP ,Mo , Sompat , Nut</p>
                <h1 style="font-family:verdana" >ScreenShot:</h1>
                <p>
                <button> <img src="http://i.ytimg.com/vi/TM6JCG6LIHo/maxresdefault.jpg" style="width:180px;height:128px" onclick="location.href='http://i.ytimg.com/vi/TM6JCG6LIHo/maxresdefault.jpg'"> </button>
                <button> <img src="http://i.ytimg.com/vi/0YEY4PVbg0E/maxresdefault.jpg" style="width:180px;height:128px" onclick="location.href='http://i.ytimg.com/vi/0YEY4PVbg0E/maxresdefault.jpg'"> </button>
                <button> <img src="http://i.ytimg.com/vi/lAdBJQXoCpc/maxresdefault.jpg" style="width:180px;height:128px" onclick="location.href='http://i.ytimg.com/vi/lAdBJQXoCpc/maxresdefault.jpg'"> </button>
                </p>
                <button type="button" onclick="getElementById('content').innerHTML ='<p1>Date start: 14/02/15<br> ' +
                'Date finish : 20/3/15<br> </p1>'">Read more!
                </button>
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
                  DATE: Mon Mar 23 20:54:19 ICT 2015
                  SOURCE: /Users/nathakorn/Documents/Team2Big2Slim/app/views/profile.scala.html
                  HASH: 0fca134a42df0856ca1d675b9dfeb5911337f955
                  MATRIX: 800->0|896->70|924->71|964->84|1012->106|1040->107|1075->116|1116->130|1145->131|1186->144|1285->216|1314->217|1350->226|1391->240|1420->241|1461->254|1562->328|1591->329|1627->338|1665->349|1694->350|1735->363|1836->437|1865->438|1897->443
                  LINES: 29->1|34->6|34->6|35->7|36->8|36->8|37->9|38->10|38->10|39->11|42->14|42->14|43->15|44->16|44->16|45->17|48->20|48->20|49->21|50->22|50->22|51->23|54->26|54->26|55->27
                  -- GENERATED --
              */
          
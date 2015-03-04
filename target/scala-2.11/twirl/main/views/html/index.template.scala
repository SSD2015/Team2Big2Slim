
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*2.2*/main("Main Menu")/*2.19*/ {_display_(Seq[Any](format.raw/*2.21*/("""
    """),format.raw/*3.5*/("""<html>
        <head>
        <!-- Bootstrap -->
            <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
            <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
            <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

            <!-- CSS -->
            <style>
                html, body """),format.raw/*12.28*/("""{"""),format.raw/*12.29*/("""
                    """),format.raw/*13.21*/("""max-width: 100%;
                    overflow-x: hidden;
                """),format.raw/*15.17*/("""}"""),format.raw/*15.18*/("""
                """),format.raw/*16.17*/(""".header """),format.raw/*16.25*/("""{"""),format.raw/*16.26*/("""
                """),format.raw/*17.17*/("""float: right;
                /*width: 300px;     */
                """),format.raw/*19.17*/("""}"""),format.raw/*19.18*/("""
                """),format.raw/*20.17*/(""".toppanel """),format.raw/*20.27*/("""{"""),format.raw/*20.28*/("""
                    """),format.raw/*21.21*/("""position: fixed;
                    background-color: #ff8080;
                    color: white;
                    /*text-align: center;*/
                    padding: 20px;
                    width: 100%;
                    z-index: 1;
                """),format.raw/*28.17*/("""}"""),format.raw/*28.18*/("""
                """),format.raw/*29.17*/(""".projectlist """),format.raw/*29.30*/("""{"""),format.raw/*29.31*/("""
                    """),format.raw/*30.21*/("""position: absolute;
                    top: 100px;
                    z-index: 0;
                    width: 100%;
                """),format.raw/*34.17*/("""}"""),format.raw/*34.18*/("""
                """),format.raw/*35.17*/(""".project """),format.raw/*35.26*/("""{"""),format.raw/*35.27*/("""
                    """),format.raw/*36.21*/("""width: 100%;
                """),format.raw/*37.17*/("""}"""),format.raw/*37.18*/("""
                """),format.raw/*38.17*/(""".container """),format.raw/*38.28*/("""{"""),format.raw/*38.29*/("""
                    """),format.raw/*39.21*/("""/*position: ;*/
                    margin-left: 0px;
                """),format.raw/*41.17*/("""}"""),format.raw/*41.18*/("""
            """),format.raw/*42.13*/("""</style>
        </head>

        <body>
        <div class="container">
            <div class="toppanel">
                <image src = "assets/option_bar.jpg" title = "option"></image>
                <div class="dropdown" style="float: right;">
                        <button class="btn btn-default dropdown-toggle btn-lg" type="button" id="optionmenu" data-toggle="dropdown" aria-expanded="true">
                        <span class="glyphicon glyphicon-option-vertical" aria-hidden="true"></span>
                        <span class="caret"></span>
                        </button>
                        <ul class="dropdown-menu dropdown-menu-right" role="menu" aria-labelledby="optionmenu">
                            <li role="presentation" onclick="camerabEvent()" id="camera"><a role="menuitem" tabindex="-1" href="#">
                            <span class="glyphicon glyphicon-camera" aria-hidden="true"></span> Camera</a></li>
                            <li role="presentation" onclick="votebEvent()" id="vote"><a role="menuitem" tabindex="-1" href="#">
                            <span class="glyphicon glyphicon-star" aria-hidden="true"></span> Vote</a></li>
                            <li role="presentation" onclick="logoutbEvent()" id="logout"><a role="menuitem" tabindex="-1" href="#">
                            <span class="glyphicon glyphicon-off" aria-hidden="true"></span> Logout</a></li>
                        </ul>
                    </div>
            </div>

            <div class="projectlist">
                <image class="project" src = "assets/template_g1.jpg" title = "group1"></image>

                <br>
                <br>

                <image class="project" src = "assets/template_g2.jpg" title = "group2"></image>

                <br>
                <br>

                <image class="project" src = "assets/template_g3.jpg" title = "group3"></image>

                <br>
                <br>

                <image class="project" src = "assets/template_g4.jpg" title = "group4"></image>

                <br>
                <br>
            </div>>
            <!-- JQuery -->
            <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js">
                $(document).ready(function()"""),format.raw/*88.45*/("""{"""),format.raw/*88.46*/("""
                    """),format.raw/*89.21*/("""$("#camera").click(function()"""),format.raw/*89.50*/("""{"""),format.raw/*89.51*/("""
                        """),format.raw/*90.25*/("""alert("camera");
                    """),format.raw/*91.21*/("""}"""),format.raw/*91.22*/(""");

                """),format.raw/*93.17*/("""}"""),format.raw/*93.18*/(""");
            </script>

            <!-- JS -->
            <script>
                function camerabEvent() """),format.raw/*98.41*/("""{"""),format.raw/*98.42*/("""
                    """),format.raw/*99.21*/("""//open camera app
                    alert("camera");
                """),format.raw/*101.17*/("""}"""),format.raw/*101.18*/("""
                """),format.raw/*102.17*/("""function votebEvent() """),format.raw/*102.39*/("""{"""),format.raw/*102.40*/("""
                    """),format.raw/*103.21*/("""//actually go to vote page
                    alert("vote");
                """),format.raw/*105.17*/("""}"""),format.raw/*105.18*/("""
                """),format.raw/*106.17*/("""function logoutbEvent() """),format.raw/*106.41*/("""{"""),format.raw/*106.42*/("""
                    """),format.raw/*107.21*/("""//confirmation prompt out
                    confirm("Are you sure ?");
                """),format.raw/*109.17*/("""}"""),format.raw/*109.18*/("""
            """),format.raw/*110.13*/("""</script>
        </div>
        </body>
    </html>
""")))}),format.raw/*114.2*/("""
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 04 17:38:23 ICT 2015
                  SOURCE: /Users/Punpikorn/Desktop/2Big2Slim/Team2Big2Slim/app/views/index.scala.html
                  HASH: a21739cf64844a067585a3e16551a77a99f8c965
                  MATRIX: 798->2|823->19|862->21|893->26|1361->466|1390->467|1439->488|1540->561|1569->562|1614->579|1650->587|1679->588|1724->605|1821->674|1850->675|1895->692|1933->702|1962->703|2011->724|2297->982|2326->983|2371->1000|2412->1013|2441->1014|2490->1035|2651->1168|2680->1169|2725->1186|2762->1195|2791->1196|2840->1217|2897->1246|2926->1247|2971->1264|3010->1275|3039->1276|3088->1297|3186->1367|3215->1368|3256->1381|5564->3661|5593->3662|5642->3683|5699->3712|5728->3713|5781->3738|5846->3775|5875->3776|5923->3796|5952->3797|6091->3908|6120->3909|6169->3930|6269->4001|6299->4002|6345->4019|6396->4041|6426->4042|6476->4063|6583->4141|6613->4142|6659->4159|6712->4183|6742->4184|6792->4205|6910->4294|6940->4295|6982->4308|7067->4362
                  LINES: 29->2|29->2|29->2|30->3|39->12|39->12|40->13|42->15|42->15|43->16|43->16|43->16|44->17|46->19|46->19|47->20|47->20|47->20|48->21|55->28|55->28|56->29|56->29|56->29|57->30|61->34|61->34|62->35|62->35|62->35|63->36|64->37|64->37|65->38|65->38|65->38|66->39|68->41|68->41|69->42|115->88|115->88|116->89|116->89|116->89|117->90|118->91|118->91|120->93|120->93|125->98|125->98|126->99|128->101|128->101|129->102|129->102|129->102|130->103|132->105|132->105|133->106|133->106|133->106|134->107|136->109|136->109|137->110|141->114
                  -- GENERATED --
              */
          
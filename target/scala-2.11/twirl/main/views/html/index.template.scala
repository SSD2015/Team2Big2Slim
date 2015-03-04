
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
            <script src="//ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.min.js"></script>
            <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

            <!-- CSS -->
            <style>
                html, body """),format.raw/*13.28*/("""{"""),format.raw/*13.29*/("""
                    """),format.raw/*14.21*/("""max-width: 100%;
                    overflow-x: hidden;
                """),format.raw/*16.17*/("""}"""),format.raw/*16.18*/("""
                """),format.raw/*17.17*/(""".header """),format.raw/*17.25*/("""{"""),format.raw/*17.26*/("""
                """),format.raw/*18.17*/("""float: right;
                /*width: 300px;     */
                """),format.raw/*20.17*/("""}"""),format.raw/*20.18*/("""
                """),format.raw/*21.17*/(""".toppanel """),format.raw/*21.27*/("""{"""),format.raw/*21.28*/("""
                    """),format.raw/*22.21*/("""position: fixed;
                    background-color: #ff8080;
                    color: white;
                    /*text-align: center;*/
                    padding: 20px;
                    width: 100%;
                    z-index: 1;
                """),format.raw/*29.17*/("""}"""),format.raw/*29.18*/("""
                """),format.raw/*30.17*/(""".projectlist """),format.raw/*30.30*/("""{"""),format.raw/*30.31*/("""
                    """),format.raw/*31.21*/("""position: absolute;
                    top: 100px;
                    z-index: 0;
                    width: 100%;
                """),format.raw/*35.17*/("""}"""),format.raw/*35.18*/("""
                """),format.raw/*36.17*/(""".project """),format.raw/*36.26*/("""{"""),format.raw/*36.27*/("""
                    """),format.raw/*37.21*/("""width: 100%;
                """),format.raw/*38.17*/("""}"""),format.raw/*38.18*/("""
                """),format.raw/*39.17*/(""".container """),format.raw/*39.28*/("""{"""),format.raw/*39.29*/("""
                    """),format.raw/*40.21*/("""/*position: ;*/
                    margin-left: 0px;
                """),format.raw/*42.17*/("""}"""),format.raw/*42.18*/("""
            """),format.raw/*43.13*/("""</style>
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
                            <li role="presentation" id="vote"><a role="menuitem" tabindex="-1" href="vote">
                            <span class="glyphicon glyphicon-star" aria-hidden="true"></span> Vote</a></li>
                            <li role="presentation" onclick="logoutbEvent()" id="logout"><a role="menuitem" tabindex="-1" href="#">
                            <span class="glyphicon glyphicon-off" aria-hidden="true"></span> Logout</a></li>
                        </ul>
                    </div>
            </div>

            <div class="projectlist">
                <a href="profile"><image class="project" src = "assets/template_g1.jpg" title = "group1"></image></a>

                <br>
                <br>

                <a href="profile"><image class="project" src = "assets/template_g2.jpg" title = "group2"></image></a>

                <br>
                <br>

                <a href="profile"><image class="project" src = "assets/template_g3.jpg" title = "group3"></image></a>

                <br>
                <br>

                <a href="profile"><image class="project" src = "assets/template_g4.jpg" title = "group4"></image></a>

                <br>
                <br>
            </div>>
            <!-- JQuery -->
            <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js">
                $(document).ready(function()"""),format.raw/*89.45*/("""{"""),format.raw/*89.46*/("""
                    """),format.raw/*90.21*/("""$("#camera").click(function()"""),format.raw/*90.50*/("""{"""),format.raw/*90.51*/("""
                        """),format.raw/*91.25*/("""alert("camera");
                    """),format.raw/*92.21*/("""}"""),format.raw/*92.22*/(""");

                """),format.raw/*94.17*/("""}"""),format.raw/*94.18*/(""");
            </script>

            <!-- JS -->
            <script>
                function camerabEvent() """),format.raw/*99.41*/("""{"""),format.raw/*99.42*/("""
                    """),format.raw/*100.21*/("""//open camera app
                    alert("camera");
                """),format.raw/*102.17*/("""}"""),format.raw/*102.18*/("""
                """),format.raw/*103.17*/("""function votebEvent() """),format.raw/*103.39*/("""{"""),format.raw/*103.40*/("""
                    """),format.raw/*104.21*/("""//actually go to vote page
                    alert("vote");
                """),format.raw/*106.17*/("""}"""),format.raw/*106.18*/("""
                """),format.raw/*107.17*/("""function logoutbEvent() """),format.raw/*107.41*/("""{"""),format.raw/*107.42*/("""
                    """),format.raw/*108.21*/("""//confirmation prompt out
                    confirm("Are you sure ?");
                """),format.raw/*110.17*/("""}"""),format.raw/*110.18*/("""
            """),format.raw/*111.13*/("""</script>
        </div>
        </body>
    </html>
""")))}),format.raw/*115.2*/("""
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 04 18:50:32 ICT 2015
                  SOURCE: /Users/Punpikorn/Desktop/2Big2Slim/Team2Big2Slim/app/views/index.scala.html
                  HASH: 39c1c20a8c7208b9bbc40ef68faa511c4a20953d
                  MATRIX: 798->2|823->19|862->21|893->26|1456->561|1485->562|1534->583|1635->656|1664->657|1709->674|1745->682|1774->683|1819->700|1916->769|1945->770|1990->787|2028->797|2057->798|2106->819|2392->1077|2421->1078|2466->1095|2507->1108|2536->1109|2585->1130|2746->1263|2775->1264|2820->1281|2857->1290|2886->1291|2935->1312|2992->1341|3021->1342|3066->1359|3105->1370|3134->1371|3183->1392|3281->1462|3310->1463|3351->1476|5727->3824|5756->3825|5805->3846|5862->3875|5891->3876|5944->3901|6009->3938|6038->3939|6086->3959|6115->3960|6254->4071|6283->4072|6333->4093|6433->4164|6463->4165|6509->4182|6560->4204|6590->4205|6640->4226|6747->4304|6777->4305|6823->4322|6876->4346|6906->4347|6956->4368|7074->4457|7104->4458|7146->4471|7231->4525
                  LINES: 29->2|29->2|29->2|30->3|40->13|40->13|41->14|43->16|43->16|44->17|44->17|44->17|45->18|47->20|47->20|48->21|48->21|48->21|49->22|56->29|56->29|57->30|57->30|57->30|58->31|62->35|62->35|63->36|63->36|63->36|64->37|65->38|65->38|66->39|66->39|66->39|67->40|69->42|69->42|70->43|116->89|116->89|117->90|117->90|117->90|118->91|119->92|119->92|121->94|121->94|126->99|126->99|127->100|129->102|129->102|130->103|130->103|130->103|131->104|133->106|133->106|134->107|134->107|134->107|135->108|137->110|137->110|138->111|142->115
                  -- GENERATED --
              */
          
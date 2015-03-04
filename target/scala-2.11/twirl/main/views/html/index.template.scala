
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
                .header """),format.raw/*12.25*/("""{"""),format.raw/*12.26*/("""
                """),format.raw/*13.17*/("""float: right;
                /*width: 300px;     */
                """),format.raw/*15.17*/("""}"""),format.raw/*15.18*/("""
                """),format.raw/*16.17*/(""".toppanel """),format.raw/*16.27*/("""{"""),format.raw/*16.28*/("""
                    """),format.raw/*17.21*/("""position: fixed;
                    background-color: #ff8080;
                    color: white;
                    /*text-align: center;*/
                    padding: 20px;
                    width: 100%;
                    z-index: 1;
                """),format.raw/*24.17*/("""}"""),format.raw/*24.18*/("""
                """),format.raw/*25.17*/(""".projectlist """),format.raw/*25.30*/("""{"""),format.raw/*25.31*/("""
                    """),format.raw/*26.21*/("""position: absolute;
                    top: 100px;
                    z-index: 0;
                    width: 100%;
                """),format.raw/*30.17*/("""}"""),format.raw/*30.18*/("""
                """),format.raw/*31.17*/(""".project """),format.raw/*31.26*/("""{"""),format.raw/*31.27*/("""
                    """),format.raw/*32.21*/("""width: 100%;
                """),format.raw/*33.17*/("""}"""),format.raw/*33.18*/("""
                """),format.raw/*34.17*/(""".container """),format.raw/*34.28*/("""{"""),format.raw/*34.29*/("""
                    """),format.raw/*35.21*/("""/*position: ;*/
                    margin-left: 0px;
                """),format.raw/*37.17*/("""}"""),format.raw/*37.18*/("""
            """),format.raw/*38.13*/("""</style>
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
                $(document).ready(function()"""),format.raw/*84.45*/("""{"""),format.raw/*84.46*/("""
                    """),format.raw/*85.21*/("""$("#camera").click(function()"""),format.raw/*85.50*/("""{"""),format.raw/*85.51*/("""
                        """),format.raw/*86.25*/("""alert("camera");
                    """),format.raw/*87.21*/("""}"""),format.raw/*87.22*/(""");

                """),format.raw/*89.17*/("""}"""),format.raw/*89.18*/(""");
            </script>

            <!-- JS -->
            <script>
                function camerabEvent() """),format.raw/*94.41*/("""{"""),format.raw/*94.42*/("""
                    """),format.raw/*95.21*/("""//open camera app
                    alert("camera");
                """),format.raw/*97.17*/("""}"""),format.raw/*97.18*/("""
                """),format.raw/*98.17*/("""function votebEvent() """),format.raw/*98.39*/("""{"""),format.raw/*98.40*/("""
                    """),format.raw/*99.21*/("""//actually go to vote page
                    alert("vote");
                """),format.raw/*101.17*/("""}"""),format.raw/*101.18*/("""
                """),format.raw/*102.17*/("""function logoutbEvent() """),format.raw/*102.41*/("""{"""),format.raw/*102.42*/("""
                    """),format.raw/*103.21*/("""//confirmation prompt out
                    confirm("Are you sure ?");
                """),format.raw/*105.17*/("""}"""),format.raw/*105.18*/("""
            """),format.raw/*106.13*/("""</script>
        </div>
        </body>
    </html>
""")))}),format.raw/*110.2*/("""
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 04 17:30:18 ICT 2015
                  SOURCE: /Users/Punpikorn/Desktop/2Big2Slim/Team2Big2Slim/app/views/index.scala.html
                  HASH: 03047cc539b9350f2096f2af2e6535f093993c4f
                  MATRIX: 798->2|823->19|862->21|893->26|1358->463|1387->464|1432->481|1529->550|1558->551|1603->568|1641->578|1670->579|1719->600|2005->858|2034->859|2079->876|2120->889|2149->890|2198->911|2359->1044|2388->1045|2433->1062|2470->1071|2499->1072|2548->1093|2605->1122|2634->1123|2679->1140|2718->1151|2747->1152|2796->1173|2894->1243|2923->1244|2964->1257|5272->3537|5301->3538|5350->3559|5407->3588|5436->3589|5489->3614|5554->3651|5583->3652|5631->3672|5660->3673|5799->3784|5828->3785|5877->3806|5976->3877|6005->3878|6050->3895|6100->3917|6129->3918|6178->3939|6285->4017|6315->4018|6361->4035|6414->4059|6444->4060|6494->4081|6612->4170|6642->4171|6684->4184|6769->4238
                  LINES: 29->2|29->2|29->2|30->3|39->12|39->12|40->13|42->15|42->15|43->16|43->16|43->16|44->17|51->24|51->24|52->25|52->25|52->25|53->26|57->30|57->30|58->31|58->31|58->31|59->32|60->33|60->33|61->34|61->34|61->34|62->35|64->37|64->37|65->38|111->84|111->84|112->85|112->85|112->85|113->86|114->87|114->87|116->89|116->89|121->94|121->94|122->95|124->97|124->97|125->98|125->98|125->98|126->99|128->101|128->101|129->102|129->102|129->102|130->103|132->105|132->105|133->106|137->110
                  -- GENERATED --
              */
          
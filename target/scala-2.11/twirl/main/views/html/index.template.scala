
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message:String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.18*/("""
"""),_display_(/*2.2*/main("Main Menu")/*2.19*/ {_display_(Seq[Any](format.raw/*2.21*/("""
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
                """),format.raw/*14.17*/("""max-width: 100%;
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
                            <li role="presentation" id="vote"><a role="menuitem" tabindex="-1" href="voting">
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

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 25 16:37:38 ICT 2015
                  SOURCE: /Users/nutkaewnak/Documents/SoftSpec/Team2Big2Slim/app/views/index.scala.html
                  HASH: 0460958f219414162f0158d8aef710d701102c17
                  MATRIX: 723->1|827->17|854->19|879->36|918->38|949->43|1512->578|1541->579|1586->596|1683->665|1712->666|1757->683|1793->691|1822->692|1867->709|1964->778|1993->779|2038->796|2076->806|2105->807|2154->828|2440->1086|2469->1087|2514->1104|2555->1117|2584->1118|2633->1139|2794->1272|2823->1273|2868->1290|2905->1299|2934->1300|2983->1321|3040->1350|3069->1351|3114->1368|3153->1379|3182->1380|3231->1401|3329->1471|3358->1472|3399->1485|5777->3835|5806->3836|5855->3857|5912->3886|5941->3887|5994->3912|6059->3949|6088->3950|6136->3970|6165->3971|6304->4082|6333->4083|6383->4104|6483->4175|6513->4176|6559->4193|6610->4215|6640->4216|6690->4237|6797->4315|6827->4316|6873->4333|6926->4357|6956->4358|7006->4379|7124->4468|7154->4469|7196->4482|7281->4536
                  LINES: 26->1|29->1|30->2|30->2|30->2|31->3|41->13|41->13|42->14|44->16|44->16|45->17|45->17|45->17|46->18|48->20|48->20|49->21|49->21|49->21|50->22|57->29|57->29|58->30|58->30|58->30|59->31|63->35|63->35|64->36|64->36|64->36|65->37|66->38|66->38|67->39|67->39|67->39|68->40|70->42|70->42|71->43|117->89|117->89|118->90|118->90|118->90|119->91|120->92|120->92|122->94|122->94|127->99|127->99|128->100|130->102|130->102|131->103|131->103|131->103|132->104|134->106|134->106|135->107|135->107|135->107|136->108|138->110|138->110|139->111|143->115
                  -- GENERATED --
              */
          
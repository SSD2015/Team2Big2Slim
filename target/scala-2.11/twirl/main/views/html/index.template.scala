
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
                  DATE: Thu Mar 05 23:11:42 ICT 2015
                  SOURCE: /Users/nutkaewnak/Documents/SoftSpec/Team2Big2Slim/app/views/index.scala.html
                  HASH: 5e7ebde48dbf51a2adf810fa1fbbe6a79cc9bd2c
                  MATRIX: 723->1|827->17|854->19|879->36|918->38|949->43|1512->578|1541->579|1590->600|1691->673|1720->674|1765->691|1801->699|1830->700|1875->717|1972->786|2001->787|2046->804|2084->814|2113->815|2162->836|2448->1094|2477->1095|2522->1112|2563->1125|2592->1126|2641->1147|2802->1280|2831->1281|2876->1298|2913->1307|2942->1308|2991->1329|3048->1358|3077->1359|3122->1376|3161->1387|3190->1388|3239->1409|3337->1479|3366->1480|3407->1493|5785->3843|5814->3844|5863->3865|5920->3894|5949->3895|6002->3920|6067->3957|6096->3958|6144->3978|6173->3979|6312->4090|6341->4091|6391->4112|6491->4183|6521->4184|6567->4201|6618->4223|6648->4224|6698->4245|6805->4323|6835->4324|6881->4341|6934->4365|6964->4366|7014->4387|7132->4476|7162->4477|7204->4490|7289->4544
                  LINES: 26->1|29->1|30->2|30->2|30->2|31->3|41->13|41->13|42->14|44->16|44->16|45->17|45->17|45->17|46->18|48->20|48->20|49->21|49->21|49->21|50->22|57->29|57->29|58->30|58->30|58->30|59->31|63->35|63->35|64->36|64->36|64->36|65->37|66->38|66->38|67->39|67->39|67->39|68->40|70->42|70->42|71->43|117->89|117->89|118->90|118->90|118->90|119->91|120->92|120->92|122->94|122->94|127->99|127->99|128->100|130->102|130->102|131->103|131->103|131->103|132->104|134->106|134->106|135->107|135->107|135->107|136->108|138->110|138->110|139->111|143->115
                  -- GENERATED --
              */
          
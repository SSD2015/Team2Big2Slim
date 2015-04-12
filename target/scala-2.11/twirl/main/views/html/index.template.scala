
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
            <title>Main menu</title>
            <meta charset="utf-8">
            <meta name="viewport" content="width=device-width, initial-scale=1">
            <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
            <link rel="stylesheet" media="screen" href=""""),_display_(/*9.58*/routes/*9.64*/.Assets.at("stylesheets/index.css")),format.raw/*9.99*/("""">
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
            <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
        </head>

        <body>
                <!-- Modal -->
            <div id="logout" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="Logout" aria-hidden="true">
                <div class="modal-dialog modal-sm">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h2><center>Are you sure ?</center></h2>
                        </div>
                        <div class="modal-footer">
                            <button onclick="location.href='http://localhost:9000/login'" type="button" class="btn btn-default">Ok</button>
                            <button type="button" class="btn btn-primary" data-dismiss="modal">Cancel</button>
                        </div>
                    </div>
                </div>
            </div>

            <div id="voteConfirm" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="Vote confirmation" aria-hidden="true">
                <div class="modal-dialog modal-sm">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h3>You vote <b><projectName></projectName></b> <p>Are you sure ?</h3>
                        </div>
                        <div class="modal-footer">
                            <form action="/vote" method="post">
                                <input id="voteValue" type="radio" name="projectID" value="" checked style="visibility: hidden;">
                                <button type="submit" name="action" class="btn btn-default">Ok</button>
                                <button type="button" class="btn btn-primary" data-dismiss="modal">Cancel</button>
                            </form>

                        </div>
                    </div>
                </div>
            </div>

            <nav class="navbar navbar-inverse navbar-fixed-top votelayer">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#">
                        Select the best group then click ok
                    </a>
                </div>
                <div class="container-fluid">
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="#" id="back"><span class="glyphicon glyphicon-chevron-up"></span> Back</a></li>
                    </ul>
                </div>
            </nav>

            <nav class="navbar navbar-inverse navbar-fixed-top topbar" id="topbar">
                <div class="container-fluid">
                    <div class="navbar-header">
                        <a class="navbar-brand" href="#">
                            ExceedVote
                        </a>
                    </div>
                    <div>
                        <ul class="nav navbar-nav">
                            <li><a><clock ></clock></a></li>
                        </ul>

                        <div class="container-fluid">
                            <ul class="nav navbar-nav navbar-right">
                                <li><a href="#" id="vote"><span class="glyphicon glyphicon-star"></span><font color="#F0F0F0" style="font-size:large"> Vote</font></a></li>
                                <li><a data-toggle="modal" data-target="#logout"><span class="glyphicon glyphicon-off"></span> <font color="#F0F0F0" style="font-size:large">Logout</font></a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </nav>

            <div id="voteLayer">
                <div class="container-fluid votelist">
                    <div class="row" id="1">
                        <a value="1" class="voteB" id="project1" data-toggle="modal" data-target="#voteConfirm"><image class="project img-rounded" src = "assets/g1_vector.jpg" title = "group1"></image></a>
                    </div>
                    <div class="row" id="2">
                        <a value="2" class="voteB" id="project2" data-toggle="modal" data-target="#voteConfirm"><image class="project img-rounded" src = "assets/g2_vector.jpg" title = "group2"></image></a>
                    </div>
               
                </div>
            </div>

            <div id="projectlistLayer">
                <div class="container-fluid projectlist">
                    <div class="row" id="1">
                        <a href="profile/1" id="project1"><image class="project img-rounded" src = "assets/g1_vector.jpg" title = "group1"></image></a>
                    </div>
                    <div class="row" id="2">
                        <a href="profile/2"><image class="project img-rounded" src = "assets/g2_vector.jpg" title = "group2"></image></a>
                    </div>

                </div>
            </div>
                <!-- JQuery -->
            <script>
                $(document).ready(function()"""),format.raw/*108.45*/("""{"""),format.raw/*108.46*/("""
                    """),format.raw/*109.21*/("""function getdate()"""),format.raw/*109.39*/("""{"""),format.raw/*109.40*/("""
                        """),format.raw/*110.25*/("""var today = new Date();
                        var h = today.getHours();
                        var m = today.getMinutes();
                        var s = today.getSeconds();
                        if(h<10) """),format.raw/*114.34*/("""{"""),format.raw/*114.35*/("""
                            """),format.raw/*115.29*/("""h = "0"+h;
                        """),format.raw/*116.25*/("""}"""),format.raw/*116.26*/("""
                        """),format.raw/*117.25*/("""if(m<10) """),format.raw/*117.34*/("""{"""),format.raw/*117.35*/("""
                            """),format.raw/*118.29*/("""m = "0"+m;
                        """),format.raw/*119.25*/("""}"""),format.raw/*119.26*/("""
                        """),format.raw/*120.25*/("""if(s<10)"""),format.raw/*120.33*/("""{"""),format.raw/*120.34*/("""
                            """),format.raw/*121.29*/("""s = "0"+s;
                        """),format.raw/*122.25*/("""}"""),format.raw/*122.26*/("""
                        """),format.raw/*123.25*/("""$("clock").text(h+" : "+m+" : "+s);
                        setTimeout(function()"""),format.raw/*124.46*/("""{"""),format.raw/*124.47*/("""getdate()"""),format.raw/*124.56*/("""}"""),format.raw/*124.57*/(""", 500);
                    """),format.raw/*125.21*/("""}"""),format.raw/*125.22*/("""
                    """),format.raw/*126.21*/("""getdate();

                    $("#voteLayer" ).toggle();

                    $('#vote').click(function () """),format.raw/*130.50*/("""{"""),format.raw/*130.51*/("""
                        """),format.raw/*131.25*/("""var body = $("html, body");
                        body.animate("""),format.raw/*132.38*/("""{"""),format.raw/*132.39*/("""scrollTop:0"""),format.raw/*132.50*/("""}"""),format.raw/*132.51*/(""", "duration:600", "swing", function() """),format.raw/*132.89*/("""{"""),format.raw/*132.90*/("""
                        """),format.raw/*133.25*/("""console.log("vote");
                        $("#topbar").fadeOut();
                        $("#projectlistLayer").fadeOut();
                        $("#votebar" ).fadeIn();
                        $("#voteLayer" ).fadeIn();
                        """),format.raw/*138.25*/("""}"""),format.raw/*138.26*/(""");
                    """),format.raw/*139.21*/("""}"""),format.raw/*139.22*/(""");

                    $("#back" ).click(function () """),format.raw/*141.51*/("""{"""),format.raw/*141.52*/("""
                        """),format.raw/*142.25*/("""console.log("back");
                        $("#topbar" ).fadeIn();
                        $("#projectlistLayer" ).fadeIn();
                        $("#voteLayer" ).fadeOut();
                    """),format.raw/*146.21*/("""}"""),format.raw/*146.22*/(""");

                    $(".voteB" ).click(function () """),format.raw/*148.52*/("""{"""),format.raw/*148.53*/("""
                        """),format.raw/*149.25*/("""var name = $(this ).attr("id");
                        var value = $(this ).attr("value");
                        $("projectname").contents().filter(function () """),format.raw/*151.72*/("""{"""),format.raw/*151.73*/("""
                        """),format.raw/*152.25*/("""return this.nodeType === 3;
                        """),format.raw/*153.25*/("""}"""),format.raw/*153.26*/(""" """),format.raw/*153.27*/(""").remove();
                        $("projectname" ).append(name);
                        $("#voteValue" ).attr("value", value);
                    """),format.raw/*156.21*/("""}"""),format.raw/*156.22*/(""");

                """),format.raw/*158.17*/("""}"""),format.raw/*158.18*/(""");
            </script>

                <!-- JS -->
            <script>
                function camerabEvent() """),format.raw/*163.41*/("""{"""),format.raw/*163.42*/("""
                """),format.raw/*164.17*/("""//open camera app
                alert("camera");
                """),format.raw/*166.17*/("""}"""),format.raw/*166.18*/("""
                """),format.raw/*167.17*/("""function votebEvent() """),format.raw/*167.39*/("""{"""),format.raw/*167.40*/("""
                """),format.raw/*168.17*/("""//actually go to vote page
                alert("vote");
                """),format.raw/*170.17*/("""}"""),format.raw/*170.18*/("""
                """),format.raw/*171.17*/("""function logoutbEvent() """),format.raw/*171.41*/("""{"""),format.raw/*171.42*/("""
                """),format.raw/*172.17*/("""//confirmation prompt out
                confirm("Are you sure ?");
                """),format.raw/*174.17*/("""}"""),format.raw/*174.18*/("""
                """),format.raw/*175.17*/("""function redirectProfile1() """),format.raw/*175.45*/("""{"""),format.raw/*175.46*/("""
                    """),format.raw/*176.21*/("""return true;
                """),format.raw/*177.17*/("""}"""),format.raw/*177.18*/("""
            """),format.raw/*178.13*/("""</script>
        </body>
    </html>
""")))}),format.raw/*181.2*/("""
"""),format.raw/*182.1*/("""<script type="text/javascript">
function theFunction () """),format.raw/*183.25*/("""{"""),format.raw/*183.26*/("""
"""),format.raw/*184.1*/("""// return true or false, depending on whether you want to allow the `href` property to follow through or not
"""),format.raw/*185.1*/("""}"""),format.raw/*185.2*/("""
"""),format.raw/*186.1*/("""</script>"""))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Apr 12 18:19:33 ICT 2015
                  SOURCE: /Users/Punpikorn/Desktop/2Big2Slim/Team2Big2Slim/app/views/index.scala.html
                  HASH: de50ca1c32bd6bb0af402859eb0328f8a749a2f6
                  MATRIX: 723->1|827->17|854->19|879->36|918->38|949->43|1319->387|1333->393|1388->428|6559->5570|6589->5571|6639->5592|6686->5610|6716->5611|6770->5636|7010->5847|7040->5848|7098->5877|7162->5912|7192->5913|7246->5938|7284->5947|7314->5948|7372->5977|7436->6012|7466->6013|7520->6038|7557->6046|7587->6047|7645->6076|7709->6111|7739->6112|7793->6137|7903->6218|7933->6219|7971->6228|8001->6229|8058->6257|8088->6258|8138->6279|8276->6388|8306->6389|8360->6414|8454->6479|8484->6480|8524->6491|8554->6492|8621->6530|8651->6531|8705->6556|8985->6807|9015->6808|9067->6831|9097->6832|9180->6886|9210->6887|9264->6912|9492->7111|9522->7112|9606->7167|9636->7168|9690->7193|9882->7356|9912->7357|9966->7382|10047->7434|10077->7435|10107->7436|10287->7587|10317->7588|10366->7608|10396->7609|10540->7724|10570->7725|10616->7742|10712->7809|10742->7810|10788->7827|10839->7849|10869->7850|10915->7867|11018->7941|11048->7942|11094->7959|11147->7983|11177->7984|11223->8001|11337->8086|11367->8087|11413->8104|11470->8132|11500->8133|11550->8154|11608->8183|11638->8184|11680->8197|11750->8236|11779->8237|11864->8293|11894->8294|11923->8295|12060->8404|12089->8405|12118->8406
                  LINES: 26->1|29->1|30->2|30->2|30->2|31->3|37->9|37->9|37->9|136->108|136->108|137->109|137->109|137->109|138->110|142->114|142->114|143->115|144->116|144->116|145->117|145->117|145->117|146->118|147->119|147->119|148->120|148->120|148->120|149->121|150->122|150->122|151->123|152->124|152->124|152->124|152->124|153->125|153->125|154->126|158->130|158->130|159->131|160->132|160->132|160->132|160->132|160->132|160->132|161->133|166->138|166->138|167->139|167->139|169->141|169->141|170->142|174->146|174->146|176->148|176->148|177->149|179->151|179->151|180->152|181->153|181->153|181->153|184->156|184->156|186->158|186->158|191->163|191->163|192->164|194->166|194->166|195->167|195->167|195->167|196->168|198->170|198->170|199->171|199->171|199->171|200->172|202->174|202->174|203->175|203->175|203->175|204->176|205->177|205->177|206->178|209->181|210->182|211->183|211->183|212->184|213->185|213->185|214->186
                  -- GENERATED --
              */
          
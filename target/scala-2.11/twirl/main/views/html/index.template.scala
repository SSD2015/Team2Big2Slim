
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
            <script src="http://cdnjs.cloudflare.com/ajax/libs/gsap/1.16.1/TweenMax.min.js"></script>
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
            <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
        </head>

        <body>
                <!-- Modal -->
            <div id="logoutModal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="Logout" aria-hidden="true">
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

            <div id="votecriteriaModal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="Choose a criterian" aria-hidden="true">
                <div class="modal-dialog modal-sm">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h2><center>Select the Voting Criteria</center></h2>
                        </div>
                        <div class="modal-body vcField">
                            <!-- Template Prepared for Database -->
                            <p><button type="button" class="btn btn-warning btn-block vote-criteria" value="1" data-dismiss="modal"><span class="glyphicon glyphicon-star"></span> The Best</button>
                            <p><button type="button" class="btn btn-danger btn-block vote-criteria" value="2" data-dismiss="modal"><span class="glyphicon glyphicon-heart"></span> The Coolest</button>
                            <p><button type="button" class="btn btn-info btn-block vote-criteria" value="3" data-dismiss="modal"><span class="glyphicon glyphicon-cog"></span> Greatest Performance</button>
                            <p><button type="button" class="btn btn-primary btn-block vote-criteria" value="4" data-dismiss="modal"><span class="glyphicon glyphicon-eye-open"></span> Greatest Design</button>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-primary" data-dismiss="modal">Cancel</button>
                        </div>
                    </div>
                </div>
            </div>

            <nav class="navbar navbar-default navbar-fixed-top" id="votebar">
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

            <nav class="navbar navbar-inverse navbar-fixed-top" id="topbar">
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
                                <li><a data-toggle="modal" data-target="#votecriteriaModal" id="vote"><span class="glyphicon glyphicon-star"></span><font color="#F0F0F0" style="font-size:large"> Vote</font></a></li>
                                <li><a data-toggle="modal" data-target="#logoutModal"><span class="glyphicon glyphicon-off"></span> <font color="#F0F0F0" style="font-size:large">Logout</font></a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </nav>

            <div class="voteLayer">
                <div class="container-fluid voteList">
                    <div class="row" id="1">
                        <a value="1" class="voteB" id="project1" data-toggle="modal" data-target="#voteConfirm"><image class="project img-rounded" src = "assets/g1_vector.jpg" title = "group1"></image></a>
                    </div>
                    <div class="row" id="2">
                        <a value="2" class="voteB" id="project2" data-toggle="modal" data-target="#voteConfirm"><image class="project img-rounded" src = "assets/g2_vector.jpg" title = "group2"></image></a>
                    </div>
               
                </div>
            </div>

            <div class="projectListLayer">
                <div class="container-fluid projectList">
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
                $(document).ready(function()"""),format.raw/*130.45*/("""{"""),format.raw/*130.46*/("""
                    """),format.raw/*131.21*/("""//Clock Section
                    function getdate()"""),format.raw/*132.39*/("""{"""),format.raw/*132.40*/("""
                        """),format.raw/*133.25*/("""var today = new Date();
                        var h = today.getHours();
                        var m = today.getMinutes();
                        var s = today.getSeconds();
                        if(h<10) """),format.raw/*137.34*/("""{"""),format.raw/*137.35*/("""
                            """),format.raw/*138.29*/("""h = "0"+h;
                        """),format.raw/*139.25*/("""}"""),format.raw/*139.26*/("""
                        """),format.raw/*140.25*/("""if(m<10) """),format.raw/*140.34*/("""{"""),format.raw/*140.35*/("""
                            """),format.raw/*141.29*/("""m = "0"+m;
                        """),format.raw/*142.25*/("""}"""),format.raw/*142.26*/("""
                        """),format.raw/*143.25*/("""if(s<10)"""),format.raw/*143.33*/("""{"""),format.raw/*143.34*/("""
                            """),format.raw/*144.29*/("""s = "0"+s;
                        """),format.raw/*145.25*/("""}"""),format.raw/*145.26*/("""
                        """),format.raw/*146.25*/("""$("clock").text(h+" : "+m+" : "+s);
                        setTimeout(function()"""),format.raw/*147.46*/("""{"""),format.raw/*147.47*/("""getdate()"""),format.raw/*147.56*/("""}"""),format.raw/*147.57*/(""", 500);
                    """),format.raw/*148.21*/("""}"""),format.raw/*148.22*/("""
                    """),format.raw/*149.21*/("""getdate();
                    //////////////////////////////////////////////

                    //Vote Section
                    $('#vote').click(function () """),format.raw/*153.50*/("""{"""),format.raw/*153.51*/("""
                        """),format.raw/*154.25*/("""var body = $("html, body");
                        body.animate("""),format.raw/*155.38*/("""{"""),format.raw/*155.39*/("""scrollTop:0"""),format.raw/*155.50*/("""}"""),format.raw/*155.51*/(""", "duration:600", "swing", function() """),format.raw/*155.89*/("""{"""),format.raw/*155.90*/("""
                            """),format.raw/*156.29*/("""//old vote animate
//                        console.log("vote");
//                        $("#topbar").fadeOut();
//                        $("#projectlistLayer").fadeOut();
//                        $("#votebar" ).fadeIn();
//                        $("#voteLayer" ).fadeIn();

                        """),format.raw/*163.25*/("""}"""),format.raw/*163.26*/(""");
                    """),format.raw/*164.21*/("""}"""),format.raw/*164.22*/(""");
                    //////////////////////////////////////////////

                    //Back Button
                    $("#back" ).click(function () """),format.raw/*168.51*/("""{"""),format.raw/*168.52*/("""
                        """),format.raw/*169.25*/("""$(".projectListLayer" ).toggle();
                        $("#topbar" ).fadeToggle(700, "swing", function() """),format.raw/*170.75*/("""{"""),format.raw/*170.76*/("""

                        """),format.raw/*172.25*/("""}"""),format.raw/*172.26*/(""");
                    """),format.raw/*173.21*/("""}"""),format.raw/*173.22*/(""");
                    //////////////////////////////////////////////

                    //Vote Button
                    $(".voteB" ).click(function () """),format.raw/*177.52*/("""{"""),format.raw/*177.53*/("""
                        """),format.raw/*178.25*/("""var name = $(this ).attr("id");
                        var value = $(this ).attr("value");
                        $("projectname").contents().filter(function () """),format.raw/*180.72*/("""{"""),format.raw/*180.73*/("""
                        """),format.raw/*181.25*/("""return this.nodeType === 3;
                        """),format.raw/*182.25*/("""}"""),format.raw/*182.26*/(""" """),format.raw/*182.27*/(""").remove();
                        $("projectname" ).append(name);
                        $("#voteValue" ).attr("value", value);
                    """),format.raw/*185.21*/("""}"""),format.raw/*185.22*/(""");
                    //////////////////////////////////////////////

                    //Vote Criteria Section
                    var voteCriteriaID = -1;
                    $(".vote-criteria" ).click(function() """),format.raw/*190.59*/("""{"""),format.raw/*190.60*/("""
                        """),format.raw/*191.25*/("""voteCriteriaID = $(this ).attr("value");
                        $(".projectListLayer" ).toggle();
                        $("#topbar" ).fadeToggle(700, "swing", function() """),format.raw/*193.75*/("""{"""),format.raw/*193.76*/("""
                            """),format.raw/*194.29*/("""console.log("finish");
                        """),format.raw/*195.25*/("""}"""),format.raw/*195.26*/(""");
//                        $("#topbar" ).animate("""),format.raw/*196.49*/("""{"""),format.raw/*196.50*/("""width: "toggle""""),format.raw/*196.65*/("""}"""),format.raw/*196.66*/(""", 1000, function() """),format.raw/*196.85*/("""{"""),format.raw/*196.86*/("""
"""),format.raw/*197.1*/("""//
//                        """),format.raw/*198.27*/("""}"""),format.raw/*198.28*/(""");
                    """),format.raw/*199.21*/("""}"""),format.raw/*199.22*/(""");

                """),format.raw/*201.17*/("""}"""),format.raw/*201.18*/(""");
            </script>
        </body>
    </html>
""")))}),format.raw/*205.2*/("""

"""),format.raw/*207.1*/("""<script type="text/javascript">
function theFunction () """),format.raw/*208.25*/("""{"""),format.raw/*208.26*/("""
"""),format.raw/*209.1*/("""// return true or false, depending on whether you want to allow the `href` property to follow through or not
"""),format.raw/*210.1*/("""}"""),format.raw/*210.2*/("""
"""),format.raw/*211.1*/("""</script>"""))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Apr 15 15:14:32 ICT 2015
                  SOURCE: /Users/Punpikorn/Desktop/2Big2Slim/Team2Big2Slim/app/views/index.scala.html
                  HASH: 38c30b9af2614fcfecadf67961f8846eabc429f0
                  MATRIX: 723->1|827->17|854->19|879->36|918->38|949->43|1319->387|1333->393|1388->428|8350->7361|8380->7362|8430->7383|8513->7437|8543->7438|8597->7463|8837->7674|8867->7675|8925->7704|8989->7739|9019->7740|9073->7765|9111->7774|9141->7775|9199->7804|9263->7839|9293->7840|9347->7865|9384->7873|9414->7874|9472->7903|9536->7938|9566->7939|9620->7964|9730->8045|9760->8046|9798->8055|9828->8056|9885->8084|9915->8085|9965->8106|10157->8269|10187->8270|10241->8295|10335->8360|10365->8361|10405->8372|10435->8373|10502->8411|10532->8412|10590->8441|10924->8746|10954->8747|11006->8770|11036->8771|11220->8926|11250->8927|11304->8952|11441->9060|11471->9061|11526->9087|11556->9088|11608->9111|11638->9112|11823->9268|11853->9269|11907->9294|12099->9457|12129->9458|12183->9483|12264->9535|12294->9536|12324->9537|12504->9688|12534->9689|12781->9907|12811->9908|12865->9933|13067->10106|13097->10107|13155->10136|13231->10183|13261->10184|13341->10235|13371->10236|13415->10251|13445->10252|13493->10271|13523->10272|13552->10273|13610->10302|13640->10303|13692->10326|13722->10327|13771->10347|13801->10348|13886->10402|13916->10404|14001->10460|14031->10461|14060->10462|14197->10571|14226->10572|14255->10573
                  LINES: 26->1|29->1|30->2|30->2|30->2|31->3|37->9|37->9|37->9|158->130|158->130|159->131|160->132|160->132|161->133|165->137|165->137|166->138|167->139|167->139|168->140|168->140|168->140|169->141|170->142|170->142|171->143|171->143|171->143|172->144|173->145|173->145|174->146|175->147|175->147|175->147|175->147|176->148|176->148|177->149|181->153|181->153|182->154|183->155|183->155|183->155|183->155|183->155|183->155|184->156|191->163|191->163|192->164|192->164|196->168|196->168|197->169|198->170|198->170|200->172|200->172|201->173|201->173|205->177|205->177|206->178|208->180|208->180|209->181|210->182|210->182|210->182|213->185|213->185|218->190|218->190|219->191|221->193|221->193|222->194|223->195|223->195|224->196|224->196|224->196|224->196|224->196|224->196|225->197|226->198|226->198|227->199|227->199|229->201|229->201|233->205|235->207|236->208|236->208|237->209|238->210|238->210|239->211
                  -- GENERATED --
              */
          
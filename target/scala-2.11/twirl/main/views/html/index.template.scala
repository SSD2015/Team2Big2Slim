
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

            <!-- votebar -->
            <nav class="navbar navbar-default navbar-fixed-top" id="votebar">
                <div class="navbar-header pull-left">
                    <a class="navbar-brand voteText" href="#">
                        Select the best group then click ok
                    </a>
                </div>
                <div class="navbar-header pull-right">
                    <a class="navbar-brand voteText" href="#" id="back"><span class="glyphicon glyphicon-chevron-up"></span> Back</a>
                </div>
            </nav>

            <!-- topbar -->
            <nav class="navbar navbar-inverse navbar-fixed-top" id="topbar">
                    <div class="navbar-headerll-left">
                    <a class="navbar-brand hidden-xs" href="#">
                        ExceedVote
                    </a>
                    <a class="navbar-brand" href="#"><clock ></clock></a>
                </div>

                <div class="navbar-header pull-right">
                    <a class="navbar-brand" data-toggle="modal" data-target="#votecriteriaModal" id="vote"><span class="glyphicon glyphicon-star"></span><font color="#F0F0F0" style="font-size:large"> Vote</font></a>
                    <a class="navbar-brand" data-toggle="modal" data-target="#logoutModal"><span class="glyphicon glyphicon-off"></span> <font color="#F0F0F0" style="font-size:large">Logout</font></a>
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
                $("#votebar" ).toggle();

                $(document).ready(function()"""),format.raw/*124.45*/("""{"""),format.raw/*124.46*/("""

                    """),format.raw/*126.21*/("""//Clock Section
                    function getdate()"""),format.raw/*127.39*/("""{"""),format.raw/*127.40*/("""
                        """),format.raw/*128.25*/("""var today = new Date();
                        var h = today.getHours();
                        var m = today.getMinutes();
                        var s = today.getSeconds();
                        if(h<10) """),format.raw/*132.34*/("""{"""),format.raw/*132.35*/("""
                            """),format.raw/*133.29*/("""h = "0"+h;
                        """),format.raw/*134.25*/("""}"""),format.raw/*134.26*/("""
                        """),format.raw/*135.25*/("""if(m<10) """),format.raw/*135.34*/("""{"""),format.raw/*135.35*/("""
                            """),format.raw/*136.29*/("""m = "0"+m;
                        """),format.raw/*137.25*/("""}"""),format.raw/*137.26*/("""
                        """),format.raw/*138.25*/("""if(s<10)"""),format.raw/*138.33*/("""{"""),format.raw/*138.34*/("""
                            """),format.raw/*139.29*/("""s = "0"+s;
                        """),format.raw/*140.25*/("""}"""),format.raw/*140.26*/("""
                        """),format.raw/*141.25*/("""$("clock").text(h+" : "+m+" : "+s);
                        setTimeout(function()"""),format.raw/*142.46*/("""{"""),format.raw/*142.47*/("""getdate()"""),format.raw/*142.56*/("""}"""),format.raw/*142.57*/(""", 500);
                    """),format.raw/*143.21*/("""}"""),format.raw/*143.22*/("""
                    """),format.raw/*144.21*/("""getdate();
                    //////////////////////////////////////////////

                    //Vote Section
                    $('#vote').click(function () """),format.raw/*148.50*/("""{"""),format.raw/*148.51*/("""
                        """),format.raw/*149.25*/("""var body = $("html, body");
                        body.animate("""),format.raw/*150.38*/("""{"""),format.raw/*150.39*/("""scrollTop:0"""),format.raw/*150.50*/("""}"""),format.raw/*150.51*/(""", "duration:600", "swing", function() """),format.raw/*150.89*/("""{"""),format.raw/*150.90*/("""
                            """),format.raw/*151.29*/("""//old vote animate
//                        console.log("vote");
//                        $("#topbar").fadeOut();
//                        $("#projectlistLayer").fadeOut();
//                        $("#votebar" ).fadeIn();
//                        $("#voteLayer" ).fadeIn();

                        """),format.raw/*158.25*/("""}"""),format.raw/*158.26*/(""");
                    """),format.raw/*159.21*/("""}"""),format.raw/*159.22*/(""");
                    //////////////////////////////////////////////

                    //Back Button
                    $("#back" ).click(function () """),format.raw/*163.51*/("""{"""),format.raw/*163.52*/("""
                        """),format.raw/*164.25*/("""$(".projectListLayer" ).toggle();
                        $("#topbar" ).fadeToggle(700, "swing", function() """),format.raw/*165.75*/("""{"""),format.raw/*165.76*/("""
                        """),format.raw/*166.25*/("""}"""),format.raw/*166.26*/(""");
                        $("#votebar" ).fadeToggle(700, "swing", function() """),format.raw/*167.76*/("""{"""),format.raw/*167.77*/("""
                        """),format.raw/*168.25*/("""}"""),format.raw/*168.26*/(""");
                    """),format.raw/*169.21*/("""}"""),format.raw/*169.22*/(""");
                    //////////////////////////////////////////////

                    //Vote Button
                    $(".voteB" ).click(function () """),format.raw/*173.52*/("""{"""),format.raw/*173.53*/("""
                        """),format.raw/*174.25*/("""var name = $(this ).attr("id");
                        var value = $(this ).attr("value");
                        $("projectname").contents().filter(function () """),format.raw/*176.72*/("""{"""),format.raw/*176.73*/("""
                        """),format.raw/*177.25*/("""return this.nodeType === 3;
                        """),format.raw/*178.25*/("""}"""),format.raw/*178.26*/(""" """),format.raw/*178.27*/(""").remove();
                        $("projectname" ).append(name);
                        $("#voteValue" ).attr("value", value);
                    """),format.raw/*181.21*/("""}"""),format.raw/*181.22*/(""");
                    //////////////////////////////////////////////

                    //Vote Criteria Section
                    var voteCriteriaID = -1;
                    $(".vote-criteria" ).click(function() """),format.raw/*186.59*/("""{"""),format.raw/*186.60*/("""
                        """),format.raw/*187.25*/("""voteCriteriaID = $(this ).attr("value");
                        $(".projectListLayer" ).toggle();
                        $("#topbar" ).fadeToggle(700, "swing", function() """),format.raw/*189.75*/("""{"""),format.raw/*189.76*/("""
                        """),format.raw/*190.25*/("""}"""),format.raw/*190.26*/(""");
                        $("#votebar" ).fadeToggle(700, "swing", function() """),format.raw/*191.76*/("""{"""),format.raw/*191.77*/("""
                        """),format.raw/*192.25*/("""}"""),format.raw/*192.26*/(""");
                    """),format.raw/*193.21*/("""}"""),format.raw/*193.22*/(""");
                    //////////////////////////////////////////////

                    var screenWidth = $(window ).width();
                    console.log(screenWidth);
                    if (screenWidth < 405) """),format.raw/*198.44*/("""{"""),format.raw/*198.45*/("""
                        """),format.raw/*199.25*/("""$(".voteText" ).css("font-size", "smaller");
                    """),format.raw/*200.21*/("""}"""),format.raw/*200.22*/("""
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
                  DATE: Wed Apr 15 21:20:09 ICT 2015
                  SOURCE: /Users/Punpikorn/Desktop/2Big2Slim/Team2Big2Slim/app/views/index.scala.html
                  HASH: 64c0f6b30e4fc9b9549e3899163f83b442e56bea
                  MATRIX: 723->1|827->17|854->19|879->36|918->38|949->43|1319->387|1333->393|1388->428|8103->7114|8133->7115|8184->7137|8267->7191|8297->7192|8351->7217|8591->7428|8621->7429|8679->7458|8743->7493|8773->7494|8827->7519|8865->7528|8895->7529|8953->7558|9017->7593|9047->7594|9101->7619|9138->7627|9168->7628|9226->7657|9290->7692|9320->7693|9374->7718|9484->7799|9514->7800|9552->7809|9582->7810|9639->7838|9669->7839|9719->7860|9911->8023|9941->8024|9995->8049|10089->8114|10119->8115|10159->8126|10189->8127|10256->8165|10286->8166|10344->8195|10678->8500|10708->8501|10760->8524|10790->8525|10974->8680|11004->8681|11058->8706|11195->8814|11225->8815|11279->8840|11309->8841|11416->8919|11446->8920|11500->8945|11530->8946|11582->8969|11612->8970|11797->9126|11827->9127|11881->9152|12073->9315|12103->9316|12157->9341|12238->9393|12268->9394|12298->9395|12478->9546|12508->9547|12755->9765|12785->9766|12839->9791|13041->9964|13071->9965|13125->9990|13155->9991|13262->10069|13292->10070|13346->10095|13376->10096|13428->10119|13458->10120|13705->10338|13735->10339|13789->10364|13883->10429|13913->10430|13959->10447|13989->10448|14074->10502|14104->10504|14189->10560|14219->10561|14248->10562|14385->10671|14414->10672|14443->10673
                  LINES: 26->1|29->1|30->2|30->2|30->2|31->3|37->9|37->9|37->9|152->124|152->124|154->126|155->127|155->127|156->128|160->132|160->132|161->133|162->134|162->134|163->135|163->135|163->135|164->136|165->137|165->137|166->138|166->138|166->138|167->139|168->140|168->140|169->141|170->142|170->142|170->142|170->142|171->143|171->143|172->144|176->148|176->148|177->149|178->150|178->150|178->150|178->150|178->150|178->150|179->151|186->158|186->158|187->159|187->159|191->163|191->163|192->164|193->165|193->165|194->166|194->166|195->167|195->167|196->168|196->168|197->169|197->169|201->173|201->173|202->174|204->176|204->176|205->177|206->178|206->178|206->178|209->181|209->181|214->186|214->186|215->187|217->189|217->189|218->190|218->190|219->191|219->191|220->192|220->192|221->193|221->193|226->198|226->198|227->199|228->200|228->200|229->201|229->201|233->205|235->207|236->208|236->208|237->209|238->210|238->210|239->211
                  -- GENERATED --
              */
          
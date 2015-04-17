
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[VotingCriteria],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(voteCriteria: List[VotingCriteria]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.38*/("""
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
							"""),_display_(/*57.9*/voteCriteria/*57.21*/.map/*57.25*/ { vote =>_display_(Seq[Any](format.raw/*57.35*/("""
								"""),format.raw/*58.9*/("""<p><button type="button" class="btn btn-warning btn-block vote-criteria" value="1" data-dismiss="modal"><span class="glyphicon glyphicon-star"></span> """),_display_(/*58.161*/vote/*58.165*/.criteriaName),format.raw/*58.178*/("""</button>
							""")))}),format.raw/*59.9*/("""
                            
                            """),format.raw/*61.29*/("""<!-- <p><button type="button" class="btn btn-danger btn-block vote-criteria" value="2" data-dismiss="modal"><span class="glyphicon glyphicon-heart"></span> The Coolest</button>
                            <p><button type="button" class="btn btn-info btn-block vote-criteria" value="3" data-dismiss="modal"><span class="glyphicon glyphicon-cog"></span> Greatest Performance</button>
                            <p><button type="button" class="btn btn-primary btn-block vote-criteria" value="4" data-dismiss="modal"><span class="glyphicon glyphicon-eye-open"></span> Greatest Design</button> -->
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

                $(document).ready(function()"""),format.raw/*127.45*/("""{"""),format.raw/*127.46*/("""

                    """),format.raw/*129.21*/("""//Clock Section
                    function getdate()"""),format.raw/*130.39*/("""{"""),format.raw/*130.40*/("""
                        """),format.raw/*131.25*/("""var today = new Date();
                        var h = today.getHours();
                        var m = today.getMinutes();
                        var s = today.getSeconds();
                        if(h<10) """),format.raw/*135.34*/("""{"""),format.raw/*135.35*/("""
                            """),format.raw/*136.29*/("""h = "0"+h;
                        """),format.raw/*137.25*/("""}"""),format.raw/*137.26*/("""
                        """),format.raw/*138.25*/("""if(m<10) """),format.raw/*138.34*/("""{"""),format.raw/*138.35*/("""
                            """),format.raw/*139.29*/("""m = "0"+m;
                        """),format.raw/*140.25*/("""}"""),format.raw/*140.26*/("""
                        """),format.raw/*141.25*/("""if(s<10)"""),format.raw/*141.33*/("""{"""),format.raw/*141.34*/("""
                            """),format.raw/*142.29*/("""s = "0"+s;
                        """),format.raw/*143.25*/("""}"""),format.raw/*143.26*/("""
                        """),format.raw/*144.25*/("""$("clock").text(h+" : "+m+" : "+s);
                        setTimeout(function()"""),format.raw/*145.46*/("""{"""),format.raw/*145.47*/("""getdate()"""),format.raw/*145.56*/("""}"""),format.raw/*145.57*/(""", 500);
                    """),format.raw/*146.21*/("""}"""),format.raw/*146.22*/("""
                    """),format.raw/*147.21*/("""getdate();
                    //////////////////////////////////////////////

                    //Vote Section
                    $('#vote').click(function () """),format.raw/*151.50*/("""{"""),format.raw/*151.51*/("""
                        """),format.raw/*152.25*/("""var body = $("html, body");
                        body.animate("""),format.raw/*153.38*/("""{"""),format.raw/*153.39*/("""scrollTop:0"""),format.raw/*153.50*/("""}"""),format.raw/*153.51*/(""", "duration:600", "swing", function() """),format.raw/*153.89*/("""{"""),format.raw/*153.90*/("""
                            """),format.raw/*154.29*/("""//old vote animate
//                        console.log("vote");
//                        $("#topbar").fadeOut();
//                        $("#projectlistLayer").fadeOut();
//                        $("#votebar" ).fadeIn();
//                        $("#voteLayer" ).fadeIn();

                        """),format.raw/*161.25*/("""}"""),format.raw/*161.26*/(""");
                    """),format.raw/*162.21*/("""}"""),format.raw/*162.22*/(""");
                    //////////////////////////////////////////////

                    //Back Button
                    $("#back" ).click(function () """),format.raw/*166.51*/("""{"""),format.raw/*166.52*/("""
                        """),format.raw/*167.25*/("""$(".projectListLayer" ).toggle();
                        $("#topbar" ).fadeToggle(700, "swing", function() """),format.raw/*168.75*/("""{"""),format.raw/*168.76*/("""
                        """),format.raw/*169.25*/("""}"""),format.raw/*169.26*/(""");
                        $("#votebar" ).fadeToggle(700, "swing", function() """),format.raw/*170.76*/("""{"""),format.raw/*170.77*/("""
                        """),format.raw/*171.25*/("""}"""),format.raw/*171.26*/(""");
                    """),format.raw/*172.21*/("""}"""),format.raw/*172.22*/(""");
                    //////////////////////////////////////////////

                    //Vote Button
                    $(".voteB" ).click(function () """),format.raw/*176.52*/("""{"""),format.raw/*176.53*/("""
                        """),format.raw/*177.25*/("""var name = $(this ).attr("id");
                        var value = $(this ).attr("value");
                        $("projectname").contents().filter(function () """),format.raw/*179.72*/("""{"""),format.raw/*179.73*/("""
                        """),format.raw/*180.25*/("""return this.nodeType === 3;
                        """),format.raw/*181.25*/("""}"""),format.raw/*181.26*/(""" """),format.raw/*181.27*/(""").remove();
                        $("projectname" ).append(name);
                        $("#voteValue" ).attr("value", value);
                    """),format.raw/*184.21*/("""}"""),format.raw/*184.22*/(""");
                    //////////////////////////////////////////////

                    //Vote Criteria Section
                    var voteCriteriaID = -1;
                    $(".vote-criteria" ).click(function() """),format.raw/*189.59*/("""{"""),format.raw/*189.60*/("""
                        """),format.raw/*190.25*/("""voteCriteriaID = $(this ).attr("value");
                        $(".projectListLayer" ).toggle();
                        $("#topbar" ).fadeToggle(700, "swing", function() """),format.raw/*192.75*/("""{"""),format.raw/*192.76*/("""
                        """),format.raw/*193.25*/("""}"""),format.raw/*193.26*/(""");
                        $("#votebar" ).fadeToggle(700, "swing", function() """),format.raw/*194.76*/("""{"""),format.raw/*194.77*/("""
                        """),format.raw/*195.25*/("""}"""),format.raw/*195.26*/(""");
                    """),format.raw/*196.21*/("""}"""),format.raw/*196.22*/(""");
                    //////////////////////////////////////////////

                    var screenWidth = $(window ).width();
                    console.log(screenWidth);
                    if (screenWidth < 405) """),format.raw/*201.44*/("""{"""),format.raw/*201.45*/("""
                        """),format.raw/*202.25*/("""$(".voteText" ).css("font-size", "smaller");
                    """),format.raw/*203.21*/("""}"""),format.raw/*203.22*/("""
                """),format.raw/*204.17*/("""}"""),format.raw/*204.18*/(""");
            </script>
        </body>
    </html>
""")))}),format.raw/*208.2*/("""

"""),format.raw/*210.1*/("""<script type="text/javascript">
function theFunction () """),format.raw/*211.25*/("""{"""),format.raw/*211.26*/("""
"""),format.raw/*212.1*/("""// return true or false, depending on whether you want to allow the `href` property to follow through or not
"""),format.raw/*213.1*/("""}"""),format.raw/*213.2*/("""
"""),format.raw/*214.1*/("""</script>"""))}
  }

  def render(voteCriteria:List[VotingCriteria]): play.twirl.api.HtmlFormat.Appendable = apply(voteCriteria)

  def f:((List[VotingCriteria]) => play.twirl.api.HtmlFormat.Appendable) = (voteCriteria) => apply(voteCriteria)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Apr 17 14:48:27 ICT 2015
                  SOURCE: C:/Team2Big2Slim/app/views/index.scala.html
                  HASH: 0270f4e3b1ef34bfa73baf3bd2e85127c5c34b40
                  MATRIX: 737->1|861->37|889->40|914->57|953->59|985->65|1361->415|1375->421|1430->456|4213->3213|4234->3225|4247->3229|4295->3239|4332->3249|4512->3401|4526->3405|4561->3418|4610->3437|4698->3497|8562->7332|8592->7333|8645->7357|8729->7412|8759->7413|8814->7439|9058->7654|9088->7655|9147->7685|9212->7721|9242->7722|9297->7748|9335->7757|9365->7758|9424->7788|9489->7824|9519->7825|9574->7851|9611->7859|9641->7860|9700->7890|9765->7926|9795->7927|9850->7953|9961->8035|9991->8036|10029->8045|10059->8046|10117->8075|10147->8076|10198->8098|10394->8265|10424->8266|10479->8292|10574->8358|10604->8359|10644->8370|10674->8371|10741->8409|10771->8410|10830->8440|11171->8752|11201->8753|11254->8777|11284->8778|11472->8937|11502->8938|11557->8964|11695->9073|11725->9074|11780->9100|11810->9101|11918->9180|11948->9181|12003->9207|12033->9208|12086->9232|12116->9233|12305->9393|12335->9394|12390->9420|12584->9585|12614->9586|12669->9612|12751->9665|12781->9666|12811->9667|12994->9821|13024->9822|13276->10045|13306->10046|13361->10072|13565->10247|13595->10248|13650->10274|13680->10275|13788->10354|13818->10355|13873->10381|13903->10382|13956->10406|13986->10407|14238->10630|14268->10631|14323->10657|14418->10723|14448->10724|14495->10742|14525->10743|14614->10801|14646->10805|14732->10862|14762->10863|14792->10865|14930->10975|14959->10976|14989->10978
                  LINES: 26->1|29->1|30->2|30->2|30->2|31->3|37->9|37->9|37->9|85->57|85->57|85->57|85->57|86->58|86->58|86->58|86->58|87->59|89->61|155->127|155->127|157->129|158->130|158->130|159->131|163->135|163->135|164->136|165->137|165->137|166->138|166->138|166->138|167->139|168->140|168->140|169->141|169->141|169->141|170->142|171->143|171->143|172->144|173->145|173->145|173->145|173->145|174->146|174->146|175->147|179->151|179->151|180->152|181->153|181->153|181->153|181->153|181->153|181->153|182->154|189->161|189->161|190->162|190->162|194->166|194->166|195->167|196->168|196->168|197->169|197->169|198->170|198->170|199->171|199->171|200->172|200->172|204->176|204->176|205->177|207->179|207->179|208->180|209->181|209->181|209->181|212->184|212->184|217->189|217->189|218->190|220->192|220->192|221->193|221->193|222->194|222->194|223->195|223->195|224->196|224->196|229->201|229->201|230->202|231->203|231->203|232->204|232->204|236->208|238->210|239->211|239->211|240->212|241->213|241->213|242->214
                  -- GENERATED --
              */
          
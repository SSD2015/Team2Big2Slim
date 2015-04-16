
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

                $(document).ready(function()"""),format.raw/*123.45*/("""{"""),format.raw/*123.46*/("""

                    """),format.raw/*125.21*/("""//Clock Section
                    function getdate()"""),format.raw/*126.39*/("""{"""),format.raw/*126.40*/("""
                        """),format.raw/*127.25*/("""var today = new Date();
                        var h = today.getHours();
                        var m = today.getMinutes();
                        var s = today.getSeconds();
                        if(h<10) """),format.raw/*131.34*/("""{"""),format.raw/*131.35*/("""
                            """),format.raw/*132.29*/("""h = "0"+h;
                        """),format.raw/*133.25*/("""}"""),format.raw/*133.26*/("""
                        """),format.raw/*134.25*/("""if(m<10) """),format.raw/*134.34*/("""{"""),format.raw/*134.35*/("""
                            """),format.raw/*135.29*/("""m = "0"+m;
                        """),format.raw/*136.25*/("""}"""),format.raw/*136.26*/("""
                        """),format.raw/*137.25*/("""if(s<10)"""),format.raw/*137.33*/("""{"""),format.raw/*137.34*/("""
                            """),format.raw/*138.29*/("""s = "0"+s;
                        """),format.raw/*139.25*/("""}"""),format.raw/*139.26*/("""
                        """),format.raw/*140.25*/("""$("clock").text(h+" : "+m+" : "+s);
                        setTimeout(function()"""),format.raw/*141.46*/("""{"""),format.raw/*141.47*/("""getdate()"""),format.raw/*141.56*/("""}"""),format.raw/*141.57*/(""", 500);
                    """),format.raw/*142.21*/("""}"""),format.raw/*142.22*/("""
                    """),format.raw/*143.21*/("""getdate();
                    //////////////////////////////////////////////

                    //Vote Section
                    $('#vote').click(function () """),format.raw/*147.50*/("""{"""),format.raw/*147.51*/("""
                        """),format.raw/*148.25*/("""var body = $("html, body");
                        body.animate("""),format.raw/*149.38*/("""{"""),format.raw/*149.39*/("""scrollTop:0"""),format.raw/*149.50*/("""}"""),format.raw/*149.51*/(""", "duration:600", "swing", function() """),format.raw/*149.89*/("""{"""),format.raw/*149.90*/("""
                            """),format.raw/*150.29*/("""//old vote animate
//                        console.log("vote");
//                        $("#topbar").fadeOut();
//                        $("#projectlistLayer").fadeOut();
//                        $("#votebar" ).fadeIn();
//                        $("#voteLayer" ).fadeIn();

                        """),format.raw/*157.25*/("""}"""),format.raw/*157.26*/(""");
                    """),format.raw/*158.21*/("""}"""),format.raw/*158.22*/(""");
                    //////////////////////////////////////////////

                    //Back Button
                    $("#back" ).click(function () """),format.raw/*162.51*/("""{"""),format.raw/*162.52*/("""
                        """),format.raw/*163.25*/("""$(".projectListLayer" ).toggle();
                        $("#topbar" ).fadeToggle(700, "swing", function() """),format.raw/*164.75*/("""{"""),format.raw/*164.76*/("""
                        """),format.raw/*165.25*/("""}"""),format.raw/*165.26*/(""");
                        $("#votebar" ).fadeToggle(700, "swing", function() """),format.raw/*166.76*/("""{"""),format.raw/*166.77*/("""
                        """),format.raw/*167.25*/("""}"""),format.raw/*167.26*/(""");
                    """),format.raw/*168.21*/("""}"""),format.raw/*168.22*/(""");
                    //////////////////////////////////////////////

                    //Vote Button
                    $(".voteB" ).click(function () """),format.raw/*172.52*/("""{"""),format.raw/*172.53*/("""
                        """),format.raw/*173.25*/("""var name = $(this ).attr("id");
                        var value = $(this ).attr("value");
                        $("projectname").contents().filter(function () """),format.raw/*175.72*/("""{"""),format.raw/*175.73*/("""
                        """),format.raw/*176.25*/("""return this.nodeType === 3;
                        """),format.raw/*177.25*/("""}"""),format.raw/*177.26*/(""" """),format.raw/*177.27*/(""").remove();
                        $("projectname" ).append(name);
                        $("#voteValue" ).attr("value", value);
                    """),format.raw/*180.21*/("""}"""),format.raw/*180.22*/(""");
                    //////////////////////////////////////////////

                    //Vote Criteria Section
                    var voteCriteriaID = -1;
                    $(".vote-criteria" ).click(function() """),format.raw/*185.59*/("""{"""),format.raw/*185.60*/("""
                        """),format.raw/*186.25*/("""voteCriteriaID = $(this ).attr("value");
                        $(".projectListLayer" ).toggle();
                        $("#topbar" ).fadeToggle(700, "swing", function() """),format.raw/*188.75*/("""{"""),format.raw/*188.76*/("""
                        """),format.raw/*189.25*/("""}"""),format.raw/*189.26*/(""");
                        $("#votebar" ).fadeToggle(700, "swing", function() """),format.raw/*190.76*/("""{"""),format.raw/*190.77*/("""
                        """),format.raw/*191.25*/("""}"""),format.raw/*191.26*/(""");
                    """),format.raw/*192.21*/("""}"""),format.raw/*192.22*/(""");
                    //////////////////////////////////////////////

                    var screenWidth = $(window ).width();
                    console.log(screenWidth);
                    if (screenWidth < 405) """),format.raw/*197.44*/("""{"""),format.raw/*197.45*/("""
                        """),format.raw/*198.25*/("""$(".voteText" ).css("font-size", "smaller");
                    """),format.raw/*199.21*/("""}"""),format.raw/*199.22*/("""
                """),format.raw/*200.17*/("""}"""),format.raw/*200.18*/(""");
            </script>
        </body>
    </html>
""")))}),format.raw/*204.2*/("""

"""),format.raw/*206.1*/("""<script type="text/javascript">
function theFunction () """),format.raw/*207.25*/("""{"""),format.raw/*207.26*/("""
"""),format.raw/*208.1*/("""// return true or false, depending on whether you want to allow the `href` property to follow through or not
"""),format.raw/*209.1*/("""}"""),format.raw/*209.2*/("""
"""),format.raw/*210.1*/("""</script>"""))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Apr 16 16:59:22 ICT 2015
                  SOURCE: /Users/nathakorn/Documents/Team2Big2Slim/app/views/index.scala.html
                  HASH: cbcfc023f1f7c1908837ac1987227dcefa141fbc
                  MATRIX: 723->1|827->17|854->19|879->36|918->38|949->43|1319->387|1333->393|1388->428|8102->7113|8132->7114|8183->7136|8266->7190|8296->7191|8350->7216|8590->7427|8620->7428|8678->7457|8742->7492|8772->7493|8826->7518|8864->7527|8894->7528|8952->7557|9016->7592|9046->7593|9100->7618|9137->7626|9167->7627|9225->7656|9289->7691|9319->7692|9373->7717|9483->7798|9513->7799|9551->7808|9581->7809|9638->7837|9668->7838|9718->7859|9910->8022|9940->8023|9994->8048|10088->8113|10118->8114|10158->8125|10188->8126|10255->8164|10285->8165|10343->8194|10677->8499|10707->8500|10759->8523|10789->8524|10973->8679|11003->8680|11057->8705|11194->8813|11224->8814|11278->8839|11308->8840|11415->8918|11445->8919|11499->8944|11529->8945|11581->8968|11611->8969|11796->9125|11826->9126|11880->9151|12072->9314|12102->9315|12156->9340|12237->9392|12267->9393|12297->9394|12477->9545|12507->9546|12754->9764|12784->9765|12838->9790|13040->9963|13070->9964|13124->9989|13154->9990|13261->10068|13291->10069|13345->10094|13375->10095|13427->10118|13457->10119|13704->10337|13734->10338|13788->10363|13882->10428|13912->10429|13958->10446|13988->10447|14073->10501|14103->10503|14188->10559|14218->10560|14247->10561|14384->10670|14413->10671|14442->10672
                  LINES: 26->1|29->1|30->2|30->2|30->2|31->3|37->9|37->9|37->9|151->123|151->123|153->125|154->126|154->126|155->127|159->131|159->131|160->132|161->133|161->133|162->134|162->134|162->134|163->135|164->136|164->136|165->137|165->137|165->137|166->138|167->139|167->139|168->140|169->141|169->141|169->141|169->141|170->142|170->142|171->143|175->147|175->147|176->148|177->149|177->149|177->149|177->149|177->149|177->149|178->150|185->157|185->157|186->158|186->158|190->162|190->162|191->163|192->164|192->164|193->165|193->165|194->166|194->166|195->167|195->167|196->168|196->168|200->172|200->172|201->173|203->175|203->175|204->176|205->177|205->177|205->177|208->180|208->180|213->185|213->185|214->186|216->188|216->188|217->189|217->189|218->190|218->190|219->191|219->191|220->192|220->192|225->197|225->197|226->198|227->199|227->199|228->200|228->200|232->204|234->206|235->207|235->207|236->208|237->209|237->209|238->210
                  -- GENERATED --
              */
          
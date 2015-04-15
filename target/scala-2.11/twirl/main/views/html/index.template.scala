
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
                    <a class="navbar-brand" href="#">
                        Select the best group then click ok
                    </a>
                </div>
                <div class="navbar-header pull-right">
                    <a class="navbar-brand" href="#" id="back"><span class="glyphicon glyphicon-chevron-up"></span> Back</a>
                </div>
            </nav>

            <!-- topbar -->
            <nav class="navbar navbar-inverse navbar-fixed-top"  id="topbar">
                <div class="navbar-header pull-left">
                    <a class="navbar-brand" href="#">
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
                $(document).ready(function()"""),format.raw/*121.45*/("""{"""),format.raw/*121.46*/("""
                    """),format.raw/*122.21*/("""//Clock Section
                    function getdate()"""),format.raw/*123.39*/("""{"""),format.raw/*123.40*/("""
                        """),format.raw/*124.25*/("""var today = new Date();
                        var h = today.getHours();
                        var m = today.getMinutes();
                        var s = today.getSeconds();
                        if(h<10) """),format.raw/*128.34*/("""{"""),format.raw/*128.35*/("""
                            """),format.raw/*129.29*/("""h = "0"+h;
                        """),format.raw/*130.25*/("""}"""),format.raw/*130.26*/("""
                        """),format.raw/*131.25*/("""if(m<10) """),format.raw/*131.34*/("""{"""),format.raw/*131.35*/("""
                            """),format.raw/*132.29*/("""m = "0"+m;
                        """),format.raw/*133.25*/("""}"""),format.raw/*133.26*/("""
                        """),format.raw/*134.25*/("""if(s<10)"""),format.raw/*134.33*/("""{"""),format.raw/*134.34*/("""
                            """),format.raw/*135.29*/("""s = "0"+s;
                        """),format.raw/*136.25*/("""}"""),format.raw/*136.26*/("""
                        """),format.raw/*137.25*/("""$("clock").text(h+" : "+m+" : "+s);
                        setTimeout(function()"""),format.raw/*138.46*/("""{"""),format.raw/*138.47*/("""getdate()"""),format.raw/*138.56*/("""}"""),format.raw/*138.57*/(""", 500);
                    """),format.raw/*139.21*/("""}"""),format.raw/*139.22*/("""
                    """),format.raw/*140.21*/("""getdate();
                    //////////////////////////////////////////////

                    //Vote Section
                    $('#vote').click(function () """),format.raw/*144.50*/("""{"""),format.raw/*144.51*/("""
                        """),format.raw/*145.25*/("""var body = $("html, body");
                        body.animate("""),format.raw/*146.38*/("""{"""),format.raw/*146.39*/("""scrollTop:0"""),format.raw/*146.50*/("""}"""),format.raw/*146.51*/(""", "duration:600", "swing", function() """),format.raw/*146.89*/("""{"""),format.raw/*146.90*/("""
                            """),format.raw/*147.29*/("""//old vote animate
//                        console.log("vote");
//                        $("#topbar").fadeOut();
//                        $("#projectlistLayer").fadeOut();
//                        $("#votebar" ).fadeIn();
//                        $("#voteLayer" ).fadeIn();

                        """),format.raw/*154.25*/("""}"""),format.raw/*154.26*/(""");
                    """),format.raw/*155.21*/("""}"""),format.raw/*155.22*/(""");
                    //////////////////////////////////////////////

                    //Back Button
                    $("#back" ).click(function () """),format.raw/*159.51*/("""{"""),format.raw/*159.52*/("""
                        """),format.raw/*160.25*/("""$(".projectListLayer" ).toggle();
                        $("#topbar" ).fadeToggle(700, "swing", function() """),format.raw/*161.75*/("""{"""),format.raw/*161.76*/("""

                        """),format.raw/*163.25*/("""}"""),format.raw/*163.26*/(""");
                    """),format.raw/*164.21*/("""}"""),format.raw/*164.22*/(""");
                    //////////////////////////////////////////////

                    //Vote Button
                    $(".voteB" ).click(function () """),format.raw/*168.52*/("""{"""),format.raw/*168.53*/("""
                        """),format.raw/*169.25*/("""var name = $(this ).attr("id");
                        var value = $(this ).attr("value");
                        $("projectname").contents().filter(function () """),format.raw/*171.72*/("""{"""),format.raw/*171.73*/("""
                        """),format.raw/*172.25*/("""return this.nodeType === 3;
                        """),format.raw/*173.25*/("""}"""),format.raw/*173.26*/(""" """),format.raw/*173.27*/(""").remove();
                        $("projectname" ).append(name);
                        $("#voteValue" ).attr("value", value);
                    """),format.raw/*176.21*/("""}"""),format.raw/*176.22*/(""");
                    //////////////////////////////////////////////

                    //Vote Criteria Section
                    var voteCriteriaID = -1;
                    $(".vote-criteria" ).click(function() """),format.raw/*181.59*/("""{"""),format.raw/*181.60*/("""
                        """),format.raw/*182.25*/("""voteCriteriaID = $(this ).attr("value");
                        $(".projectListLayer" ).toggle();
                        $("#topbar" ).fadeToggle(700, "swing", function() """),format.raw/*184.75*/("""{"""),format.raw/*184.76*/("""
                            """),format.raw/*185.29*/("""console.log("finish");
                        """),format.raw/*186.25*/("""}"""),format.raw/*186.26*/(""");
//                        $("#topbar" ).animate("""),format.raw/*187.49*/("""{"""),format.raw/*187.50*/("""width: "toggle""""),format.raw/*187.65*/("""}"""),format.raw/*187.66*/(""", 1000, function() """),format.raw/*187.85*/("""{"""),format.raw/*187.86*/("""
"""),format.raw/*188.1*/("""//
//                        """),format.raw/*189.27*/("""}"""),format.raw/*189.28*/(""");
                    """),format.raw/*190.21*/("""}"""),format.raw/*190.22*/(""");

                """),format.raw/*192.17*/("""}"""),format.raw/*192.18*/(""");
            </script>
        </body>
    </html>
""")))}),format.raw/*196.2*/("""

"""),format.raw/*198.1*/("""<script type="text/javascript">
function theFunction () """),format.raw/*199.25*/("""{"""),format.raw/*199.26*/("""
"""),format.raw/*200.1*/("""// return true or false, depending on whether you want to allow the `href` property to follow through or not
"""),format.raw/*201.1*/("""}"""),format.raw/*201.2*/("""
"""),format.raw/*202.1*/("""</script>"""))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Apr 15 15:37:50 ICT 2015
                  SOURCE: /Users/Punpikorn/Desktop/2Big2Slim/Team2Big2Slim/app/views/index.scala.html
                  HASH: e2b51dcad9d6181dcc922f6bcd23fd08d61f4f4f
                  MATRIX: 723->1|827->17|854->19|879->36|918->38|949->43|1319->387|1333->393|1388->428|8044->7055|8074->7056|8124->7077|8207->7131|8237->7132|8291->7157|8531->7368|8561->7369|8619->7398|8683->7433|8713->7434|8767->7459|8805->7468|8835->7469|8893->7498|8957->7533|8987->7534|9041->7559|9078->7567|9108->7568|9166->7597|9230->7632|9260->7633|9314->7658|9424->7739|9454->7740|9492->7749|9522->7750|9579->7778|9609->7779|9659->7800|9851->7963|9881->7964|9935->7989|10029->8054|10059->8055|10099->8066|10129->8067|10196->8105|10226->8106|10284->8135|10618->8440|10648->8441|10700->8464|10730->8465|10914->8620|10944->8621|10998->8646|11135->8754|11165->8755|11220->8781|11250->8782|11302->8805|11332->8806|11517->8962|11547->8963|11601->8988|11793->9151|11823->9152|11877->9177|11958->9229|11988->9230|12018->9231|12198->9382|12228->9383|12475->9601|12505->9602|12559->9627|12761->9800|12791->9801|12849->9830|12925->9877|12955->9878|13035->9929|13065->9930|13109->9945|13139->9946|13187->9965|13217->9966|13246->9967|13304->9996|13334->9997|13386->10020|13416->10021|13465->10041|13495->10042|13580->10096|13610->10098|13695->10154|13725->10155|13754->10156|13891->10265|13920->10266|13949->10267
                  LINES: 26->1|29->1|30->2|30->2|30->2|31->3|37->9|37->9|37->9|149->121|149->121|150->122|151->123|151->123|152->124|156->128|156->128|157->129|158->130|158->130|159->131|159->131|159->131|160->132|161->133|161->133|162->134|162->134|162->134|163->135|164->136|164->136|165->137|166->138|166->138|166->138|166->138|167->139|167->139|168->140|172->144|172->144|173->145|174->146|174->146|174->146|174->146|174->146|174->146|175->147|182->154|182->154|183->155|183->155|187->159|187->159|188->160|189->161|189->161|191->163|191->163|192->164|192->164|196->168|196->168|197->169|199->171|199->171|200->172|201->173|201->173|201->173|204->176|204->176|209->181|209->181|210->182|212->184|212->184|213->185|214->186|214->186|215->187|215->187|215->187|215->187|215->187|215->187|216->188|217->189|217->189|218->190|218->190|220->192|220->192|224->196|226->198|227->199|227->199|228->200|229->201|229->201|230->202
                  -- GENERATED --
              */
          
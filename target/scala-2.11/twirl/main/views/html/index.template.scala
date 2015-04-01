
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
            <title>Bootstrap Case</title>
            <meta charset="utf-8">
            <meta name="viewport" content="width=device-width, initial-scale=1">
            <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
            <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>

                <!-- CSS -->
            <style>
            html, body """),format.raw/*15.24*/("""{"""),format.raw/*15.25*/("""
            """),format.raw/*16.13*/("""max-width: 100%;
            overflow-x: hidden;
            margin-top: 30px;
            background-color: #909090;
            """),format.raw/*20.13*/("""}"""),format.raw/*20.14*/("""
            """),format.raw/*21.13*/(""".header """),format.raw/*21.21*/("""{"""),format.raw/*21.22*/("""
            """),format.raw/*22.13*/("""float: right;
            /*width: 300px;     */
            """),format.raw/*24.13*/("""}"""),format.raw/*24.14*/("""
            """),format.raw/*25.13*/(""".toppanel """),format.raw/*25.23*/("""{"""),format.raw/*25.24*/("""
            """),format.raw/*26.13*/("""position: fixed;
            background-color: #ff8080;
            color: white;
            /*text-align: center;*/
            padding: 20px;
            width: 100%;
            z-index: 1;
            """),format.raw/*33.13*/("""}"""),format.raw/*33.14*/("""
            """),format.raw/*34.13*/(""".topbar """),format.raw/*34.21*/("""{"""),format.raw/*34.22*/("""
            """),format.raw/*35.13*/("""height: 40px;
            color: lightgrey;
            """),format.raw/*37.13*/("""}"""),format.raw/*37.14*/("""
            """),format.raw/*38.13*/(""".projectlist """),format.raw/*38.26*/("""{"""),format.raw/*38.27*/("""
            """),format.raw/*39.13*/("""border-color: grey;
            """),format.raw/*40.13*/("""}"""),format.raw/*40.14*/("""
            """),format.raw/*41.13*/(""".project """),format.raw/*41.22*/("""{"""),format.raw/*41.23*/("""
            """),format.raw/*42.13*/("""margin: 7px;
            margin-left: 15px;
            width: 100%;
            border: solid;
            border-width: 0.1px;
            opacity: 0.6;
            """),format.raw/*48.13*/("""}"""),format.raw/*48.14*/("""
            """),format.raw/*49.13*/(""".project:hover """),format.raw/*49.28*/("""{"""),format.raw/*49.29*/("""
            """),format.raw/*50.13*/("""opacity: 1.0;
            """),format.raw/*51.13*/("""}"""),format.raw/*51.14*/("""
            """),format.raw/*52.13*/(""".container """),format.raw/*52.24*/("""{"""),format.raw/*52.25*/("""
            """),format.raw/*53.13*/("""/*position: ;*/
            margin-left: 0px;
            """),format.raw/*55.13*/("""}"""),format.raw/*55.14*/("""
            """),format.raw/*56.13*/(""".row """),format.raw/*56.18*/("""{"""),format.raw/*56.19*/("""
            """),format.raw/*57.13*/("""width: 100%;
            """),format.raw/*58.13*/("""}"""),format.raw/*58.14*/("""
            """),format.raw/*59.13*/("""#voteLayer """),format.raw/*59.24*/("""{"""),format.raw/*59.25*/("""
            """),format.raw/*60.13*/("""/*opacity : 0;*/
            position: absolute;
            """),format.raw/*62.13*/("""}"""),format.raw/*62.14*/("""
            """),format.raw/*63.13*/("""clock """),format.raw/*63.19*/("""{"""),format.raw/*63.20*/("""
            """),format.raw/*64.13*/("""font: serif;
            font-size: x-large;
            """),format.raw/*66.13*/("""}"""),format.raw/*66.14*/("""
            """),format.raw/*67.13*/("""</style>
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
                            <button type="button" class="btn btn-default">Ok</button>
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
                        <a value="1" class="voteB" href="#" id="project1" data-toggle="modal" data-target="#voteConfirm"><image class="project img-rounded" src = "assets/g1_vector.jpg" title = "group1"></image></a>
                    </div>
                    <div class="row" id="2">
                        <a value="2" class="voteB" href="#" id="project2" data-toggle="modal" data-target="#voteConfirm"><image class="project img-rounded" src = "assets/g2_vector.jpg" title = "group2"></image></a>
                    </div>
                    <div class="row" id="3">
                        <a value="3" class="voteB" href="#" id="project3" data-toggle="modal" data-target="#voteConfirm"><image class="project img-rounded" src = "assets/g3_vector.jpg" title = "group3"></image></a>
                    </div>
                    <div class="row" id="4">
                        <a value="4" class="voteB" href="#" id="project4" data-toggle="modal" data-target="#voteConfirm"><image class="project img-rounded" src = "assets/g4_vector.jpg" title = "group4"></image></a>
                    </div>
                </div>
            </div>

            <div id="projectlistLayer">
                <div class="container-fluid projectlist">
                    <div class="row" id="1">
                        <a href="rate"><image class="project img-rounded" src = "assets/g1_vector.jpg" title = "group1"></image></a>
                    </div>
                    <div class="row" id="2">
                        <a href="rate"><image class="project img-rounded" src = "assets/g2_vector.jpg" title = "group2"></image></a>
                    </div>
                    <div class="row" id="3">
                        <a href="rate"><image class="project img-rounded" src = "assets/g3_vector.jpg" title = "group3"></image></a>
                    </div>
                    <div class="row" id="4">
                        <a href="rate"><image class="project img-rounded" src = "assets/g4_vector.jpg" title = "group4"></image></a>
                    </div>
                </div>
            </div>
                <!-- JQuery -->
            <script>
                $(document).ready(function()"""),format.raw/*175.45*/("""{"""),format.raw/*175.46*/("""
                    """),format.raw/*176.21*/("""function getdate()"""),format.raw/*176.39*/("""{"""),format.raw/*176.40*/("""
                        """),format.raw/*177.25*/("""var today = new Date();
                        var h = today.getHours();
                        var m = today.getMinutes();
                        var s = today.getSeconds();
                        if(s<10)"""),format.raw/*181.33*/("""{"""),format.raw/*181.34*/("""
                        """),format.raw/*182.25*/("""s = "0"+s;
                        """),format.raw/*183.25*/("""}"""),format.raw/*183.26*/("""
                        """),format.raw/*184.25*/("""$("clock").text(h+" : "+m+" : "+s);
                        setTimeout(function()"""),format.raw/*185.46*/("""{"""),format.raw/*185.47*/("""getdate()"""),format.raw/*185.56*/("""}"""),format.raw/*185.57*/(""", 500);
                    """),format.raw/*186.21*/("""}"""),format.raw/*186.22*/("""
                    """),format.raw/*187.21*/("""getdate();

                    $('#vote').click(function () """),format.raw/*189.50*/("""{"""),format.raw/*189.51*/("""
                        """),format.raw/*190.25*/("""var body = $("html, body");
                        body.animate("""),format.raw/*191.38*/("""{"""),format.raw/*191.39*/("""scrollTop:0"""),format.raw/*191.50*/("""}"""),format.raw/*191.51*/(""", "duration:600", "swing", function() """),format.raw/*191.89*/("""{"""),format.raw/*191.90*/("""
                        """),format.raw/*192.25*/("""console.log("vote");
                        $("#topbar").fadeOut();
                        $("#projectlistLayer").fadeOut();
                        $("#votebar" ).fadeIn();
                        $("#voteLayer" ).fadeIn();
                        """),format.raw/*197.25*/("""}"""),format.raw/*197.26*/(""");
                    """),format.raw/*198.21*/("""}"""),format.raw/*198.22*/(""");

                    $("#back" ).click(function () """),format.raw/*200.51*/("""{"""),format.raw/*200.52*/("""
                        """),format.raw/*201.25*/("""console.log("back");
                        $("#topbar" ).fadeIn();
                        $("#projectlistLayer" ).fadeIn();
                        $("#voteLayer" ).fadeOut();
                    """),format.raw/*205.21*/("""}"""),format.raw/*205.22*/(""");

                    $(".voteB" ).click(function () """),format.raw/*207.52*/("""{"""),format.raw/*207.53*/("""
                        """),format.raw/*208.25*/("""var name = $(this ).attr("id");
                        var value = $(this ).attr("value");
                        $("projectname").contents().filter(function () """),format.raw/*210.72*/("""{"""),format.raw/*210.73*/("""
                        """),format.raw/*211.25*/("""return this.nodeType === 3;
                        """),format.raw/*212.25*/("""}"""),format.raw/*212.26*/(""" """),format.raw/*212.27*/(""").remove();
                        $("projectname" ).append(name);
                        $("#voteValue" ).attr("value", value);
                    """),format.raw/*215.21*/("""}"""),format.raw/*215.22*/(""");
                """),format.raw/*216.17*/("""}"""),format.raw/*216.18*/(""");
            </script>

                <!-- JS -->
            <script>
            function camerabEvent() """),format.raw/*221.37*/("""{"""),format.raw/*221.38*/("""
            """),format.raw/*222.13*/("""//open camera app
            alert("camera");
            """),format.raw/*224.13*/("""}"""),format.raw/*224.14*/("""
            """),format.raw/*225.13*/("""function votebEvent() """),format.raw/*225.35*/("""{"""),format.raw/*225.36*/("""
            """),format.raw/*226.13*/("""//actually go to vote page
            alert("vote");
            """),format.raw/*228.13*/("""}"""),format.raw/*228.14*/("""
            """),format.raw/*229.13*/("""function logoutbEvent() """),format.raw/*229.37*/("""{"""),format.raw/*229.38*/("""
            """),format.raw/*230.13*/("""//confirmation prompt out
            confirm("Are you sure ?");
            """),format.raw/*232.13*/("""}"""),format.raw/*232.14*/("""
            """),format.raw/*233.13*/("""</script>
        </body>
    </html>
""")))}),format.raw/*236.2*/("""
"""))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Apr 01 22:47:58 ICT 2015
                  SOURCE: /Users/Punpikorn/Desktop/2Big2Slim/Team2Big2Slim/app/views/index.scala.html
                  HASH: 582831b9a5fb3515ab27933a3e2f4e3ba99804bf
                  MATRIX: 723->1|827->17|854->19|879->36|918->38|949->43|1582->648|1611->649|1652->662|1810->792|1839->793|1880->806|1916->814|1945->815|1986->828|2075->889|2104->890|2145->903|2183->913|2212->914|2253->927|2487->1133|2516->1134|2557->1147|2593->1155|2622->1156|2663->1169|2747->1225|2776->1226|2817->1239|2858->1252|2887->1253|2928->1266|2988->1298|3017->1299|3058->1312|3095->1321|3124->1322|3165->1335|3360->1502|3389->1503|3430->1516|3473->1531|3502->1532|3543->1545|3597->1571|3626->1572|3667->1585|3706->1596|3735->1597|3776->1610|3862->1668|3891->1669|3932->1682|3965->1687|3994->1688|4035->1701|4088->1726|4117->1727|4158->1740|4197->1751|4226->1752|4267->1765|4356->1826|4385->1827|4426->1840|4460->1846|4489->1847|4530->1860|4615->1917|4644->1918|4685->1931|10565->7782|10595->7783|10645->7804|10692->7822|10722->7823|10776->7848|11015->8058|11045->8059|11099->8084|11163->8119|11193->8120|11247->8145|11357->8226|11387->8227|11425->8236|11455->8237|11512->8265|11542->8266|11592->8287|11682->8348|11712->8349|11766->8374|11860->8439|11890->8440|11930->8451|11960->8452|12027->8490|12057->8491|12111->8516|12391->8767|12421->8768|12473->8791|12503->8792|12586->8846|12616->8847|12670->8872|12898->9071|12928->9072|13012->9127|13042->9128|13096->9153|13288->9316|13318->9317|13372->9342|13453->9394|13483->9395|13513->9396|13693->9547|13723->9548|13771->9567|13801->9568|13941->9679|13971->9680|14013->9693|14101->9752|14131->9753|14173->9766|14224->9788|14254->9789|14296->9802|14391->9868|14421->9869|14463->9882|14516->9906|14546->9907|14588->9920|14694->9997|14724->9998|14766->10011|14836->10050
                  LINES: 26->1|29->1|30->2|30->2|30->2|31->3|43->15|43->15|44->16|48->20|48->20|49->21|49->21|49->21|50->22|52->24|52->24|53->25|53->25|53->25|54->26|61->33|61->33|62->34|62->34|62->34|63->35|65->37|65->37|66->38|66->38|66->38|67->39|68->40|68->40|69->41|69->41|69->41|70->42|76->48|76->48|77->49|77->49|77->49|78->50|79->51|79->51|80->52|80->52|80->52|81->53|83->55|83->55|84->56|84->56|84->56|85->57|86->58|86->58|87->59|87->59|87->59|88->60|90->62|90->62|91->63|91->63|91->63|92->64|94->66|94->66|95->67|203->175|203->175|204->176|204->176|204->176|205->177|209->181|209->181|210->182|211->183|211->183|212->184|213->185|213->185|213->185|213->185|214->186|214->186|215->187|217->189|217->189|218->190|219->191|219->191|219->191|219->191|219->191|219->191|220->192|225->197|225->197|226->198|226->198|228->200|228->200|229->201|233->205|233->205|235->207|235->207|236->208|238->210|238->210|239->211|240->212|240->212|240->212|243->215|243->215|244->216|244->216|249->221|249->221|250->222|252->224|252->224|253->225|253->225|253->225|254->226|256->228|256->228|257->229|257->229|257->229|258->230|260->232|260->232|261->233|264->236
                  -- GENERATED --
              */
          

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
                    <div class="row" id="3">
                        <a value="3" class="voteB" id="project3" data-toggle="modal" data-target="#voteConfirm"><image class="project img-rounded" src = "assets/g3_vector.jpg" title = "group3"></image></a>
                    </div>
                    <div class="row" id="4">
                        <a value="4" class="voteB" id="project4" data-toggle="modal" data-target="#voteConfirm"><image class="project img-rounded" src = "assets/g4_vector.jpg" title = "group4"></image></a>
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
                    <div class="row" id="3">
                        <a href="#"><image class="project img-rounded" src = "assets/g3_vector.jpg" title = "group3"></image></a>
                    </div>
                    <div class="row" id="4">
                        <a href="#"><image class="project img-rounded" src = "assets/g4_vector.jpg" title = "group4"></image></a>
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
                        if(h<10) """),format.raw/*181.34*/("""{"""),format.raw/*181.35*/("""
                            """),format.raw/*182.29*/("""h = "0"+h;
                        """),format.raw/*183.25*/("""}"""),format.raw/*183.26*/("""
                        """),format.raw/*184.25*/("""if(m<10) """),format.raw/*184.34*/("""{"""),format.raw/*184.35*/("""
                            """),format.raw/*185.29*/("""m = "0"+m;
                        """),format.raw/*186.25*/("""}"""),format.raw/*186.26*/("""
                        """),format.raw/*187.25*/("""if(s<10)"""),format.raw/*187.33*/("""{"""),format.raw/*187.34*/("""
                            """),format.raw/*188.29*/("""s = "0"+s;
                        """),format.raw/*189.25*/("""}"""),format.raw/*189.26*/("""
                        """),format.raw/*190.25*/("""$("clock").text(h+" : "+m+" : "+s);
                        setTimeout(function()"""),format.raw/*191.46*/("""{"""),format.raw/*191.47*/("""getdate()"""),format.raw/*191.56*/("""}"""),format.raw/*191.57*/(""", 500);
                    """),format.raw/*192.21*/("""}"""),format.raw/*192.22*/("""
                    """),format.raw/*193.21*/("""getdate();

                    $("#voteLayer" ).toggle();

                    $('#vote').click(function () """),format.raw/*197.50*/("""{"""),format.raw/*197.51*/("""
                        """),format.raw/*198.25*/("""var body = $("html, body");
                        body.animate("""),format.raw/*199.38*/("""{"""),format.raw/*199.39*/("""scrollTop:0"""),format.raw/*199.50*/("""}"""),format.raw/*199.51*/(""", "duration:600", "swing", function() """),format.raw/*199.89*/("""{"""),format.raw/*199.90*/("""
                        """),format.raw/*200.25*/("""console.log("vote");
                        $("#topbar").fadeOut();
                        $("#projectlistLayer").fadeOut();
                        $("#votebar" ).fadeIn();
                        $("#voteLayer" ).fadeIn();
                        """),format.raw/*205.25*/("""}"""),format.raw/*205.26*/(""");
                    """),format.raw/*206.21*/("""}"""),format.raw/*206.22*/(""");

                    $("#back" ).click(function () """),format.raw/*208.51*/("""{"""),format.raw/*208.52*/("""
                        """),format.raw/*209.25*/("""console.log("back");
                        $("#topbar" ).fadeIn();
                        $("#projectlistLayer" ).fadeIn();
                        $("#voteLayer" ).fadeOut();
                    """),format.raw/*213.21*/("""}"""),format.raw/*213.22*/(""");

                    $(".voteB" ).click(function () """),format.raw/*215.52*/("""{"""),format.raw/*215.53*/("""
                        """),format.raw/*216.25*/("""var name = $(this ).attr("id");
                        var value = $(this ).attr("value");
                        $("projectname").contents().filter(function () """),format.raw/*218.72*/("""{"""),format.raw/*218.73*/("""
                        """),format.raw/*219.25*/("""return this.nodeType === 3;
                        """),format.raw/*220.25*/("""}"""),format.raw/*220.26*/(""" """),format.raw/*220.27*/(""").remove();
                        $("projectname" ).append(name);
                        $("#voteValue" ).attr("value", value);
                    """),format.raw/*223.21*/("""}"""),format.raw/*223.22*/(""");

                """),format.raw/*225.17*/("""}"""),format.raw/*225.18*/(""");
            </script>

                <!-- JS -->
            <script>
                function camerabEvent() """),format.raw/*230.41*/("""{"""),format.raw/*230.42*/("""
                """),format.raw/*231.17*/("""//open camera app
                alert("camera");
                """),format.raw/*233.17*/("""}"""),format.raw/*233.18*/("""
                """),format.raw/*234.17*/("""function votebEvent() """),format.raw/*234.39*/("""{"""),format.raw/*234.40*/("""
                """),format.raw/*235.17*/("""//actually go to vote page
                alert("vote");
                """),format.raw/*237.17*/("""}"""),format.raw/*237.18*/("""
                """),format.raw/*238.17*/("""function logoutbEvent() """),format.raw/*238.41*/("""{"""),format.raw/*238.42*/("""
                """),format.raw/*239.17*/("""//confirmation prompt out
                confirm("Are you sure ?");
                """),format.raw/*241.17*/("""}"""),format.raw/*241.18*/("""
                """),format.raw/*242.17*/("""function redirectProfile1() """),format.raw/*242.45*/("""{"""),format.raw/*242.46*/("""
                    """),format.raw/*243.21*/("""return true;
                """),format.raw/*244.17*/("""}"""),format.raw/*244.18*/("""
            """),format.raw/*245.13*/("""</script>
        </body>
    </html>
""")))}),format.raw/*248.2*/("""
"""),format.raw/*249.1*/("""<script type="text/javascript">
function theFunction () """),format.raw/*250.25*/("""{"""),format.raw/*250.26*/("""
"""),format.raw/*251.1*/("""// return true or false, depending on whether you want to allow the `href` property to follow through or not
"""),format.raw/*252.1*/("""}"""),format.raw/*252.2*/("""
"""),format.raw/*253.1*/("""</script>"""))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Apr 02 01:48:32 ICT 2015
                  SOURCE: /Users/nathakorn/Documents/Team2Big2Slim/app/views/index.scala.html
                  HASH: 124616b5683fa351b94c69eba2bdfe37f0c17ec3
                  MATRIX: 723->1|827->17|854->19|879->36|918->38|949->43|1582->648|1611->649|1652->662|1810->792|1839->793|1880->806|1916->814|1945->815|1986->828|2075->889|2104->890|2145->903|2183->913|2212->914|2253->927|2487->1133|2516->1134|2557->1147|2593->1155|2622->1156|2663->1169|2747->1225|2776->1226|2817->1239|2858->1252|2887->1253|2928->1266|2988->1298|3017->1299|3058->1312|3095->1321|3124->1322|3165->1335|3360->1502|3389->1503|3430->1516|3473->1531|3502->1532|3543->1545|3597->1571|3626->1572|3667->1585|3706->1596|3735->1597|3776->1610|3862->1668|3891->1669|3932->1682|3965->1687|3994->1688|4035->1701|4088->1726|4117->1727|4158->1740|4197->1751|4226->1752|4267->1765|4356->1826|4385->1827|4426->1840|4460->1846|4489->1847|4530->1860|4615->1917|4644->1918|4685->1931|10601->7818|10631->7819|10681->7840|10728->7858|10758->7859|10812->7884|11052->8095|11082->8096|11140->8125|11204->8160|11234->8161|11288->8186|11326->8195|11356->8196|11414->8225|11478->8260|11508->8261|11562->8286|11599->8294|11629->8295|11687->8324|11751->8359|11781->8360|11835->8385|11945->8466|11975->8467|12013->8476|12043->8477|12100->8505|12130->8506|12180->8527|12318->8636|12348->8637|12402->8662|12496->8727|12526->8728|12566->8739|12596->8740|12663->8778|12693->8779|12747->8804|13027->9055|13057->9056|13109->9079|13139->9080|13222->9134|13252->9135|13306->9160|13534->9359|13564->9360|13648->9415|13678->9416|13732->9441|13924->9604|13954->9605|14008->9630|14089->9682|14119->9683|14149->9684|14329->9835|14359->9836|14408->9856|14438->9857|14582->9972|14612->9973|14658->9990|14754->10057|14784->10058|14830->10075|14881->10097|14911->10098|14957->10115|15060->10189|15090->10190|15136->10207|15189->10231|15219->10232|15265->10249|15379->10334|15409->10335|15455->10352|15512->10380|15542->10381|15592->10402|15650->10431|15680->10432|15722->10445|15792->10484|15821->10485|15906->10541|15936->10542|15965->10543|16102->10652|16131->10653|16160->10654
                  LINES: 26->1|29->1|30->2|30->2|30->2|31->3|43->15|43->15|44->16|48->20|48->20|49->21|49->21|49->21|50->22|52->24|52->24|53->25|53->25|53->25|54->26|61->33|61->33|62->34|62->34|62->34|63->35|65->37|65->37|66->38|66->38|66->38|67->39|68->40|68->40|69->41|69->41|69->41|70->42|76->48|76->48|77->49|77->49|77->49|78->50|79->51|79->51|80->52|80->52|80->52|81->53|83->55|83->55|84->56|84->56|84->56|85->57|86->58|86->58|87->59|87->59|87->59|88->60|90->62|90->62|91->63|91->63|91->63|92->64|94->66|94->66|95->67|203->175|203->175|204->176|204->176|204->176|205->177|209->181|209->181|210->182|211->183|211->183|212->184|212->184|212->184|213->185|214->186|214->186|215->187|215->187|215->187|216->188|217->189|217->189|218->190|219->191|219->191|219->191|219->191|220->192|220->192|221->193|225->197|225->197|226->198|227->199|227->199|227->199|227->199|227->199|227->199|228->200|233->205|233->205|234->206|234->206|236->208|236->208|237->209|241->213|241->213|243->215|243->215|244->216|246->218|246->218|247->219|248->220|248->220|248->220|251->223|251->223|253->225|253->225|258->230|258->230|259->231|261->233|261->233|262->234|262->234|262->234|263->235|265->237|265->237|266->238|266->238|266->238|267->239|269->241|269->241|270->242|270->242|270->242|271->243|272->244|272->244|273->245|276->248|277->249|278->250|278->250|279->251|280->252|280->252|281->253
                  -- GENERATED --
              */
          
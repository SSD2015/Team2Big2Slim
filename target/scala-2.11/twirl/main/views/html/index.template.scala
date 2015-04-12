
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
                $(document).ready(function()"""),format.raw/*165.45*/("""{"""),format.raw/*165.46*/("""
                    """),format.raw/*166.21*/("""function getdate()"""),format.raw/*166.39*/("""{"""),format.raw/*166.40*/("""
                        """),format.raw/*167.25*/("""var today = new Date();
                        var h = today.getHours();
                        var m = today.getMinutes();
                        var s = today.getSeconds();
                        if(h<10) """),format.raw/*171.34*/("""{"""),format.raw/*171.35*/("""
                            """),format.raw/*172.29*/("""h = "0"+h;
                        """),format.raw/*173.25*/("""}"""),format.raw/*173.26*/("""
                        """),format.raw/*174.25*/("""if(m<10) """),format.raw/*174.34*/("""{"""),format.raw/*174.35*/("""
                            """),format.raw/*175.29*/("""m = "0"+m;
                        """),format.raw/*176.25*/("""}"""),format.raw/*176.26*/("""
                        """),format.raw/*177.25*/("""if(s<10)"""),format.raw/*177.33*/("""{"""),format.raw/*177.34*/("""
                            """),format.raw/*178.29*/("""s = "0"+s;
                        """),format.raw/*179.25*/("""}"""),format.raw/*179.26*/("""
                        """),format.raw/*180.25*/("""$("clock").text(h+" : "+m+" : "+s);
                        setTimeout(function()"""),format.raw/*181.46*/("""{"""),format.raw/*181.47*/("""getdate()"""),format.raw/*181.56*/("""}"""),format.raw/*181.57*/(""", 500);
                    """),format.raw/*182.21*/("""}"""),format.raw/*182.22*/("""
                    """),format.raw/*183.21*/("""getdate();

                    $("#voteLayer" ).toggle();

                    $('#vote').click(function () """),format.raw/*187.50*/("""{"""),format.raw/*187.51*/("""
                        """),format.raw/*188.25*/("""var body = $("html, body");
                        body.animate("""),format.raw/*189.38*/("""{"""),format.raw/*189.39*/("""scrollTop:0"""),format.raw/*189.50*/("""}"""),format.raw/*189.51*/(""", "duration:600", "swing", function() """),format.raw/*189.89*/("""{"""),format.raw/*189.90*/("""
                        """),format.raw/*190.25*/("""console.log("vote");
                        $("#topbar").fadeOut();
                        $("#projectlistLayer").fadeOut();
                        $("#votebar" ).fadeIn();
                        $("#voteLayer" ).fadeIn();
                        """),format.raw/*195.25*/("""}"""),format.raw/*195.26*/(""");
                    """),format.raw/*196.21*/("""}"""),format.raw/*196.22*/(""");

                    $("#back" ).click(function () """),format.raw/*198.51*/("""{"""),format.raw/*198.52*/("""
                        """),format.raw/*199.25*/("""console.log("back");
                        $("#topbar" ).fadeIn();
                        $("#projectlistLayer" ).fadeIn();
                        $("#voteLayer" ).fadeOut();
                    """),format.raw/*203.21*/("""}"""),format.raw/*203.22*/(""");

                    $(".voteB" ).click(function () """),format.raw/*205.52*/("""{"""),format.raw/*205.53*/("""
                        """),format.raw/*206.25*/("""var name = $(this ).attr("id");
                        var value = $(this ).attr("value");
                        $("projectname").contents().filter(function () """),format.raw/*208.72*/("""{"""),format.raw/*208.73*/("""
                        """),format.raw/*209.25*/("""return this.nodeType === 3;
                        """),format.raw/*210.25*/("""}"""),format.raw/*210.26*/(""" """),format.raw/*210.27*/(""").remove();
                        $("projectname" ).append(name);
                        $("#voteValue" ).attr("value", value);
                    """),format.raw/*213.21*/("""}"""),format.raw/*213.22*/(""");

                """),format.raw/*215.17*/("""}"""),format.raw/*215.18*/(""");
            </script>

                <!-- JS -->
            <script>
                function camerabEvent() """),format.raw/*220.41*/("""{"""),format.raw/*220.42*/("""
                """),format.raw/*221.17*/("""//open camera app
                alert("camera");
                """),format.raw/*223.17*/("""}"""),format.raw/*223.18*/("""
                """),format.raw/*224.17*/("""function votebEvent() """),format.raw/*224.39*/("""{"""),format.raw/*224.40*/("""
                """),format.raw/*225.17*/("""//actually go to vote page
                alert("vote");
                """),format.raw/*227.17*/("""}"""),format.raw/*227.18*/("""
                """),format.raw/*228.17*/("""function logoutbEvent() """),format.raw/*228.41*/("""{"""),format.raw/*228.42*/("""
                """),format.raw/*229.17*/("""//confirmation prompt out
                confirm("Are you sure ?");
                """),format.raw/*231.17*/("""}"""),format.raw/*231.18*/("""
                """),format.raw/*232.17*/("""function redirectProfile1() """),format.raw/*232.45*/("""{"""),format.raw/*232.46*/("""
                    """),format.raw/*233.21*/("""return true;
                """),format.raw/*234.17*/("""}"""),format.raw/*234.18*/("""
            """),format.raw/*235.13*/("""</script>
        </body>
    </html>
""")))}),format.raw/*238.2*/("""
"""),format.raw/*239.1*/("""<script type="text/javascript">
function theFunction () """),format.raw/*240.25*/("""{"""),format.raw/*240.26*/("""
"""),format.raw/*241.1*/("""// return true or false, depending on whether you want to allow the `href` property to follow through or not
"""),format.raw/*242.1*/("""}"""),format.raw/*242.2*/("""
"""),format.raw/*243.1*/("""</script>"""))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Apr 12 15:34:02 ICT 2015
                  SOURCE: /Users/Punpikorn/Desktop/2Big2Slim/Team2Big2Slim/app/views/index.scala.html
                  HASH: 3e4fa2dd9321aa40435bbb45a61b469fbed787c3
                  MATRIX: 723->1|827->17|854->19|879->36|918->38|949->43|1582->648|1611->649|1652->662|1810->792|1839->793|1880->806|1916->814|1945->815|1986->828|2075->889|2104->890|2145->903|2183->913|2212->914|2253->927|2487->1133|2516->1134|2557->1147|2593->1155|2622->1156|2663->1169|2747->1225|2776->1226|2817->1239|2858->1252|2887->1253|2928->1266|2988->1298|3017->1299|3058->1312|3095->1321|3124->1322|3165->1335|3360->1502|3389->1503|3430->1516|3473->1531|3502->1532|3543->1545|3597->1571|3626->1572|3667->1585|3706->1596|3735->1597|3776->1610|3862->1668|3891->1669|3932->1682|3965->1687|3994->1688|4035->1701|4088->1726|4117->1727|4158->1740|4197->1751|4226->1752|4267->1765|4356->1826|4385->1827|4426->1840|4460->1846|4489->1847|4530->1860|4615->1917|4644->1918|4685->1931|9658->6875|9688->6876|9738->6897|9785->6915|9815->6916|9869->6941|10109->7152|10139->7153|10197->7182|10261->7217|10291->7218|10345->7243|10383->7252|10413->7253|10471->7282|10535->7317|10565->7318|10619->7343|10656->7351|10686->7352|10744->7381|10808->7416|10838->7417|10892->7442|11002->7523|11032->7524|11070->7533|11100->7534|11157->7562|11187->7563|11237->7584|11375->7693|11405->7694|11459->7719|11553->7784|11583->7785|11623->7796|11653->7797|11720->7835|11750->7836|11804->7861|12084->8112|12114->8113|12166->8136|12196->8137|12279->8191|12309->8192|12363->8217|12591->8416|12621->8417|12705->8472|12735->8473|12789->8498|12981->8661|13011->8662|13065->8687|13146->8739|13176->8740|13206->8741|13386->8892|13416->8893|13465->8913|13495->8914|13639->9029|13669->9030|13715->9047|13811->9114|13841->9115|13887->9132|13938->9154|13968->9155|14014->9172|14117->9246|14147->9247|14193->9264|14246->9288|14276->9289|14322->9306|14436->9391|14466->9392|14512->9409|14569->9437|14599->9438|14649->9459|14707->9488|14737->9489|14779->9502|14849->9541|14878->9542|14963->9598|14993->9599|15022->9600|15159->9709|15188->9710|15217->9711
                  LINES: 26->1|29->1|30->2|30->2|30->2|31->3|43->15|43->15|44->16|48->20|48->20|49->21|49->21|49->21|50->22|52->24|52->24|53->25|53->25|53->25|54->26|61->33|61->33|62->34|62->34|62->34|63->35|65->37|65->37|66->38|66->38|66->38|67->39|68->40|68->40|69->41|69->41|69->41|70->42|76->48|76->48|77->49|77->49|77->49|78->50|79->51|79->51|80->52|80->52|80->52|81->53|83->55|83->55|84->56|84->56|84->56|85->57|86->58|86->58|87->59|87->59|87->59|88->60|90->62|90->62|91->63|91->63|91->63|92->64|94->66|94->66|95->67|193->165|193->165|194->166|194->166|194->166|195->167|199->171|199->171|200->172|201->173|201->173|202->174|202->174|202->174|203->175|204->176|204->176|205->177|205->177|205->177|206->178|207->179|207->179|208->180|209->181|209->181|209->181|209->181|210->182|210->182|211->183|215->187|215->187|216->188|217->189|217->189|217->189|217->189|217->189|217->189|218->190|223->195|223->195|224->196|224->196|226->198|226->198|227->199|231->203|231->203|233->205|233->205|234->206|236->208|236->208|237->209|238->210|238->210|238->210|241->213|241->213|243->215|243->215|248->220|248->220|249->221|251->223|251->223|252->224|252->224|252->224|253->225|255->227|255->227|256->228|256->228|256->228|257->229|259->231|259->231|260->232|260->232|260->232|261->233|262->234|262->234|263->235|266->238|267->239|268->240|268->240|269->241|270->242|270->242|271->243
                  -- GENERATED --
              */
          
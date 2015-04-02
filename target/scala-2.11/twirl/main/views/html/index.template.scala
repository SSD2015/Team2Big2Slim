
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
             
                </div>
            </div>
                <!-- JQuery -->
            <script>
                $(document).ready(function()"""),format.raw/*170.45*/("""{"""),format.raw/*170.46*/("""
                    """),format.raw/*171.21*/("""function getdate()"""),format.raw/*171.39*/("""{"""),format.raw/*171.40*/("""
                        """),format.raw/*172.25*/("""var today = new Date();
                        var h = today.getHours();
                        var m = today.getMinutes();
                        var s = today.getSeconds();
                        if(h<10) """),format.raw/*176.34*/("""{"""),format.raw/*176.35*/("""
                            """),format.raw/*177.29*/("""h = "0"+h;
                        """),format.raw/*178.25*/("""}"""),format.raw/*178.26*/("""
                        """),format.raw/*179.25*/("""if(m<10) """),format.raw/*179.34*/("""{"""),format.raw/*179.35*/("""
                            """),format.raw/*180.29*/("""m = "0"+m;
                        """),format.raw/*181.25*/("""}"""),format.raw/*181.26*/("""
                        """),format.raw/*182.25*/("""if(s<10)"""),format.raw/*182.33*/("""{"""),format.raw/*182.34*/("""
                            """),format.raw/*183.29*/("""s = "0"+s;
                        """),format.raw/*184.25*/("""}"""),format.raw/*184.26*/("""
                        """),format.raw/*185.25*/("""$("clock").text(h+" : "+m+" : "+s);
                        setTimeout(function()"""),format.raw/*186.46*/("""{"""),format.raw/*186.47*/("""getdate()"""),format.raw/*186.56*/("""}"""),format.raw/*186.57*/(""", 500);
                    """),format.raw/*187.21*/("""}"""),format.raw/*187.22*/("""
                    """),format.raw/*188.21*/("""getdate();

                    $("#voteLayer" ).toggle();

                    $('#vote').click(function () """),format.raw/*192.50*/("""{"""),format.raw/*192.51*/("""
                        """),format.raw/*193.25*/("""var body = $("html, body");
                        body.animate("""),format.raw/*194.38*/("""{"""),format.raw/*194.39*/("""scrollTop:0"""),format.raw/*194.50*/("""}"""),format.raw/*194.51*/(""", "duration:600", "swing", function() """),format.raw/*194.89*/("""{"""),format.raw/*194.90*/("""
                        """),format.raw/*195.25*/("""console.log("vote");
                        $("#topbar").fadeOut();
                        $("#projectlistLayer").fadeOut();
                        $("#votebar" ).fadeIn();
                        $("#voteLayer" ).fadeIn();
                        """),format.raw/*200.25*/("""}"""),format.raw/*200.26*/(""");
                    """),format.raw/*201.21*/("""}"""),format.raw/*201.22*/(""");

                    $("#back" ).click(function () """),format.raw/*203.51*/("""{"""),format.raw/*203.52*/("""
                        """),format.raw/*204.25*/("""console.log("back");
                        $("#topbar" ).fadeIn();
                        $("#projectlistLayer" ).fadeIn();
                        $("#voteLayer" ).fadeOut();
                    """),format.raw/*208.21*/("""}"""),format.raw/*208.22*/(""");

                    $(".voteB" ).click(function () """),format.raw/*210.52*/("""{"""),format.raw/*210.53*/("""
                        """),format.raw/*211.25*/("""var name = $(this ).attr("id");
                        var value = $(this ).attr("value");
                        $("projectname").contents().filter(function () """),format.raw/*213.72*/("""{"""),format.raw/*213.73*/("""
                        """),format.raw/*214.25*/("""return this.nodeType === 3;
                        """),format.raw/*215.25*/("""}"""),format.raw/*215.26*/(""" """),format.raw/*215.27*/(""").remove();
                        $("projectname" ).append(name);
                        $("#voteValue" ).attr("value", value);
                    """),format.raw/*218.21*/("""}"""),format.raw/*218.22*/(""");

                """),format.raw/*220.17*/("""}"""),format.raw/*220.18*/(""");
            </script>

                <!-- JS -->
            <script>
                function camerabEvent() """),format.raw/*225.41*/("""{"""),format.raw/*225.42*/("""
                """),format.raw/*226.17*/("""//open camera app
                alert("camera");
                """),format.raw/*228.17*/("""}"""),format.raw/*228.18*/("""
                """),format.raw/*229.17*/("""function votebEvent() """),format.raw/*229.39*/("""{"""),format.raw/*229.40*/("""
                """),format.raw/*230.17*/("""//actually go to vote page
                alert("vote");
                """),format.raw/*232.17*/("""}"""),format.raw/*232.18*/("""
                """),format.raw/*233.17*/("""function logoutbEvent() """),format.raw/*233.41*/("""{"""),format.raw/*233.42*/("""
                """),format.raw/*234.17*/("""//confirmation prompt out
                confirm("Are you sure ?");
                """),format.raw/*236.17*/("""}"""),format.raw/*236.18*/("""
                """),format.raw/*237.17*/("""function redirectProfile1() """),format.raw/*237.45*/("""{"""),format.raw/*237.46*/("""
                    """),format.raw/*238.21*/("""return true;
                """),format.raw/*239.17*/("""}"""),format.raw/*239.18*/("""
            """),format.raw/*240.13*/("""</script>
        </body>
    </html>
""")))}),format.raw/*243.2*/("""
"""),format.raw/*244.1*/("""<script type="text/javascript">
function theFunction () """),format.raw/*245.25*/("""{"""),format.raw/*245.26*/("""
"""),format.raw/*246.1*/("""// return true or false, depending on whether you want to allow the `href` property to follow through or not
"""),format.raw/*247.1*/("""}"""),format.raw/*247.2*/("""
"""),format.raw/*248.1*/("""</script>"""))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Apr 02 08:34:25 ICT 2015
                  SOURCE: C:/Users/momomomomo/Documents/WORK/SoftSpec/project/Team2Big2Slim/app/views/index.scala.html
                  HASH: e33cbb40e614623989bbdd19632f719fb27af100
                  MATRIX: 723->1|827->17|855->20|880->37|919->39|951->45|1596->662|1625->663|1667->677|1829->811|1858->812|1900->826|1936->834|1965->835|2007->849|2098->912|2127->913|2169->927|2207->937|2236->938|2278->952|2519->1165|2548->1166|2590->1180|2626->1188|2655->1189|2697->1203|2783->1261|2812->1262|2854->1276|2895->1289|2924->1290|2966->1304|3027->1337|3056->1338|3098->1352|3135->1361|3164->1362|3206->1376|3407->1549|3436->1550|3478->1564|3521->1579|3550->1580|3592->1594|3647->1621|3676->1622|3718->1636|3757->1647|3786->1648|3828->1662|3916->1722|3945->1723|3987->1737|4020->1742|4049->1743|4091->1757|4145->1783|4174->1784|4216->1798|4255->1809|4284->1810|4326->1824|4417->1887|4446->1888|4488->1902|4522->1908|4551->1909|4593->1923|4680->1982|4709->1983|4751->1997|10380->7597|10410->7598|10461->7620|10508->7638|10538->7639|10593->7665|10837->7880|10867->7881|10926->7911|10991->7947|11021->7948|11076->7974|11114->7983|11144->7984|11203->8014|11268->8050|11298->8051|11353->8077|11390->8085|11420->8086|11479->8116|11544->8152|11574->8153|11629->8179|11740->8261|11770->8262|11808->8271|11838->8272|11896->8301|11926->8302|11977->8324|12119->8437|12149->8438|12204->8464|12299->8530|12329->8531|12369->8542|12399->8543|12466->8581|12496->8582|12551->8608|12836->8864|12866->8865|12919->8889|12949->8890|13034->8946|13064->8947|13119->8973|13351->9176|13381->9177|13467->9234|13497->9235|13552->9261|13746->9426|13776->9427|13831->9453|13913->9506|13943->9507|13973->9508|14156->9662|14186->9663|14237->9685|14267->9686|14416->9806|14446->9807|14493->9825|14591->9894|14621->9895|14668->9913|14719->9935|14749->9936|14796->9954|14901->10030|14931->10031|14978->10049|15031->10073|15061->10074|15108->10092|15224->10179|15254->10180|15301->10198|15358->10226|15388->10227|15439->10249|15498->10279|15528->10280|15571->10294|15644->10336|15674->10338|15760->10395|15790->10396|15820->10398|15958->10508|15987->10509|16017->10511
                  LINES: 26->1|29->1|30->2|30->2|30->2|31->3|43->15|43->15|44->16|48->20|48->20|49->21|49->21|49->21|50->22|52->24|52->24|53->25|53->25|53->25|54->26|61->33|61->33|62->34|62->34|62->34|63->35|65->37|65->37|66->38|66->38|66->38|67->39|68->40|68->40|69->41|69->41|69->41|70->42|76->48|76->48|77->49|77->49|77->49|78->50|79->51|79->51|80->52|80->52|80->52|81->53|83->55|83->55|84->56|84->56|84->56|85->57|86->58|86->58|87->59|87->59|87->59|88->60|90->62|90->62|91->63|91->63|91->63|92->64|94->66|94->66|95->67|198->170|198->170|199->171|199->171|199->171|200->172|204->176|204->176|205->177|206->178|206->178|207->179|207->179|207->179|208->180|209->181|209->181|210->182|210->182|210->182|211->183|212->184|212->184|213->185|214->186|214->186|214->186|214->186|215->187|215->187|216->188|220->192|220->192|221->193|222->194|222->194|222->194|222->194|222->194|222->194|223->195|228->200|228->200|229->201|229->201|231->203|231->203|232->204|236->208|236->208|238->210|238->210|239->211|241->213|241->213|242->214|243->215|243->215|243->215|246->218|246->218|248->220|248->220|253->225|253->225|254->226|256->228|256->228|257->229|257->229|257->229|258->230|260->232|260->232|261->233|261->233|261->233|262->234|264->236|264->236|265->237|265->237|265->237|266->238|267->239|267->239|268->240|271->243|272->244|273->245|273->245|274->246|275->247|275->247|276->248
                  -- GENERATED --
              */
          
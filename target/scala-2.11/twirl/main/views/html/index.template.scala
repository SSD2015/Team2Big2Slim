
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
                  DATE: Thu Apr 02 07:36:36 ICT 2015
                  SOURCE: C:/Users/momomomomo/Documents/WORK/SoftSpec/project/Team2Big2Slim/app/views/index.scala.html
                  HASH: 29e47a06556d91602387c252b57ddc294af44142
                  MATRIX: 723->1|827->17|855->20|880->37|919->39|951->45|1596->662|1625->663|1667->677|1829->811|1858->812|1900->826|1936->834|1965->835|2007->849|2098->912|2127->913|2169->927|2207->937|2236->938|2278->952|2519->1165|2548->1166|2590->1180|2626->1188|2655->1189|2697->1203|2783->1261|2812->1262|2854->1276|2895->1289|2924->1290|2966->1304|3027->1337|3056->1338|3098->1352|3135->1361|3164->1362|3206->1376|3407->1549|3436->1550|3478->1564|3521->1579|3550->1580|3592->1594|3647->1621|3676->1622|3718->1636|3757->1647|3786->1648|3828->1662|3916->1722|3945->1723|3987->1737|4020->1742|4049->1743|4091->1757|4145->1783|4174->1784|4216->1798|4255->1809|4284->1810|4326->1824|4417->1887|4446->1888|4488->1902|4522->1908|4551->1909|4593->1923|4680->1982|4709->1983|4751->1997|10775->7992|10805->7993|10856->8015|10903->8033|10933->8034|10988->8060|11232->8275|11262->8276|11321->8306|11386->8342|11416->8343|11471->8369|11509->8378|11539->8379|11598->8409|11663->8445|11693->8446|11748->8472|11785->8480|11815->8481|11874->8511|11939->8547|11969->8548|12024->8574|12135->8656|12165->8657|12203->8666|12233->8667|12291->8696|12321->8697|12372->8719|12514->8832|12544->8833|12599->8859|12694->8925|12724->8926|12764->8937|12794->8938|12861->8976|12891->8977|12946->9003|13231->9259|13261->9260|13314->9284|13344->9285|13429->9341|13459->9342|13514->9368|13746->9571|13776->9572|13862->9629|13892->9630|13947->9656|14141->9821|14171->9822|14226->9848|14308->9901|14338->9902|14368->9903|14551->10057|14581->10058|14632->10080|14662->10081|14811->10201|14841->10202|14888->10220|14986->10289|15016->10290|15063->10308|15114->10330|15144->10331|15191->10349|15296->10425|15326->10426|15373->10444|15426->10468|15456->10469|15503->10487|15619->10574|15649->10575|15696->10593|15753->10621|15783->10622|15834->10644|15893->10674|15923->10675|15966->10689|16039->10731|16069->10733|16155->10790|16185->10791|16215->10793|16353->10903|16382->10904|16412->10906
                  LINES: 26->1|29->1|30->2|30->2|30->2|31->3|43->15|43->15|44->16|48->20|48->20|49->21|49->21|49->21|50->22|52->24|52->24|53->25|53->25|53->25|54->26|61->33|61->33|62->34|62->34|62->34|63->35|65->37|65->37|66->38|66->38|66->38|67->39|68->40|68->40|69->41|69->41|69->41|70->42|76->48|76->48|77->49|77->49|77->49|78->50|79->51|79->51|80->52|80->52|80->52|81->53|83->55|83->55|84->56|84->56|84->56|85->57|86->58|86->58|87->59|87->59|87->59|88->60|90->62|90->62|91->63|91->63|91->63|92->64|94->66|94->66|95->67|203->175|203->175|204->176|204->176|204->176|205->177|209->181|209->181|210->182|211->183|211->183|212->184|212->184|212->184|213->185|214->186|214->186|215->187|215->187|215->187|216->188|217->189|217->189|218->190|219->191|219->191|219->191|219->191|220->192|220->192|221->193|225->197|225->197|226->198|227->199|227->199|227->199|227->199|227->199|227->199|228->200|233->205|233->205|234->206|234->206|236->208|236->208|237->209|241->213|241->213|243->215|243->215|244->216|246->218|246->218|247->219|248->220|248->220|248->220|251->223|251->223|253->225|253->225|258->230|258->230|259->231|261->233|261->233|262->234|262->234|262->234|263->235|265->237|265->237|266->238|266->238|266->238|267->239|269->241|269->241|270->242|270->242|270->242|271->243|272->244|272->244|273->245|276->248|277->249|278->250|278->250|279->251|280->252|280->252|281->253
                  -- GENERATED --
              */
          
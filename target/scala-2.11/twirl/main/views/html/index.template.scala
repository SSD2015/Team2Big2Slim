
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
                """),format.raw/*16.17*/("""max-width: 100%;
                overflow-x: hidden;
                margin-top: 30px;
                background-color: #909090;
            """),format.raw/*20.13*/("""}"""),format.raw/*20.14*/("""
            """),format.raw/*21.13*/(""".header """),format.raw/*21.21*/("""{"""),format.raw/*21.22*/("""
                """),format.raw/*22.17*/("""float: right;
                /*width: 300px;     */
            """),format.raw/*24.13*/("""}"""),format.raw/*24.14*/("""
            """),format.raw/*25.13*/(""".toppanel """),format.raw/*25.23*/("""{"""),format.raw/*25.24*/("""
                """),format.raw/*26.17*/("""position: fixed;
                background-color: #ff8080;
                color: white;
                /*text-align: center;*/
                padding: 20px;
                width: 100%;
                z-index: 1;
            """),format.raw/*33.13*/("""}"""),format.raw/*33.14*/("""
            """),format.raw/*34.13*/(""".topbar """),format.raw/*34.21*/("""{"""),format.raw/*34.22*/("""
                """),format.raw/*35.17*/("""height: 40px;
                color: lightgrey;
            """),format.raw/*37.13*/("""}"""),format.raw/*37.14*/("""
            """),format.raw/*38.13*/(""".projectlist """),format.raw/*38.26*/("""{"""),format.raw/*38.27*/("""
                """),format.raw/*39.17*/("""border-color: grey;
            """),format.raw/*40.13*/("""}"""),format.raw/*40.14*/("""
            """),format.raw/*41.13*/(""".project """),format.raw/*41.22*/("""{"""),format.raw/*41.23*/("""
                """),format.raw/*42.17*/("""margin: 7px;
                margin-left: 15px;
                width: 100%;
                border: solid;
                border-width: 0.1px;
                opacity: 0.6;
            """),format.raw/*48.13*/("""}"""),format.raw/*48.14*/("""
            """),format.raw/*49.13*/(""".project:hover """),format.raw/*49.28*/("""{"""),format.raw/*49.29*/("""
                """),format.raw/*50.17*/("""opacity: 1.0;
            """),format.raw/*51.13*/("""}"""),format.raw/*51.14*/(""" 
            """),format.raw/*52.13*/(""".container """),format.raw/*52.24*/("""{"""),format.raw/*52.25*/("""
                """),format.raw/*53.17*/("""/*position: ;*/
                margin-left: 0px;
            """),format.raw/*55.13*/("""}"""),format.raw/*55.14*/("""
            """),format.raw/*56.13*/(""".row """),format.raw/*56.18*/("""{"""),format.raw/*56.19*/("""
                """),format.raw/*57.17*/("""width: 100%;
            """),format.raw/*58.13*/("""}"""),format.raw/*58.14*/("""
            """),format.raw/*59.13*/("""clock """),format.raw/*59.19*/("""{"""),format.raw/*59.20*/("""
                """),format.raw/*60.17*/("""font: serif;
                font-size: x-large;
            """),format.raw/*62.13*/("""}"""),format.raw/*62.14*/("""
        """),format.raw/*63.9*/("""</style>
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
    
            <!-- JQuery -->
            <script>
                $(document).ready(function()"""),format.raw/*122.45*/("""{"""),format.raw/*122.46*/("""
                    """),format.raw/*123.21*/("""function getdate()"""),format.raw/*123.39*/("""{"""),format.raw/*123.40*/("""
                        """),format.raw/*124.25*/("""var today = new Date();
                        var h = today.getHours();
                        var m = today.getMinutes();
                        var s = today.getSeconds();
                         if(s<10)"""),format.raw/*128.34*/("""{"""),format.raw/*128.35*/("""
                             """),format.raw/*129.30*/("""s = "0"+s;
                        """),format.raw/*130.25*/("""}"""),format.raw/*130.26*/("""
                        """),format.raw/*131.25*/("""$("clock").text(h+" : "+m+" : "+s);
                        setTimeout(function()"""),format.raw/*132.46*/("""{"""),format.raw/*132.47*/("""getdate()"""),format.raw/*132.56*/("""}"""),format.raw/*132.57*/(""", 500);
                    """),format.raw/*133.21*/("""}"""),format.raw/*133.22*/("""
                    """),format.raw/*134.21*/("""getdate();

                    $('#vote').click(function () """),format.raw/*136.50*/("""{"""),format.raw/*136.51*/("""
                        """),format.raw/*137.25*/("""// $('body').fadeOut('slow');
                        // $('#yellow-box').fadeIn('slow');
                        var body = $("html, body");
                        body.animate("""),format.raw/*140.38*/("""{"""),format.raw/*140.39*/("""scrollTop:0"""),format.raw/*140.50*/("""}"""),format.raw/*140.51*/(""", """),format.raw/*140.53*/("""{"""),format.raw/*140.54*/("""duration:600"""),format.raw/*140.66*/("""}"""),format.raw/*140.67*/(""", 'swing', function() """),format.raw/*140.89*/("""{"""),format.raw/*140.90*/(""" 
                           """),format.raw/*141.28*/("""$('.topbar').hide();
                        """),format.raw/*142.25*/("""}"""),format.raw/*142.26*/(""");
                    """),format.raw/*143.21*/("""}"""),format.raw/*143.22*/(""");

                """),format.raw/*145.17*/("""}"""),format.raw/*145.18*/(""");
            </script>

            <!-- JS -->
            <script>
                function camerabEvent() """),format.raw/*150.41*/("""{"""),format.raw/*150.42*/("""
                    """),format.raw/*151.21*/("""//open camera app
                    alert("camera");
                """),format.raw/*153.17*/("""}"""),format.raw/*153.18*/("""
                """),format.raw/*154.17*/("""function votebEvent() """),format.raw/*154.39*/("""{"""),format.raw/*154.40*/("""
                    """),format.raw/*155.21*/("""//actually go to vote page
                    alert("vote");
                """),format.raw/*157.17*/("""}"""),format.raw/*157.18*/("""
                """),format.raw/*158.17*/("""function logoutbEvent() """),format.raw/*158.41*/("""{"""),format.raw/*158.42*/("""
                    """),format.raw/*159.21*/("""//confirmation prompt out
                    confirm("Are you sure ?");
                """),format.raw/*161.17*/("""}"""),format.raw/*161.18*/("""
            """),format.raw/*162.13*/("""</script>
        </div>
        </body>
    </html>
""")))}),format.raw/*166.2*/("""
"""))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Mar 27 17:07:54 ICT 2015
                  SOURCE: C:/Team2Big2Slim/app/views/index.scala.html
                  HASH: 90452d0c699d87294df1997aae543f7c98205624
                  MATRIX: 723->1|827->17|855->20|880->37|919->39|951->45|1552->618|1581->619|1627->637|1801->783|1830->784|1872->798|1908->806|1937->807|1983->825|2078->892|2107->893|2149->907|2187->917|2216->918|2262->936|2527->1173|2556->1174|2598->1188|2634->1196|2663->1197|2709->1215|2799->1277|2828->1278|2870->1292|2911->1305|2940->1306|2986->1324|3047->1357|3076->1358|3118->1372|3155->1381|3184->1382|3230->1400|3451->1593|3480->1594|3522->1608|3565->1623|3594->1624|3640->1642|3695->1669|3724->1670|3767->1685|3806->1696|3835->1697|3881->1715|3973->1779|4002->1780|4044->1794|4077->1799|4106->1800|4152->1818|4206->1844|4235->1845|4277->1859|4311->1865|4340->1866|4386->1884|4477->1947|4506->1948|4543->1958|7173->4559|7203->4560|7254->4582|7301->4600|7331->4601|7386->4627|7630->4842|7660->4843|7720->4874|7785->4910|7815->4911|7870->4937|7981->5019|8011->5020|8049->5029|8079->5030|8137->5059|8167->5060|8218->5082|8310->5145|8340->5146|8395->5172|8606->5354|8636->5355|8676->5366|8706->5367|8737->5369|8767->5370|8808->5382|8838->5383|8889->5405|8919->5406|8978->5436|9053->5482|9083->5483|9136->5507|9166->5508|9217->5530|9247->5531|9392->5647|9422->5648|9473->5670|9575->5743|9605->5744|9652->5762|9703->5784|9733->5785|9784->5807|9893->5887|9923->5888|9970->5906|10023->5930|10053->5931|10104->5953|10224->6044|10254->6045|10297->6059|10386->6117
                  LINES: 26->1|29->1|30->2|30->2|30->2|31->3|43->15|43->15|44->16|48->20|48->20|49->21|49->21|49->21|50->22|52->24|52->24|53->25|53->25|53->25|54->26|61->33|61->33|62->34|62->34|62->34|63->35|65->37|65->37|66->38|66->38|66->38|67->39|68->40|68->40|69->41|69->41|69->41|70->42|76->48|76->48|77->49|77->49|77->49|78->50|79->51|79->51|80->52|80->52|80->52|81->53|83->55|83->55|84->56|84->56|84->56|85->57|86->58|86->58|87->59|87->59|87->59|88->60|90->62|90->62|91->63|150->122|150->122|151->123|151->123|151->123|152->124|156->128|156->128|157->129|158->130|158->130|159->131|160->132|160->132|160->132|160->132|161->133|161->133|162->134|164->136|164->136|165->137|168->140|168->140|168->140|168->140|168->140|168->140|168->140|168->140|168->140|168->140|169->141|170->142|170->142|171->143|171->143|173->145|173->145|178->150|178->150|179->151|181->153|181->153|182->154|182->154|182->154|183->155|185->157|185->157|186->158|186->158|186->158|187->159|189->161|189->161|190->162|194->166
                  -- GENERATED --
              */
          
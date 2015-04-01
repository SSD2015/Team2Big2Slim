
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
object profile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Project,List[Member],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(project : Project )(member : List[Member]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.45*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE HTML>
<html lang = "en">
    <title>"""),_display_(/*4.13*/project/*4.20*/.projectName),format.raw/*4.32*/("""</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>

        <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
        <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">
    <style>
        .NameProject"""),format.raw/*16.21*/("""{"""),format.raw/*16.22*/("""
            """),format.raw/*17.13*/("""font-size : 250%;
            color : black;
        """),format.raw/*19.9*/("""}"""),format.raw/*19.10*/("""
        """),format.raw/*20.9*/(""".Description"""),format.raw/*20.21*/("""{"""),format.raw/*20.22*/("""
            """),format.raw/*21.13*/("""font-size : 250%;
            color : black;
        """),format.raw/*23.9*/("""}"""),format.raw/*23.10*/("""
        """),format.raw/*24.9*/(""".ScreenShot"""),format.raw/*24.20*/("""{"""),format.raw/*24.21*/("""
            """),format.raw/*25.13*/("""font-size : 250%;
            color : black;
        """),format.raw/*27.9*/("""}"""),format.raw/*27.10*/("""
        """),format.raw/*28.9*/("""p"""),format.raw/*28.10*/("""{"""),format.raw/*28.11*/("""
            """),format.raw/*29.13*/("""font-style: normal;
        """),format.raw/*30.9*/("""}"""),format.raw/*30.10*/("""
       """),format.raw/*31.8*/(""".Line"""),format.raw/*31.13*/("""{"""),format.raw/*31.14*/("""
            """),format.raw/*32.13*/("""border-bottom: 1px dashed;
        """),format.raw/*33.9*/("""}"""),format.raw/*33.10*/("""

        """),format.raw/*35.9*/(""".carousel-inner > .item > img,
        .carousel-inner > .item > a > img """),format.raw/*36.43*/("""{"""),format.raw/*36.44*/("""
        """),format.raw/*37.9*/("""width: auto;
        margin: auto;
        """),format.raw/*39.9*/("""}"""),format.raw/*39.10*/("""
        """),format.raw/*40.9*/(""".container"""),format.raw/*40.19*/("""{"""),format.raw/*40.20*/("""
            """),format.raw/*41.13*/("""width : 600px;
            height : 400px;
        """),format.raw/*43.9*/("""}"""),format.raw/*43.10*/("""
    """),format.raw/*44.5*/("""</style>

    <head>
        <title>Profile:GTA</title>
        <meta charset = "UTF-8" />
    </head>

    <body>
        <div class="container-fluid">
            <div class="row">
                <div class = "col-xs-2"> </div>
                <div class="col-xs-8">
                    <div class = "NameProject">
                        <h style="font-family:verdana" >"""),_display_(/*57.58*/project/*57.65*/.projectName),format.raw/*57.77*/("""</h>
                    </div>
                </div>
                <div class = "col-xs-2"> </div>
            </div>
            <div class="row">
                <div class = "col-xs-2"> </div>
                <div class="col-xs-8">
                    <div class = "PictureProject">
                        <p> <img src = """),_display_(/*66.41*/project/*66.48*/.PicProject),format.raw/*66.59*/(""" """),format.raw/*66.60*/("""style="width:700px;height:450px"> </p>
                    </div>
                </div>
                <div class = "col-xs-2"> </div>
            </div>
            <div class="row">
                <div class="col-xs-12">
                    <div class = "Line"></div>
                </div>
            </div>
            <div class="row">
                <div class = "col-xs-2"> </div>
                <div class="col-xs-8">
                    <div class = "Description">
                        <h style="font-family:verdana" >Description</h>
                    </div>
                </div>
                <div class = "col-xs-2"> </div>
            </div>
            <div class="row">
                <div class = "col-xs-2"> </div>
                <div class="col-xs-8">
                    <div class = "Information">
                        <p>Project name: """),_display_(/*89.43*/project/*89.50*/.projectName),format.raw/*89.62*/("""</p>
                        <p>Type of project: """),_display_(/*90.46*/project/*90.53*/.typeApp),format.raw/*90.61*/("""</p>
                        <p>Member: </p>
                        """),_display_(/*92.26*/member/*92.32*/.map/*92.36*/ { person =>_display_(Seq[Any](format.raw/*92.48*/("""
                         """),format.raw/*93.26*/("""<p>"""),_display_(/*93.30*/person/*93.36*/.name),format.raw/*93.41*/(""" """),format.raw/*93.42*/(""", """),_display_(/*93.45*/person/*93.51*/.surname),format.raw/*93.59*/("""</p>
                     """)))}),format.raw/*94.23*/("""
                    """),format.raw/*95.21*/("""</div>
                </div>
                <div class = "col-xs-2"> </div>
            </div>
            <div class="row">
                <div class="col-xs-12">
                    <div class = "Line"></div>
                </div>
            </div>
            <div class="row">
                <div class = "col-xs-2"> </div>
                <div class="col-xs-8">
                    <div class = ScreenShot>
                        <h style="font-family:verdana" >Screenshot</h>
                    </div>
                </div>
                <div class = "col-xs-2"> </div>
            </div>
            <div class="row">
                <div class = "col-xs-1"> </div>
                <div class="col-xs-9">
                    <div class="container">
                        <br>
                        <div id="myCarousel" class="carousel slide" data-ride="carousel">
                                <!-- Indicators -->
                            <ol class="carousel-indicators">
                                <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                                <li data-target="#myCarousel" data-slide-to="1"></li>
                                <li data-target="#myCarousel" data-slide-to="2"></li>
                            </ol>

                                <!-- Wrapper for slides -->
                            <div class="carousel-inner" role="listbox">
                                <div class="item active">
                                    <button class = "Picture"> <img src= """),_display_(/*129.75*/project/*129.82*/.sc1),format.raw/*129.86*/(""" """),format.raw/*129.87*/("""alt="Chania" width="553.5" height="345" onclick="location.href='http://localhost:9000/screenshot1' """),_display_(/*129.187*/project/*129.194*/.id),format.raw/*129.197*/(""""> </button>
                                </div>
                                <div class="item">
                                    <button class = "Picture"> <img src= """),_display_(/*132.75*/project/*132.82*/.sc2),format.raw/*132.86*/(""" """),format.raw/*132.87*/("""alt="Chania" width="553.5" height="345" onclick="location.href='http://localhost:9000/screenshot2' """),_display_(/*132.187*/project/*132.194*/.id),format.raw/*132.197*/(""""> </button>
                                </div>
                                <div class="item">
                                    <button class = "Picture"> <img src= """),_display_(/*135.75*/project/*135.82*/.sc3),format.raw/*135.86*/(""" """),format.raw/*135.87*/("""alt="Flower" width="553.5" height="345" onclick="location.href='http://localhost:9000/screenshot3' """),_display_(/*135.187*/project/*135.194*/.id),format.raw/*135.197*/(""""> </button>
                                </div>
                            </div>

                                <!-- Left and right controls -->
                            <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
                                <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                                <span class="sr-only">Previous</span>
                            </a>
                            <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
                                <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                                <span class="sr-only">Next</span>
                            </a>
                        </div>
                    </div>
                </div>
                <div class = "col-xs-2"> </div>
            </div>
        </div>
        <div class="row">
            <div class="col-xs-12">
                <div class = "Line"></div>
            </div>
        </div>
        <div class="row">
            <div class = "col-xs-2"> </div>
            <div class="col-xs-8">
                <div class = ScreenShot>
                    <h style="font-family:verdana" >Rate</h>
                </div>
            </div>
            <div class = "col-xs-2"> </div>
        </div>
    </body>
    <div id="content"></div>
</html>"""))}
  }

  def render(project:Project,member:List[Member]): play.twirl.api.HtmlFormat.Appendable = apply(project)(member)

  def f:((Project) => (List[Member]) => play.twirl.api.HtmlFormat.Appendable) = (project) => (member) => apply(project)(member)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Apr 01 20:20:15 ICT 2015
                  SOURCE: /Users/nathakorn/Documents/Team2Big2Slim/app/views/profile.scala.html
                  HASH: 8f44ef0976eb04ad7b704b4a281a07943975bbf0
                  MATRIX: 739->1|870->44|897->45|970->92|985->99|1017->111|1778->844|1807->845|1848->858|1928->911|1957->912|1993->921|2033->933|2062->934|2103->947|2183->1000|2212->1001|2248->1010|2287->1021|2316->1022|2357->1035|2437->1088|2466->1089|2502->1098|2531->1099|2560->1100|2601->1113|2656->1141|2685->1142|2720->1150|2753->1155|2782->1156|2823->1169|2885->1204|2914->1205|2951->1215|3052->1288|3081->1289|3117->1298|3187->1341|3216->1342|3252->1351|3290->1361|3319->1362|3360->1375|3438->1426|3467->1427|3499->1432|3901->1807|3917->1814|3950->1826|4307->2156|4323->2163|4355->2174|4384->2175|5287->3051|5303->3058|5336->3070|5413->3120|5429->3127|5458->3135|5555->3205|5570->3211|5583->3215|5633->3227|5687->3253|5718->3257|5733->3263|5759->3268|5788->3269|5818->3272|5833->3278|5862->3286|5920->3313|5969->3334|7568->4905|7585->4912|7611->4916|7641->4917|7770->5017|7788->5024|7814->5027|8019->5204|8036->5211|8062->5215|8092->5216|8221->5316|8239->5323|8265->5326|8470->5503|8487->5510|8513->5514|8543->5515|8672->5615|8690->5622|8716->5625
                  LINES: 26->1|29->1|30->2|32->4|32->4|32->4|44->16|44->16|45->17|47->19|47->19|48->20|48->20|48->20|49->21|51->23|51->23|52->24|52->24|52->24|53->25|55->27|55->27|56->28|56->28|56->28|57->29|58->30|58->30|59->31|59->31|59->31|60->32|61->33|61->33|63->35|64->36|64->36|65->37|67->39|67->39|68->40|68->40|68->40|69->41|71->43|71->43|72->44|85->57|85->57|85->57|94->66|94->66|94->66|94->66|117->89|117->89|117->89|118->90|118->90|118->90|120->92|120->92|120->92|120->92|121->93|121->93|121->93|121->93|121->93|121->93|121->93|121->93|122->94|123->95|157->129|157->129|157->129|157->129|157->129|157->129|157->129|160->132|160->132|160->132|160->132|160->132|160->132|160->132|163->135|163->135|163->135|163->135|163->135|163->135|163->135
                  -- GENERATED --
              */
          
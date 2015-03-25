
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
object vote extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*1.2*/main("Voting")/*1.16*/ {_display_(Seq[Any](format.raw/*1.18*/("""
    """),format.raw/*2.5*/("""<h> Who is the best ?</h>
    <br>
    <br>
    """),format.raw/*5.29*/("""
    """),format.raw/*6.5*/("""<form id='voteProject' action=""""),_display_(/*6.37*/routes/*6.43*/.Application.vote("1")),format.raw/*6.65*/("""" method="post">
        <script text='text/javascript' src='"""),_display_(/*7.46*/routes/*7.52*/.Assets.at("js/getButton.js")),format.raw/*7.81*/("""'></script>
        <dev id = 'list' ></dev>
        <script text="/text/javascript">
        $('#voteProject' ).on('change',function()"""),format.raw/*10.50*/("""{"""),format.raw/*10.51*/("""
        """),format.raw/*11.9*/("""//$("#voteProject" ).attr("action", "routes.Application.vote(" + ($('input[name=project]:checked','#voteProject').val()) + ")" ) ;
        alert("you select "+$('input[name=project]:checked','#voteProject' ).val());
        """),format.raw/*13.9*/("""}"""),format.raw/*13.10*/(""");
        </script>
        <button>submit</button>
    </form>
    <br>
    <br>
""")))}))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Mar 24 19:41:07 ICT 2015
                  SOURCE: /Users/Punpikorn/Desktop/2Big2Slim/Team2Big2Slim/app/views/vote.scala.html
                  HASH: 853c88f5ef5d19d3deedc21cdf0dbc07605bf34c
                  MATRIX: 797->1|819->15|858->17|889->22|964->94|995->99|1053->131|1067->137|1109->159|1197->221|1211->227|1260->256|1423->391|1452->392|1488->401|1739->625|1768->626
                  LINES: 29->1|29->1|29->1|30->2|33->5|34->6|34->6|34->6|34->6|35->7|35->7|35->7|38->10|38->10|39->11|41->13|41->13
                  -- GENERATED --
              */
          
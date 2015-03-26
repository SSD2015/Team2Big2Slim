
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
                  DATE: Thu Mar 26 21:40:53 ICT 2015
                  SOURCE: C:/Users/momomomomo/Documents/WORK/SoftSpec/project/Team2Big2Slim/app/views/vote.scala.html
                  HASH: 0e5952ba5c94f12523bb88d47f45f3569f9c4340
                  MATRIX: 797->1|819->15|858->17|890->23|968->98|1000->104|1058->136|1072->142|1114->164|1203->227|1217->233|1266->262|1432->400|1461->401|1498->411|1751->637|1780->638
                  LINES: 29->1|29->1|29->1|30->2|33->5|34->6|34->6|34->6|34->6|35->7|35->7|35->7|38->10|38->10|39->11|41->13|41->13
                  -- GENERATED --
              */
          
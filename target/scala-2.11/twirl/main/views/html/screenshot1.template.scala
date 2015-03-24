
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
object screenshot1 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
        <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
        <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">
    <style>
    .Picture"""),format.raw/*8.13*/("""{"""),format.raw/*8.14*/("""
        """),format.raw/*9.9*/("""position:absolute;
        top:0px;
        left:300px;
    """),format.raw/*12.5*/("""}"""),format.raw/*12.6*/("""
    """),format.raw/*13.5*/(""".Button"""),format.raw/*13.12*/("""{"""),format.raw/*13.13*/("""
        """),format.raw/*14.9*/("""position:absolute;
        top:370px;
        left:550px;
    """),format.raw/*17.5*/("""}"""),format.raw/*17.6*/("""

    """),format.raw/*19.5*/("""</style>

    <head lang="en">
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <div class = "Picture">
            <p> <img src = "http://i.ytimg.com/vi/1gnbUusxRks/maxresdefault.jpg" style="width:600px;height:350px"> </p>
        </div>
        <div class = "Button">
            <button type="button" class="btn btn-default -lg" onclick="location.href='http://localhost:9000/profile'"> <span class="glyphicon glyphicon-arrow-left" aria-hidden="true" ></span> Go Back</button>
        </div>
    </body>
</html>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Mar 24 20:06:21 ICT 2015
                  SOURCE: /Users/nathakorn/Documents/Team2Big2Slim/app/views/screenshot1.scala.html
                  HASH: 41c11fe83fd286a19d6cc4b4f7179f0f017c508f
                  MATRIX: 804->0|1176->345|1204->346|1239->355|1326->415|1354->416|1386->421|1421->428|1450->429|1486->438|1575->500|1603->501|1636->507
                  LINES: 29->1|36->8|36->8|37->9|40->12|40->12|41->13|41->13|41->13|42->14|45->17|45->17|47->19
                  -- GENERATED --
              */
          
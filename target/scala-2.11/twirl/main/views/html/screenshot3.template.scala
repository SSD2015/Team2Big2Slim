
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
object screenshot3 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
    """),format.raw/*9.5*/("""position:absolute;
    top:0px;
    left:300px;
    """),format.raw/*12.5*/("""}"""),format.raw/*12.6*/("""
    """),format.raw/*13.5*/(""".Button"""),format.raw/*13.12*/("""{"""),format.raw/*13.13*/("""
    """),format.raw/*14.5*/("""position:absolute;
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
            <p> <img src = "http://i.ytimg.com/vi/lAdBJQXoCpc/maxresdefault.jpg" style="width:600px;height:350px"> </p>
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
                  DATE: Tue Mar 24 20:13:32 ICT 2015
                  SOURCE: /Users/nathakorn/Documents/Team2Big2Slim/app/views/screenshot3.scala.html
                  HASH: c838283584adc61decc891715433ce3a9f1d0e9f
                  MATRIX: 804->0|1176->345|1204->346|1235->351|1314->403|1342->404|1374->409|1409->416|1438->417|1470->422|1551->476|1579->477|1612->483
                  LINES: 29->1|36->8|36->8|37->9|40->12|40->12|41->13|41->13|41->13|42->14|45->17|45->17|47->19
                  -- GENERATED --
              */
          
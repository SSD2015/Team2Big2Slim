
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
object screenshot3 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Project,List[Member],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(project : Project )(member : List[Member]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.45*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <title>Screentshot3</title>
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
    </style>

    <head lang="en">
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <div class="container-fluid">
            <div class="row">
                <div class = "col-xs-2"> </div>
                <div class="col-xs-8">
                    <div class = "Picture">
                        <p> <img src = """),_display_(/*27.41*/project/*27.48*/.sc3),format.raw/*27.52*/(""" """),format.raw/*27.53*/("""style="width:600px;height:350px"> </p>
                    </div>
                </div>
                <div class = "col-xs-2"> </div>
            </div>
            <div class="row">
                <div class = "col-xs-2"> </div>
                <div class="col-xs-8">
                    <div class = "Button">
                    <button type="button" class="btn btn-default -lg" onclick="location.href='http://localhost:9000/profile/' + """),_display_(/*36.130*/project/*36.137*/.id),format.raw/*36.140*/(""""> <span class="glyphicon glyphicon-arrow-left" aria-hidden="true" ></span> Go Back</button>
                    </div>
                </div>
                <div class = "col-xs-2"> </div>
            </div>
        </div>
    </body>
</html>"""))}
  }

  def render(project:Project,member:List[Member]): play.twirl.api.HtmlFormat.Appendable = apply(project)(member)

  def f:((Project) => (List[Member]) => play.twirl.api.HtmlFormat.Appendable) = (project) => (member) => apply(project)(member)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Apr 01 22:03:35 ICT 2015
                  SOURCE: /Users/nathakorn/Documents/Team2Big2Slim/app/views/screenshot3.scala.html
                  HASH: 5a275bbf7b58977af6ac2c554e4e36811e5ef2c2
                  MATRIX: 743->1|874->44|901->45|2038->1155|2054->1162|2079->1166|2108->1167|2581->1612|2598->1619|2623->1622
                  LINES: 26->1|29->1|30->2|55->27|55->27|55->27|55->27|64->36|64->36|64->36
                  -- GENERATED --
              */
          
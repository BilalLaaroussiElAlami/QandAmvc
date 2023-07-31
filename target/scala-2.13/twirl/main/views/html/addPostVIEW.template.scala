
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._
/*1.2*/import models.Content.Post

object addPostVIEW extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[Form[Post],Session,RequestHeader,MessagesProvider,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(postForm: Form[Post])(implicit session: Session, request: RequestHeader, messagesProvider: MessagesProvider, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import b3._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ b3.vertical.fieldConstructor() }};
Seq[Any](format.raw/*3.1*/("""
"""),format.raw/*5.64*/("""


"""),_display_(/*8.2*/mainSTOF("Add post", session)/*8.31*/ {_display_(Seq[Any](format.raw/*8.33*/("""

    """),format.raw/*10.5*/("""<div id="content" class="wrapper doc">
        <h2>Post Details</h2>
        """),_display_(/*12.10*/b3/*12.12*/.form(action =  helper.CSRF(routes.ContentController.savePost()))/*12.77*/ {_display_(Seq[Any](format.raw/*12.79*/("""
        """),format.raw/*13.9*/("""<fieldset>
            <legend>(new)</legend>
            title: """),_display_(/*15.21*/b3/*15.23*/.textarea(postForm("title"))),format.raw/*15.51*/("""
            """),format.raw/*16.13*/("""text: """),_display_(/*16.20*/b3/*16.22*/.textarea(postForm("text"))),format.raw/*16.49*/("""
            """),format.raw/*17.13*/("""code: """),_display_(/*17.20*/b3/*17.22*/.textarea(postForm("code"))),format.raw/*17.49*/("""
            """),format.raw/*18.13*/("""tags: """),_display_(/*18.20*/b3/*18.22*/.text(postForm("tags"))),format.raw/*18.45*/("""
        """),format.raw/*19.9*/("""</fieldset>
        <div>
        """),_display_(/*21.10*/b3/*21.12*/.submit(Symbol("class") -> "btn btn-default")/*21.57*/{_display_(Seq[Any](format.raw/*21.58*/(""" """),format.raw/*21.59*/("""Add""")))}),format.raw/*21.63*/("""
        """),format.raw/*22.9*/("""</div>
        """)))}),format.raw/*23.10*/("""
        """),format.raw/*24.9*/("""<a href=""""),_display_(/*24.19*/routes/*24.25*/.HomeControllerSTOF.index),format.raw/*24.50*/("""">cancel</a>
    </div>
""")))}))
      }
    }
  }

  def render(postForm:Form[Post],session:Session,request:RequestHeader,messagesProvider:MessagesProvider,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(postForm)(session,request,messagesProvider,flash)

  def f:((Form[Post]) => (Session,RequestHeader,MessagesProvider,Flash) => play.twirl.api.HtmlFormat.Appendable) = (postForm) => (session,request,messagesProvider,flash) => apply(postForm)(session,request,messagesProvider,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/addPostVIEW.scala.html
                  HASH: 86e86750336d3fe80e4510beb4ffaf5ad23dc903
                  MATRIX: 432->1|818->29|1014->155|1047->168|1079->192|1146->153|1174->230|1203->234|1240->263|1279->265|1312->271|1417->349|1428->351|1502->416|1542->418|1578->427|1671->493|1682->495|1731->523|1772->536|1806->543|1817->545|1865->572|1906->585|1940->592|1951->594|1999->621|2040->634|2074->641|2085->643|2129->666|2165->675|2227->710|2238->712|2292->757|2331->758|2360->759|2395->763|2431->772|2478->788|2514->797|2551->807|2566->813|2612->838
                  LINES: 17->1|22->2|25->4|27->5|27->5|28->3|29->5|32->8|32->8|32->8|34->10|36->12|36->12|36->12|36->12|37->13|39->15|39->15|39->15|40->16|40->16|40->16|40->16|41->17|41->17|41->17|41->17|42->18|42->18|42->18|42->18|43->19|45->21|45->21|45->21|45->21|45->21|45->21|46->22|47->23|48->24|48->24|48->24|48->24
                  -- GENERATED --
              */
          
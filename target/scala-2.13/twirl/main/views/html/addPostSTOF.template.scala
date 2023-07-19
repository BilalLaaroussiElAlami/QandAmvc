
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

object addPostSTOF extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[Form[PostSTOF],Session,RequestHeader,MessagesProvider,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(postForm: Form[PostSTOF])(implicit session: Session, request: RequestHeader, messagesProvider: MessagesProvider, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import b3._

implicit def /*4.2*/implicitFieldConstructor/*4.26*/ = {{ b3.vertical.fieldConstructor() }};
Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.64*/("""


"""),_display_(/*7.2*/mainSTOF("Add post", session)/*7.31*/ {_display_(Seq[Any](format.raw/*7.33*/("""

    """),format.raw/*9.5*/("""<div id="content" class="wrapper doc">
    <h2>Post Details</h2>
    """),_display_(/*11.6*/b3/*11.8*/.form(action =  helper.CSRF(routes.PostControllerSTOF.save()))/*11.70*/ {_display_(Seq[Any](format.raw/*11.72*/("""
        """),format.raw/*12.9*/("""<fieldset>
            <legend>(new)</legend>
            title: """),_display_(/*14.21*/b3/*14.23*/.textarea(postForm("title"))),format.raw/*14.51*/("""
            """),format.raw/*15.13*/("""text: """),_display_(/*15.20*/b3/*15.22*/.textarea(postForm("text"))),format.raw/*15.49*/("""
            """),format.raw/*16.13*/("""code: """),_display_(/*16.20*/b3/*16.22*/.textarea(postForm("code"))),format.raw/*16.49*/("""
            """),format.raw/*17.13*/("""tags: """),_display_(/*17.20*/b3/*17.22*/.text(postForm("tags[]"))),format.raw/*17.47*/("""
        """),format.raw/*18.9*/("""</fieldset>
        """),_display_(/*19.10*/b3/*19.12*/.submit(Symbol("class") -> "btn btn-default")/*19.57*/{_display_(Seq[Any](format.raw/*19.58*/(""" """),format.raw/*19.59*/("""Add""")))}),format.raw/*19.63*/("""
        """),_display_(/*20.10*/b3/*20.12*/.submit(Symbol("class") -> "btn btn-default")/*20.57*/{_display_(Seq[Any](format.raw/*20.58*/(""" """),format.raw/*20.59*/("""Cancel""")))}),format.raw/*20.66*/("""
    """)))}),format.raw/*21.6*/("""
    """),format.raw/*22.5*/("""</div>
""")))}))
      }
    }
  }

  def render(postForm:Form[PostSTOF],session:Session,request:RequestHeader,messagesProvider:MessagesProvider,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(postForm)(session,request,messagesProvider,flash)

  def f:((Form[PostSTOF]) => (Session,RequestHeader,MessagesProvider,Flash) => play.twirl.api.HtmlFormat.Appendable) = (postForm) => (session,request,messagesProvider,flash) => apply(postForm)(session,request,messagesProvider,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/addPostSTOF.scala.html
                  HASH: 53eb30265391f5126b1b5582aaa83e043433029b
                  MATRIX: 788->1|988->131|1021->144|1053->168|1120->129|1148->206|1177->210|1214->239|1253->241|1285->247|1381->317|1391->319|1462->381|1502->383|1538->392|1631->458|1642->460|1691->488|1732->501|1766->508|1777->510|1825->537|1866->550|1900->557|1911->559|1959->586|2000->599|2034->606|2045->608|2091->633|2127->642|2175->663|2186->665|2240->710|2279->711|2308->712|2343->716|2380->726|2391->728|2445->773|2484->774|2513->775|2551->782|2587->788|2619->793
                  LINES: 21->1|24->3|26->4|26->4|27->2|28->4|31->7|31->7|31->7|33->9|35->11|35->11|35->11|35->11|36->12|38->14|38->14|38->14|39->15|39->15|39->15|39->15|40->16|40->16|40->16|40->16|41->17|41->17|41->17|41->17|42->18|43->19|43->19|43->19|43->19|43->19|43->19|44->20|44->20|44->20|44->20|44->20|44->20|45->21|46->22
                  -- GENERATED --
              */
          
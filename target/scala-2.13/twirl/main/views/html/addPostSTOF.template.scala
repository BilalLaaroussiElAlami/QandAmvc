
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

object addPostSTOF extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[Form[Product],Session,RequestHeader,MessagesProvider,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(productForm: Form[Product])(implicit session: Session, request: RequestHeader, messagesProvider: MessagesProvider, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import b3._

implicit def /*4.2*/implicitFieldConstructor/*4.26*/ = {{ b3.vertical.fieldConstructor() }};
Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.64*/("""


"""),_display_(/*7.2*/mainSTOF("Add post", session)/*7.31*/ {_display_(Seq[Any](format.raw/*7.33*/("""
    """),format.raw/*8.5*/("""<h2>Post Details</h2>

    """),_display_(/*10.6*/b3/*10.8*/.form(action = routes.HomeControllerSTOF.index)/*10.55*/ {_display_(Seq[Any](format.raw/*10.57*/("""
        """),format.raw/*11.9*/("""<fieldset>
            <legend>(new)</legend>
            title: """),_display_(/*13.21*/b3/*13.23*/.text(productForm("ean"))),format.raw/*13.48*/("""
            """),format.raw/*14.13*/("""tags: """),_display_(/*14.20*/b3/*14.22*/.text(productForm("name"))),format.raw/*14.48*/("""
            """),format.raw/*15.13*/("""text: """),_display_(/*15.20*/b3/*15.22*/.textarea(productForm("description"))),format.raw/*15.59*/("""
            """),format.raw/*16.13*/("""code: """),_display_(/*16.20*/b3/*16.22*/.textarea(productForm("description"))),format.raw/*16.59*/("""
        """),format.raw/*17.9*/("""</fieldset>
        """),_display_(/*18.10*/b3/*18.12*/.submit(Symbol("class") -> "btn btn-default")/*18.57*/{_display_(Seq[Any](format.raw/*18.58*/(""" """),format.raw/*18.59*/("""Add """)))}),format.raw/*18.64*/("""
    """)))}),format.raw/*19.6*/("""
""")))}))
      }
    }
  }

  def render(productForm:Form[Product],session:Session,request:RequestHeader,messagesProvider:MessagesProvider,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(productForm)(session,request,messagesProvider,flash)

  def f:((Form[Product]) => (Session,RequestHeader,MessagesProvider,Flash) => play.twirl.api.HtmlFormat.Appendable) = (productForm) => (session,request,messagesProvider,flash) => apply(productForm)(session,request,messagesProvider,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/addPostSTOF.scala.html
                  HASH: 72e6693a7f9d1fc56ca964a2e8301ec88bac13fc
                  MATRIX: 787->1|989->133|1022->146|1054->170|1121->131|1149->208|1178->212|1215->241|1254->243|1285->248|1339->276|1349->278|1405->325|1445->327|1481->336|1574->402|1585->404|1631->429|1672->442|1706->449|1717->451|1764->477|1805->490|1839->497|1850->499|1908->536|1949->549|1983->556|1994->558|2052->595|2088->604|2136->625|2147->627|2201->672|2240->673|2269->674|2305->679|2341->685
                  LINES: 21->1|24->3|26->4|26->4|27->2|28->4|31->7|31->7|31->7|32->8|34->10|34->10|34->10|34->10|35->11|37->13|37->13|37->13|38->14|38->14|38->14|38->14|39->15|39->15|39->15|39->15|40->16|40->16|40->16|40->16|41->17|42->18|42->18|42->18|42->18|42->18|42->18|43->19
                  -- GENERATED --
              */
          
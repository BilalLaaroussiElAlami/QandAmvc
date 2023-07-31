
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
/*1.2*/import models.Content.Answer

object addAnswerVIEW extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[Form[Answer],Int,Session,RequestHeader,MessagesProvider,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(answerForm: Form[Answer], postID: Int)(implicit session: Session, request: RequestHeader, messagesProvider: MessagesProvider, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import b3._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ b3.vertical.fieldConstructor() }};
Seq[Any](format.raw/*3.1*/("""
"""),format.raw/*5.64*/("""


"""),_display_(/*8.2*/mainSTOF("Answer", session)/*8.29*/ {_display_(Seq[Any](format.raw/*8.31*/("""
    """),format.raw/*9.5*/("""<div id="content" class="wrapper doc">
        <h2>Answer Details</h2>
        """),_display_(/*11.10*/b3/*11.12*/.form(action =  helper.CSRF(routes.ContentController.saveAnswer(postID)))/*11.85*/ {_display_(Seq[Any](format.raw/*11.87*/("""
            """),format.raw/*12.13*/("""<fieldset>
                <legend>(new)</legend>
                text: """),_display_(/*14.24*/b3/*14.26*/.textarea(answerForm("text"))),format.raw/*14.55*/("""
                """),format.raw/*15.17*/("""code: """),_display_(/*15.24*/b3/*15.26*/.textarea(answerForm("code"))),format.raw/*15.55*/("""
            """),format.raw/*16.13*/("""</fieldset>
            <div>
            """),_display_(/*18.14*/b3/*18.16*/.submit(Symbol("class") -> "btn btn-default")/*18.61*/{_display_(Seq[Any](format.raw/*18.62*/(""" """),format.raw/*18.63*/("""Add""")))}),format.raw/*18.67*/("""
            """),format.raw/*19.13*/("""</div>
        """)))}),format.raw/*20.10*/("""
        """),format.raw/*21.9*/("""<a href=""""),_display_(/*21.19*/routes/*21.25*/.HomeControllerSTOF.index),format.raw/*21.50*/("""">cancel</a>
    </div>
""")))}))
      }
    }
  }

  def render(answerForm:Form[Answer],postID:Int,session:Session,request:RequestHeader,messagesProvider:MessagesProvider,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(answerForm,postID)(session,request,messagesProvider,flash)

  def f:((Form[Answer],Int) => (Session,RequestHeader,MessagesProvider,Flash) => play.twirl.api.HtmlFormat.Appendable) = (answerForm,postID) => (session,request,messagesProvider,flash) => apply(answerForm,postID)(session,request,messagesProvider,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/addAnswerVIEW.scala.html
                  HASH: 38c0e1b94cdb41be8d7cd854bc190f2d6fe09c45
                  MATRIX: 432->1|828->31|1041->174|1074->187|1106->211|1173->172|1201->249|1230->253|1265->280|1304->282|1335->287|1442->367|1453->369|1535->442|1575->444|1616->457|1716->530|1727->532|1777->561|1822->578|1856->585|1867->587|1917->616|1958->629|2028->672|2039->674|2093->719|2132->720|2161->721|2196->725|2237->738|2284->754|2320->763|2357->773|2372->779|2418->804
                  LINES: 17->1|22->2|25->4|27->5|27->5|28->3|29->5|32->8|32->8|32->8|33->9|35->11|35->11|35->11|35->11|36->12|38->14|38->14|38->14|39->15|39->15|39->15|39->15|40->16|42->18|42->18|42->18|42->18|42->18|42->18|43->19|44->20|45->21|45->21|45->21|45->21
                  -- GENERATED --
              */
          
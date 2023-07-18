
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

object contacts extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[Contact],Session,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(contacts: List[Contact])(implicit session: Session):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("List of Contacts", session)/*3.35*/ {_display_(Seq[Any](format.raw/*3.37*/("""
  """),format.raw/*4.3*/("""<div class="wrapper fadeInUp">
  <table>
  <tr>
    <td>Name</td>
    <td>Phone</td>
  </tr>
    """),_display_(/*10.6*/if(session.get(models.Global.SESSION_USERNAME_KEY))/*10.57*/ {_display_(Seq[Any](format.raw/*10.59*/("""
      """),_display_(/*11.8*/for(contact <- contacts) yield /*11.32*/ {_display_(Seq[Any](format.raw/*11.34*/("""
        """),format.raw/*12.9*/("""<tr>
          <td>"""),_display_(/*13.16*/contact/*13.23*/.name),format.raw/*13.28*/("""</td>
          <td>"""),_display_(/*14.16*/contact/*14.23*/.phone),format.raw/*14.29*/("""</td>
        </tr>
      """)))}),format.raw/*16.8*/("""
    """)))}),format.raw/*17.6*/("""
  """),format.raw/*18.3*/("""</table>
  </div>
""")))}),format.raw/*20.2*/("""
"""))
      }
    }
  }

  def render(contacts:List[Contact],session:Session): play.twirl.api.HtmlFormat.Appendable = apply(contacts)(session)

  def f:((List[Contact]) => (Session) => play.twirl.api.HtmlFormat.Appendable) = (contacts) => (session) => apply(contacts)(session)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/contacts.scala.html
                  HASH: 934322add6ef4a2f73a5015062bd721184e4265a
                  MATRIX: 747->1|893->54|920->56|961->89|1000->91|1029->94|1153->192|1213->243|1253->245|1287->253|1327->277|1367->279|1403->288|1450->308|1466->315|1492->320|1540->341|1556->348|1583->354|1640->381|1676->387|1706->390|1755->409
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|34->10|34->10|34->10|35->11|35->11|35->11|36->12|37->13|37->13|37->13|38->14|38->14|38->14|40->16|41->17|42->18|44->20
                  -- GENERATED --
              */
          

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

object loginLandingPage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Session,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit session: Session):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.59*/("""

"""),_display_(/*3.2*/main("Welcome to Play", session)/*3.34*/ {_display_(Seq[Any](format.raw/*3.36*/("""
    """),format.raw/*4.5*/("""<div class="wrapper fadeInUp">

    <h1>Welcome! You are logged in.</h1>

    """),format.raw/*8.44*/("""
    """),format.raw/*9.43*/("""
    """),format.raw/*10.5*/("""</div>
""")))}),format.raw/*11.2*/("""
"""))
      }
    }
  }

  def render(session:Session): play.twirl.api.HtmlFormat.Appendable = apply()(session)

  def f:(() => (Session) => play.twirl.api.HtmlFormat.Appendable) = () => (session) => apply()(session)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/loginLandingPage.scala.html
                  HASH: 2d0bf7c5253dfb9dabd240016cd703b89b8ec4de
                  MATRIX: 741->1|865->58|893->61|933->93|972->95|1003->100|1108->217|1140->260|1172->265|1210->273
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|33->8|34->9|35->10|36->11
                  -- GENERATED --
              */
          
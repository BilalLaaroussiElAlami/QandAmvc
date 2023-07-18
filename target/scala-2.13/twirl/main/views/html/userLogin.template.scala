
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

object userLogin extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Form[models.User],Call,Session,MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[models.User], postUrl: Call)(implicit session: Session, request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/mainSTOF("User Login", session)/*2.33*/ {_display_(Seq[Any](format.raw/*2.35*/("""
    """),_display_(/*3.6*/defining(play.core.PlayVersion.current)/*3.45*/ { version =>_display_(Seq[Any](format.raw/*3.58*/("""
    """),format.raw/*4.5*/("""<div class="wrapper fadeInDown">

    <div id="user-login-form">

        """),_display_(/*8.10*/request/*8.17*/.flash.data.map/*8.32*/{ case (name, value) =>_display_(Seq[Any](format.raw/*8.55*/("""
            """),format.raw/*9.13*/("""<div>"""),_display_(/*9.19*/name),format.raw/*9.23*/(""": """),_display_(/*9.26*/value),format.raw/*9.31*/("""</div>
        """)))}),format.raw/*10.10*/("""

        """),format.raw/*12.70*/("""
        """),_display_(/*13.10*/if(form.hasGlobalErrors)/*13.34*/ {_display_(Seq[Any](format.raw/*13.36*/("""
            """),_display_(/*14.14*/form/*14.18*/.globalErrors.map/*14.35*/ { error: FormError =>_display_(Seq[Any](format.raw/*14.57*/("""
                """),format.raw/*15.17*/("""<div>
                    Error: """),_display_(/*16.29*/error/*16.34*/.key),format.raw/*16.38*/(""": """),_display_(/*16.41*/error/*16.46*/.message),format.raw/*16.54*/("""
                """),format.raw/*17.17*/("""</div>
            """)))}),format.raw/*18.14*/("""
        """)))}),format.raw/*19.10*/("""

        """),_display_(/*21.10*/helper/*21.16*/.form(postUrl, Symbol("id") -> "user-login-form")/*21.65*/ {_display_(Seq[Any](format.raw/*21.67*/("""

        """),_display_(/*23.10*/helper/*23.16*/.CSRF.formField),format.raw/*23.31*/("""

        """),_display_(/*25.10*/helper/*25.16*/.inputText(
            form("username"),
            Symbol("label") -> "Username",
            Symbol("placeholder") -> "username",
            Symbol("id") -> "username",
            Symbol("size") -> 60
        )),format.raw/*31.10*/("""

        """),_display_(/*33.10*/helper/*33.16*/.inputPassword(
            form("password"),
            Symbol("label") -> "password",
            Symbol("placeholder") -> "password",
            Symbol("id") -> "password",
            Symbol("size") -> 60
        )),format.raw/*39.10*/("""
            """),format.raw/*40.13*/("""<input type="submit" value="Log In">
            """)))}),format.raw/*41.14*/("""
    """),format.raw/*42.5*/("""</div>
</div>
    """)))}),format.raw/*44.6*/("""
""")))}),format.raw/*45.2*/("""
"""))
      }
    }
  }

  def render(form:Form[models.User],postUrl:Call,session:Session,request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(form,postUrl)(session,request)

  def f:((Form[models.User],Call) => (Session,MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (form,postUrl) => (session,request) => apply(form,postUrl)(session,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/userLogin.scala.html
                  HASH: 956320201258128ae480991fc20fa176d6000d91
                  MATRIX: 779->1|972->102|1011->133|1050->135|1081->141|1128->180|1178->193|1209->198|1310->273|1325->280|1348->295|1408->318|1448->331|1480->337|1504->341|1533->344|1558->349|1605->365|1643->436|1680->446|1713->470|1753->472|1794->486|1807->490|1833->507|1893->529|1938->546|1999->580|2013->585|2038->589|2068->592|2082->597|2111->605|2156->622|2207->642|2248->652|2286->663|2301->669|2359->718|2399->720|2437->731|2452->737|2488->752|2526->763|2541->769|2778->985|2816->996|2831->1002|3072->1222|3113->1235|3194->1285|3226->1290|3275->1309|3307->1311
                  LINES: 21->1|26->2|26->2|26->2|27->3|27->3|27->3|28->4|32->8|32->8|32->8|32->8|33->9|33->9|33->9|33->9|33->9|34->10|36->12|37->13|37->13|37->13|38->14|38->14|38->14|38->14|39->15|40->16|40->16|40->16|40->16|40->16|40->16|41->17|42->18|43->19|45->21|45->21|45->21|45->21|47->23|47->23|47->23|49->25|49->25|55->31|57->33|57->33|63->39|64->40|65->41|66->42|68->44|69->45
                  -- GENERATED --
              */
          
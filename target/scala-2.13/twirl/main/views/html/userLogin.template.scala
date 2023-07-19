
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
/*1.2*/import models.User.User

object userLogin extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Form[User],Call,Session,MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(form: Form[User], postUrl: Call)(implicit session: Session, request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*3.2*/mainSTOF("User Login", session)/*3.33*/ {_display_(Seq[Any](format.raw/*3.35*/("""
    """),_display_(/*4.6*/defining(play.core.PlayVersion.current)/*4.45*/ { version =>_display_(Seq[Any](format.raw/*4.58*/("""
    """),format.raw/*5.5*/("""<div class="wrapper fadeInDown">

    <div id="user-login-form">

        """),_display_(/*9.10*/request/*9.17*/.flash.data.map/*9.32*/{ case (name, value) =>_display_(Seq[Any](format.raw/*9.55*/("""
            """),format.raw/*10.13*/("""<div>"""),_display_(/*10.19*/name),format.raw/*10.23*/(""": """),_display_(/*10.26*/value),format.raw/*10.31*/("""</div>
        """)))}),format.raw/*11.10*/("""

        """),format.raw/*13.70*/("""
        """),_display_(/*14.10*/if(form.hasGlobalErrors)/*14.34*/ {_display_(Seq[Any](format.raw/*14.36*/("""
            """),_display_(/*15.14*/form/*15.18*/.globalErrors.map/*15.35*/ { error: FormError =>_display_(Seq[Any](format.raw/*15.57*/("""
                """),format.raw/*16.17*/("""<div>
                    Error: """),_display_(/*17.29*/error/*17.34*/.key),format.raw/*17.38*/(""": """),_display_(/*17.41*/error/*17.46*/.message),format.raw/*17.54*/("""
                """),format.raw/*18.17*/("""</div>
            """)))}),format.raw/*19.14*/("""
        """)))}),format.raw/*20.10*/("""

        """),_display_(/*22.10*/helper/*22.16*/.form(postUrl, Symbol("id") -> "user-login-form")/*22.65*/ {_display_(Seq[Any](format.raw/*22.67*/("""

        """),_display_(/*24.10*/helper/*24.16*/.CSRF.formField),format.raw/*24.31*/("""

        """),_display_(/*26.10*/helper/*26.16*/.inputText(
            form("username"),
            Symbol("label") -> "Username",
            Symbol("placeholder") -> "username",
            Symbol("id") -> "username",
            Symbol("size") -> 60
        )),format.raw/*32.10*/("""

        """),_display_(/*34.10*/helper/*34.16*/.inputPassword(
            form("password"),
            Symbol("label") -> "password",
            Symbol("placeholder") -> "password",
            Symbol("id") -> "password",
            Symbol("size") -> 60
        )),format.raw/*40.10*/("""
            """),format.raw/*41.13*/("""<input type="submit" value="Log In">
            """)))}),format.raw/*42.14*/("""
    """),format.raw/*43.5*/("""</div>
</div>
    """)))}),format.raw/*45.6*/("""
""")))}),format.raw/*46.2*/("""
"""))
      }
    }
  }

  def render(form:Form[User],postUrl:Call,session:Session,request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(form,postUrl)(session,request)

  def f:((Form[User],Call) => (Session,MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (form,postUrl) => (session,request) => apply(form,postUrl)(session,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/userLogin.scala.html
                  HASH: dcf7eaa448f9e86951d1f5e467d0f1caba419623
                  MATRIX: 432->1|803->26|989->120|1028->151|1067->153|1098->159|1145->198|1195->211|1226->216|1327->291|1342->298|1365->313|1425->336|1466->349|1499->355|1524->359|1554->362|1580->367|1627->383|1665->454|1702->464|1735->488|1775->490|1816->504|1829->508|1855->525|1915->547|1960->564|2021->598|2035->603|2060->607|2090->610|2104->615|2133->623|2178->640|2229->660|2270->670|2308->681|2323->687|2381->736|2421->738|2459->749|2474->755|2510->770|2548->781|2563->787|2800->1003|2838->1014|2853->1020|3094->1240|3135->1253|3216->1303|3248->1308|3297->1327|3329->1329
                  LINES: 17->1|22->2|27->3|27->3|27->3|28->4|28->4|28->4|29->5|33->9|33->9|33->9|33->9|34->10|34->10|34->10|34->10|34->10|35->11|37->13|38->14|38->14|38->14|39->15|39->15|39->15|39->15|40->16|41->17|41->17|41->17|41->17|41->17|41->17|42->18|43->19|44->20|46->22|46->22|46->22|46->22|48->24|48->24|48->24|50->26|50->26|56->32|58->34|58->34|64->40|65->41|66->42|67->43|69->45|70->46
                  -- GENERATED --
              */
          

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

object userLoginVIEW extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Form[User],Call,Session,MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

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
                  SOURCE: app/views/userLoginVIEW.scala.html
                  HASH: dcf7eaa448f9e86951d1f5e467d0f1caba419623
                  MATRIX: 432->1|807->26|993->120|1032->151|1071->153|1102->159|1149->198|1199->211|1230->216|1331->291|1346->298|1369->313|1429->336|1470->349|1503->355|1528->359|1558->362|1584->367|1631->383|1669->454|1706->464|1739->488|1779->490|1820->504|1833->508|1859->525|1919->547|1964->564|2025->598|2039->603|2064->607|2094->610|2108->615|2137->623|2182->640|2233->660|2274->670|2312->681|2327->687|2385->736|2425->738|2463->749|2478->755|2514->770|2552->781|2567->787|2804->1003|2842->1014|2857->1020|3098->1240|3139->1253|3220->1303|3252->1308|3301->1327|3333->1329
                  LINES: 17->1|22->2|27->3|27->3|27->3|28->4|28->4|28->4|29->5|33->9|33->9|33->9|33->9|34->10|34->10|34->10|34->10|34->10|35->11|37->13|38->14|38->14|38->14|39->15|39->15|39->15|39->15|40->16|41->17|41->17|41->17|41->17|41->17|41->17|42->18|43->19|44->20|46->22|46->22|46->22|46->22|48->24|48->24|48->24|50->26|50->26|56->32|58->34|58->34|64->40|65->41|66->42|67->43|69->45|70->46
                  -- GENERATED --
              */
          
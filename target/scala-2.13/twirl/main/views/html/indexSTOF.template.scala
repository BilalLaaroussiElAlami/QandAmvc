
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

object indexSTOF extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Seq[PostSTOF],Session,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(welcome: String, posts: Seq[PostSTOF])(implicit session: Session):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import b3._


Seq[Any](_display_(/*3.2*/mainSTOF(welcome, session)/*3.28*/ {_display_(Seq[Any](format.raw/*3.30*/("""
    """),_display_(/*4.6*/defining(play.core.PlayVersion.current)/*4.45*/ { version =>_display_(Seq[Any](format.raw/*4.58*/("""
        """),format.raw/*5.9*/("""<div id="content" class="wrapper doc">
            <h1>"""),_display_(/*6.18*/welcome),format.raw/*6.25*/("""</h1>

            <btn><a href= """),_display_(/*8.28*/controllers/*8.39*/.routes.PostControllerSTOF.sortByDate),format.raw/*8.76*/(""" """),format.raw/*8.77*/(""">sort by date</a></btn>
            <btn><a href= """),_display_(/*9.28*/controllers/*9.39*/.routes.PostControllerSTOF.sortByVotes),format.raw/*9.77*/(""" """),format.raw/*9.78*/(""">sort by votes</a></btn>



            <h4> Search</h4>
                <form action = """),_display_(/*14.33*/routes/*14.39*/.PostControllerSTOF.searchByTag("fzefez")),format.raw/*14.80*/("""" method="get">
                <input type="text" name="tag" placeholder="Enter your search query">
                <input type="submit" value="Search">
            </form>


            <dl>
            """),_display_(/*21.14*/for(post <- posts) yield /*21.32*/ {_display_(Seq[Any](format.raw/*21.34*/("""
                """),format.raw/*22.17*/("""<dl class="dl-horizontal" >
                    <dt>text:</dt>
                    <dd>"""),_display_(/*24.26*/post/*24.30*/.text),format.raw/*24.35*/(""" """),format.raw/*24.36*/("""</dd>

                    <dt>code:</dt>
                    <dd>"""),_display_(/*27.26*/post/*27.30*/.code),format.raw/*27.35*/("""</dd>

                    <dt>date:</dt>
                    <dd>"""),_display_(/*30.26*/post/*30.30*/.date),format.raw/*30.35*/("""</dd>

                    <dt>votes: </dt>
                    <dd>"""),_display_(/*33.26*/post/*33.30*/.votes),format.raw/*33.36*/("""</dd>

                    <dt>Tags: </dt>
                    <dd> """),_display_(/*36.27*/post/*36.31*/.tags.mkString(",")),format.raw/*36.50*/("""</dd>

                    <btn><a >more details</a></btn>
                </dl>
            """)))}),format.raw/*40.14*/("""
            """),format.raw/*41.13*/("""</dl>
    """)))}),format.raw/*42.6*/("""
        """),format.raw/*43.9*/("""</div>

    """)))}),format.raw/*45.6*/("""
"""))
      }
    }
  }

  def render(welcome:String,posts:Seq[PostSTOF],session:Session): play.twirl.api.HtmlFormat.Appendable = apply(welcome,posts)(session)

  def f:((String,Seq[PostSTOF]) => (Session) => play.twirl.api.HtmlFormat.Appendable) = (welcome,posts) => (session) => apply(welcome,posts)(session)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/indexSTOF.scala.html
                  HASH: 21f478b6d8f1db5755278292bfce02fd3311962f
                  MATRIX: 755->1|894->69|934->82|968->108|1007->110|1038->116|1085->155|1135->168|1170->177|1252->233|1279->240|1339->274|1358->285|1415->322|1443->323|1520->374|1539->385|1597->423|1625->424|1741->513|1756->519|1818->560|2051->766|2085->784|2125->786|2170->803|2285->891|2298->895|2324->900|2353->901|2447->968|2460->972|2486->977|2580->1044|2593->1048|2619->1053|2715->1122|2728->1126|2755->1132|2851->1201|2864->1205|2904->1224|3029->1318|3070->1331|3111->1342|3147->1351|3190->1364
                  LINES: 21->1|24->2|27->3|27->3|27->3|28->4|28->4|28->4|29->5|30->6|30->6|32->8|32->8|32->8|32->8|33->9|33->9|33->9|33->9|38->14|38->14|38->14|45->21|45->21|45->21|46->22|48->24|48->24|48->24|48->24|51->27|51->27|51->27|54->30|54->30|54->30|57->33|57->33|57->33|60->36|60->36|60->36|64->40|65->41|66->42|67->43|69->45
                  -- GENERATED --
              */
          
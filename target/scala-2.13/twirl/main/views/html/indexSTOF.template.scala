
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
                <form action = """),_display_(/*13.33*/routes/*13.39*/.PostControllerSTOF.searchByTag("")),format.raw/*13.74*/("""" method="get">
                <input type="text" name="tag" placeholder="Enter your search query">
                <input type="submit" value="Search">
            </form>


            <!-- TODO change to seperate post view? -->
            <dl>
            """),_display_(/*21.14*/for(post <- posts) yield /*21.32*/ {_display_(Seq[Any](format.raw/*21.34*/("""
                """),format.raw/*22.17*/("""<dl class="dl-horizontal" >
                    <dt>title:</dt>
                    <dd>"""),_display_(/*24.26*/post/*24.30*/.title),format.raw/*24.36*/("""<dd>

                    <dt>text:</dt>
                    <dd>"""),_display_(/*27.26*/post/*27.30*/.text),format.raw/*27.35*/(""" """),format.raw/*27.36*/("""</dd>

                    <dt>code:</dt>
                    <dd>"""),_display_(/*30.26*/post/*30.30*/.code),format.raw/*30.35*/("""</dd>

                    <dt>date:</dt>
                    <dd>"""),_display_(/*33.26*/post/*33.30*/.date),format.raw/*33.35*/("""</dd>

                    <dt>votes: </dt>
                    <dd>"""),_display_(/*36.26*/post/*36.30*/.votes),format.raw/*36.36*/("""</dd>

                    <dt>Tags: </dt>
                    <dd> """),_display_(/*39.27*/post/*39.31*/.tags.mkString(",")),format.raw/*39.50*/("""</dd>

                    <!-- only loged in users can vote -->
                    """),_display_(/*42.22*/if(session.get(models.Global.SESSION_USERNAME_KEY).nonEmpty)/*42.82*/ {_display_(Seq[Any](format.raw/*42.84*/("""
                        """),format.raw/*43.25*/("""<li><a href=""""),_display_(/*43.39*/routes/*43.45*/.PostControllerSTOF.upvote(post.id)),format.raw/*43.80*/("""  """),format.raw/*43.82*/(""""> upvote </a></li>
                        <li><a href=""""),_display_(/*44.39*/routes/*44.45*/.PostControllerSTOF.downvote(post.id)),format.raw/*44.82*/(""""> downvote </a></li>
                    """)))}),format.raw/*45.22*/("""
                """),format.raw/*46.17*/("""</dl>
            """)))}),format.raw/*47.14*/("""
            """),format.raw/*48.13*/("""</dl>
    """)))}),format.raw/*49.6*/("""
        """),format.raw/*50.9*/("""</div>

    """)))}),format.raw/*52.6*/("""
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
                  HASH: d705f5292d195ceeb69f8a9b7965261ff50f18b4
                  MATRIX: 755->1|894->69|934->82|968->108|1007->110|1038->116|1085->155|1135->168|1170->177|1252->233|1279->240|1339->274|1358->285|1415->322|1443->323|1520->374|1539->385|1597->423|1625->424|1740->512|1755->518|1811->553|2100->815|2134->833|2174->835|2219->852|2335->941|2348->945|2375->951|2468->1017|2481->1021|2507->1026|2536->1027|2630->1094|2643->1098|2669->1103|2763->1170|2776->1174|2802->1179|2898->1248|2911->1252|2938->1258|3034->1327|3047->1331|3087->1350|3200->1436|3269->1496|3309->1498|3362->1523|3403->1537|3418->1543|3474->1578|3504->1580|3589->1638|3604->1644|3662->1681|3736->1724|3781->1741|3831->1760|3872->1773|3913->1784|3949->1793|3992->1806
                  LINES: 21->1|24->2|27->3|27->3|27->3|28->4|28->4|28->4|29->5|30->6|30->6|32->8|32->8|32->8|32->8|33->9|33->9|33->9|33->9|37->13|37->13|37->13|45->21|45->21|45->21|46->22|48->24|48->24|48->24|51->27|51->27|51->27|51->27|54->30|54->30|54->30|57->33|57->33|57->33|60->36|60->36|60->36|63->39|63->39|63->39|66->42|66->42|66->42|67->43|67->43|67->43|67->43|67->43|68->44|68->44|68->44|69->45|70->46|71->47|72->48|73->49|74->50|76->52
                  -- GENERATED --
              */
          
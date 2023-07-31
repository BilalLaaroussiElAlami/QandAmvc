
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
/*1.2*/import models.Content.Post
/*2.2*/import models.Content.Answer

object postWithAnswers extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[String,Post,Seq[Answer],Session,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(welcome: String, post: Post, answers: Seq[Answer])(implicit session: Session):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import b3._


Seq[Any](_display_(/*5.2*/mainSTOF(welcome, session)/*5.28*/ {_display_(Seq[Any](format.raw/*5.30*/("""
    """),_display_(/*6.6*/defining(play.core.PlayVersion.current)/*6.45*/ { version =>_display_(Seq[Any](format.raw/*6.58*/("""
        """),format.raw/*7.9*/("""<div id="content" class="wrapper doc">
            <h1>"""),_display_(/*8.18*/welcome),format.raw/*8.25*/("""</h1>

            <dl class="dl-horizontal">
                <dt>title:</dt>
                <dd>"""),_display_(/*12.22*/post/*12.26*/.title),format.raw/*12.32*/("""<dd>

                <dt>text:</dt>
                <dd>"""),_display_(/*15.22*/post/*15.26*/.text),format.raw/*15.31*/(""" """),format.raw/*15.32*/("""</dd>

                <dt>code:</dt>
                <dd>"""),_display_(/*18.22*/post/*18.26*/.code),format.raw/*18.31*/("""</dd>

                <dt>date:</dt>
                <dd>"""),_display_(/*21.22*/post/*21.26*/.date),format.raw/*21.31*/("""</dd>

                <dt>votes: </dt>
                <dd>"""),_display_(/*24.22*/post/*24.26*/.votes),format.raw/*24.32*/("""</dd>

                <dt>Tags: </dt>
                <dd> """),_display_(/*27.23*/post/*27.27*/.tags.mkString(",")),format.raw/*27.46*/("""</dd>

                    <!-- only loged in users can vote -->
                """),_display_(/*30.18*/if(session.get(models.Global.SESSION_USERNAME_KEY).nonEmpty)/*30.78*/ {_display_(Seq[Any](format.raw/*30.80*/("""
                    """),format.raw/*31.21*/("""<ul>
                        <button><a href=""""),_display_(/*32.43*/routes/*32.49*/.ContentController.upvotePostFromPostWithAnswerPage(post.id)),format.raw/*32.109*/("""  """),format.raw/*32.111*/(""""> upvote   </a></button>
                        <button><a href=""""),_display_(/*33.43*/routes/*33.49*/.ContentController.downvotePostFromPostWithAnswerPage(post.id)),format.raw/*33.111*/(""""> downvote </a></button>
                        <button><a href=""""),_display_(/*34.43*/routes/*34.49*/.ContentController.newAnswer(post.id)),format.raw/*34.86*/(""""> answer </a> </button>
                    </ul>
                """)))}),format.raw/*36.18*/("""
            """),format.raw/*37.13*/("""</dl>

            <dl>
            """),_display_(/*40.14*/for(answer <- answers) yield /*40.36*/ {_display_(Seq[Any](format.raw/*40.38*/("""
                """),format.raw/*41.17*/("""<dl class="dl-horizontal" >
                    <dt>text:</dt>
                    <dd>"""),_display_(/*43.26*/answer/*43.32*/.text),format.raw/*43.37*/(""" """),format.raw/*43.38*/("""</dd>

                    <dt>code:</dt>
                    <dd>"""),_display_(/*46.26*/answer/*46.32*/.code),format.raw/*46.37*/("""</dd>

                    <dt>data:</dt>
                    <dd>"""),_display_(/*49.26*/answer/*49.32*/.date),format.raw/*49.37*/("""</dd>

                    <dt>votes: </dt>
                    <dd>"""),_display_(/*52.26*/answer/*52.32*/.votes),format.raw/*52.38*/("""</dd>
                        <!-- only loged in users can vote -->
                    """),_display_(/*54.22*/if(session.get(models.Global.SESSION_USERNAME_KEY).nonEmpty)/*54.82*/ {_display_(Seq[Any](format.raw/*54.84*/("""
                        """),format.raw/*55.25*/("""<ul>
                            <button><a href=""""),_display_(/*56.47*/routes/*56.53*/.ContentController.upvoteAnswer(answer.id)),format.raw/*56.95*/("""  """),format.raw/*56.97*/(""""> upvote answer </a></button>
                            <button><a href=""""),_display_(/*57.47*/routes/*57.53*/.ContentController.downvoteAnswer(answer.id)),format.raw/*57.97*/(""""> downvote answer </a></button>
                        </ul>
                    """)))}),format.raw/*59.22*/("""
                """),format.raw/*60.17*/("""</dl>
            """)))}),format.raw/*61.14*/("""
            """),format.raw/*62.13*/("""</dl>
    """)))}),format.raw/*63.6*/("""
"""),format.raw/*64.1*/("""</div>
""")))}),format.raw/*65.2*/("""
"""))
      }
    }
  }

  def render(welcome:String,post:Post,answers:Seq[Answer],session:Session): play.twirl.api.HtmlFormat.Appendable = apply(welcome,post,answers)(session)

  def f:((String,Post,Seq[Answer]) => (Session) => play.twirl.api.HtmlFormat.Appendable) = (welcome,post,answers) => (session) => apply(welcome,post,answers)(session)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/postWithAnswers.scala.html
                  HASH: 2f5115a4e267fa968071915f0ba81de428fc95e6
                  MATRIX: 432->1|466->29|834->59|985->139|1025->152|1059->178|1098->180|1129->186|1176->225|1226->238|1261->247|1343->303|1370->310|1496->409|1509->413|1536->419|1621->477|1634->481|1660->486|1689->487|1775->546|1788->550|1814->555|1900->614|1913->618|1939->623|2027->684|2040->688|2067->694|2155->755|2168->759|2208->778|2317->860|2386->920|2426->922|2475->943|2549->990|2564->996|2646->1056|2677->1058|2772->1126|2787->1132|2871->1194|2966->1262|2981->1268|3039->1305|3138->1373|3179->1386|3243->1423|3281->1445|3321->1447|3366->1464|3481->1552|3496->1558|3522->1563|3551->1564|3645->1631|3660->1637|3686->1642|3780->1709|3795->1715|3821->1720|3917->1789|3932->1795|3959->1801|4075->1890|4144->1950|4184->1952|4237->1977|4315->2028|4330->2034|4393->2076|4423->2078|4527->2155|4542->2161|4607->2205|4722->2289|4767->2306|4817->2325|4858->2338|4899->2349|4927->2350|4965->2358
                  LINES: 17->1|18->2|23->3|26->4|29->5|29->5|29->5|30->6|30->6|30->6|31->7|32->8|32->8|36->12|36->12|36->12|39->15|39->15|39->15|39->15|42->18|42->18|42->18|45->21|45->21|45->21|48->24|48->24|48->24|51->27|51->27|51->27|54->30|54->30|54->30|55->31|56->32|56->32|56->32|56->32|57->33|57->33|57->33|58->34|58->34|58->34|60->36|61->37|64->40|64->40|64->40|65->41|67->43|67->43|67->43|67->43|70->46|70->46|70->46|73->49|73->49|73->49|76->52|76->52|76->52|78->54|78->54|78->54|79->55|80->56|80->56|80->56|80->56|81->57|81->57|81->57|83->59|84->60|85->61|86->62|87->63|88->64|89->65
                  -- GENERATED --
              */
          
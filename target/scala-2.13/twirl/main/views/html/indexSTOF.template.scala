
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

object indexSTOF extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Seq[Post],Session,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(welcome: String, posts: Seq[Post])(implicit session: Session):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import b3._


Seq[Any](_display_(/*4.2*/mainSTOF(welcome, session)/*4.28*/ {_display_(Seq[Any](format.raw/*4.30*/("""
    """),_display_(/*5.6*/defining(play.core.PlayVersion.current)/*5.45*/ { version =>_display_(Seq[Any](format.raw/*5.58*/("""
        """),format.raw/*6.9*/("""<div id="content" class="wrapper doc">
            <h1>"""),_display_(/*7.18*/welcome),format.raw/*7.25*/("""</h1>

            <btn><a href= """),_display_(/*9.28*/controllers/*9.39*/.routes.PostControllerSTOF.sortByDate),format.raw/*9.76*/(""" """),format.raw/*9.77*/(""">sort by date</a></btn>
            <btn><a href= """),_display_(/*10.28*/controllers/*10.39*/.routes.PostControllerSTOF.sortByVotes),format.raw/*10.77*/(""" """),format.raw/*10.78*/(""">sort by votes</a></btn>


            <h4> Search</h4>
                <form action = """),_display_(/*14.33*/routes/*14.39*/.PostControllerSTOF.searchByTag("")),format.raw/*14.74*/("""" method="get">
                <input type="text" name="tag" placeholder="Enter your search query">
                <input type="submit" value="Search">
            </form>


            <!-- TODO change to seperate post view? -->
            <dl>
            """),_display_(/*22.14*/for(post <- posts) yield /*22.32*/ {_display_(Seq[Any](format.raw/*22.34*/("""
                """),format.raw/*23.17*/("""<dl class="dl-horizontal" >
                    <dt>title:</dt>
                    <dd>"""),_display_(/*25.26*/post/*25.30*/.title),format.raw/*25.36*/("""<dd>

                    <dt>text:</dt>
                    <dd>"""),_display_(/*28.26*/post/*28.30*/.text),format.raw/*28.35*/(""" """),format.raw/*28.36*/("""</dd>

                    <dt>code:</dt>
                    <dd>"""),_display_(/*31.26*/post/*31.30*/.code),format.raw/*31.35*/("""</dd>

                    <dt>date:</dt>
                    <dd>"""),_display_(/*34.26*/post/*34.30*/.date),format.raw/*34.35*/("""</dd>

                    <dt>votes: </dt>
                    <dd>"""),_display_(/*37.26*/post/*37.30*/.votes),format.raw/*37.36*/("""</dd>

                    <dt>Tags: </dt>
                    <dd> """),_display_(/*40.27*/post/*40.31*/.tags.mkString(",")),format.raw/*40.50*/("""</dd>

                    <!-- only loged in users can vote -->
                    """),_display_(/*43.22*/if(session.get(models.Global.SESSION_USERNAME_KEY).nonEmpty)/*43.82*/ {_display_(Seq[Any](format.raw/*43.84*/("""
                        """),format.raw/*44.25*/("""<ul>
                            <button><a href=""""),_display_(/*45.47*/routes/*45.53*/.PostControllerSTOF.upvote(post.id)),format.raw/*45.88*/("""  """),format.raw/*45.90*/(""""> upvote </a></button>
                            <button><a href=""""),_display_(/*46.47*/routes/*46.53*/.PostControllerSTOF.downvote(post.id)),format.raw/*46.90*/(""""> downvote </a></button>
                            <button>  answer </button>
                        </ul>
                    """)))}),format.raw/*49.22*/("""
                """),format.raw/*50.17*/("""</dl>
            """)))}),format.raw/*51.14*/("""
            """),format.raw/*52.13*/("""</dl>
    """)))}),format.raw/*53.6*/("""
        """),format.raw/*54.9*/("""</div>

    """)))}),format.raw/*56.6*/("""
"""))
      }
    }
  }

  def render(welcome:String,posts:Seq[Post],session:Session): play.twirl.api.HtmlFormat.Appendable = apply(welcome,posts)(session)

  def f:((String,Seq[Post]) => (Session) => play.twirl.api.HtmlFormat.Appendable) = (welcome,posts) => (session) => apply(welcome,posts)(session)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/indexSTOF.scala.html
                  HASH: 51a2504617c4cca1afc46f0dfe5b7073685a1a88
                  MATRIX: 432->1|785->29|920->93|960->106|994->132|1033->134|1064->140|1111->179|1161->192|1196->201|1278->257|1305->264|1365->298|1384->309|1441->346|1469->347|1547->398|1567->409|1626->447|1655->448|1770->536|1785->542|1841->577|2130->839|2164->857|2204->859|2249->876|2365->965|2378->969|2405->975|2498->1041|2511->1045|2537->1050|2566->1051|2660->1118|2673->1122|2699->1127|2793->1194|2806->1198|2832->1203|2928->1272|2941->1276|2968->1282|3064->1351|3077->1355|3117->1374|3230->1460|3299->1520|3339->1522|3392->1547|3470->1598|3485->1604|3541->1639|3571->1641|3668->1711|3683->1717|3741->1754|3904->1886|3949->1903|3999->1922|4040->1935|4081->1946|4117->1955|4160->1968
                  LINES: 17->1|22->2|25->3|28->4|28->4|28->4|29->5|29->5|29->5|30->6|31->7|31->7|33->9|33->9|33->9|33->9|34->10|34->10|34->10|34->10|38->14|38->14|38->14|46->22|46->22|46->22|47->23|49->25|49->25|49->25|52->28|52->28|52->28|52->28|55->31|55->31|55->31|58->34|58->34|58->34|61->37|61->37|61->37|64->40|64->40|64->40|67->43|67->43|67->43|68->44|69->45|69->45|69->45|69->45|70->46|70->46|70->46|73->49|74->50|75->51|76->52|77->53|78->54|80->56
                  -- GENERATED --
              */
          
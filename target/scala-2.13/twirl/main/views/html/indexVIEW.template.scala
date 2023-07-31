
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

object indexVIEW extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Seq[Post],Session,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(welcome: String, posts: Seq[Post])(implicit session: Session):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import b3._


Seq[Any](_display_(/*4.2*/mainSTOF(welcome, session)/*4.28*/ {_display_(Seq[Any](format.raw/*4.30*/("""
    """),_display_(/*5.6*/defining(play.core.PlayVersion.current)/*5.45*/ { version =>_display_(Seq[Any](format.raw/*5.58*/("""
        """),format.raw/*6.9*/("""<div id="content" class="wrapper doc">
            <h1>"""),_display_(/*7.18*/welcome),format.raw/*7.25*/("""</h1>

            <btn><a href= """),_display_(/*9.28*/controllers/*9.39*/.routes.ContentController.sortByDate),format.raw/*9.75*/(""" """),format.raw/*9.76*/(""">sort by date</a></btn>
            <btn><a href= """),_display_(/*10.28*/controllers/*10.39*/.routes.ContentController.sortByVotes),format.raw/*10.76*/(""" """),format.raw/*10.77*/(""">sort by votes</a></btn>


            <h4> Search</h4>
                <form action = """),_display_(/*14.33*/routes/*14.39*/.ContentController.searchByTag("")),format.raw/*14.73*/("""" method="get">
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
                    <ul>
                    """),_display_(/*44.22*/if(session.get(models.Global.SESSION_USERNAME_KEY).nonEmpty)/*44.82*/ {_display_(Seq[Any](format.raw/*44.84*/("""
                            """),format.raw/*45.29*/("""<button><a href=""""),_display_(/*45.47*/routes/*45.53*/.ContentController.upvote(post.id)),format.raw/*45.87*/("""  """),format.raw/*45.89*/(""""> upvote </a></button>
                            <button><a href=""""),_display_(/*46.47*/routes/*46.53*/.ContentController.downvote(post.id)),format.raw/*46.89*/(""""> downvote </a></button>
                    """)))}),format.raw/*47.22*/("""
                    """),format.raw/*48.21*/("""<button><a href=""""),_display_(/*48.39*/routes/*48.45*/.ContentController.postWithAnswers(post.id)),format.raw/*48.88*/("""">Expand</a> </button>
                    </ul>
                </dl>
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
                  SOURCE: app/views/indexVIEW.scala.html
                  HASH: 3bbbdaff19cb8ed086ac9b5517afaddbb4028715
                  MATRIX: 432->1|785->29|920->93|960->106|994->132|1033->134|1064->140|1111->179|1161->192|1196->201|1278->257|1305->264|1365->298|1384->309|1440->345|1468->346|1546->397|1566->408|1624->445|1653->446|1768->534|1783->540|1838->574|2127->836|2161->854|2201->856|2246->873|2362->962|2375->966|2402->972|2495->1038|2508->1042|2534->1047|2563->1048|2657->1115|2670->1119|2696->1124|2790->1191|2803->1195|2829->1200|2925->1269|2938->1273|2965->1279|3061->1348|3074->1352|3114->1371|3252->1482|3321->1542|3361->1544|3418->1573|3463->1591|3478->1597|3533->1631|3563->1633|3660->1703|3675->1709|3732->1745|3810->1792|3859->1813|3904->1831|3919->1837|3983->1880|4098->1964|4139->1977|4180->1988|4216->1997|4259->2010
                  LINES: 17->1|22->2|25->3|28->4|28->4|28->4|29->5|29->5|29->5|30->6|31->7|31->7|33->9|33->9|33->9|33->9|34->10|34->10|34->10|34->10|38->14|38->14|38->14|46->22|46->22|46->22|47->23|49->25|49->25|49->25|52->28|52->28|52->28|52->28|55->31|55->31|55->31|58->34|58->34|58->34|61->37|61->37|61->37|64->40|64->40|64->40|68->44|68->44|68->44|69->45|69->45|69->45|69->45|69->45|70->46|70->46|70->46|71->47|72->48|72->48|72->48|72->48|75->51|76->52|77->53|78->54|80->56
                  -- GENERATED --
              */
          
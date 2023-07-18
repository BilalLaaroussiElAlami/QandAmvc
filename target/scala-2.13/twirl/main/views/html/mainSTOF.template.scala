
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

object mainSTOF extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Session,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
* This template is called from the `index` template. This template
* handles the rendering of the page header and body tags. It takes
* two arguments, a `String` for the title of the page and an `Html`
* object to insert into the body of the page.
*/
  def apply/*7.2*/(title: String, session: Session)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*8.1*/("""


"""),format.raw/*11.1*/("""<!DOCTYPE html>
<html lang="en">

    <head>
        <title>"""),_display_(/*15.17*/title),format.raw/*15.22*/("""</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" media="screen" href='"""),_display_(/*17.54*/routes/*17.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*17.101*/("""'>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
    </head>

    <body>

            <!------ Include the above in your HEAD tag ---------->

        <div class="container-fluid">
                <!-- Second navbar for categories -->
            <nav class="navbar navbar-default">
                <div class="container">
                        <!-- Brand and toggle get grouped for better mobile display -->
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-collapse-1">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a class="navbar-brand" href=""""),_display_(/*38.56*/routes/*38.62*/.HomeControllerSTOF.index),format.raw/*38.87*/("""">ALL POSTS</a>
                    </div>

                        <!-- Collect the nav links, forms, and other content for toggling -->
                    <div class="collapse navbar-collapse" id="navbar-collapse-1">
                        <ul class="nav navbar-nav navbar-right">
                        """),_display_(/*44.26*/if(session.get(models.Global.SESSION_USERNAME_KEY).isEmpty)/*44.85*/ {_display_(Seq[Any](format.raw/*44.87*/("""
                            """),format.raw/*45.29*/("""<li><a href=""""),_display_(/*45.43*/routes/*45.49*/.UserController.showLoginForm),format.raw/*45.78*/("""">Login</a></li>
                        """)))}/*46.27*/else/*46.32*/{_display_(Seq[Any](format.raw/*46.33*/("""
                            """),format.raw/*47.29*/("""<li><a href=""""),_display_(/*47.43*/routes/*47.49*/.AuthenticatedUserController.logout),format.raw/*47.84*/("""">Logout</a></li>
                            <li><a href=""""),_display_(/*48.43*/routes/*48.49*/.PostControllerSTOF.newProduct),format.raw/*48.79*/("""">Add Post</a></li>
                        """)))}),format.raw/*49.26*/("""
                        """),format.raw/*50.25*/("""</ul>

                    </div><!-- /.navbar-collapse -->
                </div><!-- /.container -->
            </nav><!-- /.navbar -->

        </div><!-- /.container-fluid -->
        """),_display_(/*57.10*/content),format.raw/*57.17*/("""
    """),format.raw/*58.5*/("""</body>

</html>"""))
      }
    }
  }

  def render(title:String,session:Session,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,session)(content)

  def f:((String,Session) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,session) => (content) => apply(title,session)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/mainSTOF.scala.html
                  HASH: 0c347334c6e13c994899343cf658a7e9878baa62
                  MATRIX: 994->255|1136->304|1166->307|1254->368|1280->373|1448->514|1463->520|1526->561|2658->1666|2673->1672|2719->1697|3056->2007|3124->2066|3164->2068|3221->2097|3262->2111|3277->2117|3327->2146|3388->2189|3401->2194|3440->2195|3497->2224|3538->2238|3553->2244|3609->2279|3696->2339|3711->2345|3762->2375|3838->2420|3891->2445|4108->2635|4136->2642|4168->2647
                  LINES: 26->7|31->8|34->11|38->15|38->15|40->17|40->17|40->17|61->38|61->38|61->38|67->44|67->44|67->44|68->45|68->45|68->45|68->45|69->46|69->46|69->46|70->47|70->47|70->47|70->47|71->48|71->48|71->48|72->49|73->50|80->57|80->57|81->58
                  -- GENERATED --
              */
          
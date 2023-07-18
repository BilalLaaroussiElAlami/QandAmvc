
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Session,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String, session: Session)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.50*/("""



"""),format.raw/*11.1*/("""<!DOCTYPE html>
<html lang="en">

<head>
    <title>"""),_display_(/*15.13*/title),format.raw/*15.18*/("""</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" media="screen" href='"""),_display_(/*17.50*/routes/*17.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*17.97*/("""'>
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
                    <a class="navbar-brand" href=""""),_display_(/*38.52*/routes/*38.58*/.HomeController.index),format.raw/*38.79*/("""">Home</a>
                </div>

                    <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="navbar-collapse-1">
                    <ul class="nav navbar-nav navbar-right">
                    """),_display_(/*44.22*/if(session.get(models.Global.SESSION_USERNAME_KEY).isEmpty)/*44.81*/ {_display_(Seq[Any](format.raw/*44.83*/("""
                        """),format.raw/*45.25*/("""<li><a href=""""),_display_(/*45.39*/routes/*45.45*/.UserController.showLoginForm),format.raw/*45.74*/("""">Login</a></li>
                    """)))}/*46.23*/else/*46.28*/{_display_(Seq[Any](format.raw/*46.29*/("""
                        """),format.raw/*47.25*/("""<li><a href=""""),_display_(/*47.39*/routes/*47.45*/.AuthenticatedUserController.logout),format.raw/*47.80*/("""">Logout</a></li>
                        <li><a href=""""),_display_(/*48.39*/routes/*48.45*/.ContactPageController.listContacts),format.raw/*48.80*/("""">Contacts</a></li>
                    """)))}),format.raw/*49.22*/("""
                    """),format.raw/*50.21*/("""</ul>

                </div><!-- /.navbar-collapse -->
            </div><!-- /.container -->
        </nav><!-- /.navbar -->

    </div><!-- /.container-fluid -->
    """),_display_(/*57.6*/content),format.raw/*57.13*/("""
"""),format.raw/*58.1*/("""</body>

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
                  SOURCE: app/views/main.scala.html
                  HASH: bd2f2d934476cd7ebe735fb48975fb6adad8e645
                  MATRIX: 1000->266|1143->314|1178->322|1262->379|1288->384|1450->519|1465->525|1527->566|2608->1620|2623->1626|2665->1647|2983->1938|3051->1997|3091->1999|3145->2025|3186->2039|3201->2045|3251->2074|3309->2114|3322->2119|3361->2120|3415->2146|3456->2160|3471->2166|3527->2201|3611->2258|3626->2264|3682->2299|3755->2341|3805->2363|4008->2540|4036->2547|4065->2549
                  LINES: 26->7|31->7|35->11|39->15|39->15|41->17|41->17|41->17|62->38|62->38|62->38|68->44|68->44|68->44|69->45|69->45|69->45|69->45|70->46|70->46|70->46|71->47|71->47|71->47|71->47|72->48|72->48|72->48|73->49|74->50|81->57|81->57|82->58
                  -- GENERATED --
              */
          
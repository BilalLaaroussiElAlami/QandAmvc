
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Session,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(welcome: String)(implicit session: Session):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.46*/("""

  """),_display_(/*3.4*/main(welcome, session)/*3.26*/ {_display_(Seq[Any](format.raw/*3.28*/("""
    """),_display_(/*4.6*/defining(play.core.PlayVersion.current)/*4.45*/ { version =>_display_(Seq[Any](format.raw/*4.58*/("""

      """),format.raw/*6.7*/("""<div id="content" class="wrapper doc">
        <article>
          <h1>"""),_display_(/*8.16*/welcome),format.raw/*8.23*/("""</h1>
          <h2>MVC Pattern in the Play Framework</h2>

          <p>
            This application will introduce you to the Play framework in Scala, which embraces the MVC architecture,
            Code Injection and so much more to build interactive Web Apps.
          </p>

          <h2>How was this page shown?</h2>

          <p>
            The <code>conf/routes</code> file defines a route that tells Play to invoke the <code>
            HomeController.index</code> action
            whenever a browser requests the <code>/</code> URI using the GET method:
          </p>

          <pre><code>
            GET / controllers.HomeController.index</code>
          </pre>

          <p>
            Play has invoked the <code>controllers.HomeController.index</code> method to obtain the <code>
            Action</code> to execute:
          </p>

          <pre><code>
            def welcome = Action """),format.raw/*34.34*/("""{"""),format.raw/*34.35*/("""
            """),format.raw/*35.13*/("""Ok(views.html.index("Welcome to the 7th Software Architectures Lab Session"))
            """),format.raw/*36.13*/("""}"""),format.raw/*36.14*/("""</code>
          </pre>

          <p>
            An action is a function that handles the incoming HTTP request, and returns the HTTP result to send back
            to the web client. Here we send a <code>200 OK</code> response, using a template to fill its content.
          </p>

          <p>
            The template is defined in the <code>app/views/index.scala.html</code>
            file and compiled as a Scala function.
          </p>

          <pre><code>
          @(welcome: String)
            @main(welcome) """),format.raw/*51.29*/("""{"""),format.raw/*51.30*/(""".."""),format.raw/*51.32*/("""}"""),format.raw/*51.33*/("""</code>
          </pre>

          <p>
            The first line of the template defines the function signature. Here it just takes a single
            <code>String</code>parameter.
            This template then calls another function defined in <code>app/views/main.scala.html</code>, which displays
            the HTML layout, and another function that displays this welcome message. You can freely add any HTML
            fragment mixed with Scala code in this file.
          </p>

          <p>You can read more about <a href="https://www.playframework.com/documentation/"""),_display_(/*62.92*/version),format.raw/*62.99*/("""/ScalaTemplates" target="_blank">Twirl</a>,
            the template language used by Play, and how Play handles <a href="https://www.playframework.com/documentation/"""),_display_(/*63.124*/version),format.raw/*63.131*/("""/ScalaActions" target="_blank">
            actions</a>.
          </p>


          <h2>Now, proceed to the Exercise</h2>
          <br>
          <h2>Need more documentation?</h2>
          <p>
            Play documentation is available at <a href="https://www.playframework.com/documentation/2.8.x" target="_blank">
            https://www.playframework.com/documentation</a>.
          </p>
          <h2>Need more info on the console?</h2>

          <p>
            For more information on the various commands you can run on Play, i.e., running tests and packaging a
            pplications for production, see
            <a href="https://playframework.com/documentation/2.8.x/PlayConsole" target="_blank">
              Using the Play console</a>.
          </p>
        </article>
      </div>
    """)))}),format.raw/*85.6*/("""
  """)))}))
      }
    }
  }

  def render(welcome:String,session:Session): play.twirl.api.HtmlFormat.Appendable = apply(welcome)(session)

  def f:((String) => (Session) => play.twirl.api.HtmlFormat.Appendable) = (welcome) => (session) => apply(welcome)(session)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/index.scala.html
                  HASH: ba4b0e3715f08292f2e918e2c1908c274e414066
                  MATRIX: 737->1|876->45|908->52|938->74|977->76|1009->83|1056->122|1106->135|1142->145|1242->219|1269->226|2239->1168|2268->1169|2310->1183|2429->1274|2458->1275|3030->1821|3059->1822|3089->1824|3118->1825|3739->2419|3767->2426|3963->2594|3992->2601|4853->3432
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|29->4|29->4|31->6|33->8|33->8|59->34|59->34|60->35|61->36|61->36|76->51|76->51|76->51|76->51|87->62|87->62|88->63|88->63|110->85
                  -- GENERATED --
              */
          
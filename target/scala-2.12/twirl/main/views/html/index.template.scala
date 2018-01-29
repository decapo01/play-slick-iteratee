
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>Slick Play Iteratees Sample</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*7.54*/routes/*7.60*/.Assets.at("stylesheets/main.css")),format.raw/*7.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*8.59*/routes/*8.65*/.Assets.at("images/favicon.png")),format.raw/*8.97*/("""">
        <script src=""""),_display_(/*9.23*/routes/*9.29*/.Assets.at("javascripts/jquery-1.10.2.min.js")),format.raw/*9.75*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*10.23*/routes/*10.29*/.Assets.at("javascripts/json2.js")),format.raw/*10.63*/("""" type="text/javascript"></script>
    </head>
    <body>
        <!--
          Comet message handler for via a hidden iframe
            see http://www.playframework.com/documentation/2.2.x/ScalaComet
          -->
        <script type="text/javascript">
            // don't try to console.log in htmlunit...
            function logIfConsole(message) """),format.raw/*19.44*/("""{"""),format.raw/*19.45*/("""
                """),format.raw/*20.17*/("""if ( typeof console != "undefined" && console.log ) """),format.raw/*20.69*/("""{"""),format.raw/*20.70*/("""
                    """),format.raw/*21.21*/("""console.log(message);
                """),format.raw/*22.17*/("""}"""),format.raw/*22.18*/("""
            """),format.raw/*23.13*/("""}"""),format.raw/*23.14*/("""

            """),format.raw/*25.13*/("""// this is the callback function for comet messages
            var cometMessage = function(message) """),format.raw/*26.50*/("""{"""),format.raw/*26.51*/("""
                """),format.raw/*27.17*/("""logIfConsole('Received comet message: ' + message);
                $.each(message, function( index, record ) """),format.raw/*28.59*/("""{"""),format.raw/*28.60*/("""
                    """),format.raw/*29.21*/("""logIfConsole(record);
                    $("#items-list ul" ).append('<li><code>' + JSON.stringify(record) + '</code></li>');
                """),format.raw/*31.17*/("""}"""),format.raw/*31.18*/(""");
            """),format.raw/*32.13*/("""}"""),format.raw/*32.14*/("""
        """),format.raw/*33.9*/("""</script>
        <style type="text/css">
            iframe.hidden """),format.raw/*35.27*/("""{"""),format.raw/*35.28*/(""" """),format.raw/*35.29*/("""display:none; """),format.raw/*35.43*/("""}"""),format.raw/*35.44*/("""
        """),format.raw/*36.9*/("""</style>
        <iframe src="/list.comet" width="0" height="0" tabindex="-1" title="empty" class="hidden"></iframe>
        <!-- End of Comet message handling -->

        <div id="items-container">
            <div id="items-title">
                Query to populate list is streamed in chunks of 2...
            </div>
            <div id="items-list">
                <ul>
                    <!-- Comet callback will add items here -->
                </ul>
            </div>
        </div>
    </body>
</html>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Jan 28 21:05:25 CST 2018
                  SOURCE: /home/decapo/apps/play-slick-iteratee/app/views/index.scala.html
                  HASH: 09263ea1373bc841dd975643bf691e3f3e34b051
                  MATRIX: 811->0|1017->180|1031->186|1085->220|1172->281|1186->287|1238->319|1289->344|1303->350|1369->396|1453->453|1468->459|1523->493|1906->848|1935->849|1980->866|2060->918|2089->919|2138->940|2204->978|2233->979|2274->992|2303->993|2345->1007|2474->1108|2503->1109|2548->1126|2686->1236|2715->1237|2764->1258|2935->1401|2964->1402|3007->1417|3036->1418|3072->1427|3168->1495|3197->1496|3226->1497|3268->1511|3297->1512|3333->1521
                  LINES: 26->1|32->7|32->7|32->7|33->8|33->8|33->8|34->9|34->9|34->9|35->10|35->10|35->10|44->19|44->19|45->20|45->20|45->20|46->21|47->22|47->22|48->23|48->23|50->25|51->26|51->26|52->27|53->28|53->28|54->29|56->31|56->31|57->32|57->32|58->33|60->35|60->35|60->35|60->35|60->35|61->36
                  -- GENERATED --
              */
          
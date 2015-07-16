package js.scala.example

import scala.scalajs.js
import scala.scalajs.js.JSApp

import org.scalajs.dom
import scala.scalajs.js.Dynamic.{ global => g, newInstance => jsnew }

object ExampleApp extends JSApp {
  def main(): Unit = {
    var stringFromJS = g.jsVar4ScalaJS
    println(stringFromJS)

    //http://stackoverflow.com/questions/29921144/check-if-call-result-is-undefined
    println(if (js.isUndefined(g.thisVarShouldIsUndefined)) "thisVarShouldIsUndefined => undefined :-("
      else "thisVarShouldIsUndefined OK")

    var reverseStringFromJS = stringFromJS.asInstanceOf[String].reverse
    dom.alert(reverseStringFromJS)
  }
}

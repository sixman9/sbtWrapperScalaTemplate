package js.scala.example

import scala.scalajs.js
import scala.scalajs.js.JSApp

import org.scalajs.dom
import scala.scalajs.js.Dynamic.{ global => g, newInstance => jsnew }

object ExampleApp extends JSApp {
  def main(): Unit = {
    val stringFromJS = g.jsVar4ScalaJS
    println(stringFromJS + " <= This text passed/retrieved/printed by Scala.JS code!")

    //http://stackoverflow.com/questions/29921144/check-if-call-result-is-undefined
    println(if (js.isUndefined(g.thisVarShouldBeUndefined)) "thisVarShouldBeUndefined => undefined :-("
      else "thisVarShouldBeUndefined OK")

    val reverseStringFromJS = stringFromJS.asInstanceOf[String].reverse
    dom.alert(reverseStringFromJS)
  }
}

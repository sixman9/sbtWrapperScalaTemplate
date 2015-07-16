/*** SBT line spacing used historically, only needed 0.13.6 and below */

/*** Enable 'ScalaJSPlugin' and NodeJS support 'scalaJSStage' */

enablePlugins(ScalaJSPlugin)

scalaJSStage in Global := FastOptStage

name := "Scala.js Tutorial"

version := "0.1"

scalaVersion := "2.11.6"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.2" % "test"

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.8.1"

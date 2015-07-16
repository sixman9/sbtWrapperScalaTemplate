/*** Enable Eclipse and Idea project generation */

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "4.0.0")

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.6.0")

/*** Enable ScalaJS cross-compilation */

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.4")

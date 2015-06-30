# Basic Scala-with-SBT-wrapper Project and ScalaTest Support (*nix & Windows)

This is a template for a basic Scala/SBT **project able to download a, project-local, copy of the [SBT][SBT] runtime** itself*. The project also has an example and dependency references for [ScalaTest][ScalaTest] support, the latter within the 'build.sbt' project file.

Grab this project if you want a template/skeleton directory structure for a new project that has the following, e.g.:

* Uses a standard [SBT][SBT] directory structure.
* The [ScalaTest][ScalaTest] dependency is already included, in build.sbt.
* Minimal sample Scala source and test code files are included.
* Just issue 'sbt compile', 'sbt run', or 'sbt test', to get started, straight out of the box!
* SBT version => 1.3.8 (see sbt or sbt.bat to update).

## Checking the project out of Github

Checkout a copy of this project with the following command:

    git clone https://github.com/sixman9/sbtWrapperScalaTemplate.git

## Notes

With thanks and heavily based on [Alvin Alexander's](http://devdaily.com)
[BasicScalaSbtProjectWithScalatest](https://github.com/alvinj/BasicScalaSbtProjectWithScalatest).

SBT Wrapper scripts (sbt/sbt.bat) either written or sourced by [Richard Joseph](mailto:sixman9@gmail-dot-com)

*This means that no system-wide SBT installation is necessary, and SBT is/can be distrubuted along with the project itself, speeding up developement.

### License

This code/project is shared under the terms of the Creative Commons
Attribution-ShareAlike 3.0 Unported License.

See http://creativecommons.org/licenses/by-sa/3.0/ for more information.


#### Need a similar Gradle-based wrapper template? Then head on over to https://github.com/sixman9/gradleWrapperStandalone

[ScalaTest]: http://scalatest.org
[SBT]: http://www.scala-sbt.org

organization := "de.envisia"

name := """twirl-api"""

version := "1.1.1"

scalaVersion := "2.11.8"

lazy val root = project.in(file(".")).enablePlugins(ScalaJSPlugin)

libraryDependencies += "org.scalatest" %%% "scalatest" % "3.0.0-RC4" % "test"

licenses +=("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0"))

bintrayOrganization := Some("envisia")
scalaVersion := "2.13.6"
name := "hacktoberfest-algorithms"
organization := "hacktoberfest"
// We will use Semver for this project
version := "0.11.0"

// libraries
val scalaTestVersion = "3.0.8"
val ammoniteVersion  = "1.7.4"

libraryDependencies += "org.scalatest" %% "scalatest" % scalaTestVersion % "test"
libraryDependencies += "com.lihaoyi"   % "ammonite"   % ammoniteVersion  % "test" cross CrossVersion.full

scalaVersion := "2.13.15"
name         := "scala-chisel-test"
organization := "io.github.zakki0925224"
version      := "1.0"

logLevel := Level.Info

val chiselVersion = "6.6.0"

libraryDependencies ++= Seq(
    "org.chipsalliance" %% "chisel" % chiselVersion
    // "org.scalatest"     %% "scalatest" % "3.2.16" % "test"
)
scalacOptions ++= Seq(
    "-language:reflectiveCalls",
    "-deprecation",
    "-feature",
    "-Xcheckinit",
    "-Ymacro-annotations"
)
addCompilerPlugin("org.chipsalliance" % "chisel-plugin" % chiselVersion cross CrossVersion.full)

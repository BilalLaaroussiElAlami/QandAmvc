ThisBuild / version := "0.0.1"
ThisBuild / scalaVersion := "2.13.10"


lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := "Lab Session 7"
  )

libraryDependencies ++= Seq(
  guice,
  "com.adrianhurt" %% "play-bootstrap" % "1.6.1-P28-B3"
)

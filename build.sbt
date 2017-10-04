name := """play-java"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  javaWs,
  "com.restfb" % "restfb" % "1.6.16",
  "com.github.xuwei-k" % "html2image" % "0.1.0",
  "org.postgresql" % "postgresql" % "9.4-1200-jdbc41")

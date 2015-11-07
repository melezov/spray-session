name := "spray-session"
organization := "org.gnieh"
version := "0.1.1-SNAPSHOT"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "io.spray" %% "spray-json" % "1.3.2" % "optional"
, "io.spray" %% "spray-routing" % "1.3.3"
, "io.spray" %% "spray-testkit" % "1.3.3" % "test"
, "org.specs2" %% "specs2-core" % "3.6.5" % "test"
, "com.typesafe.akka" %% "akka-actor" % "2.4.0" % "provided, test"
, "net.debasishg" %% "redisreact" % "0.8" % "optional"
)

scalacOptions ++= Seq(
  "-deprecation"
, "-encoding", "UTF-8"
, "-feature"
, "-language:implicitConversions"
, "-optimise"
, "-target:jvm-1.6"
, "-unchecked"
, "-Xfatal-warnings"
, "-Xlint"
, "-Xno-forwarders"
, "-Xverify"
, "-Yclosure-elim"
, "-Yconst-opt"
, "-Ydead-code"
, "-Yinline-warnings"
, "-Yinline"
, "-Yrepl-sync"
, "-Ywarn-adapted-args"
, "-Ywarn-dead-code"
, "-Ywarn-inaccessible"
, "-Ywarn-infer-any"
, "-Ywarn-nullary-override"
, "-Ywarn-nullary-unit"
, "-Ywarn-numeric-widen"
, "-Ywarn-unused"
)

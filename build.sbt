name := "akkaHttp"

version := "0.1"

scalaVersion := "2.13.1"

libraryDependencies ++= Seq(

  "com.typesafe.akka" %% "akka-http"   % "10.1.11",

  "com.typesafe.akka" %% "akka-stream" % "2.5.26",

  "org.scalatest" %% "scalatest" % "3.1.0" % "test"

)

name := "auth-plugin"

version := "1.0"

resolvers += "Mesosphere Public Repo" at "http://downloads.mesosphere.io/maven"

libraryDependencies ++= Seq(
  "mesosphere.marathon" %% "plugin-interface" % "1.6.325" % "provided",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.7.2" % "provided"
)

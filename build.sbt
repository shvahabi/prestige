val scala3Version = "3.5.0"

javacOptions ++= Seq("-source", "21", "-target", "21", "-release", "21")
scalacOptions ++= Seq("-source", "3.5", "-java-output-version", "21")

lazy val root = project
  .in(file("."))
  .settings(
    name := "Prestige, a Persistence Layer for Scala",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,

    libraryDependencies ++= Seq(
      "org.scalameta" %% "munit" % "1.0.1" % Test
    )
  )

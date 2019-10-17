import Dependencies._

ThisBuild / scalaVersion     := "2.13.1"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "scala library sample 001",
    libraryDependencies += scalaTest % Test
  )

ThisBuild / description := "Scala sample library."
ThisBuild / licenses := List("Apache 2" -> new URL("http://www.apache.org/licenses/LICENSE-2.0.txt"))
ThisBuild / homepage := Some(url("https://github.com/thachi/scala-library-sample001"))
ThisBuild / scmInfo := Some(
  ScmInfo(
    url("https://github.com/thachi/scala-library-sample001"),
    "scm:git@github.com:thachi/scala-library-sample001.git"
  )
)
ThisBuild / pomIncludeRepository := { _ => false }
ThisBuild / publishTo := Some("github" at "https://maven.pkg.github.com/thachi/scala-library-sample001")
ThisBuild / credentials += Credentials(
  "GitHub Package Registry",
  "maven.pkg.github.com",
  sys.env.getOrElse("GITHUB_USER", throw new Exception("GITHUB_USER not found in environment variables.")),
  sys.env.getOrElse("GITHUB_TOKEN", throw new Exception("GITHUB_TOKEN not found in environment variables."))
)
ThisBuild / publishMavenStyle := true

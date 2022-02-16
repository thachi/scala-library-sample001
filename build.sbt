import Dependencies._
import sbtrelease.ReleaseStateTransformations._

ThisBuild / scalaVersion     := "2.13.1"
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
ThisBuild / publishMavenStyle := true

githubOwner := "thachi"
githubRepository := "scala-library-sample001"
githubTokenSource := TokenSource.Environment("GITHUB_TOKEN")

releaseProcess := Seq[ReleaseStep](
  checkSnapshotDependencies,
  inquireVersions,
  runClean,
  runTest,
  setReleaseVersion,
  commitReleaseVersion,
  tagRelease,
  // publishArtifacts,
  setNextVersion,
  commitNextVersion,
  pushChanges
)
ThisBuild / scalaVersion     := "2.13.6"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "googleTokenGenerator",
    libraryDependencies += "com.google.auth" % "google-auth-library-oauth2-http" % "1.2.2"
  )
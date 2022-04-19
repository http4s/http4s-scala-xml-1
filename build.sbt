// https://typelevel.org/sbt-typelevel/faq.html#what-is-a-base-version-anyway
ThisBuild / tlBaseVersion := "0.0" // your current series x.y

ThisBuild / licenses := Seq(License.Apache2)
ThisBuild / developers := List(
  // your GitHub handle and name
  tlGitHubDev("rossabaker", "Ross A. Baker")
)

// publish website from this branch
ThisBuild / tlSitePublishBranch := Some("main")

val Scala213 = "2.13.8"
ThisBuild / crossScalaVersions := Seq(Scala213, "3.1.2")
ThisBuild / scalaVersion := Scala213 // the default Scala

val http4sVersion = "0.23.11"
val munitCatsEffectVersion = "1.0.7"
val scalaXmlVersion = "2.1.0"

lazy val root = tlCrossRootProject.aggregate(scalaXml1)

lazy val scalaXml1 = project
  .in(file("scala-xml"))
  .settings(
    name := "http4s-scala-xml-1",
    description := "Provides scala-xml-1.x codecs for http4s",
    startYear := Some(2014),
    libraryDependencies ++= Seq(
      "org.http4s" %% "http4s-core" % http4sVersion,
      "org.http4s" %% "http4s-laws" % http4sVersion % Test,
      "org.scala-lang.modules" %% "scala-xml" % scalaXmlVersion,
      "org.typelevel" %% "munit-cats-effect-3" % munitCatsEffectVersion % Test,
    ),
  )

lazy val docs = project.in(file("site")).enablePlugins(TypelevelSitePlugin)

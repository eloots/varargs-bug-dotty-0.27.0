import sbt._

object Version {
  val logbackVer        = "1.2.3"
  val mUnitVer          = "0.7.12"
  val scalaVersion      = "0.27.0-RC1"
//  val scalaVersion      = "0.26.0"
  val log4j             = "2.13.3"
}

object Dependencies {

  private val logbackDeps = Seq (
    "ch.qos.logback"                 %  "logback-classic",
  ).map (_ % Version.logbackVer)

  private val munitDeps = Seq(
    "org.scalameta" %% "munit" % Version.mUnitVer % Test
  )

  private val log4j = Seq(
    "org.apache.logging.log4j" % "log4j-core" % Version.log4j,
    "org.apache.logging.log4j" % "log4j-api" % Version.log4j
  )

  val dependencies: Seq[ModuleID] =
    logbackDeps ++
    munitDeps ++
    log4j
}

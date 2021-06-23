ThisBuild / scalaVersion     := "2.13.6"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "backend"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "backend",
    libraryDependencies ++= Seq(
      "io.getquill" %% "quill-zio" % "3.7.2",
      "io.getquill" %% "quill-jdbc-zio" % "3.7.2",
      "com.h2database" % "h2" % "1.4.200",

      "io.d11" %% "zhttp" % "1.0.0.0-RC17",

      "dev.zio" %% "zio" % "1.0.9",
      "dev.zio" %% "zio-test" % "1.0.9" % Test
    ),
    testFrameworks += new TestFramework("zio.test.sbt.ZTestFramework")
  )

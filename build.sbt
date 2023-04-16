ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.2.1"

lazy val root = (project in file("."))
  .settings(
    name := "test-scala3-graalvm"
  )
  .enablePlugins(GraalVMNativeImagePlugin)
  .settings(
    graalVMNativeImageOptions ++= Seq(
      "-J-Xmx10G",
      "--allow-incomplete-classpath",
      "--install-exit-handlers",
      "--no-fallback"
    )
  )

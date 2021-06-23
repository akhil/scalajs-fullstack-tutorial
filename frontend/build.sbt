ThisBuild / scalaVersion     := "2.13.6"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "frontend"
ThisBuild / organizationName := "example"

enablePlugins(ScalaJSPlugin)

// This is an application with a main method
scalaJSUseMainModuleInitializer := true

// ECMAScript
//scalaJSLinkerConfig ~= { _.withModuleKind(ModuleKind.ESModule) }

// CommonJS
//scalaJSLinkerConfig ~= { _.withModuleKind(ModuleKind.CommonJSModule) }

scalaJSLinkerConfig ~= { _.withSourceMap(false) }

scalaJSUseMainModuleInitializer := true

jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv()

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "1.1.0"

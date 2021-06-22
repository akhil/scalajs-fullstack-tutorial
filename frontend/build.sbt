enablePlugins(ScalaJSPlugin)

name := "Scala.js Tutorial"
scalaVersion := "2.13.6" // or any other Scala version >= 2.11.12

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

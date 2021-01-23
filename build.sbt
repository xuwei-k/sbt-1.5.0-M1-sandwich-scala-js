enablePlugins(ScalaJSPlugin)

scalaVersion := "3.0.0-M3"

scalaJSUseMainModuleInitializer := true

libraryDependencies += "org.scalaz" %%% "scalaz-core" % "7.3.3" cross CrossVersion.for3Use2_13

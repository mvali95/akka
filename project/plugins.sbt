libraryDependencies += Defaults.sbtPluginExtra(
  "com.eed3si9n" % "sbt-assembly" % "0.14.10",
  (sbtBinaryVersion in pluginCrossBuild).value,
  (scalaBinaryVersion in pluginCrossBuild).value)

// these comment markers are for including code into the docs
//#sbt-multi-jvm
addSbtPlugin("com.typesafe.sbt" % "sbt-multi-jvm" % "0.4.0")
//#sbt-multi-jvm

addSbtPlugin("com.lightbend.sbt" % "sbt-java-formatter" % "0.4.4")
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.0.6")
addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.9.7-1")
addSbtPlugin("com.typesafe.sbt" % "sbt-osgi" % "0.9.5")
addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "0.6.1")
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.1.2")
addSbtPlugin("com.eed3si9n" % "sbt-unidoc" % "0.4.2")
addSbtPlugin("com.thoughtworks.sbt-api-mappings" % "sbt-api-mappings" % "3.0.0")
addSbtPlugin("pl.project13.scala" % "sbt-jmh" % "0.3.7")
addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.4.1")
addSbtPlugin("io.spray" % "sbt-boilerplate" % "0.6.1")
addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.4.2")
addSbtPlugin("com.lightbend.akka" % "sbt-paradox-akka" % "0.26")
addSbtPlugin("com.lightbend" % "sbt-whitesource" % "0.1.17")
addSbtPlugin("de.heikoseeberger" % "sbt-header" % "5.2.0") // for maintenance of copyright file header
addSbtPlugin("com.hpe.sbt" % "sbt-pull-request-validator" % "1.0.0")
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.6.0")
addSbtPlugin("net.bzzt" % "sbt-reproducible-builds" % "0.22")

// used for @unidoc directive
libraryDependencies += "io.github.classgraph" % "classgraph" % "4.8.47"

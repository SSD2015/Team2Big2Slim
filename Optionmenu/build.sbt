name := "Optionmenu"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache
)     

libraryDependencies += "org.webjars" % "bootstrap" % "3.3.2-1"

play.Project.playJavaSettings

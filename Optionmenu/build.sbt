name := "Optionmenu"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache
)     

libraryDependencies += "org.webjars" % "bootstrap" % "3.3.2-1"

playAssetsDirectories <+= baseDirectory / "public"

play.Project.playJavaSettings

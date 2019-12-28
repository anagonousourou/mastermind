ThisBuild / organization := "ANAGONOU Patrick"

lazy val hello = (project in file("."))
  .settings(
    name := "Mastermind",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test

  )

  lazy val osName = System.getProperty("os.name") match {

    case n if n.startsWith("Linux") => "linux"
  
    case n if n.startsWith("Mac") => "mac"
  
    case n if n.startsWith("Windows") => "win"
  
    case _ => throw new Exception("Unknown platform!")
  
  }
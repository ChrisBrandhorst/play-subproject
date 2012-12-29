import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "play-multi"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq()

    val sub = play.Project(appName + "-sub", appVersion, path=file("modules/sub")).settings()

    val main = play.Project(appName, appVersion, appDependencies)
      .settings()
      .dependsOn(sub)

}

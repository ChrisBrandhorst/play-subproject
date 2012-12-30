import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "play-multi"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq()

    val sub = PlayProject(appName + "-sub", appVersion, path=file("modules/sub"), mainLang = SCALA).settings()

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA)
      .settings()
      .aggregate(sub)
      .dependsOn(sub)

}

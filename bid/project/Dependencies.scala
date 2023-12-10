import sbt.*

object Dependencies {

  import ProjectLibraries.*

  val carpenterProject: Seq[ModuleID] = Seq(
    zio,
    zioTest           % Test,
    zioTestSbt        % Test,
    zioTestMagnolina  % Test

  )
}

object ProjectLibraries {
  val zio =     "dev.zio"     %% "zio"           % Version.zio
  val zioTest = "dev.zio"     %% "zio-test"      % Version.zio
  val zioTestSbt = "dev.zio"  %% "zio-test-sbt"  % Version.zio
  val zioTestMagnolina = "dev.zio"  %% "zio-test-magnolia"  % Version.zio

}

object Version {
  val zio = "2.0.19"
}
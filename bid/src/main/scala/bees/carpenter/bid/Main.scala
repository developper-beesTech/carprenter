package bees.carpenter.bid

import zio.{ZIO, ZIOAppArgs, ZIOAppDefault}

import java.util.concurrent.{Executor, Executors}

object Main extends ZIOAppDefault:
  //TODO: verify activation of virtual threads with java21
  def run: ZIO[ZIOAppArgs, Any, Any] =
    for
      _ <- ZIO.logInfo(s"Welcome to carpenter bid verifier ${Runtime.getRuntime.availableProcessors()}")
    yield ()



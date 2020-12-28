package com.ryandelap.playground

import cats.effect.{ExitCode, IO, IOApp}

object Playground extends IOApp {
  override def run(args: List[String]): IO[ExitCode] = {
    IO(println("Hello World")).as(ExitCode.Success)
  }
}

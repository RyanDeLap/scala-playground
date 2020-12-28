val catsV = "2.1.1"
val catsEffectV = "2.1.4"
val fs2V = "2.4.2"
val http4sV = "0.21.6"
val circeV = "0.13.0"
val doobieV = "0.8.8"
val log4catsV = "1.0.1"
val pureConfigV = "0.13.0"
val epimetheusV = "0.4.0"
val epimetheusHttp4sV = "0.4.0"
val specs2V = "4.9.4"
val fuuidV = "0.3.0"
val enumeratumV = "1.6.1"

lazy val core =
  project
    .in(file("."))
    .settings(commonSettings)

Global / scalaVersion := "2.12.11"

lazy val commonSettings = Seq(
  addCompilerPlugin("org.typelevel" % "kind-projector"      % "0.11.0" cross CrossVersion.full),
  addCompilerPlugin("com.olegpy"    %% "better-monadic-for" % "0.3.1"),
  libraryDependencies ++= Seq(
    "org.typelevel"         %% "cats-core"                % catsV,
    "org.typelevel"         %% "cats-effect"              % catsEffectV,
    "co.fs2"                %% "fs2-core"                 % fs2V,
    "org.http4s"            %% "http4s-dsl"               % http4sV,
    "org.http4s"            %% "http4s-blaze-server"      % http4sV,
    "org.http4s"            %% "http4s-blaze-client"      % http4sV,
    "org.http4s"            %% "http4s-circe"             % http4sV,
    "org.http4s"            %% "http4s-async-http-client" % http4sV,
    "io.circe"              %% "circe-generic"            % circeV,
    "io.circe"              %% "circe-parser"             % circeV,
    "io.chrisdavenport"     %% "log4cats-slf4j"           % log4catsV,
    "io.chrisdavenport"     %% "epimetheus"               % epimetheusV,
    "io.chrisdavenport"     %% "epimetheus-http4s"        % epimetheusHttp4sV,
    "io.chrisdavenport"     %% "fuuid"                    % fuuidV,
    "io.chrisdavenport"     %% "fuuid-http4s"             % fuuidV,
    "io.chrisdavenport"     %% "fuuid-doobie"             % fuuidV,
    "io.chrisdavenport"     %% "fuuid-circe"              % fuuidV,
    "com.github.pureconfig" %% "pureconfig"               % pureConfigV,
    "com.github.pureconfig" %% "pureconfig-http4s"        % pureConfigV,
    "org.tpolecat"          %% "doobie-core"              % doobieV,
    "org.tpolecat"          %% "doobie-hikari"            % doobieV,
    "org.tpolecat"          %% "doobie-postgres"          % doobieV,
    "org.tpolecat"          %% "doobie-specs2"            % doobieV % Test,
    "org.specs2"            %% "specs2-core"              % specs2V % Test,
    "org.specs2"            %% "specs2-cats"              % specs2V % Test,
    "org.specs2"            %% "specs2-scalacheck"        % specs2V % Test,
    "io.chrisdavenport"     %% "testcontainers-specs2"    % "0.2.0-M2" % Test,
    "com.beachape"          %% "enumeratum"               % enumeratumV,
  )
)
name := "computer-database-sample"

//PlayKeys.playOmnidoc := false

scalaVersion := "2.12.3"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

libraryDependencies ++= Seq(
	guice,
	"com.typesafe.play" %% "play-slick" % "3.0.1",
  "com.typesafe.play" %% "play-slick-evolutions" % "3.0.1",
	"com.h2database"   	%  "h2"                       % "1.4.196",
	"com.typesafe.play" %% "play-iteratees" % "2.6.1",
	"com.typesafe.play" %% "play-iteratees-reactive-streams" % "2.6.1"
)

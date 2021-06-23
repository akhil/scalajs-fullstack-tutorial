
import zio._
import zio.console.putStrLn
import zhttp.http._
import zhttp.service.Server

object Main extends App {
  /*
  override def run(args: List[String]): URIO[zio.ZEnv, ExitCode] =
    putStrLn("Welcome to your first ZIO app!").exitCode
   */

  // Create HTTP route
  val app: HttpApp[Any, Nothing] = HttpApp.collect {
    case Method.GET -> Root / "text" => Response.text("Hello World!")
    case Method.GET -> Root / "json" => Response.jsonString("""{"greetings": "Hello World!"}""")
  }

  override def run(args: List[String]): URIO[zio.ZEnv, ExitCode] =
    Server.start(8090, app).exitCode
}
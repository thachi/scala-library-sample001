package example

object Hello extends Greeting with App {
  println(greeting)
}

trait Greeting {
  lazy val greeting: String = "hello" + BuildInfo.toString
  lazy val greeting2: String = "hello2" + BuildInfo.toString
}

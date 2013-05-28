import scala.actors._
import scala.actors.Actor._

case object Poke
case object Feed

class Kid() extends Actor {
    def act() {
        loop {
            println("new loop")

            react {
                case Poke => {
                    println("Ow...")
                    println("Quit it...")
                }
                case Feed => {
                    println("Gurgle...")
                    println("Burp...")
                }
                case "shit" => {
                    println("shit")
                }
            }

            println("hello world")
        }
    }
}

val bart = new Kid().start
val lisa = new Kid().start
println("Ready to poke and feed...")
bart ! Poke
lisa ! Poke
bart ! "shit"
bart ! Feed
lisa ! Feed

// vim: set ts=4 sw=4 et:

import scala.io.Source

trait Censor {
    val map = Source.fromFile("censor.dat").getLines().map((line) => line.split(" "))

    def censored(content:String):String = {
        var c = content
        map.foreach {(pair) =>
          c = c.replace(pair(0), pair(1))
        }
        c
    }
}

class Foo extends Censor

val s = new Foo
println(s.censored("Shoot me Darn!!!"))

// vim: set ts=4 sw=4 et:

import scala.io._
import scala.actors._
import Actor._

object PageLoader {
    def getPageSize(url: String) = Source.fromURL(url).mkString.length

    def getPageLinks(url: String) = {
        val source = Source.fromURL(url).mkString
        "https?://[^'\"()]*".r.findAllIn(source)
    }
}

val urls = List(
    "http://www.baidu.com/",
    "http://www.youku.com/"
)

def timeMethod(method: () => Unit) = {
    val start = System.nanoTime
    method()
    val end = System.nanoTime
    println("Method took " + (end-start)/1000000000.0 + " seconds.")
}

def getPageSizeSequentially() = {
    for(url <- urls) {
        println("Size for " + url + ": " + PageLoader.getPageSize(url))
    }
}

def getPageSizeConcurrently() = {
    val caller = self

    for(url <- urls) {
        actor { caller ! (url, PageLoader.getPageLinks(url))}
    }

    for(i <- 1 to urls.size) {
        receive {
            case (url, size:Int) =>
              println("Size for " + url + ": " + size)
            case (url, links:scala.util.matching.Regex.MatchIterator) =>
              for(l <- links) { println(l) }
        }
    }
}

println("Sequential run:")
timeMethod { getPageSizeSequentially }

println("Concurrent run:")
timeMethod { getPageSizeConcurrently }

// vim: set ts=4 sw=4 et:

def forLoop {
    println("for loop using Java-style iter")
    for(i <- 0 until args.length) {
        println(args(i))
    }
}

forLoop

def rubyStyleForLoop {
    println("for loop using Ruby-style iter")
    args.foreach { arg =>
        println(arg)
    }
}

rubyStyleForLoop
// vim: set ts=4 sw=4 et:

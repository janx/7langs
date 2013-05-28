class Game(size: Int) {

    val marks = Array('.', 'X', 'O')
    val board = Array.ofDim[Int](size, size)
    val reverseBoard = Array.ofDim[Int](size, size)
    var xMove = true

    def x(i:Int, j:Int) = board(i)(j) = 1
    def o(i:Int, j:Int) = board(i)(j) = 2

    def cols = board
    def rows = reverseBoard
    def diags: Array[Array[Int]] = {
        val a = new Array[Int](size)
        val b = new Array[Int](size)
        for(i <- 0 until size) {
            a(i) = board(i)(i)
            b(i) = board(i)(size-i-1)
        }
        return Array(a, b)
    }

    def fail(line: Array[Int]): Boolean = {
        line.filter(i => i > 0).groupBy(i => i).size > 1
    }

    def isTie: Boolean = {
        return (cols++rows++diags).forall(l => fail(l))
    }

    def winner: String = {
        if(win(1)) return "X"
        if(win(2)) return "O"
        return null
    }

    def win(mark: Int): Boolean = {
        (cols++rows++diags).exists(line =>{
            line.forall(v => v == mark)
        })
    }

    def updateReverseBoard {
        for(i <- 0 until size) {
            for(j <- 0 until size) {
                reverseBoard(i)(j) = board(j)(i)
            }
        }
    }

    def move(i:Int, j:Int) {
        if(xMove) x(i, j) else o(i, j)
        xMove = !xMove
        updateReverseBoard
    }

    def tieOrWin {
        if(isTie) {
            println("Tie!")
            exit(0)
        }

        val w = winner
        if(w == "X" || w == "O") {
            println("The winner is " + w + "!")
            exit(0)
        }
    }

    def renderBoard {
        for(col <- board) {
          for(v <- col) {
              print(marks(v))
          }
          print("\n")
        }
    }

    def start {
        println("Welcome to tic-tac-toe!")

        while( true ) {
            if(xMove)
                println("X move:")
            else
                println("O move:")

            val line = readLine()

            if(line != null) {
                val pos = line.split(',')
                move(pos(0).toInt, pos(1).toInt)
                renderBoard
                tieOrWin
            }
        }
    }
}

val g = new Game(3)
g.start

// vim: set ts=4 sw=4 et:

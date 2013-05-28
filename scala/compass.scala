class Compass {
    val directions = List("north", "east", "south", "west")
    var bearing = 0

    print("Initial bearing: ")
    println(direction)

    def direction() = directions(bearing)

    def inform(turnDirection: String) {
        println("Turning " + turnDirection + ". Now bearing " + direction)
    }

    def turnRight() {
        bearing = (bearing + 1) % directions.size
        inform("right")
    }

    def turnLeft() {
        bearing = (bearing - 1 + directions.size) % directions.size
        inform("left")
    }
}

var myCompass = new Compass

myCompass.turnRight
myCompass.turnRight

myCompass.turnLeft
myCompass.turnLeft
myCompass.turnLeft

// vim: set ts=4 sw=4 et:

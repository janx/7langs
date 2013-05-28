class Person(val name:String)

trait Nice {
    def greet() = println("Howdily doodily.")
}

trait Bad {
    def shit() = println("shit")
}

class Character(override val name: String) extends Person(name) with Nice with Bad

val ned = new Character("Ned")
ned.greet
ned.shit

// vim: set ts=4 sw=4 et:

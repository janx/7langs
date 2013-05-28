class Person(firstName: String) {
    println("Outer constructor")

    def this(firstName: String, lastName: String) {
        this(firstName)
        println("Inner")
    }

    def talk() = println("Hi")
}

println("bob")
val bob = new Person("Bob")
println("bobTate")
val bobTate = new Person("Bob", "Tate")
println("shitTate")
val shitTate = new Person("Shit", "Tate")

// object is used to define singleton
// object with same name of a class is called companion object
object Person {
    def shit = println("class method")
}

Person.shit
// vim: set ts=4 sw=4 et:

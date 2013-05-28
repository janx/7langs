class Person(val name: String) {
    def talk(message: String) = println(name + " says " + message)
    def id(): String = name
}

// You need to specify the complete parameter list for Person, though you can omit the types
// 
// The override keyword, both in the constructor and for any methods you want to extend from
// the base class, is mandatory. This keyword will keep you from inadvertently introducing new
// methods with mis-spellings.
//
// override is like that annotation in java.
class Employee(override val name: String, val number: Int) extends Person(name) {
    override def talk(message: String) {
        println(name + " with number " + number + " says " + message)
    }

    override def id():String = number.toString
}

val employee = new Employee("Yoda", 4)
employee.talk("Extend or extend not. There is no try.")

// vim: set ts=4 sw=4 et:

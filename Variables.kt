// variables
// constants are declared using val
// variables using var -> can change


// we can declare variables outside the main func
// these are called top level var / i guess we can say global vars too
val popcon = 40
var sausage = 30

fun main() {
    val name = "Hussein"
    var age = 23

    // we can change the value of age
    age = 24

    // we cannot change the value of name
//    name = "abc" <- is an error


    // String templates
    println("$name is $age years old")
}





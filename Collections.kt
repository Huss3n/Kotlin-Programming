// has the following collections
// - Lists
// - Sets
// - Maps

// Lists
// - Ordered collection of items
// - allow duplicates


// we have two types in lists
// mutable
// readonly


// readonly list
fun main() {
    val readOnlyList = listOf("bmw", "audi", "mercedes")
    println(readOnlyList)

    // mutable list
    val mutableList = mutableListOf("bmw", "audi", "mercedes")
    println(mutableList)


    // to create a list that cannot be mutated
    val fruits: List<String> = listOf("apple", "orange", "pear")

    // to create a list that can be mutated
    var nums: MutableList<Int> = mutableListOf(20, 30, 40, 50)

    // add item to a mutable list
    nums.add(60)

    print(nums[4])

    val first = nums.first()
    val last = nums.last()

    val numberOfItems = nums.count()

    println(first)
    println(last)
    println(numberOfItems)




    // SETS
    // They are unordered but only store unique items
    // a readonly set
    val readOnlySet: Set<String> = setOf("abc", "efg", "hij")

    val mutableSet: MutableSet<String> = mutableSetOf("chair", "table", "fan")
    mutableSet.add("chair")
    mutableSet.add("book")
    println(mutableSet)

    mutableSet.remove("fan")

    println("chair" in mutableSet) // true



    // MAP
    // Read-only map
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyJuiceMenu)
// {apple=100, kiwi=190, orange=100}

// Mutable map with explicit type declaration
    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(juiceMenu)
// {apple=100, kiwi=190, orange=100}
}

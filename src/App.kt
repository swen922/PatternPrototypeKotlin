
import shape.*

/** Прототип, также известен как: Клон, Prototype */

fun main(args : Array<String>) {
    var c1 = Circle()
    var r1 = Rectangle()

    c1.diameter = 12
    c1.color = "White"

    r1.width = 20
    r1.height = 10
    r1.color = "Black"

    var list1 = mutableListOf(c1, r1)
    var list2 = mutableListOf<Shape>()

    list2.add(c1.cloneShape())
    list2.add(r1.cloneShape())

    for (sh in list1) {
        println(sh)
    }

    println("---")

    for (sh in list2) {
        println(sh)
    }

}
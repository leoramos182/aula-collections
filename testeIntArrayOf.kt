package one.digitalinnovation.collections

fun main() {
    println(LINHA)
    var values = intArrayOf(5,6,1,2,3)
    values.forEach {
        println(it)
    }
    println(LINHA)
    values.sort()
    values.forEach {
        println(it)
    }

}
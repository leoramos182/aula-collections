package one.digitalinnovation.collections

fun main() {
    println(LINHA)
    val values = Array(3){""}
    values[0] = "Luizinho"
    values[1] = "Zezinho"
    values[2] = "Huguinho"
    for(n in values){
        println(n)
    }
    println(LINHA)
    values.sort()
    values.forEach { println(it) }
}
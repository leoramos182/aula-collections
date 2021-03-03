package one.digitalinnovation.collections

fun main() {
    //Função DoubleArray()
    val values = DoubleArray(3)
    values[0] = 6.5
    values[1] = 4.6
    values[2] = 1.8
    //Função doubleArrayOf()
    val values1 = doubleArrayOf(8.0,5.5,1.5)
    println("Array um normal")
    for(valor in values){
        println(valor)
    }
    println("Array um arrumado (sort)")
    values.sort()
    for(valor in values){
        println(valor)
    }
    println(LINHA)
    println("Array dois normal")
    values1.forEach { println(it) }
    values1.sort()
    println("Array dois arrumado (sort)")
    values1.forEach { println(it) }
}
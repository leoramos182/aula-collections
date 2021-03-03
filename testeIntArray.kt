package one.digitalinnovation.collections
const val LINHA = "--------------------"
fun main() {
    val values = IntArray(5)
    values[0] = 3
    values[1] = 5
    values[2] = 0
    values[3] = 1
    values[4] = 2

    for(itens in values){
        println(itens)
    }
    println(LINHA)
    values.forEach {
        println(it)
    }
    println(LINHA)
    for(i in values.indices){
        println(values[i])
    }
    println(LINHA)
    values.sort()
    for(valor in values){
        println(valor)
    }


}
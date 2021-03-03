package one.digitalinnovation.collections

fun main() {
    val pair = Pair("Joao",1500.0)
    val map1 = mapOf(pair)

    map1.forEach { (key, valor) -> println("Chave: $key * Valor: $valor") }

    val map2 = mapOf("Maria" to 1500.0,
                     "Renato" to 5000.0,
                     "John" to 3000.0)
    map2.forEach {(key,valor) -> println("Chave: $key * Valor: $valor") }
}
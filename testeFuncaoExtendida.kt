package one.digitalinnovation.collections

import java.math.BigDecimal

fun main() {
    val salarios = arrayOf("5000".toBigDecimal(),"4500".toBigDecimal())
    val decimal = salarios.decimal() //FUNÇÃO DECIMAL É A NOSSA FUNÇÃO EXTENDIDA
    val media = salarios.media() //FUNÇÃO MEDIA É A NOSSA FUNÇÃO EXTENDIDA
    println(decimal)
    println(LINHA)
    println(media)
}
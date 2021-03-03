package one.digitalinnovation.collections

fun main() {
    val salario = doubleArrayOf(800.0,2500.0,4000.0,8000.0)
    val salarioMaiorQue1000 = salario.filter { it > 1000.0 }
    println(LINHA)
    println("Maior salario: ${salario.maxOrNull()}")
    println("Menor salario: ${salario.minOrNull()}")
    println("Média salarial é de : ${salario.average()}")
    println(LINHA)
    println(salarioMaiorQue1000)
    println(LINHA)
    salarioMaiorQue1000.forEach { println(it) }
    println(LINHA)
    println(salario.count{it in 2000.0 .. 3000.0}) //CONTA QUANTOS SALARIO SAO VERDADEIROS NESTE RANGE (2000 ~ 3000)
    println(LINHA)
    println(salario.find { it == 800.0 }) //BUSCA PELO ARRAY CERTO ITEM
    println(LINHA)
    println(salario.any { it == 800.0 }) //VERIFICA DE HA OU NÃO O ITEM PEDIO E RETORNA UM BOOLEAN

}
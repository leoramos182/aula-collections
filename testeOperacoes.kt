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

}
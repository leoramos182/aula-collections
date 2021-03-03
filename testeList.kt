package one.digitalinnovation.collections

fun main() {
    val funcionario1 = Funcionario("Neto",2000.0)
    val funcionario2 = Funcionario("Gerson",1100.0)
    val funcionario3 = Funcionario("Gionnavi",850.0)

    val listaFuncionarios = listOf(funcionario1,funcionario2,funcionario3)

//    listaFuncionarios.forEach { println(it) }
//    println(LINHA)
//    println(listaFuncionarios.find { it.nome == "Renato da Silva Cariani" })
    listaFuncionarios.sortedBy { it.nome }.forEach { println(it) }
}
data class Funcionario(val nome : String, val salario : Double){
    override fun toString(): String  =
        """
        Nome   : $nome
        Salário: $salario
        -------------------
        """.trimIndent()

}

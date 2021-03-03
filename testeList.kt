package one.digitalinnovation.collections

fun main() {
    val funcionario1 = Funcionario("Joao da Silda Neto",2000.0)
    val funcionario2 = Funcionario("Ricardo Matos Ribeiro",18000.0)
    val funcionario3 = Funcionario("Renato da Silva Cariani",90000.0)

    val listaFuncionarios = listOf(funcionario1,funcionario2,funcionario3)

    listaFuncionarios.forEach { println(it) }
    println(LINHA)
    println(listaFuncionarios.find { it.nome == "Renato da Silva Cariani" })
}
data class Funcionario(val nome : String, val salario : Double){
    override fun toString(): String  =
        """
        Nome   : $nome
        Salário: $salario
        
        """.trimIndent()

}

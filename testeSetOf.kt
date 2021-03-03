package one.digitalinnovation.collections

fun main() {
    val funcionario1 = Funcionario("James",600.0,"CLT")
    val funcionario2 = Funcionario("Maria",2000.0,"CLT")
    val funcionario3 = Funcionario("Renato",8000.0,"PJ")

    val listaFuncionarioClt = setOf(funcionario1,funcionario2)
    val listaFuncionarioPj = setOf(funcionario3)

    //val listaUnion = listaFuncionarioClt.union(listaFuncionarioPj).forEach{println(it)}

    val listaFuncionarios3 = setOf(funcionario1,funcionario2,funcionario3)
    val listaResult = listaFuncionarios3.subtract(listaFuncionarioPj)
    listaResult.forEach { println(it) }
}
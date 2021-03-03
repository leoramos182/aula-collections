package one.digitalinnovation.collections

fun main() {
    val funcionario1 = Funcionario("Neto",2000.0,"CLT")
    val funcionario2 = Funcionario("Gerson",1100.0,"PJ")
    val funcionario3 = Funcionario("Gionnavi",850.0,"CLT")

    //MUTABLE LISTS SÃO DIFERENTES DAS LISTAS PORQUE PODEM SER FEITAS MUDANÇAS EM SUA COMPOSIÇÃO
    val listaFuncionarios = mutableListOf(funcionario1,funcionario2)
    val listaGiovanni = mutableListOf(funcionario2)
    listaFuncionarios.add(funcionario3) //ADICIONA O FUNCIONARIO GIOVANNI NA LISTA
    listaFuncionarios.remove(funcionario1) //REMOVE O FUNCIONARIO NETO DA LISTA
    listaFuncionarios.forEach { println(it) }
}
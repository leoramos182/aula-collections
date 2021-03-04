package one.digitalinnovation.collections

fun main() {
    val funcionario1 = Funcionario("James",600.0,"CLT")
    val funcionario2 = Funcionario("Maria",2000.0,"CLT")
    val funcionario3 = Funcionario("Renato",8000.0,"PJ")

    val funcionarios = Repositorio<Funcionario>()
    funcionarios.create(funcionario1.nome, funcionario1)
    funcionarios.create(funcionario2.nome, funcionario2)
    funcionarios.create(funcionario3.nome, funcionario3)
    //ENCONTRA O USUÁRIO POR UMA ID STRING - NESTE CASO JAMES
    println(funcionarios.findById(funcionario1.nome))
    //REMOVE O USUÁRIO PELO ID STRING
    funcionarios.removeById("Maria")
    //VAI PROCURAR PELA ID 'MARIA' MAS NAO VAI ACHAR POIS FOI REMOVIDA - RESULTANDO EM NULL
    println(funcionarios.findById("Maria"))
    //IMPRIME TODOS OS ELEMENTOS NO MUTABLE MAPS FUNCIONARIOS
    funcionarios.findAll().forEach { println(it) }

    }
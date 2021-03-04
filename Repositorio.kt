package one.digitalinnovation.collections

class Repositorio<T> {
    private var map = mutableMapOf<String,T>()
    fun create(nome: String, values: T){
        map[nome] = values
    }
    fun findById(id : String) = map[id]

}
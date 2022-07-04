package one.digitalinnovation.digionebank

class Pessoa {
    var nome:String = "Ricardo"

    var cpf: String = "123.231.312-12"
    private set
}

fun main() {
    val Ricardo = Pessoa()

    println(Ricardo.nome)
    println(Ricardo.cpf)
}
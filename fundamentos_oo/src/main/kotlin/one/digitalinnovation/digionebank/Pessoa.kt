package one.digitalinnovation.digionebank

class Pessoa {
    var nome:String = "Ricardo"
    var cpf: String = "123.231.312-12"
}

fun main() {
    val Ricardo = Pessoa()

    println(Ricardo.nome)
    println(Ricardo.cpf)
}
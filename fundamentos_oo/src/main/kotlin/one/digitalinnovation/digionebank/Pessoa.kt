package one.digitalinnovation.digionebank

class Pessoa {
    var nome:String = "Ricardo"

    var cpf: String = "123.231.312-12"
    private set

    constructor()

    fun pessoaInfo() = "Nome: $nome  CPF: $cpf"
}

fun main() {
    val Ricardo = Pessoa()

    println(Ricardo.pessoaInfo())
}
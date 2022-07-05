package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
    val ricardo = Pessoa(nome = "Ricardo Augustus", cpf = "12323131212")
    println(ricardo.nome)
    println(ricardo.cpf)

    val sirley = Funcionario("Sirley Silva", "12323131212312", BigDecimal.valueOf(2000.0))
    println(sirley.nome)
    println(sirley.cpf)
    println(sirley.salario)

}
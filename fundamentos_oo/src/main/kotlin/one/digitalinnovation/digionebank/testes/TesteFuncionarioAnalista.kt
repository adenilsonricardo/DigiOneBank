package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
    val sirley = Analista("Sirley Silva", "12323131212312", 2000.0)
    ImprimeRelatorioFuncionario.imprime(sirley)
}
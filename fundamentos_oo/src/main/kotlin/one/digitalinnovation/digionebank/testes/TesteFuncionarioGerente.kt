package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main() {
    val gustavo = Gerente("Gustavo Alcantara", "23131212312123", 10000.0)
    ImprimeRelatorioFuncionario.imprime(gustavo)
}
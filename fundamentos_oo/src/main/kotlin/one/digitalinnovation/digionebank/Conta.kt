package one.digitalinnovation.digionebank

import java.math.BigDecimal

class Conta(
    val agencia: String,
    val numeroConta: String,
    val saldoConta: BigDecimal
) {
    fun deposito(valor: BigDecimal){

    }

    fun saque(valor: BigDecimal){

    }
}
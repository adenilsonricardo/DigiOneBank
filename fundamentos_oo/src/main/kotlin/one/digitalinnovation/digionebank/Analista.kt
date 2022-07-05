package one.digitalinnovation.digionebank

class Analista(
    nome: String,
    cpf: String,
    salario: Double
): Funcionario(nome, cpf, salario) {
    override fun calculoAuxilio(): Double = salario * 0.1
}
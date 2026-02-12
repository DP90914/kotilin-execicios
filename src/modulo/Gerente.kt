package modulo

class Gerente(salario: Int) : Funcionario(salario) {
    override fun mostrarSalario(): Int {
        return salario + salario * 2 / 10
    }
}
package modulo

open class Funcionario(var salario:Int) {
    var nome:String = ""
    open fun mostrarSalario(): Int {
        return salario
    }
}
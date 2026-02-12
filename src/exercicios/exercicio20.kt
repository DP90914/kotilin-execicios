package exercicios

import modulo.Funcionario
import modulo.Gerente

fun main(){
    var funcionario = Funcionario(1_200)
    var gerente = Gerente(funcionario.salario)
    funcionario.nome = "Gustavo"
    println(funcionario.mostrarSalario())
    println(gerente.mostrarSalario())

}
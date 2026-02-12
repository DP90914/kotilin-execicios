package exercicios

import modulo.Pessoa

fun main(){
    var pessoa = Pessoa("Gustavo", 17, "Jandira")
    println("${pessoa.nome} tem ${pessoa.idade} de idade e mora em ${pessoa.cidade} ")
}
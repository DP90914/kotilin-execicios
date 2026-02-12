package exercicios

import modulo.ContaBancaria

fun main(){
    var contaBancaria = ContaBancaria("Gustavo")
    contaBancaria.depositarSaldo(36.00)
    contaBancaria.consultarSaldo()
    contaBancaria.sacarSaldo(16.00)
    contaBancaria.consultarSaldo()
}
package modulo

class ContaBancaria(var nome:String = "") {
    private var saldo:Double = 0.0
    fun sacarSaldo(valor:Double){
        saldo -= valor
    }
    fun depositarSaldo(valor:Double){
        saldo += valor
    }
    fun consultarSaldo(){
        println(saldo)
    }
}
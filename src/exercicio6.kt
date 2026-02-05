fun main(){
    val numeros = arrayOf(123,34234, 4534,12, 12)
    var maiorNumero = 0
    for(numero in numeros){
        if (numero > maiorNumero){
            maiorNumero = numero
        }
    }
    println(maiorNumero)
}
package exercicios

fun main(){
    val numeros = arrayOf(1,1,1,23,523,5,345,3,645,7,5,5,867,9,689,5,63,5,23,1,31,3)
    var valorSoma = 0
    for(numero in numeros){
         if (numero%2==0){
             valorSoma = valorSoma + numero
         }
    }
    println(valorSoma)
}
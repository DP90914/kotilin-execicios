package exercicios

fun main(){
    var numeros = (1..100).toList()
    var impares = numeros.filter { it % 2 == 1 }
    println(impares)
}
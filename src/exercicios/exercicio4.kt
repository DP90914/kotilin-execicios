package exercicios

fun main() {
    val multiplicando: Int = 2
    val tabuada = 1..10
    for (multiplicador in tabuada) {
        println("$multiplicando * $multiplicador = " + multiplicando * multiplicador)
    }
}
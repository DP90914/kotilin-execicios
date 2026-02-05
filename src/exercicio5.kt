fun main(){
    val numeros = arrayOf(1, 2, 3, 4)
    var somaValores = 0
    for (numero in numeros){
        somaValores += numero
    }
    println(somaValores)
}
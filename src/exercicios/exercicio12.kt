package exercicios

fun main(){
    val numeros = (1..100)
    for(numero in numeros){
        if (numero % 3 == 0 && numero % 5 ==0){
            println("BatataQuente")
        }else if (numero % 3 == 0){
            println("batata")
        }else if (numero % 5 == 0){
            println("Quente")
        }else{
            println("frio")
        }
    }
}
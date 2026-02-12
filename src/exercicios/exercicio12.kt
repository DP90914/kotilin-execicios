package exercicios

fun main(){
    val numeros = (1..105)
    for(numero in numeros){
        print("$numero ")
        if (numero % 3 == 0 && numero % 5 ==0){
            println("BatataQuente")
        }else if (numero % 3 == 0){
            println("batata")
        }else if (numero % 5 == 0){
            println("Quente")
        }else{
            println("")
        }
    }
}
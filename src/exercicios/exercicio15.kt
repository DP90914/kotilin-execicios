package exercicios

fun main(){
    val idades = listOf(45, 32, 1, 2, 34, 5, 89, 18, 12, 32, 34, 54)
    val maioresIdade = idades.filter { it >= 18 }
    val somaMaiorIdade = maioresIdade.reduce { idadeSoma, idade -> idadeSoma + idade}
    val mediaMaiorIdade = somaMaiorIdade / maioresIdade.size
    println(mediaMaiorIdade)
}
package exercicios

fun main(){
    var idades = listOf(45, 32, 1, 2, 34, 5, 89, 1, 12, 32, 34, 54)
    var maioresIdade = idades.filter { it > 18 }
    var somaMaiorIdade = maioresIdade.reduce { idadeSoma, idade -> idadeSoma + idade}
    var mediaMaiorIdade = somaMaiorIdade / maioresIdade.size
    println(mediaMaiorIdade)
}
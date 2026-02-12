package exercicios

fun main(){
    var precos = listOf(100, 20, 30, 450, 10)
    var precoTotal = precos.reduce { somaPreco, preco -> somaPreco + preco }
    println("O valor total é de $precoTotal")
}
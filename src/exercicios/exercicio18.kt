package exercicios

import modulo.Produto

fun main() {
    var produrosPrecos = listOf(
        Produto(nome = "ps5", valor = 3_500),
        Produto(nome = "ps6", valor = 9_500),
        Produto(nome = "ps7", valor = 18_500),
        Produto(nome = "ps8", valor = 27_500),
    )
    var maiorProduto = 0
    var nomeMaior = ""
    for (produto in produrosPrecos) {
        if (produto.valor > maiorProduto) {
            maiorProduto = produto.valor
            nomeMaior = produto.nome
        }
    }
    println(nomeMaior)
}
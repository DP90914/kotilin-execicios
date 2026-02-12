package exercicios

import modulo.Produto

fun main() {
    var produrosPrecos = listOf(
        Produto( "ps5",  3_500),
        Produto( "ps6",  9_500),
        Produto( "ps7",  18_500),
        Produto( "ps8",  27_500),
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
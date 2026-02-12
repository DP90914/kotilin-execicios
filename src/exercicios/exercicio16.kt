package exercicios

fun main(){
    var numero: Int = 5
    var soma:Int = 1
    print("$numero! = ")
    while (numero > 0){
        print("$numero ")
        soma *= numero
        numero--
        if (numero!=0){
            print("* ")
        }else{
            print("= $soma")
        }

    }
}
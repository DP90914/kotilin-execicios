fun main(){
    val idade:Int = 12
    if(idade<0){
        println("idade não existente")
    }else if(idade<12){
        println("é uma criança com $idade de idade")
    }else if(idade<18){
        println("é um adolescente com $idade de idade")
    }else if(idade<60){
        println("é um adulto com $idade de idade")
    } else{
        println("é um idoso com $idade de idade")
    }
}
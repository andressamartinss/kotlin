fun main(args: Array<String>){
    val numeros = arrayListOf(1, 2, 3, 4, 5)
    val strings = arrayListOf("RAFAEL", "PEDRO", "LEANDRO", "GUSTAVO")
    val uniao = numeros + strings

    for(item in uniao){
        println(item)
    }
}
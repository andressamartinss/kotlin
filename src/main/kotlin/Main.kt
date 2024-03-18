
data class Aluno (val nome: String, val nota: Double)
fun main (args: Array<String>){
    val alunos = arrayListOf(
        Aluno("Pedro", 7.4),
        Aluno("Arthur", 8.0),
        Aluno("Rafael", 9.7),
        Aluno("Ricardo", 5.7)
    )
    val aprovados = alunos.filter {it.nota > 7.0}.sortedBy {it.nome}
    println(aprovados)
}
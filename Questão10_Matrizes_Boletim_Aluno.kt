fun main() {
    val notas = Array(3) { DoubleArray(2) }

    notas[0][0] = 5.8; notas[0][1] = 6.5
    notas[1][0] = 7.9; notas[1][1] = 8.3
    notas[2][0] = 9.0; notas[2][1] = 8.5

    var somaMediasTurma = 0.0

    for (aluno in notas.indices) {
        var somaNotas = 0.0

        for (nota in notas[aluno]) {
            somaNotas += nota
        }

        val mediaAluno = somaNotas / notas[aluno].size
        somaMediasTurma += mediaAluno

        val situacao = if (mediaAluno >= 7.0) {
            "Aprovado"
        } else {
            "Reprovado"
        }

        println("Aluno ${aluno + 1} | Média: %.2f | Situação: $situacao".format(mediaAluno))
    }

    val mediaGeral = somaMediasTurma / notas.size
    println("\nMédia geral da turma: %.2f".format(mediaGeral))
}
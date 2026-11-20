fun main() {
    val tarefas = arrayOf(
        "Estudar Arrays em Kotlin",
        "Fazer exercícios de Matrizes",
        "Subir projeto no GitHub",
        "Revisar lógica de programação"
    )

    for ((indice, tarefa) in tarefas.withIndex()) {
        println("${indice + 1}. $tarefa")
    }
}
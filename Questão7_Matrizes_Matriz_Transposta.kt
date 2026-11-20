fun main() {
    val original = arrayOf(
        intArrayOf(2, 1, 6),
        intArrayOf(4, 3, 7)
    )

    val transposta = Array(3) { IntArray(2) }

    for (linha in original.indices) {
        for (coluna in original[linha].indices) {
            transposta[coluna][linha] = original[linha][coluna]
        }
    }

    println("=== Matriz Original (2x3) ===")
    for (linha in original) {
        println(linha.contentToString())
    }

    println("\n=== Matriz Transposta (3x2) ===")
    for (linha in transposta) {
        println(linha.contentToString())
    }
}
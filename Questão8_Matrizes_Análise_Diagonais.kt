fun main() {
    val matriz = arrayOf(
        intArrayOf(1, 2, 3, 4),
        intArrayOf(3,2, 1, 1),
        intArrayOf(9, 7, 25, 12),
        intArrayOf(13, 14, 32, 18)
    )

    var somaDiagonal = 0

    println("=== Matriz 4x4 ===")
    for (linha in matriz.indices) {
        for (coluna in matriz[linha].indices) {
            print("${matriz[linha][coluna]}\t")

            if (linha == coluna) {
                somaDiagonal += matriz[linha][coluna]
            }
        }
    }

    println("\nSoma da Diagonal Principal: $somaDiagonal")
}
fun main() {
    val matriz = arrayOf(
        intArrayOf(1, 2, 3, 4),
        intArrayOf(8, 7, 6, 5),
        intArrayOf(11, 13, 14, 16)
    )

    for (linha in matriz.indices) {
        var somaLinha = 0 

        for (coluna in matriz[linha].indices) {
            somaLinha += matriz[linha][coluna]
        }

        println("Soma da linha $linha: $somaLinha")
    }
}
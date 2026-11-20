fun main() {
    val matriz = arrayOf(
        intArrayOf(2, 0, 13),
        intArrayOf(0, -7, 4),
        intArrayOf(11, 25, 0)
    )

    var somaPositivos = 0

    for (linha in matriz.indices) {
        for (coluna in matriz[linha].indices) {
            val valor = matriz[linha][coluna]

            if (valor == 0) {
                continue 
            }

            if (valor > 0) {
                somaPositivos += valor
            }
        }
    }

    println("Soma dos valores maiores que zero: $somaPositivos")
}
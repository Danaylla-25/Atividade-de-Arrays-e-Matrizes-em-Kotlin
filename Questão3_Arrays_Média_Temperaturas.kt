fun main() {
    val temperaturas = doubleArrayOf(34.3, 31.0, 27.5, 33.2, 30.0, 22.8, 32.4)
    var soma = 0.0

    for (temp in temperaturas) {
        soma += temp
    }

    val media = soma / temperaturas.size
    println("Média da semana: %.2f°C".format(media))
    println("Dias (índices) acima da média:")

    for (dia in temperaturas.indices) {
        if (temperaturas[dia] > media) {
            println("Índice $dia -> ${temperaturas[dia]}°C")
        }
    }
}
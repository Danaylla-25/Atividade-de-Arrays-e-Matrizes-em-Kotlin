fun main() {
    val numeros = intArrayOf(10, 20, 30, 40, 50, 60)

    println("Antes:  ${numeros.contentToString()}")

    var inicio = 0
    var fim = numeros.size - 1

    while (inicio < fim) {
        val temp = numeros[inicio]

        numeros[inicio] = numeros[fim]

        numeros[fim] = temp

        inicio++
        fim--
    }

    println("Depois: ${numeros.contentToString()}")
}
fun main() {
    val codigos = arrayOf("AD-101", "AD-299", "AD-325", "AD-413", "AD-520")
    val codigoBuscado = "AD-325"

    for (indice in codigos.indices) {
        if (codigos[indice] == codigoBuscado) {
            println("Código $codigoBuscado encontrado na posição (índice): $indice")
            break
        }
    }
}
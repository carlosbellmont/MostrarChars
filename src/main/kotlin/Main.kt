fun main() {
    mostrarChars(10000)
}

fun mostrarChars(numChars : Int) {
    repeat(numChars) {
        print(it.toChar())
        if (it % 10 == 0) {
            println()
        }
    }
}
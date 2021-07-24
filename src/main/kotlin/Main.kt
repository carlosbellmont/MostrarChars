fun main() {
    mostrarChars(10000)
}

fun mostrarChars(numChars : Int) {
    var i = 0
    repeat(numChars) {
        print(i.toChar())
        i++
        if (i % 10 == 0) {
            println()
        }
    }
}
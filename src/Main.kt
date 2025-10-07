fun main() {
    println("Введите строку:")
    val input = readLine()!!

    var result = ""
    var i = 0

    while (i < input.length) {
        val currentChar = input[i]
        var count = 1

        while (i + count < input.length && input[i + count] == currentChar) {
            count++//считаем повторы
        }

        result += if (count > 1) "$currentChar$count" else "$currentChar"//если повторов больше 1 ставим цифру
        i += count
    }


    println("Результат: $result")
}
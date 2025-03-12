/*[DESAFIO] Faça um programa que mostre os 10 primeiros elementos
da Sequência de Fibonacci:
1 1 2 3 5 8 13 21...
 */

 fun main() {
    val fibonacci = mutableListOf(1, 1)
    repeat(8) { fibonacci.add(fibonacci[it] + fibonacci[it + 1]) }
    println("Fibonacci: ${fibonacci.joinToString()}")
}
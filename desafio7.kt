/*[DESAFIO] Desenvolva um programa que leia o primeiro termo e a
razão de uma PA (Progressão Aritmética), mostrando na tela os 10
primeiros elementos da PA e a soma entre todos os valores da
sequência.*/

fun main() {
    print("Primeiro termo: ")
    val primeiro = readLine()!!.toInt()
    print("Razão: ")
    val razao = readLine()!!.toInt()

    val pa = List(10) { primeiro + it * razao }
    println("PA: ${pa.joinToString()}")
    println("Soma: ${pa.sum()}")
}
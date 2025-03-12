/**
 * [DESAFIO] Crie um jogo onde o computador vai sortear um número
entre 1 e 5 o jogador vai tentar descobrir qual foi o valor
sorteado.
 */
import kotlin.random.Random

fun main() {
    
    val numero = Random.nextInt(1, 6)

    println("O numero sorteado é entre 1 e 5, tenta adivinhar qual foi:")

    val tentativa = readLine()!!.toInt()

    if (tentativa == numero) {
        println("Você acertou, o numero sorteado foi $numero")
    } 
    
    else {
        println("Você errou! O numero sorteado foi $numero")
    }
}
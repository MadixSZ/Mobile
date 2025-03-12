/**
 *[DESAFIO] Vamos melhorar o jogo que fizemos no exercício
32. A partir de agora, o computador vai sortear um número entre
1 e 10 e o jogador vai ter 4 tentativas para tentar acertar.
 */
import kotlin.random.Random

fun main() {
    
    val numero = Random.nextInt(1, 11)

    println("O numero sorteado está entre 1 e 10, tente adivinhar qual foi, você tem 4 chances:")

    var tentativas = 4

    while (tentativas > 0) {
    println("Tentativa $tentativas: Tente adivinhar o numero:")
        
        val tentativa = readLine()!!.toInt()

        if (tentativa == numero) {
            println("Parabéns! Você acertou o numero, que é $numero")
            return
        } 
        
        else {
            tentativas--
            println("Você errou! Agora sobraram $tentativas tentativas")
        }
    }

    println("Você não conseguiu! O número sorteado foi $numero")
}
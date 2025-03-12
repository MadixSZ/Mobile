/**
 * [DESAFIO] Crie um jogo de JoKenPo (Pedra-Papel-Tesoura)
 */
import kotlin.random.Random

fun main() {
    println("Escolha a sua jogada")
    println("1 - Pedra")
    println("2 - Papel")
    println("3 - Tesoura")
    
    val suaJogada = readLine()!!.toInt()
    
    val jogadaCPU = Random.nextInt(1, 4)
    
    println("A jogada da CPU foi: ${when (jogadaCPU) {
        1 -> "Pedra"
        2 -> "Papel"
        3 -> "Tesoura"
        else -> "Opção Inválida"
    }}")
    
    if (suaJogada == jogadaCPU) {
        println("Empate")
    } 
		else if ((suaJogada == 1 && jogadaCPU == 3) || 
				(suaJogada == 2 && jogadaCPU == 1) || 
                (suaJogada == 3 && jogadaCPU == 2)) {
			println("Você venceu")
   		} 
		else {
			println("A CPU venceu")
		}
}
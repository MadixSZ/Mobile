/*/[DESAFIO] Crie uma lógica que preencha um vetor de 20 posições
com números aleatórios (entre 0 e 99) gerados pelo computador.
Logo em seguida, mostre os números gerados e depois coloque o
vetor em ordem crescente, mostrando no final os valores ordenados.
 */

 import kotlin.random.Random

 fun main() {
     val numeros = List(20) { Random.nextInt(0, 100) }
     println("Os numeros gerados foram: ${numeros.joinToString()}")
 
     val ordenados = numeros.sorted()
     println("Em ordem: ${ordenados.joinToString()}")
 }
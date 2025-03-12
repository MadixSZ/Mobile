/*• [DESAFIO] Desenvolva um aplicativo que tenha um procedimento
chamado Fibonacci() que recebe um único valor inteiro como
parâmetro, indicando quantos termos da sequência serão mostrados
na tela. O seu procedimento deve receber esse valor e mostrar a
quantidade de elementos solicitados.
Obs: Use os exercícios 70 e 75 para te ajudar
na solução Ex:
Fibonacci(5) vai gerar 1 >> 1 >> 2 >> 3 >> 5 >> FIM
Fibonacci(9) vai gerar 1 >> 1 >> 2 >> 3 >> 5 >> 8 >> 13 >> 21 >> 34
>> FIM
 */

 fun main() {
    print("Quantos termos da sequência de Fibonacci quer ver? ")
    val n = readLine()!!.toInt()

    val sequencia = mutableListOf(1, 1)
    repeat(n - 2) { sequencia.add(sequencia[it] + sequencia[it + 1]) }

    println("Fibonacci: ${sequencia.joinToString(" >> ")} >> FIM")
}
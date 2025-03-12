/* [DESAFIO] Crie um programa que leia o tamanho de três segmentos
de reta. Analise seus comprimentos e diga se é possível formar um
triângulo com essas retas. Matematicamente, para três segmentos
formarem um triângulo, o comprimento
 */
fun main() {
    
    println("Digite o comprimento da primera reta:")
    val reta1 = readLine()!!.toDouble()
    
    println("Digite o comprimento da segunda reta:")
    val reta2 = readLine()!!.toDouble()
    
    println("Digite o comprimento da terceira reta:")
    val reta3 = readLine()!!.toDouble()
    
    if (reta1 + reta2 > reta3 && reta1 + reta3 > reta2 && reta2 + reta3 > reta1) {
        println("Você consegue formar o triangulo com essas retas")
    } 
    
    else {
        println("Você não consegue formar o triangulo com essas retas")
    }
}
}
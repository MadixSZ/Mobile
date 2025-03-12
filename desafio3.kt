/**
 * [DESAFIO] Refaça o algoritmo 25, acrescentando o recurso de
mostrar que tipo de triângulo será formado:
* EQUILÁTERO: todos os lados iguais
* ISÓSCELES: dois lados iguais
* ESCALENO: todos os lados diferentes
 */
fun main() {
    
    println("Digite o comprimento da primera reta:")
    val reta1 = readLine()!!.toDouble()
    
    println("Digite o comprimento da segunda reta:")
    val reta2 = readLine()!!.toDouble()
    
    println("Digite o comprimento da terceira reta:")
    val reta3 = readLine()!!.toDouble()
    
	if (reta1 + reta2 > reta3 && reta1 + reta3 > reta2 && reta2 + reta3 > reta1) {
		println("Você consegue formar um triângulo com essas retas.")
        
		if (reta1 == reta2 && reta2 == reta3) {
			println("O triângulo vai ser EQUILÁTERO.")
   		} 
    
		else if (reta1 == reta2 || reta1 == reta3 || reta2 == reta3) {
			println("O triângulo vai ser ISÓSCELES.")
        } 
        	else {
            	println("O triângulo vai ser ESCALENO.")
        	}
    } 
    		else {
        		println("Você não consegue formar um triângulo com essas retas.")
    		}
	}
/**
 * [DESAFIO] Escreva um programa para calcular a redução do tempo
de vida de um fumante. Pergunte a quantidade de cigarros fumados
por dias e quantos anos ele já fumou. Considere que um fumante

perde 10 min de vida a cada cigarro. Calcule quantos dias de vida
um fumante perderá e exiba o total em dias.
 */
 
fun main() {
    
    println("Quantos cigarros você fuma por dia?")
    var cigarrosDias = readLine()!!.toInt()
    
    println("Faz quantos anos que você fuma?")
    var anosFumando = readLine()!!.toInt()
    
    // Total de cigarros fumados ao longo dos anos
    var morreuAteAgr = cigarrosDias * (anosFumando * 365 + anosFumando / 4)
    
    // Total de minutos perdidos
    var minutosMorte = morreuAteAgr * 10
    
    // Converter minutos perdidos para dias
    var morreEm = minutosMorte / 1440
    
    println("Parabéns!!! Ao fumar $cigarrosDias cigarros por dia, você perde $minutosMorte minutos de vida.")
    
    println("Considerando que você fuma há $anosFumando anos, você já perdeu $morreEm dias da sua vida. Continue assim!")
}
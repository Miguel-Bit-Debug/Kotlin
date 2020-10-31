fun main() {
    println("Bem vindo ao bytebank")
    val titular: String = "Miguel"
    val numeroConta: Int = 1000
    var saldo: Double = 0.0

    saldo = 100 + 2.0
    saldo += 200
    saldo -= 1000.0

    println("Titular: $titular")
    println("Número da conta $numeroConta")
    println("Saldo da conta $saldo")

    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é neutra")
        saldo < 0.0 -> println("Conta é negativa")
        else -> println("Erro interno")

        
    }

}
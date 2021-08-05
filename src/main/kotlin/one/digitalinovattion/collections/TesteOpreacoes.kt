package one.digitalinovattion.collections

fun main(){
    val salarios = doubleArrayOf(10.00, 5000.00, 989.00, 3000.00)

    for (salario in salarios){
        println(salario)
   }
    println("-------------------")
    println("Maior salario:  ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Media salarial: ${salarios.average()}")

    val salariosMaiorQue2500 = salarios.filter {
        it > 2500.00
    }

    println("-------------------")
    salariosMaiorQue2500.forEach {
        println("Salarios maiores que 2500: ${it}")
    }

    println("-------------------")
    println(salarios.count { it in 2000.00..5000.00 })

    println("-------------------")
    println(salarios.find { it == 3000.00 })

    println("-------------------")
    println(salarios.any { it == 10.00 })
    println(salarios.any { it == 100.00 })
}


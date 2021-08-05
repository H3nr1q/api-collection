package one.digitalinovattion.collections

fun main(){
    val salarios = DoubleArray(3)
    salarios[0] = 10000.00
    salarios[1] = 6000.00
    salarios[2] = 9000.00

    salarios.forEach {
        println(it)
    }

    println("------------------")

    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1

    }
    salarios.forEach {
        println(it)
    }

    println("------------------")

    val salarios2 = doubleArrayOf(1500.00, 1250.00, 500.00)
    salarios2.sort()
    salarios2.forEach {
        println(it)
    }

}
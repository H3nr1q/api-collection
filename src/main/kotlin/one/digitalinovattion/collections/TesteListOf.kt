package one.digitalinovattion.collections

fun main(){
    val joao = funcionario("João", 3500.00, "CLT")
    val maria = funcionario("Maria", 2500.00,"CLT")
    val jose = funcionario("Jose", 5000.00, "PJ")

    val funcionario = listOf(joao, jose, maria)

    funcionario.forEach {
        println(it)
    }

    println(funcionario.find { it.nome == "Maria" })

    println("----------------------")
    funcionario
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("----------------------")
    funcionario
        .groupBy { it.tipoContrato }
        .forEach { println(it) }


}


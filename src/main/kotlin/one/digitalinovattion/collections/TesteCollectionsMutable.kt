package one.digitalinovattion.collections

fun main(){
    val joao = funcionario("João", 3500.00, "CLT")
    val maria = funcionario("Maria", 2500.00,"CLT")
    val jose = funcionario("Jose", 5000.00, "PJ")

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach {
        println(it)
    }
    println("---------LIST--------------")
    funcionarios.add(jose)
    funcionarios.forEach { println(it) }


    println("-----------------------")
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println("-----------SET -------------")
    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach { println(it) }

    println("-----------------------")
    funcionarioSet.add(jose)
    funcionarioSet.add(maria)

    funcionarioSet.forEach { println(it) }

    println("-----------------------")
    funcionarioSet.remove(maria)
    funcionarioSet.forEach { println(it) }

}

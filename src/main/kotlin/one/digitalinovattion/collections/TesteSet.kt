package one.digitalinovattion.collections

fun main(){
    val joao = funcionario("João", 3500.00, "CLT")
    val maria = funcionario("Maria", 2500.00,"CLT")
    val jose = funcionario("Jose", 5000.00, "PJ")

    val funcionario1 = setOf(joao, jose)
    val funcioanrio2 = setOf(maria)

    val resultFusion = funcionario1.union(funcioanrio2)
    resultFusion.forEach { println(it) }

    println("-------------------------")
    val funcionario3 = setOf(joao, maria, jose)
    val resultSubtract = funcionario3.subtract(funcioanrio2)
    resultSubtract.forEach { println(it) }

    println("-------------------------")
    val resultIntersect = funcionario3.intersect(funcioanrio2)
    resultIntersect.forEach { println(it) }


}



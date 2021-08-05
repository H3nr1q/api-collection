package one.digitalinovattion.collections

fun main(){
    val nomes = Array(5){""}
    nomes[0] = "Maria"
    nomes[1] = "Eduarda"
    nomes[2] = "Clara"
    nomes[3] = "Jose"
    nomes[4] = "Henrique"

    for (nome in nomes){
        println(nome)
    }
    println("-----------------------")
    nomes.sort()
    nomes.forEach {
        println(it)
    }

    println("-----------------------")

    val  nomes2 = arrayOf("ZAZA", "Duda", "Clara")
    nomes2.sort()
    nomes2.forEach {
        println(it)
    }

    println("-----------------------")


}


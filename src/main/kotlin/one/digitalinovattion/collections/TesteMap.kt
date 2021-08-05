package one.digitalinovattion.collections

fun main(){
    val pair: Pair<String, Double> = Pair("João", 1000.00)
    val map1 = mapOf(pair)

    map1.forEach { t, u -> println("chave:  $t - Valor: $u")  }

    val map2 = mapOf("Pedro" to 2500.00, "Maria" to 3000.00)
    map2.forEach { t, u -> println("chave:  $t - Valor: $u")  }
}
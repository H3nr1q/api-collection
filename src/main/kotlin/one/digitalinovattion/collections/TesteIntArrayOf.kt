package one.digitalinovattion.collections

fun main(){
    val values = intArrayOf(9,7,5,3,1,12,15,25,60)

    values.forEach {
        println(it)
    }

    println("-------------------")
    values.sort()
    values.forEach {
        println(it)
    }
}

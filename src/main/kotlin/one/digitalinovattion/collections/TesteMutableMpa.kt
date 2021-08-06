package one.digitalinovattion.collections

fun main(){
    val joao = funcionario("João", 3500.00, "CLT")
    val maria = funcionario("Maria", 2500.00,"CLT")
    val jose = funcionario("Jose", 5000.00, "PJ")

    val repositorio = Repositorio<funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(maria.nome, maria)
    repositorio.create(jose.nome, jose)

    println(repositorio.findById(joao.nome))

    println("-----------------------------")
    repositorio.findAll().forEach { println(it) }


    println("-----------------------------")
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach { println(it) }
}

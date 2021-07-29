package banco.testes

import banco.Analista
import banco.Funcionario
import banco.Gerente


fun main() {
    //val p1 = Pessoa("Quissanga", "123")

    val f1 = Analista("Judson Paiva", "123.123-11", 3000000.0)
    val f2 = Gerente ("Leonor José", "123.123-11", 3000000.0)



    println(imprimirRelatorio(f1) + "\n\n")
    println(imprimirRelatorio(f2))

}

fun imprimirRelatorio(f: Funcionario): String = f.toString()
// Código original
// Enunciado:
//Ler um número inteiro e imprimi-lo.
//prog lea5
//int num;
//imprima "\n entre com um numero: ";
//leia num;
//imprima "\nnumero ", num;
//imprima "\n";
//fimprog

// Código em Kotlin

fun main() {
    print("\n Entre com um número: ")
    val num = readln().toInt()

    print("\nNúmero $num")
    println()
}
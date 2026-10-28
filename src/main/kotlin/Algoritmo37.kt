// Código original
// Enunciado:
//Ler dois números inteiros e imprimir o produto.
//
//prog lea10
//int num1, num2, prod;
//imprima "\n entre com um numero: ";
//leia num1;
//imprima "\n entre com outro numero: ";
//leia num2;
//prod <- num1 * num2;
//imprima "\nproduto: ", prod;
//imprima "\n";
//fimprog

// Código em Kotlin

fun main() {
    print("\nEntre com um número: ")
    val num1 = readln().trim().toInt()

    print("\nEntre com outro número: ")
    val num2 = readln().trim().toInt()

    val prod = num1 * num2

    println("\nProduto: $prod")
}
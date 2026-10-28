// Código original
// Enunciado:
//Ler dois números inteiros e imprimi-los.
//prog lea6
//int num1, num2;
//imprima "\n entre com um numero: ";
//leia num1;
//imprima "\n entre com outro numero: ";
//leia num2;
//imprima "\nnumero 1 : ", num1;
//imprima "\nnumero 2 : ", num2;
//imprima "\n";
//fimprog

// Código original

fun main() {
    print("\nEntre com um número: ")
    val num1 = readln().trim().toInt()

    print("\nEntre com outro número: ")
    val num2 = readln().trim().toInt()

    println("\nNúmero 1: $num1")
    println("Número 2: $num2")
}
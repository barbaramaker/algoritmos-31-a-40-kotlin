// Código original
// Enunciado:
//Ler dois números inteiros e imprimir a soma.
//Antes do resultado, deverá aparecer a mensagem: Soma.
//
//prog lea9
//int num1, num2, soma;
//imprima "\n entre com um numero: ":
//leia num1;
//imprima "\n entre com outro numero: ";
//leia num2;
//soma <- num1 + num2;
//imprima " \nSoma: ", soma;
//imprima "\n";
//fimprog

// Código em Kotlin

fun main() {
    print("\nEntre com um número: ")
    val num1 = readln().trim().toInt()

    print("\nEntre com outro número: ")
    val num2 = readln().trim().toInt()

    val soma = num1 + num2

    println("\nSoma: $soma")
}
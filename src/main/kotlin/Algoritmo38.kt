// Código original
// Enunciado:
//Ler um número real e imprimir a terça parte deste número.
//
//prog lea11
//real num;
//imprima "\nentre com um numero com ponto: ";
//leia num;
//imprima "\na terça parte e: " num/3;
//imprima "\n";
//fimprog

// Código em Kotlin

fun main() {
    print("\nEntre com um número com ponto: ")
    val num = readln().trim().toDouble()

    println("\nA terça parte é: ${num / 3}")
}
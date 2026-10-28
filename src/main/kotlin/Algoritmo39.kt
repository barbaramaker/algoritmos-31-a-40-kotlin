// Código original
// Enunciado:
//Entrar com dois números reais e imprimir a média aritmética
//com a mensagem "média" antes do resultado.
//
//prog lea12
//real nota1, nota2, media;
//imprima "\ndigite 1a nota: ";
//leia nota1;
//imprima "\ndigite 2a nota: ";
//leia nota2;
//media <- ( notal + nota2)/2;
//imprima "\nmedia: ", media;
//imprima "\n";
//fimprog

// Código em Kotlin

fun main() {
    print("\nDigite a 1ª nota: ")
    val nota1 = readln().trim().toDouble()

    print("\nDigite a 2ª nota: ")
    val nota2 = readln().trim().toDouble()

    val media = (nota1 + nota2) / 2

    println("\nMédia: $media")
}
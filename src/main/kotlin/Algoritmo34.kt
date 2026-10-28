// Código original
// Enunciado:
//Ler um número inteiro e imprimir seu sucessor e seu antecessor.
//prog lea7
//int numero, suc, ant;
//imprima "\n entre com um numero: ";
//leia numero;
//ant <- numero -1;
//suc <- numero +l;
//imprima "\no sucessor e b", suc,"b o antecessor e b", ant;
//imprima "\n";
//fimprog

// Código em Kotlin

fun main() {
    print("\nEntre com um número: ")
    val numero = readln().trim().toInt()

    val ant = numero - 1
    val suc = numero + 1

    println("\nO sucessor é $suc e o antecessor é $ant")
}
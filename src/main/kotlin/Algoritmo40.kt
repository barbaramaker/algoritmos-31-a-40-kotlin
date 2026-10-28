// Código original
// Enunciado:
//Entrar com dois números inteiros e imprimir a seguinte saída:
//dividendo:
//divisor:
//quociente:
//resto:
//
//prog lea13
//int quoc, rest, val1, val2 ;
//imprima "\nentre com o dividendo: ";
//leia val1;
//imprima "\nentre com divisor: ";
//leia val2;
//quoc <- val1 div val2;
//rest <- val1 % val2;
//imprima "\n\n\n";
//imprima "\ndividendo val1;
//imprima "\ndivisor val2;
//imprima "\nquociente quoc;
//imprima "\nresto rest;
//imprima "\n";
//fimprog

// Código em Kotlin

fun main() {
    print("\nEntre com o dividendo: ")
    val val1 = readln().trim().toInt()

    print("\nEntre com o divisor: ")
    val val2 = readln().trim().toInt()

    if (val2 != 0) {
        val quoc = val1 / val2
        val rest = val1 % val2

        print("\n\n\n")

        println("\nDividendo: $val1")
        println("Divisor: $val2")
        println("Quociente: $quoc")
        println("Resto: $rest")
    } else {
        println("\nNão é possível dividir por zero.")
    }
}
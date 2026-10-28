// Código original
// Enunciado:
//Ler nome, endereço e telefone e imprimi-los.
//prog lea8
//string nome, endereco, telefone;
//imprima "\nentre com nome: ";
//leia nome;
//imprima "\nentre com endereco: ":
//leia endereco;
//imprima "\nentre com telefone: ":
//leia telefone;
//imprima "\n\n\n";
//imprima "\nNome:  ",nome;
//imprima "\nEndereco:  ",endereco;
//imprima "\nTelefone: ",telefone;
//imprima "\n";
//fimprog

// Código em Kotlin

fun main() {
    print("\nEntre com nome: ")
    val nome = readln()

    print("\nEntre com endereço: ")
    val endereco = readln()

    print("\nEntre com telefone: ")
    val telefone = readln()

    print("\n\n\n")
    println("\nNome: $nome")
    println("Endereço: $endereco")
    println("Telefone: $telefone")
}
package oo.encapsulamento;

public class PessoaTeste {

    static void main() {

        Pessoa p1 = new Pessoa("Joao", -21);
        p1.setIdade(18); // Aterar

        Pessoa p2 = new Pessoa("Helena", 19);

        System.out.println(p1.getIdade()); // Ler
        System.out.println(p1); // Ler
        System.out.println(p2); // Ler
    }
}

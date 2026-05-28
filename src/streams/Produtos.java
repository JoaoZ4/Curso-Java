package streams;

public class Produtos {
    String nome;
    double preco;
    double desconto;
    boolean fretegratis;

    Produtos(String nome, double preco, double desconto, boolean frete){
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
        this.fretegratis = frete;
    }
}

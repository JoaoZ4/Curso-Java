package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

    static void main() {
        Consumer<Produto> imprimirNome = p -> System.out.println(p.nome + "!!!");
        // O consumer recebe 1 parametro e nao retorna nada, void...

        Produto p1 = new Produto("Caneta", 12.74, 0.09);
        Produto p2 = new Produto("Notebook", 2987.99, 0.25);
        Produto p3 = new Produto("Caderno", 19.90, 0.03);
        Produto p4 = new Produto("Borracha", 7.8, 0.18);
        Produto p5 = new Produto("Lápis", 4.39, 0.19);

        imprimirNome.accept(p1); // A função para chamar o consumer é .accept

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

        produtos.forEach(imprimirNome);
        produtos.forEach(produto -> System.out.println(produto.nome));
        produtos.forEach(System.out::println);
    }
}

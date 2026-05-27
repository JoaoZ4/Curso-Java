package lambdas;

import java.util.function.Predicate;

public class Predicado {

    public static void main(String[] args) {

        // Predicado recebe um parametro e retorna verdadeiro ou falso
        Predicate<Produto> isCaro = prod -> (prod.preco * (1-prod.desconto)) >= 750;

        Produto produto = new Produto("Notebook", 3893.89, 0.15); // Nesse caso, recebe um produto e ve se ele é caro
        System.out.println(isCaro.test(produto)); // .test é uma função ja criada pelo java.util
    }
}

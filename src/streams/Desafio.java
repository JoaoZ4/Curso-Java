package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Desafio {

    static void main() {
        Produtos p1 = new Produtos("Caneta", 2.34, 0.3, false);
        Produtos p2 = new Produtos("Lápis", 1.2, 0.0, true);
        Produtos p3 = new Produtos("Estojo", 15.99, 0.5, true);
        Produtos p4 = new Produtos("Borracha", 7.43, 0.4, false);

        List<Produtos> prods = Arrays.asList(p1, p2, p3, p4);

        Predicate<Produtos> desconto30Mais = n -> n.desconto >= 0.3;
        Predicate<Produtos> freteGratis = n -> n.fretegratis;
        Function<Produtos, String> tratamento = n -> "Nome: " + n.nome + " | Preco: " + n.preco + " | Desconto: " + n.desconto;

        prods.stream()
                .filter(desconto30Mais)
                .filter(freteGratis)
                .map(tratamento)
                .forEach(System.out::println);
    }

}

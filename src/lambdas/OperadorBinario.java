package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

    static void main() {

        BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;

        System.out.println(media.apply(4.0, 6.7));

        BiFunction<Double, Double, String> resultado = (n1, n2) -> ((n1 + n2) / 2) >= 7 ? "Aprovado!" : "Reprovado!";
        // A bifunction da pra declarar o tipo do primeiro, do segundo e o tipo de retorno
        System.out.println(resultado.apply(9.7, 4.1));

        Function<Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(media.andThen(conceito).apply(6.0, 5.0));
    }
}

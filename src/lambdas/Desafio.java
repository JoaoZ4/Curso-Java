package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

    static void main() {

        Produto p = new Produto("iPad", 3235.89, 0.13);

        /*
         * 1. A partir do produto calcular o preco real (com desconto)
         * 2. Imposto Municipal: >= 2500 (8,5%)/ < 2500 (Isento)
         * 3. Frete: >= 3000 (100)/ < 3000 (50)
         * 4. Arredondar: Deixar duas casas decimais
         * 5. Formatar: R$1234,56
         */

        Function<Produto, Double> precoFinal = (n1) -> (n1.preco * (1 - n1.desconto));
        UnaryOperator<Double> imposto = n1 -> n1 >= 2500 ? n1 * 1.085 : n1;
        UnaryOperator<Double> frete = n1 -> n1 >= 3000 ? n1 + 100 : n1 + 50;
        UnaryOperator<Double> arredondar = n1 -> Math.round(n1 * 100.0) / 100.0; // Outro jeito de fazer: Double.parseDouble(String.format("%.2f", n1));
        Function<Double, String> formatar = n1 -> ("R$" + n1).replace('.', ',');

        String preco = precoFinal
                .andThen(imposto)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p);

        System.out.println("O preço final do produto fica em: " + preco);
    }
}

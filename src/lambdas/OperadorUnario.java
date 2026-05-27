package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

    static void main() {

        UnaryOperator<Integer> maisDois = n -> n + 2;
        UnaryOperator<Integer> vezesDois = n -> n * 2;
        UnaryOperator<Integer> aoQuadrado = n -> n * n;

        System.out.println(maisDois.andThen(vezesDois).andThen(vezesDois).apply(2));

        System.out.println(aoQuadrado.compose(vezesDois).compose(maisDois).apply(0));
        // O compose faz os dados serem lidos ao contrario, entao nesse caso, primeiro adiciona mais 2
        // e depois faz vezes dois e depois ao quadrado

    }
}

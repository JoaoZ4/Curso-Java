package lambdas;

import java.util.function.Function;

public class Funcao {

    static void main() {

        Function<Integer, String> parOuImpar = // Esse < Integer, String> quer dizer que vai receber como parametro um INT e retornar uma String, ou seja
                                               // temos que declarar o que vai entrar e o que vai sair
                numero -> numero % 2 == 0 ? "Par" : "Impar"; // Essa é a Lambda

        System.out.println(parOuImpar.apply(32)); //Pra ativar a função, utiliza-se o .apply

        Function<String, String> oResultadoE = valor -> "O resultado é: " + valor;

        Function<String, String> empolgado = valor -> valor + "!!!"; // Isso poderia ser um operador unario, visto que a entrada possui o mesmo tipo da saida

        Function<String, String> duvida = valor -> valor + "???";

        String resultadoFinal1 =
                parOuImpar
                .andThen(oResultadoE)
                .andThen(empolgado)
                .apply(32);

        System.out.println(resultadoFinal1);

        String resultadoFinal2 = parOuImpar.andThen(oResultadoE).andThen(duvida).apply(12);
        System.out.println(resultadoFinal2);
    }
}

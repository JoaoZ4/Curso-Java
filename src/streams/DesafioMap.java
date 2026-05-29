package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

    static void main() {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        /*
         * 1. Número para string binária... 6 => "110"
         * 2. Inverter a string... "110" => "011"
         * 3. Converter de volta para inteiro... "011" => 3
         */

        Function<Integer, String> stringBinaria = Integer::toBinaryString;

        UnaryOperator<String> inverter = texto -> {
            StringBuilder invertida = new StringBuilder();
            for (int i = texto.length() - 1; i >= 0; i--) {
                invertida.append(texto.charAt(i));
            } // Dava pra fazer assim: UnaryOperator<String> inverter = s-> new
              // StringBuilder(s).reverse().toString();
            return invertida.toString();
        };

        Function<String, Integer> binarioParaInt = n -> Integer.parseInt(n, 2);

        System.out.println("Binarios:");
        nums.stream()
                .map(stringBinaria)
                .forEach(System.out::println);

        System.out.println("\n\nInvertidos:");
        nums.stream()
                .map(stringBinaria)
                .map(inverter)
                .forEach(System.out::println);

        System.out.println("\n\nInt denovo:");
        nums.stream()
                .map(stringBinaria)
                .map(inverter)
                .map(binarioParaInt)
                .forEach(System.out::println);
    }
}

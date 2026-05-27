package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

    static void main() {

        Consumer<String> print = System.out::print;
        Consumer<Integer> println = System.out::println;

        Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
        langs.forEach(print);

        String[] maisLangs = {"Python ", "Lisp ", "Perl ", "Go\n"}; //Array
        Stream.of(maisLangs).forEach(print);
        Arrays.stream(maisLangs).forEach(print);
        Arrays.stream(maisLangs, 1, 3).forEach(print);

        List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");

        outrasLangs.stream().forEach(print);
        outrasLangs.parallelStream().forEach(print);

//        Stream.generate(() -> "a").forEach(print); // Isso vai gerar aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa infinitamente
//        Stream.iterate(0, n -> n + 1).forEach(println); // Esse vai gerar numeros que vao incrementando de 1 e 1 a partir do 0 até o infinito
    }
}

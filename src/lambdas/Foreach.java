package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");

        System.out.println("Forma Tradicional...");
        for(String nome: aprovados){
            System.out.println(nome);
        }

        System.out.println("\nLambda #01...");
        aprovados.forEach(nome2 -> {System.out.println(nome2 + "!!!");});

        System.out.println("\nMethod Reference #01...");
        aprovados.forEach(System.out::println);

        System.out.println("\nLambda #02...");
        aprovados.forEach(nome2 -> meuImprimir(nome2));

        System.out.println("\nMethod Reference #02...");
        aprovados.forEach(Foreach::meuImprimir);
    }
    static void meuImprimir(String nome){
        System.out.println("Olá, meu nome é " + nome);
    }
}

package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {

    public static void main(String[] args) {

        Predicate<Integer> isPar = num -> num % 2 == 0;
        Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;

        // Recebe um parametro e retorna boolean

        // Para executar, .test

        System.out.println(isPar.test(5));
        System.out.println(isPar.test(12));
        System.out.println(isTresDigitos.test(128));
        System.out.println(isTresDigitos.test(12));

        System.out.println(isPar.and(isTresDigitos).negate().test(122));
        System.out.println(isPar.or(isTresDigitos).test(123));
    }
}

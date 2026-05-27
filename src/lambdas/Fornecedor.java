package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

    static void main() {

        Supplier<List<String>> umLista = () -> Arrays.asList("Ana", "Bia", "Lia", "Gui");
        // Suplier não recebe nada como parametro e retorna algo, nesse caso uma Lista de Strings
        System.out.println(umLista.get());
    }
}

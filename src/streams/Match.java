package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

    static void main() {
        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Luna", 6.1);
        Aluno a3 = new Aluno("Gui", 8.1);
        Aluno a4 = new Aluno("Gabi", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;

        System.out.println(alunos.stream().allMatch(aprovado)); // .allMatch, verifica se todos os itens dentro de uma lista ou mapa, estao dentro de uma condição
        System.out.println(alunos.stream().anyMatch(aprovado)); // .anyMatch, verifica se algum dos itens, foi aprovado
        System.out.println(alunos.stream().noneMatch(aprovado)); // .noneMatch, verifica se nenhum dos itens foi aprovado
    }
}

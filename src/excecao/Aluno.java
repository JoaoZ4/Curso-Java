package excecao;

import java.util.Objects;

public class Aluno {

    public String nome;
    public double nota;

    public Aluno(String nome, double nota){
        this.nome = nome;
        this.nota = nota;
    }

    public String toString() {
        return nome + " tem nota " + nota;
    }

    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Double.compare(nota, aluno.nota) == 0 && Objects.equals(nome, aluno.nome);
    }

    public int hashCode() {
        return Objects.hash(nome, nota);
    }
}

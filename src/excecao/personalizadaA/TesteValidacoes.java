package excecao.personalizadaA;

import excecao.Aluno;

public class TesteValidacoes {

    static void main() {

        try{
            Aluno aluno = new Aluno("Ana",  10);
            Validar.aluno(aluno);
            Validar.aluno(null);
        } catch (StringVaziaException e) {
            System.out.println(e.getMessage());
        } catch (NumeroForaIntervaloException | IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Fim :)");
    }
}

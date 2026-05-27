package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		System.out.print("Insira a quantidade de alunos: ");
		int qtdAlunos = teclado.nextInt();

		System.out.print("Insira a quantidade de notas: ");
		int qtdNotas = teclado.nextInt();
		
		double notasDaTurma[][] = new double[qtdAlunos][qtdNotas];
		double notaTotal = 0;
		for(int a = 0; a < qtdAlunos; a++) {
			for(int n = 0; n < qtdNotas; n++) {
				System.out.printf("Insira a %d nota do %d aluno: ", n+1, a+1);
				notasDaTurma[a][n] = teclado.nextDouble();
				notaTotal += notasDaTurma[a][n];
			}
		}
		
		double media = notaTotal / (qtdAlunos * qtdNotas);
		
		System.out.printf("A media da turma é de %.2f pontos!", media);
		
		for(double notaAluno[]: notasDaTurma) {
			System.out.println(Arrays.toString(notaAluno));
		}
		
		teclado.close();
	}
}

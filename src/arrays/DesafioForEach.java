package arrays;

import java.util.Scanner;

public class DesafioForEach {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Quantas notas quer informar: ");
		int qtdNotas = teclado.nextInt();
		
		double notas[] = new double[qtdNotas];
		
		for(int i = 0; i < qtdNotas; i++) {
			System.out.printf("Insira o valor para a nota %d: ", i + 1);
			notas[i] = teclado.nextDouble();
		}
		double soma = 0;
		for(double nota: notas) {
			soma += nota;
		}
		double media = soma/qtdNotas;
		
		System.out.printf("A média desse aluno foi de %.2f pontos!", media);

		teclado.close();
	}
}

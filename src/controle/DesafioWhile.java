package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double total = 0;
		int contador = 0;
		double nota = 0;
		
		while (nota != -1) {
			System.out.print("Insira uma nota (-1 para sair): ");
			nota = teclado.nextDouble();
			if ((nota > 10 || nota < 0) && nota != -1) {
				System.out.println("Nota inválida!");
			} else if(nota != -1){
				total += nota;
				contador++;
			}
		}
		double media = total / contador;
		
		System.out.printf("A media geral da turma com %d alunos ficou em %.2f pontos!", contador, media);

		teclado.close();
	}
}

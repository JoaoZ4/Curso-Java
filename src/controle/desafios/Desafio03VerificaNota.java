package controle.desafios;

import java.util.Scanner;

public class Desafio03VerificaNota {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Insira sua primeira nota? ");
		int nota1 = teclado.nextInt();
		System.out.print("Insira sua segunda nota? ");
		int nota2 = teclado.nextInt();
		
		double media = (nota1 + nota2) / 2.0;
		
		if (media >= 7) {
			System.out.println("Aprovado");
		}
		else if (media >= 4) {
			System.out.println("Recuperação");
		}
		else {
			System.out.println("Reprovado");
		}

		teclado.close();
	}
}

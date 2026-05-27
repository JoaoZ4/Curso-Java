package controle.desafios;

import java.util.Scanner;

public class Desafio05Advinhacao {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int numero = 29;
		int chance = 0;
		
		System.out.println("Tente acertar um numero aleatório entre 0 e 100");
		
		for (int i = 10; i != 0; i--) {
			System.out.print("Tentativas restantes " + i + ": ");
			int tentativa = teclado.nextInt();
			chance++;
			
			if (tentativa == numero) {
				System.out.printf("Voce acertou! Foram necessárias %d tentativas!", chance);
				break;
			} else if (tentativa < numero) {
				System.out.println("Voce errou! É mais pra cima!");
			} else {
				System.out.println("Voce errou! É mais pra baixo!");
			}
		}
		teclado.close();
	}
}

package controle.desafios;

import java.util.Scanner;

public class Desafio07Maior {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int maior = 0;
		
		System.out.println("Insira 10 numeros e te direi qual é o maior!");
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Numero "+ (i+1) + ": ");
			int num = teclado.nextInt();
			
			if (i == 0) {
				maior = num;
			} else {
				if (num > maior) {
					maior = num;
				}
			}
		}
		
		System.out.println("O maior numero foi o: " + maior);

		teclado.close();
	}
}

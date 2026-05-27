package controle.desafios;

import java.util.Scanner;

public class Desafio04Primos {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite um numero: ");
		int numero = teclado.nextInt();
		
		boolean primo = true;
		
		if (numero <= 1) {
			primo = false;
		}
		
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				primo = false;
			}
		}

		System.out.println(primo ? "É primo!" : "Não é primo!");
		
		teclado.close();
	}
}

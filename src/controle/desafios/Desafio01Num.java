package controle.desafios;

import java.util.Scanner;

public class Desafio01Num {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Insira um numero: ");
		int num = teclado.nextInt();
		
		if ((num > 0 && num < 10) && num % 2 == 0) {
			System.out.println("O numero esta entre 0 e 10 e é par.");
		} else {
			System.out.println("O numero nao esta entre 0 e 10 ou nao é par, ou ambos!");
		}

		teclado.close();
	}
}

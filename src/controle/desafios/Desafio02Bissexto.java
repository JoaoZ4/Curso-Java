package controle.desafios;

import java.util.Scanner;

public class Desafio02Bissexto {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Informe o ano atual: ");
		int ano = teclado.nextInt();
		
		if (ano % 4 == 0) {
			System.out.println("Esse ano é bissexto!");
		} else {
			System.out.println("Esse ano não é bissexto!");
		}
		
		teclado.close();
		
	}
}

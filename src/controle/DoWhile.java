package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		// if (...) sentença; ou {}
		// while (...) sentença; ou {}
		// for (...; ...; ...) sentença; ou {}
		
		// do {} while (...);
		
		Scanner teclado = new Scanner(System.in);

		String texto = "";
		
		do {
			System.out.println("Voce precisa falar as palavras magicas...");
			System.out.print("Quer sair? ");
			texto = teclado.nextLine();
		} while(!texto.equalsIgnoreCase("por favor"));

		teclado.close();
	}
}

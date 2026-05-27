package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Diga um dia da semana: ");
		String dia = entrada.next();
		
		if ("Domingo".equals(dia)) {
			System.out.println("O dia inserido é o primeiro dia da semana.");
		} else if ("Segunda".equals(dia)) {
			System.out.println("O dia inserido é o segundo dia da semana.");
		} else if ("Terça".equals(dia)) {
			System.out.println("O dia inserido é o terceiro dia da semana.");
		} else if ("Quarta".equals(dia)) {
			System.out.println("O dia inserido é o quarto dia da semana.");
		} else if ("Quinta".equals(dia)) {
			System.out.println("O dia inserido é o quinto dia da semana.");
		} else if ("Sexta".equals(dia)) {
			System.out.println("O dia inserido é o sexto dia da semana.");
		} else if ("Sabado".equals(dia)) {
			System.out.println("O dia inserido é o setimo dia da semana.");
		} else {
			System.out.println("Dia invalido!");
		}
		
		entrada.close();
	}
}

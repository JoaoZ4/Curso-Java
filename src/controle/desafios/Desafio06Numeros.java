package controle.desafios;

import java.util.Scanner;

public class Desafio06Numeros {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int total = 0;
		
		int num = 0;		
		while(num >= 0) {
			System.out.print("Insira um numero qualquer, caso seja negativo, o programa se encerra: ");
			num = teclado.nextInt();
			if (num < 0) {
				break;
			} else {
				total += num;
				System.out.println("Total acumulado: " + total);
			}
		}

		teclado.close();
	}
}

package fundamentos.desafios;

import java.util.Scanner;

public class Desafio01FahParaCel {
	public static void main(String[] main) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira uma temperatura em fahrenheit: ");
		double fahrenheit = entrada.nextDouble();
		
		double calc = (5.0 / 9.0) * (fahrenheit - 32);
		
		System.out.printf("A temperatura que inseriu %.1f° em fahrenheit, convertida em celcius e de %.1f graus Celcius.", fahrenheit, calc);
		
		entrada.close();
		
	}
}

package fundamentos.desafios;

import java.util.Scanner;

public class Desafio04Operacoes {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira algum valor inteiro: ");
		
		double valor = entrada.nextDouble();
		
		double quadrado = Math.pow(valor, 2);
		
		double cubo = Math.pow(valor, 3);
		
		System.out.printf("O valor inserido %.1f ao quadrado é %.1f e ao cubo é %.1f", valor, quadrado, cubo);
		
		entrada.close();
	}
}

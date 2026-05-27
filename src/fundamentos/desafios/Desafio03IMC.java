package fundamentos.desafios;

import java.util.Scanner;

public class Desafio03IMC {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira o seu peso: ");
		double peso = entrada.nextDouble();
		System.out.print("Insira a sua altura: ");
		double altura = entrada.nextDouble();
		
		double imc = peso / (altura * altura);
		
		System.out.printf("O seu IMC esta em %.2f", imc);
		
		entrada.close();
	}
}

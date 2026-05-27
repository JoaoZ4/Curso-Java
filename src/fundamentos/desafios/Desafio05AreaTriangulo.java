package fundamentos.desafios;

import java.util.Scanner;

public class Desafio05AreaTriangulo {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira o valor da base de um triangulo: ");
		double base = entrada.nextDouble();
		System.out.print("Insira o valor da altura de um triangulo: ");
		double altura = entrada.nextDouble();
		
		double area = base * (altura / 2.0);
		
		System.out.printf("A area do triangulo de base %.1f e altura %.1f e de %.1f", base, altura, area);
		
		
		entrada.close();
	}
}

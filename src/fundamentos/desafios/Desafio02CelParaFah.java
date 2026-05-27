package fundamentos.desafios;

import java.util.Scanner;

public class Desafio02CelParaFah {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira uma temperatura em graus Celsius: ");
		double celcius = entrada.nextDouble();
		
		double calc = (celcius * 1.8) + 32.0;
		
		System.out.printf("A temperatura %.1f° Celsius, convertida em fahrenheit é de %.1f° Fahrenheit.", celcius, calc);
		
		entrada.close();
	}
}

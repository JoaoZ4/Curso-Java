package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira o primeiro numero: ");
		double num1 = entrada.nextDouble();
		System.out.print("Insira o segundo numero: ");
		double num2 = entrada.nextDouble();
		System.out.print("Agora insira a operação que deseja realizar (+ - * / %): ");
		String operacao = entrada.next();
		
		double resultado = "+".equals(operacao) ? num1 + num2 : "-".equals(operacao) ? num1 - num2 : "*".equals(operacao) ? num1 * num2 : "/".equals(operacao) ? num1 / num2 : num1 % num2;
		
		System.out.println("O resultado da operacao que escolheu é: " + resultado);
		
		entrada.close();
	}
}

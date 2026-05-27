package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia!\n\n");
											// O print nao pula linha, o println pula
		System.out.println("Bom"); 
		System.out.println("dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d\n", 1, 2, 3, 4, 5, 6); // Printf print formatado
		
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("O seu nome é %s e seu sobrenome é %s e sua idade é %d", nome, sobrenome, idade);
		
		entrada.close();
	}
}

package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite o seu primeiro salario: ");
		String str1 = teclado.nextLine();
		System.out.print("Digite o seu segundo salario: ");
		String str2 = teclado.nextLine();
		System.out.print("Digite o seu terceiro salario: ");
		String str3 = teclado.nextLine();
		
		str1 = str1.replace(",", ".");
		str2 = str2.replace(",", ".");
		str3 = str3.replace(",", ".");
		
		double num1 = Double.parseDouble(str1);
		double num2 = Double.parseDouble(str2);
		double num3 = Double.parseDouble(str3);
		
		double media = (num1 + num2 + num3) / 3;
		
		System.out.printf("A media de salario do funcionario é de R$%.2f", media);
		teclado.close();
	}
}

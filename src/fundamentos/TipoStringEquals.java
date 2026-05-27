package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[]  args) {
		System.out.println("2" == "2");
		
		String s = new String("2");
		System.out.println("2" == s);
		System.out.println("2".equals(s));
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next();
		System.out.println("2" == s2.trim()); // esse trim é o strip do python, retira os espaços do começo e final da string
		System.out.println("2".equals(s2.trim()));
		// Resumo, quando for comparar strings, nao usar o == e sim o .equals, que olha pro conteudo da string.
		
		entrada.close();
	}
}

package fundamentos.operadores;

public class Unarios {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		a++;
		a--;
		
		++b; // é igual o de cima, porem com ordem de precedencia maior
		--b;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini Desafio...");
		System.out.println(++a == b--);  // isso retornara true, pois o ++a possui ordem de precedencia maior, entao ira executar antes
		// a ordem de execução do computador será: ++a, depois ele verifica se a == b e depois faz b--
		
		System.out.println(a);
		System.out.println(b);
	}
}

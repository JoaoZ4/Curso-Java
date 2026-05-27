package arrays;

public class ForEach {

	public static void main(String[] args) {
		
		double notas[] = { 9.9, 8.7, 7.2, 9.4};
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + " "); // Esse é o for normal, com o indice subindo a cada vez que o for executa
		}
		System.out.println();
		
		for(double nota: notas) { // Esse é basicamente aquele for do python, (for nota in notas:) ele acessa o item dentro do array a cada execução
			System.out.print(nota + " "); 
		}
	}
}

package fundamentos.operadores;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		double bloco1 = Math.pow((6 * (3 + 2)), 2) / (3 * 2);
		double bloco2 = Math.pow(((1-5) * (2 - 7))/ 2, 2);
		
		double juncao = Math.pow((bloco1 - bloco2), 3);
		double divisao = juncao / (Math.pow(10, 3));

		System.out.println(divisao);
		
	}
}

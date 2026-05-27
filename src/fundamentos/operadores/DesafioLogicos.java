package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean sorvetin = trabalho1 || trabalho2;
		boolean nosorvete = !sorvetin; // Operador unário
		
		System.out.println("" + comprouTV50 + comprouTV32 + sorvetin + nosorvete);
	}
}

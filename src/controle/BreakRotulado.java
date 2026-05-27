package controle;

public class BreakRotulado {
	
	public static void main(String[] args) {
	
		externo: for (int i = 0; i < 3; i++) { // Esse externo é um rotulo que estamos dando para o loop for
			for (int j = 0; j < 3; j++) {
				if (i == 1) {
					break externo; // Nao é muito aconselhavel de se usar pois é mais dificil de ler
				}
				System.out.printf("[%d %d] ", i, j);
			}
			System.out.println("");
		}
		System.out.println("Fim!");
	}
}

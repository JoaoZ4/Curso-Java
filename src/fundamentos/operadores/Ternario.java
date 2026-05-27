package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		double media = 7.6;
		
		String resultadoParcial = media >= 5 ? "de recuperação" : "reprovado.";
		String resultadoFinal = media >= 7 ? "aprovado." : resultadoParcial;
		// Esse é o if else inline do java, se a media for maior, resultado é "Aprovado", se nao "Recuperação"
		
		System.out.println("O aluno esta " + resultadoFinal);
		
		
		double nota = 9.9;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim" : "Nao";
		
		System.out.println("Tem desconto? " + resultado);
	}
}

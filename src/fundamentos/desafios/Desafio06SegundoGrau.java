package fundamentos.desafios;

public class Desafio06SegundoGrau {
	public static void main(String[] args) {
		int a = 1;
		int b = 12;
		int c = -13;
		
		double delta = Math.pow(b,  2) - 4 * a * c;
		double bhaskara1 = (-b + Math.sqrt(delta)) / (2 * a);
		double bhaskara2 = (-b - Math.sqrt(delta)) / (2 * a);
		System.out.printf("As raízes da equação %dx² + %dx + %d sao %.1f e %.1f e o delta é %.1f", a, b, c, bhaskara1, bhaskara2, delta);
		
	}
}

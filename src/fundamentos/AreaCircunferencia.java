package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		double raio = 3;
		final double PI = 3.14159; // esse final transforma a variavel em constante, e como convenção/boas praticas, deixamos a variavel somente em letras maiusculas
		double area = PI * (raio * raio);
		System.out.println(area);
	}

}
package fundamentos;

public class temperatura {
	public static void main(String[] args) {
		final double FATOR = 5.0/9.0;
		final int AJUSTE = 32;
		
		double fahrenheit = 86;
		double celcius = (fahrenheit - AJUSTE) * FATOR;
		
		System.out.println("O reultado é " + celcius);
		
	}
}

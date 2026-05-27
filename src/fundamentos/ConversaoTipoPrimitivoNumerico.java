package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		
		// A conversão de valores implicita ocorre quando nao há chance nenhuma de se perder dados no ato da conversao, como de int para long.
		
		float b = (float) 1.123456789; // isso é o cast, uma conversão de valores explicita (eu estou forçando essa converção ocorrer)
		                               // e podem ocorrer problemas, como nesse caso, o java truncou o dado pois nao cabia mais dentro do float
		System.out.println(b);
		
		int c = 4;
		// isso nao daria pois precisamos explicitamente converter o c em byte: byte d = c;
		byte d = (byte) c; // CAST
		System.out.println(d);
		
		
		double e = 1.99999; // CAST
		int f = (int) e;
		System.out.println(f);
	}
}

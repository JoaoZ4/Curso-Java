package classe.desafiodomodulo;

public class Jantar {
	public static void main(String[] args) {
		Comida c1 = new Comida("Feijao", 0.22);

		Comida c2 = new Comida("Arroz", 0.3);
		
		Pessoa p1 = new Pessoa("Joao", 74.4);
		
		Pessoa p2 = new Pessoa("Helena", 55.2);
		
		System.out.println(p1.Comer(c1));
		System.out.println(p2.Comer(c2));
	}
}

package classe.desafiodomodulo;

public class Pessoa {
	String nome;
	double peso;
	
	Pessoa(){}
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	String Comer(Comida comida) {
		double atual = this.peso;
		this.peso += comida.peso;
		return String.format("O peso do(a) %s antes de comer %s era de %.2fKg. Após comer, ficou com %.2f", this.nome, comida.nome, atual, this.peso);
	}
}

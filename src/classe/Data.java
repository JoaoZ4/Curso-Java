package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	Data(){
		//dia = 1;
		//mes = 1;
		//ano = 1970;
		
		this(1, 1, 1970); // O this() nesse caso serve como um metodo construtor, passando como parametro os dados ja pré-definidos, igual estava antes.
	}
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes; // this. serve para dizer que queremos o mes, da instancia, nao do atributo
		this.ano = ano;
	}
	
	String obterDataFormatada(){
		String dataFormatada = "%d/%d/%d";
		return String.format(dataFormatada, dia, mes, ano);
	}
}

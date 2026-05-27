package classe;

public class ValorVSReferencia {
	public static void main(String[] args) {
		
		int a = 2;
		int b = a; // Atribuição por valor
		
		a++;
		b--;
		
		System.out.println(a + " " + b); //Cada um tem um valor agora, basicamente a variavel é duplicada e sua dupla é indepentende
		
		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1;// Atribuição por referencia (Objeto)
		
		d1.dia = 29;
		d2.mes = 07;
		d1.ano = 2024;
		System.out.println(d1.obterDataFormatada()); // Os resultados sao exatamente iguais, mesmo se tratando de objetos diferentes
		System.out.println(d2.obterDataFormatada()); // Isso ocorre pois os dois referenciam o mesmo lugar na memoria do computador, e nao uma copia.
		
		voltarDataValorPadrao(d1);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
	}
	
	static void voltarDataValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
}

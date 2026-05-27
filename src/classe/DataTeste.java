package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data d1 = new Data(29, 07, 2024);
		
		Data d2 = new Data();
		
		System.out.println(d1.obterDataFormatada());
		System.out.printf("%d/%d/%d", d2.dia, d2.mes, d2.ano);
	}
}

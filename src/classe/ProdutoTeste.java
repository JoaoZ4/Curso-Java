package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {

		Produto p1 = new Produto("NoteBook", 5000.00);
		// p1.nome = "NoteBook";
		// p1.preco = 4356.99;
		// p1.desconto = 0.25;
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 10.00;
		
		Produto.desconto = 0.50;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.precoComDesconto(); 
		double precoFinal2 = p2.precoComDesconto(0.1);
		
		System.out.printf("O preco dos dois produtos ficou em R$%.2f e R$%.2f", precoFinal1, precoFinal2);
	}
}

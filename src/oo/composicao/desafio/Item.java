package oo.composicao.desafio;

public class Item {
	
	Produto produto;
	int quantidade;

	Item(Produto produto, int qtd){
		this.quantidade = qtd;
		this.produto = produto;
	}
}

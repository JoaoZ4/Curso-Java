package oo.composicao.umpraN;

import java.util.ArrayList;

public class Compra {

	String cliente;
	ArrayList<Item> itens = new ArrayList<Item>();
	
	void adicionarItem(Item item) {
		itens.add(item);
		item.compra = this;
	}
	
	double obterValorTotal() {
		double valorTotal = 0;
		for(Item item: itens){
			valorTotal += item.preco * item.quantidade;
		}
		return valorTotal;
	}
}

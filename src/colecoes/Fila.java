package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// Offer e Add -> Adicionam elementod na fila
		// Diferença é o comportamento quando a fila está cheia!
		fila.add("Ana"); // O add retorna um erro/exceção
		fila.offer("Bia"); // O offer retorna False
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Gui");
		
		// Peek e Element -> ambos retornam o próximo elemento na fila (sem remover)		
		// Diferença é o comportamento quando a fila está vazia!
		System.out.println(fila.peek()); // Peek retorna o item armazenado ou null caso nao tenha nada
		System.out.println(fila.peek()); 
		System.out.println(fila.element()); // Retorna o mesmo do peek ou um erro/exceção caso nao tenha nada
		System.out.println(fila.element());
		
		// Poll e Remove -> ambos retornam o próximo elemento na fila (e remove)
		// Diferença é o comportamento quando a fila está vazia!
		System.out.println(fila.poll()); // O poll exclui o primeiro item na fila e caso nao tenha mais nenhum ele retorna null
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
//		System.out.println(fila.remove()); // É igual o poll, porem quando estiver vazia, retorna uma exceção/erro
		
//		fila.size();
//		fila.clear();
//		fila.isEmpty();
		
	}
}

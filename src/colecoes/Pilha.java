package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {

		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O pequeno principe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		System.out.println(livros.peek()); // Diferente da fila, agora ambos os métodos retornam o ultimo item adicionado
		System.out.println(livros.element());
		
		System.out.println("Foi excluido o livro: " + livros.poll()); // Novamente, ele exclui o ultimo da fila e retorna qual item ele excluiu
 		System.out.println(livros.poll());
 		System.out.println(livros.pop()); // Igualzinho o .remove()
		System.out.println(livros.poll());
		
//		livros.size();
//		livros.clear();
//		livros.contains();
//		livros.isEmpty();
	}
}

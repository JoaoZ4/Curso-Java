package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		
		List<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");
		
		lista.add(u1);
		lista.add(new Usuario("Pedro"));
		lista.add(new Usuario("Andre"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Helena"));
		lista.add(new Usuario("Eduardo"));
		
		System.out.println(lista.get(3)); // Acessar pelo Indice
		
		System.out.println(">>>> " + lista.remove(2)); // Retorna o objeto excluido.
		System.out.println(lista.remove(new Usuario("Lia"))); // Retorna boolean, se excluiu ou nao, nesse caso ele exclui o objeto pois nao pode haver duplicados
		
		System.out.println("Contém Helena na lista: " + lista.contains(new Usuario("Helena")));
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
	}
}

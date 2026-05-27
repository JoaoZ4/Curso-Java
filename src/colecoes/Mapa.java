package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Roberto"); // Basicamente o add dos outros tipos
		usuarios.put(1, "Ricardo"); // O put substitui o item, caso valores se repitam
		usuarios.put(1, "Ricardo");
		
		System.out.println(usuarios.size()); // Isso irá retornar 1, visto que nao podem ter valores duplicados
		
		usuarios.put(21, "Helena");
		usuarios.put(13, "Joao");
		usuarios.put(421, "Eduardo");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet()); // Acessa as chaves de cada item
		System.out.println(usuarios.values()); // Acessa o valor de cada item
		
		System.out.println(usuarios.entrySet());
		
		System.out.println(usuarios.containsKey(13)); // Retorna true caso contenha uma chave com esse valor dentro do map
		System.out.println(usuarios.containsValue("Joao"));
		
		System.out.println(usuarios.get(21)); // Voce passa a chave e ele retorna o valor associado à mesma
		System.out.println(usuarios.remove(421)); // Remove e retorna o valor que removeu
		System.out.println(usuarios.remove(4, "Pedro"));
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		for (Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + " ");
			System.out.println(registro.getValue());
		}
	}
}

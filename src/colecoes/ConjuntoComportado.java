package colecoes;

import java.util.TreeSet;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		// Set<String> listaAprovados = new HashSet<>(); // Esse <String> é oque determina o tipo de lista que estamos criando, 
		// igual abrir uma variavel int a = 0, esse <> é basicamente uma repetição do <String> so que nao precisa escrever
		// executassemos o set da linha 11 ao invés do TreeSet, ele printaria na tela, os itens fora de ordem, pois o Set nao mantém nenhuma ordem
		
		SortedSet<String> listaAprovados = new TreeSet<>();
		
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Lucca");
		listaAprovados.add("Pedro");
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}

		Set<Integer> nums = new HashSet<>();
		
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		
		for(int n: nums) {
			System.out.println(n);
		}
	}
}

package fundamentos;

public class Wrapper {  // Wrapper significa embrulho, involucro
	public static void main(String[] args) {
	
		// Basicamente, o wrapper serve para retirarmos as variaveis dos tipos primitivos, mas qual a vantagem de fazer isso?
		// A vantagem é que agora podemos utilizar outras funções nelas, como o parseInt() por exemplo

		// Para utilizarmos um wrapper, precisaremos inicializar a variavel dessas formas:
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000;
		Long l = 100000L;
		Float f = 12.12F;
		Double d = 1234.312;
		Boolean bo = true;
		Character c = 'c';
		// A diferença é que agora o tipo da variavel é uma classe chamada Byte, Short, Integer e Long, diferente de antes (byte, short, int, long)
		// isso como ja dito, nos tras mais funções para usar com os numeros, seguem exemplos:

		System.out.println(i.toString());
		bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		
		// so pra tirar a advertencia
		System.out.print(b + s + l + f + d + c);
		
	}
}

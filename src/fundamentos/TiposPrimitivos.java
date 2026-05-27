package fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // Informações do funcionário

        // Tipos numéricos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 32767;
        int id = 56789;
        long pontosAcumulados = 3_134_845_223L; // os _ sao so pra separar o numero e o L no final é so para mostrar ao
                                                // programa que quero um numero do tipo long

        // Tipos numéricos reais
        float salario = 11_445.44f; // qualquer numero com ponto flutuante no java, é considerado double, quando
                                    // quisermos declarar uma variavel temos que colocar o F, para dizer que é float
        double vendasAcumuladas = 2_991_797_103.01;

        // Tipo booleano
        boolean estaDeFerias = false; // true

        // Tipo caractere
        char status = 'a'; // somente uma letra

        // Dias de empresa
        System.out.println(anosDeEmpresa * 365);
        
        // Numero de viagens
        System.out.println(numeroDeVoos / 2);
        
        // Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);
        
        System.out.println(id + ": ganha -> " + salario);
        System.out.println("Férias? " + estaDeFerias);
        
        System.out.println(status);
    }
}

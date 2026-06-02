package excecao;

public class ChecadaVsNaoChecada {

    static void main() throws Exception {
        try{
            geraErro1();
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

        geraErro2();

        System.out.println("Fim :)");
    }
    // Não checada ou não verificada
    static void geraErro1(){
        throw new RuntimeException("Ocorreu um erro bem legal #01 !");
    }
    // Checada ou verificada
    static void geraErro2() throws Exception{
        throw new Exception("Ocorreu um erro bem legal #02 !");
    }
}


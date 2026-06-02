package excecao;

import java.util.Scanner;

public class Finally {

    static void main() {

        Scanner entrada = new Scanner(System.in);
        try{

            System.out.println(7 / entrada.nextInt());

        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finalmente...");
            entrada.close();
        }
    }
}

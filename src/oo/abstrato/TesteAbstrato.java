package oo.abstrato;

public class TesteAbstrato {

    static void main() {
        Mamifero a = new Cachorro();

        System.out.println(a.mover());
        System.out.println(a.respirar());
        System.out.println(a.mamar());
    }
}

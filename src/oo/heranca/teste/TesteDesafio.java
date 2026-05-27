package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.Lamborghini;

public class TesteDesafio {

    public static void main() {
        Ferrari c1 = new Ferrari();
        Carro c2 = new Lamborghini(40);

        System.out.println(c1 + "\n" + c2);

        c1.acelerar();
        c2.acelerar();

        System.out.println(c1 + "\n" + c2);

        c1.freiar();
        c2.freiar();

        System.out.println(c1 + "\n" + c2);

        c1.ligarTurbo();
        c1.acelerar();
        c2.acelerar();

        System.out.println(c1 + "\n" + c2);

        c1.freiar();
        c1.acelerar();
        c2.freiar();
        c1.desligarTurbo();
        c1.acelerar();
        System.out.println(c1 + "\n" + c2);
    }
}

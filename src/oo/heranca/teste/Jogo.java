package oo.heranca.teste;

import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {

    public static void main() {
        Monstro monstro = new Monstro(11, 11);
        Heroi heroi = new Heroi(10, 11);

//      monstro.andar(Direcao.NORTE);
//      monstro.andar(Direcao.LESTE);
//      monstro.andar(Direcao.NORTE);
//      monstro.andar(Direcao.LESTE);

        System.out.println(monstro.x + " " + monstro.y);

        System.out.println("Monstro: "+ monstro.vida + "\nHeroi 2: " + heroi.vida);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println("Monstro 1: "+ monstro.vida + "\nHeroi 2: " + heroi.vida);

    }
}

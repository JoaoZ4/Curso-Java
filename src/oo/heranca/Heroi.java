package oo.heranca;

public class Heroi extends Jogador{ // Aqui estamos utilizando da herança, ao usar a palavra extends, isso significa que a classe heroi ira receber tudo o que o jogador possuir

    public Heroi(int x, int y){
        super(x, y);
    }

     public boolean atacar(Jogador oponente){
         boolean ataque1 = super.atacar(oponente);
         boolean ataque2 = super.atacar(oponente);
         return ataque1 || ataque2;
     }
}

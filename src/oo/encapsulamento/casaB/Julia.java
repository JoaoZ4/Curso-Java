package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {

    Ana sogra = new Ana();

    void testeAcesso(){
        // System.out.println(mae.segredo);
        // System.out.println(mae.facoDentroDeCasa); esse é o default ou package, nao da pra acessar pois nao estamos no mesmo pacote
        // System.out.println(formaDeFalar); // Esse é o protected, nao conseguimos acessar pois nao estamos herdando nada da Ana
        System.out.println(sogra.todosSabem);
    }
}

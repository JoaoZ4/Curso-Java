package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

    Ana mae = new Ana();

    void testeAcesso(){
        // System.out.println(mae.segredo);
        // System.out.println(mae.facoDentroDeCasa); esse é o default ou package, nao da pra acessar pois nao estamos no mesmo pacote
        System.out.println(formaDeFalar); // Esse é o protected, so da pra acessar via herança, tentei acessar como mae.formaDeFalar e nao deu pois estava tentando acessar pela instancia
        System.out.println(mae.todosSabem);
    }

}

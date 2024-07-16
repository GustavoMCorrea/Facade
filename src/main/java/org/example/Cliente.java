package org.example;

public class Cliente {

    public String cartao(){
        return ClienteFacade.analiseCredito(this);
    }
}

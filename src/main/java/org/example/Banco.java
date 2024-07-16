package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Banco {

    private List<Cliente> analiseCredito = new ArrayList<Cliente>();

    public void addClientePendente(Cliente cliente) {
        this.analiseCredito.add(cliente);
    }

    public boolean verificarClienteComPendencia(Cliente cliente) {
        return this.analiseCredito.contains(cliente);
    }
}

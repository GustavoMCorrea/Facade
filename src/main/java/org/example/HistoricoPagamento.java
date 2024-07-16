package org.example;

public class HistoricoPagamento extends Banco {

    private static HistoricoPagamento historicoPagamento = new HistoricoPagamento();

    private HistoricoPagamento() {}

    public static HistoricoPagamento getInstancia() {
        return historicoPagamento;
    }
}

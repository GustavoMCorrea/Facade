package org.example;

public class ClienteFacade{

    public static String analiseCredito(Cliente cliente) {

        if (HistoricoPagamento.getInstancia().verificarClienteComPendencia(cliente)) {
            return "Pagamentos Atrasados";
        }
        if (StatusCPF.getInstancia().verificarClienteComPendencia(cliente)) {
            return "Cpf Negativado";
        }
        if (Score.getInstancia().verificarClienteComPendencia(cliente)) {
            return "Socre baixo";
        }
        return "Cartão Aprovado";

    }
}

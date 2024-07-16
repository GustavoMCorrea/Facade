package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveRetornarCpfNegativado() {
       Cliente cliente = new Cliente();
       StatusCPF.getInstancia().addClientePendente(cliente);


        assertEquals("Cpf Negativado", cliente.cartao());
    }

    @Test
    void deveRetornarScoreBaixo() {
        Cliente cliente = new Cliente();
        Score.getInstancia().addClientePendente(cliente);


        assertEquals("Socre baixo", cliente.cartao());
    }

    @Test
    void deveRetornarPagamentosAtrasados() {
        Cliente cliente = new Cliente();
        HistoricoPagamento.getInstancia().addClientePendente(cliente);


        assertEquals("Pagamentos Atrasados", cliente.cartao());
    }

    @Test
    void deveRetornarCartãoAprovado() {
        Cliente cliente = new Cliente();


        assertEquals("Cartão Aprovado", cliente.cartao());
    }


}
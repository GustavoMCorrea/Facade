package org.example;

public class StatusCPF extends Banco {

    private static StatusCPF statusCpf = new StatusCPF();

    private StatusCPF() {};

    public static StatusCPF getInstancia() {
        return statusCpf;
    }
}

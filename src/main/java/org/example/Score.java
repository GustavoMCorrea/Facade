package org.example;

public class Score extends Banco {

    private static Score score = new Score();

    private Score() {}

    public static Score getInstancia() {
        return score;
    }
}

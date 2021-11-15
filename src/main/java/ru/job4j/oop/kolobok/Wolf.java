package ru.job4j.oop.kolobok;

public class Wolf {

    public void tryEat(Ball ball) {
        System.out.println("Wolf attacks.");
        ball.tryRun(false);
    }

}

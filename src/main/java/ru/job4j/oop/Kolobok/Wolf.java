package ru.job4j.oop.Kolobok;

public class Wolf {

    public void tryEat(Ball ball) {
        System.out.println("Wolf attacks.");
        ball.tryRun(false);
    }

}

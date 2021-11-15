package ru.job4j.oop.kolobok;

public class Hare {

    public void tryEat(Ball ball) {
        System.out.println("Hare attacks.");
        ball.tryRun(false);
    }

}

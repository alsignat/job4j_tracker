package ru.job4j.oop.kolobok;

public class Fox {

    public void tryEat(Ball ball) {
        System.out.println("Fox attacks.");
        ball.tryRun(true);
    }

}

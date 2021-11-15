package ru.job4j.oop.Kolobok;

public class Fox {

    public void tryEat(Ball ball) {
        System.out.println("Fox attacks.");
        ball.tryRun(true);
    }

}

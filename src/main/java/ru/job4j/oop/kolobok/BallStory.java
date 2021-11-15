package ru.job4j.oop.kolobok;

public class BallStory {

    public static void main(String[] args) {
        Ball kolobok = new Ball();
        System.out.println("Kolobok starts his journey.");
        Hare aHare = new Hare();
        Wolf aWolf = new Wolf();
        Fox aFox = new Fox();
        aHare.tryEat(kolobok);
        aWolf.tryEat(kolobok);
        aFox.tryEat(kolobok);
    }
}

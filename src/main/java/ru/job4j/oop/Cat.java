package ru.job4j.oop;

public class Cat {

    private String food;
    private String name;

    public void show() {
        System.out.println(this.name + " ate " + this.food + ".");
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String name) {
        this.name = name;
    }

    public String sound() {
        String voice = "may-may";
        return voice;
    }

    public static void main(String[] args) {
            Cat peppy = new Cat();
            Cat sparky = new Cat();
            String say = peppy.sound();
            System.out.println("Peppy says " + say);
            System.out.println("There are gav's food.");
            Cat gav = new Cat();
            gav.giveNick("Gav");
            gav.eat("kotleta");
            gav.show();
            System.out.println("There are black's food.");
            Cat black = new Cat();
            black.giveNick("Black");
            black.eat("fish");
            black.show();
    }
}

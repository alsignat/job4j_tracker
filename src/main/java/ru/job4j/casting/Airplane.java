package ru.job4j.casting;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println("FLYYYYYY!");
    }
}

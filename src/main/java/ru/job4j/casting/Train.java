package ru.job4j.casting;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Chu-chu");
    }
}

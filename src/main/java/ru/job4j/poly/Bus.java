package ru.job4j.poly;

public class Bus implements Transport {

    private int passengers;
    private double fuel;

    @Override
    public void ride() {
        System.out.println("Bus is riding");
    }

    @Override
    public void carry(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public double refuel(double fuel) {
        this.fuel += fuel;
        return fuel * 20;
    }
}

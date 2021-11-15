package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int n) {
        return n - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int div) {
        return div / x;
    }

    public int sumAllOperation(int num) {
        return sum(num) + minus(num) + this.multiply(num) + this.divide(num);
    }

    public static void main(String[] args) {
        System.out.println(sum(10));
        System.out.println(minus(32));
        Calculator calculator = new Calculator();
        System.out.println(calculator.multiply(4));
        System.out.println(calculator.divide(5));
        System.out.println(calculator.sumAllOperation(10));
    }
}
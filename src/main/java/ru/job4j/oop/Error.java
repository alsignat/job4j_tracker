package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void show() {
        System.out.println("active: " + this.active);
        System.out.println("status: " + this.status);
        System.out.println("message: " + this.message);
        System.out.println();
    }

    public static void main(String[] args) {
        Error errorOne = new Error();
        Error errorTwo = new Error(false, 30, "It's not OK.");
        Error errorThree = new Error(true, 10, "Something gone wrong.");
        errorOne.show();
        errorTwo.show();
        errorThree.show();
    }
}

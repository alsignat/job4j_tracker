package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book bookOne = new Book("Clean code", 2800);
        Book bookTwo = new Book("War And Piece", 10000);
        Book bookThree = new Book("Good Book OK", 150);
        Book bookFour = new Book("Harry Potter and Plain Old Java Objects", 850);
        Book[] shelf = new Book[4];
        shelf[0] = bookOne;
        shelf[1] = bookTwo;
        shelf[2] = bookThree;
        shelf[3] = bookFour;
        System.out.println(System.lineSeparator() + "Initial shelf:");
        for (int i = 0; i < shelf.length; i++) {
            Book bk = shelf[i];
            System.out.println("Book " + (i + 1) + ": " + bk.getName() + ", pages count: " + bk.getPages());
        }
        System.out.println(System.lineSeparator() + "Books 1 and 4 places changed:");
        Book tmp = shelf[0];
        shelf[0] = shelf[3];
        shelf[3] = tmp;
        for (int i = 0; i < shelf.length; i++) {
            Book bk = shelf[i];
            System.out.println("Book " + (i + 1) + ": " + bk.getName() + ", pages count: " + bk.getPages());
        }
        System.out.println(System.lineSeparator() + "Books filtered by name: ");
        for (int i = 0; i < shelf.length; i++) {
            Book bk = shelf[i];
            if ("Clean code".equals(bk.getName())) {
                System.out.println("Book " + (i + 1) + ": " + bk.getName() + ", pages count: " + bk.getPages());
            }
        }
    }
}
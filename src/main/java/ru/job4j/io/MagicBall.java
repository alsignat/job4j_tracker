package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {

    public static void main(String[] args) {
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        Scanner sc = new Scanner(System.in);
        String question = sc.nextLine();
        int rand = new Random().nextInt(3);
        String answer = switch (rand) {
            case 0 -> "Да";
            case 1 -> "Нет";
            default -> "Может быть";
        };
        System.out.println("Ответ на ваш вопрос \"" + question + "\" таков: " + answer);
    }
}

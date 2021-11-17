package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {

    public static void main(String[] args) {
        Item anItem = new Item();
        String timeInfo = anItem.getTimeCreated().format(DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss"));
        System.out.println(timeInfo);
        Item secondItem = new Item("Zayaffka", 165);
        System.out.println(secondItem);
    }

}

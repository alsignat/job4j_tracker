package ru.job4j.oop;

public class Jukebox {

    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже" + System.lineSeparator()
                    + "Пешеходы по лужам." + System.lineSeparator());
        } else if (position == 2) {
            System.out.println("Спят усталые игрушки, книжки спят." + System.lineSeparator()
                    + "Одеяла и подушки ждут ребят." + System.lineSeparator());
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox player = new Jukebox();
        player.music(1);
        player.music(2);
        player.music(3);
    }
}

package ru.job4j.oop;

public class Jukebox {

    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже \nПешеходы по лужам.\n");
        } else if (position == 2) {
            System.out.println("Спят усталые игрушки, книжки спят. \nОдеяла и подушки ждут ребят.\n");
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

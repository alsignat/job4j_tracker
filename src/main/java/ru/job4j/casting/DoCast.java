package ru.job4j.casting;

public class DoCast {

    public static void main(String[] args) {
        Vehicle bus = new Bus();
        Vehicle airplane = new Airplane();
        Vehicle train = new Train();
        Vehicle[] vehicles = {bus, airplane, train};
        for (Vehicle vh: vehicles) {
            vh.move();
        }
    }

}

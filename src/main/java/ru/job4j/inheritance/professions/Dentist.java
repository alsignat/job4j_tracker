package ru.job4j.inheritance.professions;

import java.util.Date;

public class Dentist extends Doctor {

    private boolean isOrthodont;

    public Dentist(String name, String surname, Date birthday, String education, boolean licensed, boolean isOrthodont) {
        super(name, surname, birthday, education, licensed);
        this.isOrthodont = isOrthodont;
    }

    public boolean isOrthodont() {
        return this.isOrthodont;
    }

    public void removeTeeth(Pacient pacient) {
        pacient.removeTeeth();
    }

    public void addTeeth(Pacient pacient) {
        if (this.isOrthodont) {
            pacient.addTeeth();
        }
    }

}

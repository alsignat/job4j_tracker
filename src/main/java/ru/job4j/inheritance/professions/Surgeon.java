package ru.job4j.inheritance.professions;

import java.util.Date;

public class Surgeon extends Doctor {

    private boolean drunk = false;

    public Surgeon(String name, String surname, Date birthday, String education, boolean licensed, boolean drunk) {
        super(name, surname, birthday, education, licensed);
        this.drunk = drunk;
    }

    public boolean getStatus() {
        return this.drunk;
    }

    public void removeAppendix(Pacient pacient) {
        pacient.removeAppendix();
        if (this.drunk) {
            pacient.removeTeeth();
        }
    }

    public void drink() {
        this.drunk = true;
    }
}

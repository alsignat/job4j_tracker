package ru.job4j.inheritance.professions;

public class Surgeon extends Doctor {

    private boolean drunk = false;

    public Surgeon() {
        super();
    }

    public Surgeon(boolean drunk) {
        super();
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

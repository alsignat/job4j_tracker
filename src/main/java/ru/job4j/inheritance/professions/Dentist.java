package ru.job4j.inheritance.professions;

public class Dentist extends Doctor {

    private boolean isOrthodont;

    public Dentist() {
        super();
    }

    public Dentist(boolean isOrthodont) {
        super();
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

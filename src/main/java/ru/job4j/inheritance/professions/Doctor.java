package ru.job4j.inheritance.professions;

import java.util.Date;

public class Doctor extends Profession {

    private boolean licensed;

    public Doctor(String name, String surname, Date birthday, String education, boolean licensed) {
        super(name, surname, birthday, education);
        this.licensed = licensed;
    }

    public void certify() {
        this.licensed = true;
    }

    public boolean getLicense() {
        return this.licensed;
    }

    public Diagnosis diagnose(Pacient pacient) {
        return pacient.getDiagnosis();
    }

    public void changeDiagnosis(Pacient pacient, Diagnosis diagnosis) {
        pacient.changeDiagnosis(diagnosis);
    }

}

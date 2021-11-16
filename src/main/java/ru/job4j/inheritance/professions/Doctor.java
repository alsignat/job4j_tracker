package ru.job4j.inheritance.professions;

public class Doctor extends Profession {

    private boolean licensed;

    public Doctor() {
        super();
    }

    public Doctor(boolean licensed) {
        super();
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

package ru.job4j.inheritance.professions;

import java.util.Date;

public class Pacient {

    private String name;
    private String surname;
    private Date birthday;
    private Diagnosis diagnosis;
    private int teeth;
    private boolean hasAppendix = true;

    public Pacient() {
    }

    public Pacient(String name, String surname, Date birthday, int teeth) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.teeth = teeth;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public Date getBirthday() {
        return this.birthday;
    }

    public void removeTeeth() {
        this.teeth--;
    }

    public void addTeeth() {
        this.teeth++;
    }

    public void removeAppendix() {
        this.hasAppendix = false;
    }

    public Diagnosis getDiagnosis() {
        return this.diagnosis;
    }

    public void changeDiagnosis(Diagnosis diagnosis) {
        this.diagnosis = diagnosis;
    }

}

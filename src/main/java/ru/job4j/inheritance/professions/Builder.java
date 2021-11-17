package ru.job4j.inheritance.professions;

import java.util.Date;

public class Builder extends Engineer {

    private int electricityAccess;

    public Builder(String name, String surname, Date birthday, String education, boolean knowsMath, int electricity) {
        super(name, surname, birthday, education, knowsMath);
        this.electricityAccess = electricity;
    }

    public int getElectricityAccess() {
        return electricityAccess;
    }

    public void setElectricityAccess(int electricity) {
        this.electricityAccess = electricity;
    }

    public void repair() {
        if (electricityAccess >= 220) {
            System.out.println("Done!");
        } else {
            System.out.println("Bzzzzzz");
        }
    }

}

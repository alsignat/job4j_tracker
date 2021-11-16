package ru.job4j.inheritance.professions;

public class Builder extends Engineer {

    private int electricityAccess;

    public Builder() {
        super();
    }

    public Builder(int electricity) {
        super();
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

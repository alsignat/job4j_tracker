package ru.job4j.inheritance.professions;

public class Diagnosis {

    private String name = "Unidentified";
    private String icd = "NaN";

    public Diagnosis() {
    }

    public Diagnosis(String name, String icd) {
        this.name = name;
        this.icd = icd;
    }

    public String getName() {
        return name;
    }

    public String getIcd() {
        return icd;
    }
}

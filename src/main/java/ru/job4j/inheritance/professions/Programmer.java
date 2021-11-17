package ru.job4j.inheritance.professions;

import java.util.Date;

public class Programmer extends Engineer {

    private String grade;
    private boolean isIndian;

    public Programmer(String name, String surname, Date birthday, String education, boolean knowsMath, String grade, boolean isIndian) {
        super(name, surname, birthday, education, knowsMath);
        this.grade = grade;
        this.isIndian = isIndian;
    }

    public String getGrade() {
        return this.grade;
    }

    public boolean isIndian() {
        return this.isIndian;
    }

    public void answer(Profession profession, String question) {
        Google request = new Google(question);
        String answer = profession.getName() + ", " + "the answer is 42.";
        if (this.isIndian) {
            answer += " Sir.";
        }
        System.out.println(answer);
    }
}

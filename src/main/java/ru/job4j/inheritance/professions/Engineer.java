package ru.job4j.inheritance.professions;

import java.util.Date;

public class Engineer extends Profession {

    private boolean knowsMath;

    public Engineer(String name, String surname, Date birthday, String education, boolean knowsMath) {
        super(name, surname, birthday, education);
        this.knowsMath = knowsMath;
    }

    public boolean getKnowsMath() {
        return this.knowsMath;
    }

    public double getPi() {
        if (this.knowsMath) {
            return 3.1415926;
        } else {
            return -1.0;
        }
    }

}

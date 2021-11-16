package ru.job4j.inheritance.professions;

public class Engineer extends Profession {

    private boolean knowsMath;

    public Engineer() {
        super();
    }

    public Engineer(boolean knowsMath) {
        super();
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

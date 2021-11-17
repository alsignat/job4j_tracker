package ru.job4j.inheritance.professions;

import java.util.Date;

public class Profession {
    private String name;
    private String surname;
    private Date birthday;
    private String education;

    public Profession(String name, String surname, Date birthday, String education) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.education = education;
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

    public String getEducation() {
        return this.education;
    }

    public void speaks(String words) {
        System.out.println(this.name + " says: " + words);
    }

}

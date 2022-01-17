package ru.job4j.stream;

public class User {
    private String name;

    private String surname;

    private byte age;

    private String login;

    private String password;

    private boolean activated;

    private String gender;

    public User(String name, String surname, byte age,
                String login, String password, boolean activated,
                String gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.login = login;
        this.password = password;
        this.activated = activated;
        this.gender = gender;
    }

    static class Builder {
        private String name;
        private String surname;
        private byte age;
        private String login;
        private String password;
        private boolean activated;
        private String gender;

        Builder buildName(String name) {
            this.name = name;
            return this;
        }

        Builder buildSurname(String surname) {
            this.surname = surname;
            return this;
        }

        Builder buildAge(byte age) {
            this.age = age;
            return this;
        }

        Builder buildLogin(String login) {
            this.login = login;
            return this;
        }

        Builder buildPassword(String password) {
            this.password = password;
            return this;
        }

        Builder buildActivated(boolean activated) {
            this.activated = activated;
            return this;
        }

        Builder buildGender(String gender) {
            this.gender = gender;
            return this;
        }
    }

}
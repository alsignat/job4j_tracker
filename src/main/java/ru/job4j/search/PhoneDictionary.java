package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подошедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (person.getName() != null && person.getName().contains(key)
                    || person.getSurname() != null && person.getSurname().contains(key)
                    || person.getPhone() != null && person.getPhone().contains(key)
                    || person.getAddress() != null && person.getAddress().contains(key)) {
                result.add(person);
            }
        }
        return result;
    }
}

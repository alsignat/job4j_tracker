package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> dict = new HashMap<>();
        dict.put("ivanov@ljlsa.com", "Ivanov Ivan Ivanovich");
        dict.put("petrof@gmail.comm", "Petrov Noname Anonimych");
        for (String key : dict.keySet()) {
            System.out.println("Почта: " + key + "   |   "
                    + "ФИО:  " + dict.get(key)
            );
        }
    }
}

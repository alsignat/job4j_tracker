package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        for (char i = 0; i < Math.min(s1.length(), s2.length()); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return Character.compare(s1.charAt(i), s2.charAt(i));
            }
        }
        return Integer.compare(s1.length(), s2.length());
    }
}

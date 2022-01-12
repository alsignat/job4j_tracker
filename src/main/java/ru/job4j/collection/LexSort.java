package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    public int compare(String s1, String s2) {
        String[] str1 = s1.split(". ");
        String[] str2 = s2.split(". ");
        int num1 = Integer.parseInt(str1[0]);
        int num2 = Integer.parseInt(str2[0]);
        return Integer.compare(num1, num2);
    }

}

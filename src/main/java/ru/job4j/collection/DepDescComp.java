package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        String[] deps1 = s1.split("/");
        String[] deps2 = s2.split("/");
        int rsl  = deps1[0].compareTo(deps2[0]);
        return rsl == 0 ? s1.compareTo(s2) : rsl;
    }

}

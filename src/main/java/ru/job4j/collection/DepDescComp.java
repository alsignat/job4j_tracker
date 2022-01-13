package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        String[] deps1 = s1.split("/");
        String[] deps2 = s2.split("/");
        if (deps1[0].compareTo(deps2[0]) != 0) {
            return deps2[0].compareTo(deps1[0]);
        }
        for (int i = 1; i < Math.max(deps1.length, deps2.length); i++) {
            String dep1 = i >= deps1.length ? "" : deps1[i];
            String dep2 = i >= deps2.length ? "" : deps2[i];
            if (dep1.compareTo(dep2) != 0) {
                return dep1.compareTo(dep2);
            }
        }
        return 0;
    }

}

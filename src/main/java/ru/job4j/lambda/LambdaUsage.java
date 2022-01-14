package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaUsage {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("eeeee", "a",  "ccc", "dddd", "bb");
        Comparator<String> comparator = (left, right) -> {
            System.out.printf("Вызван компаратор строк по длине("
            + "%s, %s) ", left, right);
            int rsl = Integer.compare(right.length(), left.length());
            System.out.printf(" = %d." + System.lineSeparator(), rsl);
            return rsl;
        };
        strings.sort(comparator);
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
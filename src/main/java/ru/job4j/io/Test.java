package ru.job4j.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Test {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Alexander\\IdeaProjects\\job4j_tracker\\src\\main\\java\\rujob4j\\io\\file.txt");
        System.out.printf("\"%s dolor sit %s\", \"Lorem\", \"ipsum\", \"amet\"");

        try (PrintWriter printWriter = new PrintWriter(file)) {
            printWriter.printf("%s dolor sit %s", "Lorem", "ipsum", "amet");
        } catch (FileNotFoundException e) {
            System.out.println("dss");
        }
    }
}

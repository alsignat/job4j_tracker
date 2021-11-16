package ru.job4j.pojo;

import java.time.LocalDate;

public class College {

    public static void main(String[] args) {
        Student aStudent = new Student();
        aStudent.setFullName("John Petrov");
        aStudent.setGroup("BBA2021");
        aStudent.setAdmittedDate(LocalDate.of(2021, 2, 20));
        System.out.println("Student " + aStudent.getFullName()
                + ", admitted at " + aStudent.getAdmittedDate()
                + ", is in group " + aStudent.getGroup());
    }

}

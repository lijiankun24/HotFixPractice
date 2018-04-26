package com.lijiankun24.hotfixpractice;

/**
 * Student.java
 * <p>
 * Created by lijiankun on 18/4/25.
 */

public class Student {

    private String name;

    private int age;

    private String school;

    public Student(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    public String getSchool() {
        return school;
    }
}

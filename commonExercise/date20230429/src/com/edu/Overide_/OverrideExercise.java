package com.edu.Overide_;

public class OverrideExercise {
    public static void main(String[] args) {
        Person jack = new Person("jack", 18);
        Student yanna = new Student("yanna", 18, 1234, 99);
        jack.say();
        yanna.say();
    }
}

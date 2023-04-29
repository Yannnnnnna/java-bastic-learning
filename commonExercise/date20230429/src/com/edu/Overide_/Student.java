package com.edu.Overide_;

public class Student extends Person{
    private int id;
    private int score;

    public Student(String name, int age, int id, int score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }
    public void say(){
       super.say();
        System.out.println(" id: " + id + " score: " + score);
    }
}

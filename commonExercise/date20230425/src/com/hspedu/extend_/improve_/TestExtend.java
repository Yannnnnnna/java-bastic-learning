package com.hspedu.extend_.improve_;

public class TestExtend {
    public static void main(String[] args) {
        Pupils pupil = new Pupils();
        pupil.name = "银角大王~";
        pupil.age = 11;
        pupil.testing();
        pupil.setScore(50);
        pupil.showInfo();
        System.out.println("=======");
        Graduate graduate = new Graduate();
        graduate.name = "金角大王~";
        graduate.age = 23;
        graduate.testing();
        graduate.setScore(80);
        graduate.showInfo();

    }
}

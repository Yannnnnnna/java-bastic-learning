package Experiment06.Exercise02;

public class Exercise02 {
    public static void main(String[] args) {
        Person person1 = new Student("xiaoming", "shaxian",
                "12323232" , "1111@qq.com", 2);
        System.out.println(person1.toString());

        Person person2 = new Faculty("xiaoming", "shaxian", "12323232" , "1111@qq.com",
                "雇员办公室", 5000,"faculty");
        System.out.println(person2.toString());

        Person person3 = new Staff("xiaoming", "shaxian", "12323232" , "1111@qq.com",
                "雇员办公室", 5000,"stuff");

        Person person = new Person("xiaoming", "shaxian",
                "12323232", "1111@qq.com");

        System.out.println(person.toString());

        Person person4 = new Employee("xiaoming", "shaxian", "12323232" , "1111@qq.com",
                "雇员办公室", 5000);

    }
}

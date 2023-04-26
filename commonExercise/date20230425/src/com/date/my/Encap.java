package com.date.my;

public class Encap {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("无名人");
        person.setAge(300);
        person.setSalary(15000);
        System.out.println(person.infor());
    }

}
class Person{
    public String name;
    private int age;
    private double salary;

    public Person() {

    }

    public Person(String name, int age, double salary) {
        this.setName(name);
        this.setAge(age);
        this.setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 1 && age <= 120){
            this.age = age;
        }else{
            System.out.println("年龄需要在1到120， 给一个默认年龄");
            this.age = 18;
        }

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String infor(){
        return name + age + salary;
    }
}

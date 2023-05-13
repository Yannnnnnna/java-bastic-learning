package Experiment06.Exercise02;

public class Person {
    private String name;
    private String address;
    private String number;
    private String email;

    public Person() {
    }

    public Person(String name, String address, String number, String email) {
        this.name = name;
        this.address = address;
        this.number = number;
        this.email = email;
    }

    public String toString() {
        return "基本信息" + name + " " + address + " " + number + " " + email + "\n";
    }
}

package Experiment06.Exercise02;

import java.util.Date;

public class Employee extends Person {
    private String workroom;
    private int salary;
    private java.util.Date employeeDate;

    public Employee() {
    }

    public Employee(String name, String address, String number, String email,
                    String workroom, int salary) {
        super(name, address, number, email);
        this.workroom = workroom;
        this.salary = salary;
        employeeDate = new java.util.Date(10000000000000L);
    }

    public String toString() {
        return super.toString() +
                getClass() + "\n" +
                workroom + " " + salary + " " + employeeDate + "\n";
    }
}


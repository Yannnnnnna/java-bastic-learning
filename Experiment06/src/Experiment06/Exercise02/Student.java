package Experiment06.Exercise02;

public class Student extends Person {
    private int grade;

    public Student() {

    }

    public Student(String name, String address, String number, String email, int grade) {
        super(name, address, number, email);
        this.grade = grade;
    }

    public String toString() {
        return super.toString() +
                getClass() + "\n" +
                grade + "\n";
    }

}

package Experiment06.Exercise02;

public class Faculty extends Employee{
    private String faultyName;

    public Faculty() {

    }

    public Faculty(String name, String address, String number, String email,
                   String workroom, int salary, String faultyName) {

        super(name, address, number, email, workroom, salary);
        this.faultyName = faultyName;
    }
    public String toString(){
        return super.toString() + getClass() + "\n"+
                faultyName + "\n";

    }
}

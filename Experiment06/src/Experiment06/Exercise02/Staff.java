package Experiment06.Exercise02;

public class Staff extends Employee{
    private String stuffName;
    public Staff(String name, String address, String number, String email,
                   String workroom, int salary, String faultyName) {

        super(name, address, number, email, workroom, salary);
        this.stuffName = faultyName;
    }
    public String toString(){
        return super.toString() + getClass() + "\n"+
                stuffName + "\n";

    }

}

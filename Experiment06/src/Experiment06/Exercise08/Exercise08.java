package Experiment06.Exercise08;

public class Exercise08 {
    public static void main(String[] args) {
        NewAccount george = new NewAccount(1122, 1000, 0.015, "George");
        george.deposit(30);
        george.deposit(40);
        george.deposit(50);
        george.withDraw(5);
        george.withDraw(4);
        george.withDraw(2);
        System.out.println(george.toString());

    }

}

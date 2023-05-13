package Experiment06.Exercise16;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        ArrayList<Integer> answers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.printf("What is %d + %d ?\n" , number1, number2);
        int answer = scanner.nextInt();
        while (number1 + number2 != answer){
            if (answers.contains(answer)){
                System.out.println("You had input the answer.");
            }
            answers.add(answer);
            System.out.print("Wrong answer. Try again.");
            System.out.printf("What is %d + %d ?\n" , number1, number2);
            answer = scanner.nextInt();
        }
        System.out.println("You got it");
    }
}

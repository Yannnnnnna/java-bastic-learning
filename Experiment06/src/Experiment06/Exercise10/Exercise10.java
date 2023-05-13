package Experiment06.Exercise10;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("请输入5个字符串：");
        for (int i = 0; i < 5; i++) {
            list.add(scanner.next());
        }
        MyStack myStack = new MyStack(list);
        for (int i = 0; i < 5; i++) {
            System.out.println(myStack.pop());
        }


    }
}

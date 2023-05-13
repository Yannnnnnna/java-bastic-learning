package Experiment06.Exercise11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入五个数字：");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }
        sort(list);
    }
    public static void sort (ArrayList<Integer> list){
        java.util.Collections.sort(list);
        System.out.println(list);
    }
}

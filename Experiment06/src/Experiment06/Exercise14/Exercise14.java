package Experiment06.Exercise14;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.println("输入列表1的数字：");
        for (int i = 0; i < 5; i++) {
            list1.add(input.nextInt());
        }
        System.out.println("输入列表2的数字：");
        for (int i = 0; i < 5; i++) {
            list2.add(input.nextInt());
        }

        System.out.println("合并的列表为：");
        ArrayList<Integer> list = union(list1, list2);
        for (int i = 0; i < 10; i++) {
            System.out.print(list.get(i) + " ");
        }

    }
    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(list1);
        list.addAll(list2);

        return list;
    }
}

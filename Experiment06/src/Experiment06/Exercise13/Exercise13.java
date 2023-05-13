package Experiment06.Exercise13;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入十个数字");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(input.nextInt());
        }
        removeDuplicate(list);


    }
    public static void removeDuplicate(ArrayList<Integer> list){
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(!newList.contains(list.get(i))){
                newList.add(list.get(i));
            }
        }

        System.out.println("不同元素的数组为：" + newList);
    }
}

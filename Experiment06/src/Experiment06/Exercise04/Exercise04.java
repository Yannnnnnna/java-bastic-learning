package Experiment06.Exercise04;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        System.out.println("请输入一串数字，以0结尾");
        Scanner scanner = new Scanner(System.in);
        //创建一个对象
        ArrayList<Integer> list = new ArrayList<>();
        //输入数字
        int num = scanner.nextInt();
        while(num != 0){
            list.add(num);
            num = scanner.nextInt();
        }
        //调用方法
        Integer max = max(list);
        if (max == null) {
            System.out.println("列表为空或大小为0，无最大值");
        } else {
            System.out.println("最大值为：" + max);
        }

    }
    /*【知识点】
    ArrayList<Integer>是一个泛型类，表示一个可以存储整数(Integer)类型的动态数组列表。
    它是Java集合框架中的一部分，提供了动态增加、删除、查找等操作，是一种常用的数据结构。
    泛型类指的是可以为类中的某些属性、方法或者整个类指定类型参数，这样可以在编译时检查类型安全性。
    在这里，泛型类ArrayList<Integer>指定了列表中只能存储整数类型的元素。*/
    public static Integer max(ArrayList<Integer> list) {
        if(list == null || list.size() == 0){
            return null;
        }else {
            Integer max = list.get(0);
            for (int i = 1; i < list.size(); i++) {
                if(list.get(i) > max){
                    max = list.get(i);
                }
            }
            return max;
        }
    }
}

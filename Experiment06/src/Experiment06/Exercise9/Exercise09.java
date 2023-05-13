package Experiment06.Exercise9;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        //产生随机矩阵
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array size n: ");
        int n = input.nextInt();
        int[][] random = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                random[i][j] = (int) (Math.random() * 2);
            }
        }
        //创建两个列表来储存最大值下标；
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        //计算行
        int count1;
        int count2;
        int max = 0;
        for (int i = 0; i < n; i++) {
            count1 = 0;
            count2 = 0;

            for (int j = 0; j < n; j++) {
                if(random[i][j] == 1){
                    count1++;
                }
                if(random[j][i] == 1){
                    count2++;
                }

            }
            if(count1 > max){
                list1.clear();
                list1.add(i);
                max = count1;
            }else if(count1 == max){
                list1.add(i);
            }

            if(count2 > max){
                list2.clear();
                list2.add(i);
                max = count2;
            }else if(count2 == max){
                list2.add(i);
            }


        }
        System.out.println("row " + list1 + " column" + list2);

    }
}

package Experiment06.Exercise17;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer m: ");
        Integer m = scanner.nextInt();
        Integer n = perfectNumber(m);
        System.out.println("The smallest number n for m * n to be perfect number is" + n);
        System.out.println("m * n is " + m * n);

    }

    public static Integer perfectNumber(Integer m) {

        //创建一个arraylist来储存因子
        ArrayList<Integer> factor = new ArrayList<>();
        while (m != 1) {
            for (int i = 2; i <= m ; i++) {
                if (m % i == 0) {
                    factor.add(i);
                    m /= i;
                    break;
                }
            }
        }
        //创建一个ArrayList来储存出现奇数次的因子
        ArrayList<Integer> oddTimes = new ArrayList<>();
        //遍历数组，找出出现奇数次的因子并储存
        for (int i = 0; i < factor.size(); i++) {
            Integer count = 0;
            for (int j = 0; j < factor.size(); j++) {
                if (factor.get(i).equals(factor.get(j))) {
                    count++;
                }
            }
            if (count % 2 == 1 && !oddTimes.contains(factor.get(i))) {
                oddTimes.add(factor.get(i));
            }
        }
        //返回所有奇数次的因子的乘积
        Integer result = 1;
        for (int i = 0; i < oddTimes.size(); i++) {
            result *= oddTimes.get(i);
        }
        return result;

    }
}

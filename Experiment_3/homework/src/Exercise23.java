//模式识别方面：四个连续相等的数

import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of values:");
        int number = input.nextInt();
        System.out.println("Enter the values: ");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextInt();

        }
        if (isConsecutiveFour(values)) {
            System.out.println("The list has consecutive fours.");
        }else{
            System.out.println("The list has no consecutive fours.");
        }
    }

    //创建方法判断是否符合条件
    public static boolean isConsecutiveFour(int[] values) {
        boolean result = false;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == values[i + 1]
                    && values[i] == values[i + 2]
                    && values[i] == values[i + 3]){
                result = true;
                break;
            }
        }
        return result;
    }
}

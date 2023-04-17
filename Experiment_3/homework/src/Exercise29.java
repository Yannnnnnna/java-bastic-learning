import java.util.Scanner;

//探索矩阵
public class Exercise29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size for the Matrix: ");
        int size = input.nextInt();
        int arr[][] = new int[size][size];
        //产生随机数
        arr = random(arr);
        //输出数组
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        //判断结果
        result(arr);
    }

    public static int[][] random(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 2);
            }
        }
        return arr;
    }

    public static void result(int arr[][]) {
        //判断行
        boolean bool1 = true;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length - 1; j++) {
                if (arr[i][j] != arr[i][j + 1]) {
                    bool1 = false;
                    break;
                }
            }
            if (bool1) {
                System.out.printf("All %ds on row %d\n", arr[i][0], i + 1);
            }
        }
        if (!bool1) {
            System.out.println("No same numbers on  row.");
        }
        //判断列
        boolean bool2 = true;
        for (int j = 0; j < arr.length; j++) {

            for (int i = 0; i < arr[i].length - 1; i++) {
                if (arr[i][j] != arr[i + 1][j]) {
                    bool2 = false;
                    break;
                }
            }
            if (bool2) {
                System.out.printf("All %ds on row %d\n", arr[0][j], j + 1);
            }
        }
        if (!bool2) {
            System.out.println("No same numbers on  column.");
        }
        //判断对角线
        boolean bool3 = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i][i] != arr[i + 1][i + 1]) {
                bool3 = false;
            }
        }
        if (bool3 == true) {
            System.out.printf("All %ds on the major diagonal\n", arr[0][0]);
        }else{
            System.out.println("No same numbers on the major diagonal.");
        }
        boolean bool4 = true;
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i][i] != arr[i - 1][i - 1]) {
                bool4 = false;
            }
        }
        if (bool4) {
            System.out.printf("All %ds on the major sub-diagonal\n", arr[arr.length - 1][arr.length - 1]);
        }else{
            System.out.println("No same numbers on the major sub-diagonal.");
        }
    }
}


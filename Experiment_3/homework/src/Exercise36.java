import java.util.Scanner;

//拉丁正方形
public class Exercise36 {
    public static void main(String[] args) {
        Scanner input =new  Scanner(System.in);
        System.out.println("Enter number n: ");
        int n = input.nextInt();
        System.out.println("Enter " + n + " rows of letters separated by spaces:");
        char [][] arr = new char[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.next().charAt(0);
                if(arr[i][j] < 'A' || arr[i][j] >'A' + n){
                    System.out.printf("Wrong input: the letter must be from %c to %c", 
                            'A', 'A' + n);
                    System.exit(1);
                }
            }
        }
        boolean bool1 = false;
        boolean bool2 = false;
        for (int i = 0; i < arr.length; i++) {
            bool1 = isRow(arr, arr[0][i], 0);
            bool2 = isColumn(arr, arr[i][0], 0);
        }
        if(bool1 && bool2){
            System.out.println("The input array is a Latin spaces.");
        }else{
            System.out.println("The input array is not a Latin spaces.");
        }
    }
    //判断行是否相同
    public static boolean isRow(char [][]arr, int target, int a) {
        int count = 0;
        //查找行是否有相同
        for (int i = 0; i < arr.length; i++) {
            if (arr[a][i] == target) {
                count++;
            }
            if (count >= 2) {
                return false;
            }

        }
        return true;
    }
    //判断列是否相同
    public static boolean isColumn(char [][]arr, int target, int b){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr [i][b] == target){
                count++;
            }
            if(count >= 2){
                return false;
            }

        }
        return true;
    }

}

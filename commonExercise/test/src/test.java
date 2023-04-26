import java.util.Scanner;


public class test {
    public static void main(String[] args) {
        Mytools mt = new Mytools();
        int[] arr = {10, -1, 8, 0,};
        mt.bubble(arr);
        Scanner input = new Scanner(System.in);

        System.out.println("=====排序后的arr======");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

}

class Mytools {
    public void bubble(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

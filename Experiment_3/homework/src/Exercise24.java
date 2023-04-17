import java.util.Scanner;

public class Exercise24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //数组一
        System.out.println("Enter list1:");
        int length1 = input.nextInt();
        int[] list1 = new int[length1];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }
        //输入数组二的长度和内容
        System.out.println("Enter list2: ");
        int length2 = input.nextInt();
        int[] list2 = new int[length2];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }
        int[] list4 = merge(list1, list2);
        for (int i = 0; i < list4.length; i++) {
            System.out.print(list4[i] + " ");
        }
    }

    //创建方法合并两个数组，返回一个数组
    public static int[] merge(int[] list1, int[] list2) {
        int list3[] = new int[list1.length + list2.length];
        //先将两个数组合并然后进行冒泡排序
        //合并
        for (int i = 0; i < list1.length; i++) {
            list3[i] = list1[i];
        }
        for (int i = list1.length; i < list3.length; i++) {
            list3[i] = list2[i - list1.length];
        }
        int temp = 0;
        for (int i = 0; i < list3.length - 1; i++) {
            for (int j = 0; j < i; j++) {
                if(list3[j] > list3[j + 1]){
                    temp = list3[j];
                    list3[j] = list3[j + 1];
                    list3[j + 1] = temp;
                }
            }
        }
        return list3;
    }
}

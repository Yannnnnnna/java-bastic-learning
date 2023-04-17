import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //输入数组一的长度和内容
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
        //调用方法判断是否相等
        if (isIdentical(list1, list2)) {
            System.out.println("Two list are strictly identical.");
        }else {
            System.out.println("Two list are not strictly identical.");
        }
    }
    //创建方法判断两个数组是否相等
    public static boolean isIdentical(int list1[], int list2[]){
        if(list1.length == list2.length){
            for (int i = 0; i < list1.length; i++) {
                if(list1[i] != list2[i]){
                    return false;
                }
            }
        }else{
            return false;
        }
        return true;
    }
}

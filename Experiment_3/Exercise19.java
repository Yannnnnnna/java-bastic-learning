//是否排好序？
//

import java.util.Scanner;
public class Exercise19{
	public static void main(String[] args) {
        System.out.println("数字的长度：");
        Scanner input = new Scanner(System.in);

        int length = input.nextInt();
        int arr[] = new int[length];
        System.out.println("请输入数字：");
        for(int i = 0; i < length; i++){
            arr[i] = input.nextInt();
        }
        if(isSorted(arr)){
            System.out.println("The list is already sorted.");
        }else{
            System.out.println("The list is not sorted.");
        }
        
        

    }
    public static boolean isSorted(int[] list){
        for(int i = 0; i < list.length - 1; i++){
            if(list[i] > list[i + 1]){
                return false;
            }
        }
        return true;
    }
        
} 
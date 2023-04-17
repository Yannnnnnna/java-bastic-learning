//找出最小元素的下标
//创建一个数组，输入十个数
//遍历数组，找出最小元素的下标

import java.util.Scanner;
public class Exercise16{
	public static void main(String[] args) {
        //创建一个新数组储存输入的值
        double arr[] = new double[10];
        //输入十个数字
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        
        //输入
        for(int i = 0; i < 10; i++){
        	double num = input.nextDouble();
            arr[i] = num;
        	
        }
        int index = indexOfSmsllestElement(arr);
        	
        
        System.out.println("最小值下标为： " + index);
        System.out.println("最小值为： " + arr[index]);
       
       


    }
    public static int indexOfSmsllestElement(double[] arrary){
        int index = 0;
        double min = arrary[0];
        for(int i = 0; i < arrary.length; i++){
            if(arrary[i] < min){
                index = i;
                min = arrary[i];
            }
        }
        return index;
    }
}
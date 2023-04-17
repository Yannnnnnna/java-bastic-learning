//打印不同的数
//1.输入十个数
//2.计算不同的数有几个
//3.输出不同的数

import java.util.Scanner;
public class Exercise14{
	public static void main(String[] args) {
        //创建一个新数组储存输入的值
        int arr[] = new int[10];
        //输入十个数字
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        //创建一个变量储存不重复的数字
        int count = 0;
        //输入加判断
        for(int i = 0; i < 10; i++){
        	int nextInput = input.nextInt();
        	//假设不是重复的数字
        	boolean bool = true;
        	//遍历数组看是否重复
        	for(int j = 0; j < i; j++){
        		//如果重复把假设改为false
        		if(arr[j] == nextInput){
        			bool = false;
        		}
        	}
        	//如果不重复，计数加一，同时把值赋给数组
        	if(bool){
        		count++;
        		arr[count - 1] = nextInput;
        	}

        }
        //输出不重复数字个数
        System.out.println("The number of distinct numbers is " + count);
        System.out.print("The distinct numbers are: ");
        //输出不重复的数字，到count前是有效数字
        for (int i = 0 ; i < count ; i++){
            System.out.print(arr[i] + " ");
        }


    }
}
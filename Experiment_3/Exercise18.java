//消除重复
//创建一个变量记录不重复的个数
//创建一个数组储存输入的十个数
//遍历数组观察重复的个数
//调用方法将不重复的数打印出来

import java.util.Scanner;
public class Exercise18{
	public static void main(String[] args) {
        System.out.println("请输入十个数字：");
        //输入十个数字
        Scanner input = new Scanner(System.in);
        int arr[] = new int[10];
        for(int i = 0; i < 10; i++){
            int num = input.nextInt();
            arr[i] = num;
        }
        //调用对象
       int numbers[] = eliminateDuplicates(arr);
       //输出新数组
       for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
       }


    }
    public static int[] eliminateDuplicates(int[] list){
        //计算重复的个数
        int count = 0;
        for(int i = 0; i < 10; i++){
            //判断前面是否有相同的数
            for(int j = 0; j < i; j++){
                //如果有相同的数，计数加一，跳出循环
                if(list[i] == list[j]){
                    count++;
                    break;
                }
            }
        }
        //创建一个新数组来储存不同的数字
        int numbers[] = new int[10 - count];
        for(int i = 0,j = 0; i < 10 - count; i++, j++){
            //一样就跳过，不一样就储存
            for(int k = 0; k < i; k++){
                if(list[j] == numbers[k]){
                    j++;
                }
            }
            numbers[i] = list[j];

        }
    return numbers;        
      
        
      
        
    }
        
} 
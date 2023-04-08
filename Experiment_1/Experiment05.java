//求一个整数各个位数的和
//  
//	1.求整数的位数
//	2.分离各个位数
//	3.把各个位数的数字相加
//	4.化死为活：输入一个数字
import java.util.Scanner;
public class Experiment05{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		System.out.print("Please enter the number(1-1000): ");
		
		int num = input.nextInt();//输入一个数字
		int a = num;
		int count = 0;
		//计算位数
		while(a / 10 != 0){
			a /= 10;
			count++;
		}
				
		count++;
		
		
		System.out.println("这是一个" + count + "位数");

		//分离各个位数的数并相加
		
		int sum = 0;
		for(int i = 1, temp = 0; i <= count; i++){
			 temp = num % 10;
			 num /= 10;
			 sum += temp;
		}
		System.out.println("和为" + sum);
	}

}
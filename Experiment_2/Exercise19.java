//最大数出现的次数
//输入以零为结尾 for循环



import java.util.Scanner;
public class Exercise19{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		//输入一个整数
		System.out.println(" 请输入一个整数： ");
		int count = 1, max = 0, number = 0;
		for(;;){
			 number = input.nextInt();
			 //判断输入是否到结尾
			if(number == 0){
				break;
			}
			//作比较
			//相等最大值计数，大于count变为一，重新记数
			if(max > number){

			}else if(max == number){
				count++;
			}else{
				max = number;
				count = 1;
			}


		}
		System.out.println("最大值出现的次数为： " + count);
		System.out.println("最大值为： " + max);
				
	
	}
}
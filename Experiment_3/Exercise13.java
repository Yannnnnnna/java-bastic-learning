//格式化整数
//

import java.util.Scanner;
public class Exercise13{
	public static void main(String[] args){
		System.out.println("请输入数字和指定的长度：");
		
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int width = input.nextInt();
		System.out.println(format(number, width));
		
				
	
	}
	
	
	//接受数字和宽度
	//返回字符串
	public static String format(int number, int width){
		int count = 0;
		int temp = number;
		while(temp != 0){
			temp /= 10;
			count++;
		}
		int zero = width - count;
		String str = "";
		for(int i = 1; i <= zero; i++){
			str = str + "0";
		}
		return str + number;
		
	}
	
	

}
//找到将来的日期
//1.输入一个数字和未来的天数
//2.加上后的日期表示的星期数：
//如果大于六就减六
//switch-case 输出数字对应的星期数

import java.util.Scanner;
public class FutureDay{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入今天的日期：");
		int day = input.nextInt();
		System.out.println("请输入经过的天数：");
		int digit = input.nextInt();

		int lastday = day + digit;
		while(lastday > 6){
			lastday -= 7;
		
		}
		switch(lastday){
			case 0: System.out.println("星期天");
			break;
			case 1: System.out.println("星期一");
			break;
			case 2: System.out.println("星期二");
			break;
			case 3: System.out.println("星期三");
			break;
			case 4: System.out.println("星期四");
			break;
			case 5: System.out.println("星期五");
			break;
			case 6: System.out.println("星期六");
			break;

		}



	}
}
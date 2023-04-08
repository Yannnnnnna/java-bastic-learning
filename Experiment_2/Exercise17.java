//十进制到八进制
import java.util.Scanner;
public class Exercise17{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		System.out.print("请输入一个十进制整数： ");
		int num = input.nextInt();
		
		int eight[] = new int[32];//创建数组储存八进制
		//倒叙赋值
		for(int i = 31;i >= 0 ;i--){
			eight[i] = num % 8;//对八取余，赋值给数组
			num /= 8;
		}
		//输出八进制
		for(int j = 0; j < 32; j++){
		System.out.print(eight[j] + " ");
		}
		

		
	}

}
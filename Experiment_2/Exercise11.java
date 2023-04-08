
//找出一个整数的因子
import java.util.Scanner;
public class Exercise11{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		//输入一个整数
		int number = input.nextInt();

		for(int i = 2; i <= number; i++){
			if(number % i == 0){
				number /= i;
				System.out.print(i +", ");
				i = 1;
			}
		}
		
				
	
	}
}
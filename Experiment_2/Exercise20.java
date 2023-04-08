//统计：计算平均值和标准方差
import java.util.Scanner;
public class Exercise20{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
	
		System.out.println(" 请输入十个数： ");
		
		double sum = 0, stdsum = 0;
		for(int i = 1; i <= 10; i++){
			double number = input.nextDouble();
			sum += number;
			stdsum += number * number;
		}
		double mean = sum / 10.0;
		double standard = Math.sqrt((stdsum - sum * sum / 10) / 9);
		System.out.println(" The mean is " + mean);
		System.out.println("The standard deviation is ： " + standard);
	
	}
}
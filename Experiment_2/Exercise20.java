//ͳ�ƣ�����ƽ��ֵ�ͱ�׼����
import java.util.Scanner;
public class Exercise20{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
	
		System.out.println(" ������ʮ������ ");
		
		double sum = 0, stdsum = 0;
		for(int i = 1; i <= 10; i++){
			double number = input.nextDouble();
			sum += number;
			stdsum += number * number;
		}
		double mean = sum / 10.0;
		double standard = Math.sqrt((stdsum - sum * sum / 10) / 9);
		System.out.println(" The mean is " + mean);
		System.out.println("The standard deviation is �� " + standard);
	
	}
}
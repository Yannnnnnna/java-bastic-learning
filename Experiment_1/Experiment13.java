//游戏：三个数的加法
import java.util.Scanner;
import java.util.Random;
public class Experiment13{
	public static void main(String[] args){
		
		Random random = new Random();
		int num1 = random.nextInt(10);
		int num2 = random.nextInt(10);
		int num3 = random.nextInt(10);
		System.out.println(num1 + " " + num2 + " " + num3);
		int sum = num1 + num2 + num3;
		
		System.out.println("Please enter the sum:");
		Scanner input = new Scanner (System.in);
		int inputsum = input.nextInt();

		if(inputsum == sum){
			System.out.println("Right");
		}else{
			System.out.println("Fault");
		}


	}

}
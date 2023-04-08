//医疗应用程序
import java.util.Scanner;
public class Experiment09{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		
		System.out.print("Please enter the weight: ");
		double weight = input.nextDouble();
		
		System.out.print("Please enter the meter: ");
		double meter = input.nextDouble();
		weight *= 0.45359237;
		meter *= 0.0254;
		
		double BMI = weight / meter / meter;
		
		System.out.println("BMI is" + BMI );

		
	
	}

}
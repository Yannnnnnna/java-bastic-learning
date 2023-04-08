import java.util.Scanner;
public class Experiment07{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		
		System.out.print("Please enter the speed v: ");
		double v = input.nextDouble();
		
		System.out.print("Please enter the acceleration a: ");
		double a = input.nextDouble();
		
		
		double runway = v * v / (2 * a);
		
		System.out.println("The minimum runway length for this airplane  is " 
			+ runway + " meters" );

		
	
	}

}
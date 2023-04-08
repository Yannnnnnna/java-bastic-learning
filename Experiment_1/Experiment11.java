import java.util.Scanner;
public class Experiment11{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		
		System.out.print("Please enter the banance and annual interest rate: ");
		double balance = input.nextDouble();
		double rate = input.nextDouble();
		
		double interest = balance * (rate / 1200);		
		System.out.println("The interest is" + interest );

		
	
	}

}
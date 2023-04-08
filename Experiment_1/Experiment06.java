//¼ÆËãÄÜÁ¿
import java.util.Scanner;
public class Experiment06{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		
		System.out.print("Please enter the amount of water in kilograms: ");
		double kilo = input.nextDouble();
		
		System.out.print("Please enter the initial temperature: ");
		double intem = input.nextDouble();
		
		System.out.print("Please enter the final temperature: ");
		double fitem = input.nextDouble();
		
		double energy = kilo * (fitem - intem) * 4184;
		System.out.println("The energy needed is " + energy);

		
	
	}

}
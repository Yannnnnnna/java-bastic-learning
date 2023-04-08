import java.util.Scanner;

public class Computeraverage{
	public static void main (String[] args){
		Scanner input = new Scanner (System.in);
		System.out.print("Enter three number : ");
		Double number1 = input.nextDouble();
		Double number2 = input.nextDouble();
		Double number3 = input.nextDouble();

		double average = (number1 + number2 + number3)/3;

		System.out.println("The average of " + number1 + " " + number2
		 + "" + number3 + "is" + average);
	}
}
//»ØÎÄÊı×Ö
import java.util.Scanner;
public class Experiment15{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		
		System.out.print("Please enter a three-digit integer: ");
		int number = input.nextInt();
		
		int fist = number / 100;
		int last = number % 100 % 10;

		if(fist == last){
			System.out.print(number + "is a palindrome");
		}else{
			System.out.print(number + " is not a palindrome");
		}
		

		
	
	}

}
//Ê¹ÓÃ²Ù×÷·û
import java.util.Scanner;
public class Experiment19
{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		
		System.out.println("Please enter the number: ");
		int number = input.nextInt();

		System.out.println("Is " + number + " divisible by 5 and 6?");
		if(number / 5 == 0 && number / 6 == 0){
			System.out.println("ture");
		}else{
			System.out.println("false");
		}
		
		System.out.println("Is " + number + " divisible by 5 or 6?");
		if(number / 5 == 0 || number / 6 == 0){
			System.out.println("ture");
		}else{
			System.out.println("false");
		}
		
		System.out.println("Is " + number + " divisible by 5 or 6, but not both?");
		if(number / 5 == 0 ^ number / 6 == 0){
			System.out.println("ture");
		}else{
			System.out.println("false");
		}
		
		
		

		
	
	}

}
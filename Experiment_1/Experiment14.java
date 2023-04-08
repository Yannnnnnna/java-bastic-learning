//…Ã“µ£∫ºÏ≤È
import java.util.Scanner;
public class Experiment14{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		int last = 0;
		System.out.println("Please enter the fist 9 digits of an ISBN as integer: ");
		
		int ISBN[] = new int [9];

		for(int i = 0; i < 9; i++){
			ISBN[i] = input.nextInt();
			last += ISBN[i] * (i+1);
			}
		System.out.print("The ISBN-10 number is:");
		for(int i = 0; i < 9; i++){
			System.out.print(ISBN[i]);
		}
		
		if(last % 11 == 10){
			System.out.print("x");
		}else{
			System.out.print(last % 11);
		}
	}

}
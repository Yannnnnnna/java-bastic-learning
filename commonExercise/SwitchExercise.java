import java.util.Scanner;

public class SwitchExercise{
	public static void main (String[] args){
		Scanner input = new Scanner (System.in);
		
		System.out.print("Please enter the letter: ");
		char c1 = input.next().charAt(0);

		switch(c1){
			
		case 'a':
			System.out.print("A");
			break;

		case 'b':
			System.out.print("B");
			break;
		}
	}	
}		
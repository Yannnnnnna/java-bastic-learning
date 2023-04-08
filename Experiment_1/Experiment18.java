//”Œœ∑ÃÙ“ª’≈≈∆
import java.util.Scanner;
import java.util.Random;
public class Experiment18{
	public static void main(String[] args){
		
		Random random = new Random();
		int size = random.nextInt(12);
		int color = random.nextInt(3);
		
		String[] Size = new String[]{"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10","Jack", "Queen", "King"};
		
		String[] Color = new String[]{"Clubs", "Diamonds", "Hearts", "Spades"};
		
		
		
		System.out.println("The card you pick is " + Size[size]+ " of " + Color[color]);
		


	}

}
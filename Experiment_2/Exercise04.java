//电话键盘
import java.util.Scanner;
public class Exercise04{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		
		System.out.print("Please enter an uppercase letter:");
		char letter = input.next().charAt(0);
		int result = 1;
		if((letter >= 'a' && letter <= 'c') && (letter >= 'A' && letter <= 'C')){
			result = 2;
		}else if((letter >= 'd' && letter <= 'f') && (letter >= 'D' && letter <= 'F')){
			result = 3;
		}else if((letter >= 'g' && letter <= 'i') && (letter >= 'G' && letter <= 'I')){
			result = 4;
		}else if((letter >= 'j' && letter <= 'l') && (letter >= 'J' && letter <= 'L')){
			result = 5;
		}else if((letter >= 'm' && letter <= 'o') && (letter >= 'M' && letter <= 'O')){
			result = 6;
		}else if((letter >= 'p' && letter <= 's') && (letter >= 'P' && letter <= 'S')){
			result = 7;
		}else if((letter >= 't' && letter <= 'v') && (letter >= 'T' && letter <= 'V')){
			result = 8;
		}else if((letter >= 'w' && letter <= 'z') && (letter >= 'W' && letter <= 'Z')){
			result = 9;
		}else{
			System.out.print(letter + "is an invalid input");
		}
		System.out.print("The corresponding number is " + result);
	}

}

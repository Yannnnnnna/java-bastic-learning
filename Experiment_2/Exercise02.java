//给出ASCII码对应的字符
import java.util.Scanner;
public class Exercise02{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		
		System.out.print("Please enter an ASCII code:");
		int num = input.nextInt();
		char ch = (char)num;
		System.out.print("The character for ASCII code "+ num +" is " + ch);
		
	}

}

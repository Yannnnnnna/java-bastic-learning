import java.util.Scanner;

public class If02{
	public static void main (String[] args){

		int num1 = 5;
		int num2 = 6;
		int num3 = num1 +num2;

		if(num3 % 3 == 0 && num3 % 5 == 0){
			System.out.println("Yes");
		}else{
			System.out.println("NO");
		}
	}
}
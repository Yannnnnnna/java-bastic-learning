//½ðÈÚ£º»õ±Ò¶Ò»»
import java.util.Scanner;
public class Experiment20{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		
		System.out.print("Please enter exchange rate from dollars to RMB:");
		double exchangeRate = input.nextDouble();

		System.out.print("Enter 0 to convert dollers to RMB and 1 vice verse");
		int num = input.nextInt();

		if(num == 0){
			System.out.print("Enter the dollar amount");
			double dollarAmount = input.nextDouble();
			System.out.print(dollarAmount + "is " + dollarAmount * exchangeRate + " yuan");
		
		}else if(num == 1){
			System.out.print("Enter the RMB amount");
			double rmbAmount = input.nextDouble();
			System.out.print(rmbAmount + "is " + rmbAmount / exchangeRate + " yuan");

		}else{
			System.out.print("Your input is wrong");
		}

		

	
	}

}
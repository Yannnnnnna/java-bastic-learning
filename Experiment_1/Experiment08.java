//财务应用程序
import java.util.Scanner;
public class Experiment08{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		
		System.out.print("Please enter the amount to be saved for each month: ");
		double amount = input.nextDouble();
		
		System.out.print("Please enter the annual interest rate: ");
		double rate = input.nextDouble();
		
		System.out.print("Please enter the number of month: ");
		double month = input.nextDouble();
		
		double  month_rate = rate / 12 / 100;
		
		double account = amount;
		for(int i = 1; i <= month; i++){
			if(i == 1){
				
			}else{
				account += amount;
				account *= (1 + month_rate);
			}
			
			
			System.out.println(account);
		}
		
		
		System.out.println("After the " + month + " month, the account value is" + account);

		
	
	}

}
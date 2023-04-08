//给出ASCII码对应的字符
import java.util.Scanner;
public class Exercise05{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		
		System.out.print("Please enter a year:");
		int year = input.nextInt();
		System.out.print("Please enter month:");
		String month = input.next();
		int day = 0;
		switch(month){
			case "Mon" :
			case "Mar" :
			case "May" :
			case "Aut" :
			case "Jul" :
			case "Oct" :
			case "Dec" :
				day = 31;
				break;
			case "Apr" :
			case "Jun" :
			case "Sep" :
			case "Nov" :
				day = 30;
				break;
			case "Feb" :
				day = 28;
				break;

		}
		


		System.out.print(month + " " + year + " has " + day + " days .");
		
	}

}

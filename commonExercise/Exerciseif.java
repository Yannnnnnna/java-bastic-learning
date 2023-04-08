import java.util.Scanner;

public class Exerciseif{
	public static void main (String[] args){
		Scanner input = new Scanner (System.in);
		System.out.print("Please enter the month: ");
		
		int month = input.nextInt();
		
		
		if(month > 0 && month < 13){

			
			if(month >= 4 && month <= 10){
				System.out.print("Please enter the age: ");
				int age = input.nextInt();
				
				if(age >= 18 && age <= 60){
					System.out.println("adult price 60");
				}else if(age > 0 && age < 18){
					System.out.println("child price 30");
				}else if(age > 60){
					System.out.println("old price 20");
				}
			
			}else if(month < 4 || month > 10){
				System.out.print("Please enter the age: ");
				int age = input.nextInt();
				
				if(age >= 18 && age <= 60){
					System.out.println("adult price 40");
				}else{
					System.out.println("other price 20");
				}
			}

		}else{
			System.out.println("Wrong,please enter again!");
		}
	}
}
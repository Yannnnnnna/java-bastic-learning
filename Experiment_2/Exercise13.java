//����Ӧ�ó�����ʾ���ڻ���ʱ���
import java.util.Scanner;
public class Exercise13{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		//���������
		System.out.print("Enter loan amount, for example 120000.9��");
		double loan = input.nextDouble();
		//�����������
		System.out.print("Enter number of years as an integer ,for example 5: ");
		int years = input.nextInt();
		//��������
		System.out.print("Enter yearly interest rate ,for example 8.25  �� ");
		double rate = input.nextDouble();
		//������
		double month_rate = rate / 1200.0;
		
			
		//ÿ�»�����
		double month_payment = (loan * month_rate * Math.pow(1 + month_rate,years*12) / (Math.pow(1 + month_rate,years * 12) - 1));
		System.out.println("Monthly Payment �� " + month_payment);
		double interest, interest1, principal, balance = loan;
		double Total_Payment = 0;

		for(int i = 1;i <= years*12;i++){
		
			interest1 = month_rate*balance;
			Total_Payment += interest1;
		}
		System.out.println("Total Payment  �� " + (Total_Payment+loan));

		System.out.println("payment#"+"\t"+"Interest"+"\t"+"Principal"+"\t"+"Balance");	
		
		for(int i = 1; i <= years * 12; i++) {
				
			interest = month_rate * balance;
			principal = month_payment - interest;
			balance = balance - principal;
			System.out.printf("%d\t\t%.2f\t\t%.2f \t\t%.2f\n", i, interest, principal, balance);
		}


	}
}

				// double interest,interest1,principal,balance=loan,Total_Payment=0 ;
				
				// System.out.println("payment#"+"\t\t"+"Interest"+"\t\t"+"Principal"+"\t\t"+"Balance");
				// int i=1;
				// double mon_payment=(loan*mon_rate*Math.pow(1+mon_rate,years*12)/(Math.pow(1+mon_rate,years*12)-1));
				// System.out.println("Monthly Payment �� "+mon_payment);
				// for(i=1;i<=years*12;i++) 
				// {
				// 	interest1=mon_rate*balance;
				// Total_Payment+=interest1;
				// }
				// System.out.println("Total Payment  �� "+(Total_Payment+loan));
				// System.out.println("payment#"+"\t"+"Interest"+"\t"+"Principal"+"\t"+"Balance");
				// for(i=1;i<=years*12;i++) 
				// {
				// 	interest=mon_rate*balance;
				// 	principal=mon_payment-interest;
				// 	balance=balance-principal;
				// 	//System.out.println(i+"\t\t"+interest+"\t\t"+principal+"\t\t"+balance);
				// 	System.out.printf("%d\t\t%.2f\t\t%.2f \t\t%.2f\n",i,interest,principal,balance);
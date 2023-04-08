//检查字串
import java.util.Scanner;
public class Exercise08{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		//输入信息
		System.out.print("Please enter employee's name: ");
		String name = input.nextLine();
		System.out.print("Please enter number of hours worked in a week: ");
		int work_hour = input.nextInt();
		System.out.print("Please enter  hourly pay rate: ");
		double hourly_pay = input.nextDouble();
		System.out.print("Please enter federal tax withhoulding rate: ");
		double federal_rate = input.nextDouble();
		System.out.print("Please enter state tax withhoulding rate: ");
		double state_rate = input.nextDouble();
		
		//计算
		double gross_pay = work_hour * hourly_pay;
		
		double federal_withholding = gross_pay * federal_rate;
		
		double state_withholding = gross_pay * state_rate;
		double total_deduction = federal_withholding + state_withholding;

		double net_pay = gross_pay - total_deduction;
		//输出信息
		System.out.println("employee name: " + name);
		System.out.println("Hours Worked: " + work_hour);
		System.out.println("Pay rate: " + hourly_pay);
		System.out.println("gross pay" + gross_pay);
		System.out.println("Deductions: ");
		System.out.println("\t federal withholding (" + federal_rate + "%%) : " + federal_withholding);
		System.out.println("\t state withholding (" + state_rate + "%%) : " + state_withholding);
		System.out.println("total deduction: " + total_deduction);
		System.out.println("net pay: " + net_pay);
	}
}
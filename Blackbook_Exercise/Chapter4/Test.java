import java.util.Scanner;

public class Test{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		//ÊäÈë
		int data = input.nextInt();
		int sum = 0;
		while(data != 0){
			sum += data;

		}
		
		System.out.println(sum);
	}
}
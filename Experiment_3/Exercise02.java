//��һ��������������֮��
import java.util.Scanner;
public class Exercise02{

public static void main(String[] args) {
		Math amount = new Math();
		Scanner input = new Scanner(System.in);
		System.out.println("������һ������");
		int number = input.nextInt();
		
		System.out.print(amount.sumDigits(number));

	}
}
class Math{
	public static int sumDigits(long n){
		int sum = 0;
		while(n != 0){
			sum += n % 10;
			n /= 10;
		}

		return sum;
	}
}
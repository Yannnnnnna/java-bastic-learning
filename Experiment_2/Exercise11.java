
//�ҳ�һ������������
import java.util.Scanner;
public class Exercise11{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		//����һ������
		int number = input.nextInt();

		for(int i = 2; i <= number; i++){
			if(number % i == 0){
				number /= i;
				System.out.print(i +", ");
				i = 1;
			}
		}
		
				
	
	}
}
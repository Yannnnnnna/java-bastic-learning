//��ѧ��ƽ�����Ľ�����

import java.util.Scanner;
public class Exercise08{

public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("������n��");
		
		long n = input.nextLong();
		System.out.println(sqrt(n));
	}

//������1.����һ��double
//		2.ѭ�����㹫ʽ
//		3.����һ��long


	public static double sqrt(long n){
		double lastGuess = 1L;
		double nextGuess = (lastGuess + n / lastGuess) / 2;
		while(nextGuess - lastGuess >= 1e-4){
			
		
			 lastGuess = nextGuess ;
			nextGuess = (lastGuess + n / lastGuess) / 2;
		}
		return nextGuess;
	}
}
//数学：平方根的近似求法

import java.util.Scanner;
public class Exercise08{

public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("请输入n：");
		
		long n = input.nextLong();
		System.out.println(sqrt(n));
	}

//方法：1.返回一个double
//		2.循环计算公式
//		3.接受一个long


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
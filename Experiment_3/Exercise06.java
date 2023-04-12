//显示0和1构成的矩阵
import java.lang.Math;
import java.util.Scanner;
public class Exercise06{

public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Print print = new Print();
		System.out.println("请输入n的值：");
		int n = input.nextInt();
		print.printMartrix(n);
	}
}
//方法：1.产生矩阵
//		2.无返回值
//		3.接受一个int 表示n * n

class Print{
	public static void printMartrix(int n){
		
		int count = 0;
		for(int i = 1; i <= n * n; i++){
			if(count == n){
				System.out.println();
				count -= n;
			}
			int number = (int)(Math.random() * 2);
			System.out.print( number + " ");
			count++;
		}	
		
	}
}
//��ʾ0��1���ɵľ���
import java.lang.Math;
import java.util.Scanner;
public class Exercise06{

public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Print print = new Print();
		System.out.println("������n��ֵ��");
		int n = input.nextInt();
		print.printMartrix(n);
	}
}
//������1.��������
//		2.�޷���ֵ
//		3.����һ��int ��ʾn * n

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
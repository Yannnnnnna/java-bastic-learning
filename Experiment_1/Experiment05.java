//��һ����������λ���ĺ�
//  
//	1.��������λ��
//	2.�������λ��
//	3.�Ѹ���λ�����������
//	4.����Ϊ�����һ������
import java.util.Scanner;
public class Experiment05{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		System.out.print("Please enter the number(1-1000): ");
		
		int num = input.nextInt();//����һ������
		int a = num;
		int count = 0;
		//����λ��
		while(a / 10 != 0){
			a /= 10;
			count++;
		}
				
		count++;
		
		
		System.out.println("����һ��" + count + "λ��");

		//�������λ�����������
		
		int sum = 0;
		for(int i = 1, temp = 0; i <= count; i++){
			 temp = num % 10;
			 num /= 10;
			 sum += temp;
		}
		System.out.println("��Ϊ" + sum);
	}

}
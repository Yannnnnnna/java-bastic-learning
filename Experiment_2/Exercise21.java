//��ҵ�����IBSN-13

import java.util.Scanner;
public class Exercise21{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		//����ǰʮ����������Ϊ�ַ���
		System.out.println("Enter the first 12 digits of an ISBN-13 as a string�� ");
		String IBSN_12 = input.next();
		//�ж�����������Ƿ�Ϸ�
		if(IBSN_12.length() != 12){
			System.out.println(IBSN_12 + " is an invalid input.");
		}else{
			//��ȡÿ��������������
			int d1 = (int)IBSN_12.charAt(0);
			int d2 = (int)IBSN_12.charAt(1);
			int d3 = (int)IBSN_12.charAt(2);
			int d4 = (int)IBSN_12.charAt(3);
			int d5 = (int)IBSN_12.charAt(4);
			int d6 = (int)IBSN_12.charAt(5);
			int d7 = (int)IBSN_12.charAt(6);
			int d8 = (int)IBSN_12.charAt(7);
			int d9 = (int)IBSN_12.charAt(8);
			int d10 = (int)IBSN_12.charAt(9);
			int d11 = (int)IBSN_12.charAt(10);
			int d12 = (int)IBSN_12.charAt(11);
			//����β���Ƿ�Ϊ10
			int d13 = 10 - (d1 + 3*d2 +d3 + 3*d4 + d5 + 3*d6 + d7 + 3*d8 + d9 + 3*d10 + d11 + 3*d12) % 10;
			if(d13 == 10){
				d13 = 0;
			}
			//ת��Ϊ�ַ�
			d13 = (char)d13;
			//���
			System.out.println(" The ISBN-13 number is " + IBSN_12 + d13);
		
		}		
	
	}
}
//��ʽ������
//

import java.util.Scanner;
public class Exercise13{
	public static void main(String[] args){
		System.out.println("���������ֺ�ָ���ĳ��ȣ�");
		
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int width = input.nextInt();
		System.out.println(format(number, width));
		
				
	
	}
	
	
	//�������ֺͿ��
	//�����ַ���
	public static String format(int number, int width){
		int count = 0;
		int temp = number;
		while(temp != 0){
			temp /= 10;
			count++;
		}
		int zero = width - count;
		String str = "";
		for(int i = 1; i <= zero; i++){
			str = str + "0";
		}
		return str + number;
		
	}
	
	

}
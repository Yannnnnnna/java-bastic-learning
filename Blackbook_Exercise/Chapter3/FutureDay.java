//�ҵ�����������
//1.����һ�����ֺ�δ��������
//2.���Ϻ�����ڱ�ʾ����������
//����������ͼ���
//switch-case ������ֶ�Ӧ��������

import java.util.Scanner;
public class FutureDay{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("�������������ڣ�");
		int day = input.nextInt();
		System.out.println("�����뾭����������");
		int digit = input.nextInt();

		int lastday = day + digit;
		while(lastday > 6){
			lastday -= 7;
		
		}
		switch(lastday){
			case 0: System.out.println("������");
			break;
			case 1: System.out.println("����һ");
			break;
			case 2: System.out.println("���ڶ�");
			break;
			case 3: System.out.println("������");
			break;
			case 4: System.out.println("������");
			break;
			case 5: System.out.println("������");
			break;
			case 6: System.out.println("������");
			break;

		}



	}
}
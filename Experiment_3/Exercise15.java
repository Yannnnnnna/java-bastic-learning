//ͳ��һλ���ĸ���
//1.�����
//2.����һ����ά����
//3.ͳ��ÿ�������ֵĴ���

import java.lang.Math;
public class Exercise15{
	public static void main(String[] args){
		int counts[][] = new int[10][10];
		arr(counts);
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int count6 = 0;
		int count7 = 0;
		int count8 = 0;
		int count9 = 0;
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				switch(counts[i][j]){
					case 0 : count0++; continue;
					case 1 : count1++; continue;
					case 2 : count2++; continue;
					case 3 : count3++; continue;
					case 4 : count4++; continue;
					case 5 : count5++; continue;
					case 6 : count6++; continue;
					case 7 : count7++; continue;
					case 8 : count8++; continue;
					case 9 : count9++; continue;
				}

			}	
		}
		System.out.println("0 �ĸ����ǣ�" + count0);
		System.out.println("1 �ĸ����ǣ�" + count1);
		System.out.println("2 �ĸ����ǣ�" + count2);
		System.out.println("3 �ĸ����ǣ�" + count3);
		System.out.println("4 �ĸ����ǣ�" + count4);
		System.out.println("5 �ĸ����ǣ�" + count5);
		System.out.println("6 �ĸ����ǣ�" + count6);
		System.out.println("7 �ĸ����ǣ�" + count7);
		System.out.println("8 �ĸ����ǣ�" + count8);
		System.out.println("9 �ĸ����ǣ�" + count9);
	}
	
	//�����������������
	public static void arr(int counts[][]){
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				counts[i][j] = (int)(Math.random() * 10);
			}
		}
		
	}
}
//统计一位数的个数
//1.随机数
//2.创建一个二维数组
//3.统计每个数出现的次数

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
		System.out.println("0 的个数是：" + count0);
		System.out.println("1 的个数是：" + count1);
		System.out.println("2 的个数是：" + count2);
		System.out.println("3 的个数是：" + count3);
		System.out.println("4 的个数是：" + count4);
		System.out.println("5 的个数是：" + count5);
		System.out.println("6 的个数是：" + count6);
		System.out.println("7 的个数是：" + count7);
		System.out.println("8 的个数是：" + count8);
		System.out.println("9 的个数是：" + count9);
	}
	
	//产生随机数存入数组
	public static void arr(int counts[][]){
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				counts[i][j] = (int)(Math.random() * 10);
			}
		}
		
	}
}
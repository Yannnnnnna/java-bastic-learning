//几何：两个矩形
//判断两个矩形是否重叠

import java.util.Scanner;

public class Islap{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		//输入
		System.out.println("Enter r1's center  x- , y- coordinates, width, and height:");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double width1 = input.nextDouble();
		double height1 = input.nextDouble();
		
		System.out.println("Enter r2's center  x- , y- coordinates, width, and height:");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double width2 = input.nextDouble();
		double height2 = input.nextDouble();
		//判断是否重叠
		if((2 * Math.abs(y2 - y1) <= Math.abs(height2 - height1)) && (2 * Math.abs(x2 - x1) <= Math.abs(width2 - width1))){
			System.out.println("r2 is inside r1.");
		}else if((2 * Math.abs(y2 - y1) > Math.abs(height2 + height1)) && (2 * Math.abs(x2 - x1) > Math.abs(width2 + width1))){
			System.out.println("r2 does not overlap r1");
		}else{
			System.out.println("r2 overlap r1");
		}
		
				
	
	}
}
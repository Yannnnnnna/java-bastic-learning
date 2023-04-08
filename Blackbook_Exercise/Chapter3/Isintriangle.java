//几何：点是否在三角形内
//运用数学方法：在直线内侧：点带进直线小于0 x，y大于零
import java.util.Scanner;

public class Isintriangle{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		//输入x，y
		System.out.print("Enter a point's x- and y- coordinates:");
		int x = input.nextInt();
		int y = input.nextInt();

		if((y + 0.5*x - 200 < 0) && x > 0 && y > 0){
			System.out.println("The point is in the triangle.");
		}else{
			System.out.println("The point is not in the triangle.");
		}
		
				
	
	}
}
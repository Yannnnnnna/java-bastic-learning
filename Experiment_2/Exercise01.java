//几何：最大圆距离
import java.util.Scanner;
public class Exercise01{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		
		System.out.print("Please enter point 1 in degree:");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.print("Please enter point 2 in degree:");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		// Math.toRadians(x) 
		x1 = Math.toRadians(x1);
		y1 = Math.toRadians(y1);
		x2 = Math.toRadians(x2);
		y2 = Math.toRadians(y2);

		double rate = 6371.01;
		double d = rate * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1-y2));
		
			System.out.print("distance is" + d + " km ");
		

		
	
	}

}

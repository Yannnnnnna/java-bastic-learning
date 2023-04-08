//几何：六边形面积
import java.util.Scanner;
public class Experiment10{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		
		System.out.print("Please enter the side: ");
		double side = input.nextDouble();
		
		
		double area = 3 / 2 * Math.sqrt(3) * side * side;
		
		System.out.println("The area of the hexagon is" + area );

		
	
	}

}
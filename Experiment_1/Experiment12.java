//代数 ：解一元二次方程
import java.util.Scanner;
public class Experiment12{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		
		System.out.print("Please enter a, b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double discriminant = b * b - (4 * a * c);

		if(discriminant > 0){
			//Math.sqrt(10)
			double r1 = (-b + Math.sqrt(discriminant)) / 2 * a;
			double r2 = (-b - Math.sqrt(discriminant)) / 2 * a;

			System.out.println("The equation has two roots " + r1 + "and" + r2);
		}else if(discriminant == 0){
			double r = -b / 2 * a;
			System.out.println("The equation has one roots " + r);
		}else{
			System.out.println("The equation has no real roots ");
		}
	
	}

}
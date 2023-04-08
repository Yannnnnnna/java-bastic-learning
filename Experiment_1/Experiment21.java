//几何：点的位置
import java.util.Scanner;
public class Experiment21{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		
		System.out.print("Please enter three points fo p0, p1 and p2: ");
		double x0 = input.nextDouble();
		double y0 = input.nextDouble();
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		double resule = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 * y0);
		if(resule > 0){
			System.out.print("on the left");
		}else if(resule == 0){
			System.out.print("on the line");
		}else{
			System.out.print("on the right");
		}

		
	
	}

}
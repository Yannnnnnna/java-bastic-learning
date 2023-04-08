//判断点是否在圆内
import java.util.Scanner;
public class Isinyuan{
	public static void main(String[] args){
		System.out.println("请输入一个坐标");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();

		double d = Math.sqrt(a*a + b*b);
		if(d <= 10){
			System.out.println("在圆内");
		}else{
			System.out.println("不在圆内");
		}
	}
}

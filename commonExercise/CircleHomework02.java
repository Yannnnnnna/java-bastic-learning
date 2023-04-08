//判断整数的范围
import java.util.Random;
public class CircleHomework02{
	public static void main(String[] args){
		Random r = new Random();

		int i = r.nextInt();
		System.out.println("这个数是" + i);
		if(i > 0){
			System.out.println("这个数大于零");
		}else if(i == 0){
			System.out.println("这个数等于零");

		}else {
			System.out.println("这个数小于零");
		}
	}

}
//数列求和

public class Exercise05{

public static void main(String[] args) {
		Math print = new Math();
		System.out.println("i\t\tm(i)");
		System.out.println("-------------------------");
		for(int i = 1; i <= 20; i++){
			System.out.printf("%d\t\t%.4f\n", i, print.array(i));
		}

	}
}
//方法：1.计算数列和
//		2.返回double
//		3.接受一个int 表示项数
class Math{
	public static double array(int n){
		double result = 0;

		for(int i = 1; i <= n; i++){
			result += 1.0 * i / (i + 1);
		}
		return result;
	}
}
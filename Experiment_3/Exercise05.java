//�������

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
//������1.�������к�
//		2.����double
//		3.����һ��int ��ʾ����
class Math{
	public static double array(int n){
		double result = 0;

		for(int i = 1; i <= n; i++){
			result += 1.0 * i / (i + 1);
		}
		return result;
	}
}
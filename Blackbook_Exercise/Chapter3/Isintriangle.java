//���Σ����Ƿ�����������
//������ѧ��������ֱ���ڲࣺ�����ֱ��С��0 x��y������
import java.util.Scanner;

public class Isintriangle{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		//����x��y
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
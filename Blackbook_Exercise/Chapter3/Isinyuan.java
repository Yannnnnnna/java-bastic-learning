//�жϵ��Ƿ���Բ��
import java.util.Scanner;
public class Isinyuan{
	public static void main(String[] args){
		System.out.println("������һ������");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();

		double d = Math.sqrt(a*a + b*b);
		if(d <= 10){
			System.out.println("��Բ��");
		}else{
			System.out.println("����Բ��");
		}
	}
}

//�ж������ķ�Χ
import java.util.Random;
public class CircleHomework02{
	public static void main(String[] args){
		Random r = new Random();

		int i = r.nextInt();
		System.out.println("�������" + i);
		if(i > 0){
			System.out.println("�����������");
		}else if(i == 0){
			System.out.println("�����������");

		}else {
			System.out.println("�����С����");
		}
	}

}
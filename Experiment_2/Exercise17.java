//ʮ���Ƶ��˽���
import java.util.Scanner;
public class Exercise17{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		System.out.print("������һ��ʮ���������� ");
		int num = input.nextInt();
		
		int eight[] = new int[32];//�������鴢��˽���
		//����ֵ
		for(int i = 31;i >= 0 ;i--){
			eight[i] = num % 8;//�԰�ȡ�࣬��ֵ������
			num /= 8;
		}
		//����˽���
		for(int j = 0; j < 32; j++){
		System.out.print(eight[j] + " ");
		}
		

		
	}

}
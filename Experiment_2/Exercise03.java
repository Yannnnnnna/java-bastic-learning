//ʮ������ת������
import java.util.Scanner;
public class Exercise03{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		
		System.out.print("Please enter a hex character:");
		String hexString = input.nextLine();

		char ch = Character.toUpperCase(hexString.charAt(0));//Сдת��д
		int value = 0;
		if(ch <= 'F' && ch >= 'A'){
			value = ch - 'A' + 10;//�������ʮ��
		}else if(Character.isDigit(ch)){//�ж��ǲ�������
			value = ch;
		}
	
		int ten = value;//�ַ�ת������
		System.out.println(ten);
		int er[] = new int[4];//�������鴢�������
		//����ֵ
		for(int i = 3;i >= 0 ;i--){
			er[i] = ten % 2;//�Զ�ȡ�࣬��ֵ������
			ten /= 2;
		}
		//���������
		for(int j = 0; j < 4; j++){
		System.out.print(er[j]);
		}
		

		
	}

}

//�������
//����1.���ٰ�λ�ַ� String.length
//	  2.��������ĸ�����֣�isDigit is...��
//	  3.������������count����

import java.util.Scanner;
public class Exercise07{

public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("�������ַ�����");
		
		String PassWard = input.next();
		if(isLegal(PassWard)){
			System.out.println("Valid PassWard");
		}else{
			System.out.println("Invalid PassWard");
		}
	}

//������1.�ж��Ƿ�Ϸ�
//		2.����boolean 
//		3.����һ��String


	public static boolean isLegal(String s){
		boolean result = true;//�ٶ����Ϊ��
		int length = s.length();//�õ����볤��
		int letter_number = 0;//������ĸ����
		int digit_number = 0;//������������

		if(length < 8){   //�жϳ����Ƿ�С��8
			return false;
		}else{
			//�ж�ÿ���ַ������֣���ĸ�����ǷǷ��ַ�
			for(int i = 0; i < length; i++){
				if(Character.isDigit(s.charAt(i))){
					digit_number++;  //�������ָ���
				}else if(Character.isLetter(s.charAt(i))){
					letter_number++;
				}else{
					result = false;
					break;
				}
			}
			//�ж����ָ����Ƿ����2
			if(digit_number < 2){
				result = false;
			}

		}

		return result;
		
	}
}
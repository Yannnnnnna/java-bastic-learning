//�жϻ��Ĵ�
//���ģ�ѭ���жϵ�һ���͵�����һ�����ڶ����͵����ڶ����������Ƿ����

import java.util.Scanner;

public class IsPalindrome{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		System.out.println("�������ַ����� ");
		String string = input.next();
		int low = 0;
		int high = string.length() - 1;

		boolean palindrome = true;
		while(low < high){
			if(string.charAt(low) != string.charAt(high)){
				palindrome = false;
			}

			low++;
			high--;
		}

		if(palindrome){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
	}
}
//判断回文串
//核心：循环判断第一个和倒数第一个，第二个和倒数第二个。。。是否相等

import java.util.Scanner;

public class IsPalindrome{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		System.out.println("请输入字符串： ");
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
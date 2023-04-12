//检测密码
//规则1.至少八位字符 String.length
//	  2.仅包含字母和数字（isDigit is...）
//	  3.至少两个数字count计数

import java.util.Scanner;
public class Exercise07{

public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("请输入字符串：");
		
		String PassWard = input.next();
		if(isLegal(PassWard)){
			System.out.println("Valid PassWard");
		}else{
			System.out.println("Invalid PassWard");
		}
	}

//方法：1.判断是否合法
//		2.返回boolean 
//		3.接受一个String


	public static boolean isLegal(String s){
		boolean result = true;//假定结果为真
		int length = s.length();//得到密码长度
		int letter_number = 0;//计算字母数量
		int digit_number = 0;//计算数字数量

		if(length < 8){   //判断长度是否小于8
			return false;
		}else{
			//判断每个字符是数字，字母，还是非法字符
			for(int i = 0; i < length; i++){
				if(Character.isDigit(s.charAt(i))){
					digit_number++;  //计算数字个数
				}else if(Character.isLetter(s.charAt(i))){
					letter_number++;
				}else{
					result = false;
					break;
				}
			}
			//判断数字个数是否大于2
			if(digit_number < 2){
				result = false;
			}

		}

		return result;
		
	}
}
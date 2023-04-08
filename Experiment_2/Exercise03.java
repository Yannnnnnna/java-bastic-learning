//十六进制转二进制
import java.util.Scanner;
public class Exercise03{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		
		System.out.print("Please enter a hex character:");
		String hexString = input.nextLine();

		char ch = Character.toUpperCase(hexString.charAt(0));//小写转大写
		int value = 0;
		if(ch <= 'F' && ch >= 'A'){
			value = ch - 'A' + 10;//变成数字十几
		}else if(Character.isDigit(ch)){//判断是不是数字
			value = ch;
		}
	
		int ten = value;//字符转成整型
		System.out.println(ten);
		int er[] = new int[4];//创建数组储存二进制
		//倒叙赋值
		for(int i = 3;i >= 0 ;i--){
			er[i] = ten % 2;//对二取余，赋值给数组
			ten /= 2;
		}
		//输出二进制
		for(int j = 0; j < 4; j++){
		System.out.print(er[j]);
		}
		

		
	}

}

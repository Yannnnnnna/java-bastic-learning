//检查字串
import java.util.Scanner;
public class Exercise07{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		//输入SSN
		System.out.print("Please enter  string_s1: ");
		String string_s1 = input.nextLine();
		System.out.print("Please enter  string_s1: ");
		String string_s2 = input.nextLine();
		//循环判断s2里每个字符是否在s1里有
		int i = 0;
		for(;i < string_s2.length(); i++){
			int result = string_s1.indexOf(string_s2.charAt(i));//判断
			if(result == -1){//有一个没有就输出没有
				System.out.println(string_s2 + " is not a substring of " + string_s1);
			}
		}
		//最后输出是
		System.out.println(string_s2 + " is  a substring of " + string_s1);
	}
}
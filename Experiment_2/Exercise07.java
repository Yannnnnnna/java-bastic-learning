//����ִ�
import java.util.Scanner;
public class Exercise07{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		//����SSN
		System.out.print("Please enter  string_s1: ");
		String string_s1 = input.nextLine();
		System.out.print("Please enter  string_s1: ");
		String string_s2 = input.nextLine();
		//ѭ���ж�s2��ÿ���ַ��Ƿ���s1����
		int i = 0;
		for(;i < string_s2.length(); i++){
			int result = string_s1.indexOf(string_s2.charAt(i));//�ж�
			if(result == -1){//��һ��û�о����û��
				System.out.println(string_s2 + " is not a substring of " + string_s1);
			}
		}
		//��������
		System.out.println(string_s2 + " is  a substring of " + string_s1);
	}
}
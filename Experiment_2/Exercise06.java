//���SSN
//1.�ж�����'-'���Ƿ��ڵ������͵�����
//2.�����ַ������ж��Ƿ�Ϊ����
import java.util.Scanner;
public class Exercise06{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		//����SSN
		System.out.print("Please enter a SSN");
		String SSN = input.nextLine();
		//��ȡ'-'���±�
		int k1 = SSN.indexOf('-');
		int k2 = SSN.lastIndexOf('-');
		//�ж��Ƿ�Ϊ�������͵�����
		if(k1 == 3 && k2 == 6){
			//�������ֲ���
			String str1 = SSN.substring(0, 3);
			String str2 = SSN.substring(3, 6);
			String str3 = SSN.substring(7);
			//ǿתΪint
			char c1 = str1.charAt(0);
			int i1 = (int) c1;
			char c2 = str1.charAt(1);
			int i2 = (int) c2;
			char c3 = str1.charAt(2);
			int i3 = (int) c3;
			char c4 = str2.charAt(0);
			int i4 = (int) c4;
			char c5 = str2.charAt(1);
			int i5 = (int) c5;
			char c6 = str3.charAt(0);
			int i6 = (int) c6;
			char c7 = str3.charAt(1);
			int i7 = (int) c7;
			char c8 = str3.charAt(2);
			int i8 = (int) c8;
			char c9 = str3.charAt(3);
			int i9 = (int) c9;
			//�ж��Ƿ��������ַ�Χ
			if((i1 >= 45 && i1 <= 54)
			&& (i2 >= 45 && i2 <= 54)
			&& (i3 >= 45 && i3 <= 54)
			&& (i4 >= 45 && i4 <= 54)
			&& (i5 >= 45 && i5 <= 54)
			&& (i6 >= 45 && i6 <= 54)
			&& (i7 >= 45 && i7 <= 54)
			&& (i8 >= 45 && i8 <= 54)
			&& (i9 >= 45 && i9 <= 54)){
				System.out.println(SSN + "is an valid social security number.");
			}else{
				System.out.println(SSN + "is an invalid social security number.");
			}
		
				



		}else{
			System.out.println(SSN + "is an invalid social security number.");
		}
		
		
		
	}

}

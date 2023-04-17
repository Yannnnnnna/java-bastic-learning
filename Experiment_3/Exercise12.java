//����Ӧ�ó������ÿ��ŵĺϷ���

import java.util.Scanner;

public class Exercise12{
	public static void main(String[] args){
		

        // ��ȡ����
        Scanner input = new Scanner(System.in);
        System.out.print("�����뿨��\n\t");
        String str = input.next();

        // �ж�str�����Ƿ�ﵽ��׼
        int length = getSize(str);
        if (length < 13 || length > 16){
            System.out.print(str + " is invalid");
            System.exit(1);
        }

        // �ж�str�Ƿ�����4��5��37��6Ϊǰ׺
        boolean bool1 = prefixMatched(str, 4);
        boolean bool2 = prefixMatched(str, 5);
        boolean bool3 = prefixMatched(str, 37);
        boolean bool4 = prefixMatched(str, 6);
        if (bool1 || bool2 || bool3 || bool4){}
        else{
            System.out.print(str + " is invalid");
            System.exit(1);
        }

        // ���������ݴ��ݸ�isValid���������ս��
        boolean result = isValid(str);

        // �жϲ�������
        if (result)
            System.out.print(str + " is valid");
        else
            System.out.print(str + " is invalid");
    }
    //�жϲ����ؿ��ŵĺϷ���
    public static boolean isValid(String number){
        int result = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
        if (result % 10 == 0){
            return true;

        }else{
            return false;
        }
    }
    // �ڶ�����ż��λ������ӣ��������λ��������λ����ӣ�
    public static int sumOfDoubleEvenPlace(String number){
        int length = getSize(number);
        int sum = 0;
        int temp = 0;
        for (int i = 0; i < length; i += 2){
        	temp = 2 * (int)number.charAt(i);
        	if(temp > 9){
        		temp = (temp / 10) + (temp % 10);
        	}
           sum += temp;
        }
        return sum;
    }
    // ������������λ���
    public static int sumOfOddPlace(String number){
        int length = getSize(number);
        int sum = 0;
        
        for (int i = 1; i < length; i+=2){
            sum += (int)number.charAt(i);
            
        }
        return sum;
    }
    // �жϳ���
    public static int getSize(String d){
        return d.length();
    }
    // �ж�ǰ׺
    public static boolean prefixMatched(String number, int d){
        if (d < 10){
            int start = (int)number.charAt(0);
            if (start >= 4 && start <= 6)
                return true;
            else
                return false;
        }else{
            String temp = number.substring(0,2);
            int str_int = Integer.parseInt(temp);
            if (str_int == 37)
                return true;
            else
                return false;
        }
    }
}

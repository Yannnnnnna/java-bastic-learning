//财务应用程序：信用卡号的合法性

import java.util.Scanner;

public class Exercise12{
	public static void main(String[] args){
		

        // 获取输入
        Scanner input = new Scanner(System.in);
        System.out.print("请输入卡号\n\t");
        String str = input.next();

        // 判断str长度是否达到标准
        int length = getSize(str);
        if (length < 13 || length > 16){
            System.out.print(str + " is invalid");
            System.exit(1);
        }

        // 判断str是否是由4、5、37、6为前缀
        boolean bool1 = prefixMatched(str, 4);
        boolean bool2 = prefixMatched(str, 5);
        boolean bool3 = prefixMatched(str, 37);
        boolean bool4 = prefixMatched(str, 6);
        if (bool1 || bool2 || bool3 || bool4){}
        else{
            System.out.print(str + " is invalid");
            System.exit(1);
        }

        // 将输入内容传递给isValid方法并接收结果
        boolean result = isValid(str);

        // 判断并输出结果
        if (result)
            System.out.print(str + " is valid");
        else
            System.out.print(str + " is invalid");
    }
    //判断并返回卡号的合法性
    public static boolean isValid(String number){
        int result = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
        if (result % 10 == 0){
            return true;

        }else{
            return false;
        }
    }
    // 第二步：偶数位二倍相加（如果是两位数则这两位数相加）
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
    // 第三步：奇数位相加
    public static int sumOfOddPlace(String number){
        int length = getSize(number);
        int sum = 0;
        
        for (int i = 1; i < length; i+=2){
            sum += (int)number.charAt(i);
            
        }
        return sum;
    }
    // 判断长度
    public static int getSize(String d){
        return d.length();
    }
    // 判断前缀
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

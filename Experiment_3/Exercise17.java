//随机数选择器
//返回随机数，不包括传入的参数
import java.lang.Math;
import java.util.Scanner;
public class Exercise17{
	public static void main(String[] args) {
        System.out.println(getRandom(2, 3, 44, 7,34));
       


    }
    public static int getRandom(int... numbers){
        int random = (int)(Math.random() * 54 + 1);
        
            
        for(int i = 0; i < numbers.length; i++){
            if(random == numbers[i]){
               random = (int)(Math.random() * 54 + 1);
               i = -1;;

            }
        }
        
      
        return random;
    }
} 
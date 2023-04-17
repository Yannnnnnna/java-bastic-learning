//双素数
//1.要求输出差值为二的一对素数
//2.先输出所有素数，如果素数加二为素数就输出这两个素数
import java.lang.Math;
public class Exercise10{
	public static void main(String[] args){
		for(int i = 2; i < 1000; i++){
			if(isPrime(i)){
				if(isPrime(i + 2)){
					System.out.printf("(%d, %d)\n", i, i + 2);
				}
			}
		}
		
				
	
	}
	//判断是不是素数
	public static boolean isPrime(int number ){
		for(int i = 2; i <= Math.sqrt(number); i++){
			if(number % i == 0){
				return false;
			}
		}
		return true;
	}
	

}
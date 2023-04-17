//梅森素数
//1.需要输出小于31的所有素数
//2、需要符合公式（int）Math.pow(x,y)
//3、输出表格
import java.lang.Math;
public class Exercise09{
	public static void main(String[] args){
		System.out.println("p\t\t2^p-1");
		System.out.println("-------------------------");
		for(int p = 2; p <= 31; p++){
			if(isPrime(p)){
				int result = isMasom(p);
				if(result != -1){
					System.out.println(result + "\t\t" + p);
				}
			}
		}
		
				
	
	}
	//输出素数
	public static boolean isPrime(int number ){
		for(int i = 2; i <= Math.sqrt(number); i++){
			if(number % i == 0){
				return false;
			}
		}
		return true;
	}
	//判断是不是梅森素数
	public static int isMasom(int prinme){
		for(int i = 2; i < prinme; i++){
			if((int)Math.pow(2,i) - 1 == prinme){
				return i;
			}
		}
		return -1;
	}

}
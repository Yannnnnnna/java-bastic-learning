//˫����
//1.Ҫ�������ֵΪ����һ������
//2.�����������������������Ӷ�Ϊ�������������������
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
	//�ж��ǲ�������
	public static boolean isPrime(int number ){
		for(int i = 2; i <= Math.sqrt(number); i++){
			if(number % i == 0){
				return false;
			}
		}
		return true;
	}
	

}
//÷ɭ����
//1.��Ҫ���С��31����������
//2����Ҫ���Ϲ�ʽ��int��Math.pow(x,y)
//3��������
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
	//�������
	public static boolean isPrime(int number ){
		for(int i = 2; i <= Math.sqrt(number); i++){
			if(number % i == 0){
				return false;
			}
		}
		return true;
	}
	//�ж��ǲ���÷ɭ����
	public static int isMasom(int prinme){
		for(int i = 2; i < prinme; i++){
			if((int)Math.pow(2,i) - 1 == prinme){
				return i;
			}
		}
		return -1;
	}

}
//ÍêÈ«Êı
public class Exercise16{
	public static void main(String[] args){
		
		for(int num = 2; num <= 10000; num++){
			int temp = num;
			int sum = 0;
			for(int i = 1; i < num; i++){
				if(num % i == 0){
					temp /= i;
					sum += i;
				}
			}
			if(sum == num){
				System.out.println(num);
			}
		}

		
	
	}
}
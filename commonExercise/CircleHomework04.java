public class CircleHomework04{
	public static void main(String[] args){
		int sum = 0;
		for(int i = 1 ; i <= 100; i++){
			if(i % 5 != 0 ){
				System.out.print(i + " ");
				sum++;
			
				if(sum % 5 == 0){
					System.out.println();
				}
			}
		}
	}
}
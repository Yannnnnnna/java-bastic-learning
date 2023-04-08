public class ForExercise{
	public static void main (String[] args){
		int num = 0;
		int sum = 0;
		int mount = 0;
		for(;num <= 100;num++){
			if(num % 9 == 0){
				System.out.println(+num);
				sum++;
				mount += num;

			}

		}
		
		System.out.println("sum = " + sum + "mount = " + mount);
		
	
	}	
}
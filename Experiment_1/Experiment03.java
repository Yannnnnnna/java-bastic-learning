public class Experiment03{
	public static void main(String[] args){
		double i = 1.0;
		double sum = 0;
		int j = 1;
		for(; i <= 100; i += 2){
			
			if(j % 2 != 0){
				sum += 1.0 / i;
				j++;
				continue;
			}
			if(j % 2 == 0){
				sum -= 1.0 / i;
				j++;
				continue;
			}
		}
		System.out.println("pai=" + (4.0 * sum));
	}
}
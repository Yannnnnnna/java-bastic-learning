import java.util.Scanner;

public class MulForExercise01{
	public static void main (String[] args){
		
		Scanner myScanner = new Scanner (System.in);

		double classsum = 0;
		for(int j = 0; j <= 3; j++){
			double sum = 0;
			for(int i = 1 ; i <= 5; i++){
				System.out.println("please input the " + j +"class,the " + i + "student's score");
				double score = myScanner.nextDouble();
				sum += score;
				System.out.println("The score is " + score);
			}
			
			System.out.println("The average score is" + (sum / 5) + "sum = " + sum);
			classsum += sum;
		}
		System.out.println("the there class average score is" + (classsum / 15)); 
	}	
}
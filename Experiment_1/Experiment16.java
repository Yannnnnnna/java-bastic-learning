//游戏：石头剪刀布
import java.util.Scanner;
import java.util.Random;
public class Experiment16{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		Random random = new Random();
		int computer = random.nextInt(3);
		
		
		System.out.print("scissor(0),rock(1), paper(2) : ");
		int master = input.nextInt();
		int difference = computer - master;
		if(difference == 0){
			if(computer == 0){
				System.out.print("The computer is scissor. You are scissor too. It is a draw");
			}else if(computer == 1){
				System.out.print("The computer is rock. You are rock too. It is a draw");
			}else if(computer == 2){
				System.out.print("The computer is paper. You are paper too. It is a draw");
			}
		}
		switch(difference){
	    case 1:
	       System.out.print("The computer win.");
	       break; 
	    case 2 :
	       System.out.print("You win.");
	       break; 
	    case -1 :
	       System.out.print("You win.");
	       break; 
	    case -2:
	       System.out.print("The computer win.");
	       break; 
		}
		
		
		

		
	}

}
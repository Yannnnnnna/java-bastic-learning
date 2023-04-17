//游戏：双骰子赌博
//1.需要产生两个随机数：random1；random2
//2.将两个随机数相加
//3.switch-case判断和的情况
//4.若产生了点 循环掷骰子直到输赢结果出现
import java.lang.Math;
public class Exercise11{
	public static void main(String[] args){
		System.out.println("掷骰子中······");
		int sum = sum();
		switch(sum){
			case 2: case 3: case 12:
				System.out.println("You lose");
				break;
			case 7: case 11:
				System.out.println("You win");
				break;
			default :
				point(sum);

		}
		
				
	
	}
	
	
	//将两个随机数相加
	public static int sum(){
		int a = (int)(Math.random() * 6 + 1);
		int b = (int)(Math.random() * 6 + 1);
		System.out.printf("You rolled %d + %d = %d\n", a, b, a+b);
		return a + b;
	}
	//产生点了
	public static void point(int point){
		System.out.println("产生点");
		int num = 0;
		while(num != 7 && num != point){
			num = sum();
			
			if(num == 7){
				System.out.println("You lose");
				break;
			}else if(num == point){
				System.out.println("You win");
				break;
			}
		}
	}

}
//��Ϸ��˫���ӶĲ�
//1.��Ҫ���������������random1��random2
//2.��������������
//3.switch-case�жϺ͵����
//4.�������˵� ѭ��������ֱ����Ӯ�������
import java.lang.Math;
public class Exercise11{
	public static void main(String[] args){
		System.out.println("�������С�����������");
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
	
	
	//��������������
	public static int sum(){
		int a = (int)(Math.random() * 6 + 1);
		int b = (int)(Math.random() * 6 + 1);
		System.out.printf("You rolled %d + %d = %d\n", a, b, a+b);
		return a + b;
	}
	//��������
	public static void point(int point){
		System.out.println("������");
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
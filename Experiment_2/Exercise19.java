//��������ֵĴ���
//��������Ϊ��β forѭ��



import java.util.Scanner;
public class Exercise19{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		//����һ������
		System.out.println(" ������һ�������� ");
		int count = 1, max = 0, number = 0;
		for(;;){
			 number = input.nextInt();
			 //�ж������Ƿ񵽽�β
			if(number == 0){
				break;
			}
			//���Ƚ�
			//������ֵ����������count��Ϊһ�����¼���
			if(max > number){

			}else if(max == number){
				count++;
			}else{
				max = number;
				count = 1;
			}


		}
		System.out.println("���ֵ���ֵĴ���Ϊ�� " + count);
		System.out.println("���ֵΪ�� " + max);
				
	
	}
}
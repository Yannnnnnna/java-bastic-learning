//��Ʊ(lottery)
//1.����һ���������λ�� ��int��Math.random() * 100 ����0~99֮�����
//2.��ʾ�û�������λ��(guess)
//3.�ж�1�����ֺ�˳��һ�� 10000��2������һ��˳��һ�� 3000 3��һ�����ֶ��� 1000
//�жϷ���  �����������������%10��ȡ���һλ��/10 ȡʮλ��(lotteryDigit1,lotteryDigit2)
//			�������жϣ��������жϣ���һ��һ���жϣ���û�����û�н�
//			
//�޸ı����λ��
import java.util.Scanner;
public class Lottery{
	public static void main(String[] args){
		//����һ������
		int lottery = (int)(Math.random() * 1000);
		//�û�����²������
		System.out.println("���������֣�");
		Scanner input = new Scanner(System.in);
		int guess = input.nextInt();

		//��ȡ�����
		int lotteryDigit1 = lottery % 10;
		int lotteryDigit2 = lottery / 10 % 10;
		int lotteryDigit3 = lottery / 100;
		//��ȡ�û��������
		int guessDigit1 = guess % 10;
		int guessDigit2 = guess / 10 % 10;
		int guessDigit3 = guess / 100
		//��ʾ�����Ϊ
		System.out.println("�����������Ϊ�� " + lottery);

		//�ж�
		if(lottery == guess){
			System.out.println("ȫ�����У����һ��Ԫ");
		}else if((lotteryDigit1 == guessDigit2 || lotteryDigit1 == guessDigit3) 
				&& (lotteryDigit2 == guessDigit1 || lotteryDigit2 == guessDigit3)
				&& (lotteryDigit3 == guessDigit1 || lotteryDigit3 == guessDigit2)){
			System.out.println("�����������֣���˳�򲻶ԣ����3000Ԫ");
		}else if(lotteryDigit1 == guessDigit2 
				|| lotteryDigit1 == guessDigit1
				|| lotteryDigit2 == guessDigit1
				|| lotteryDigit2 == guessDigit2){
			System.out.println("����һ�����֣����1000Ԫ");
		}else{
			System.out.println("һ����û�в¶ԣ���Ǹ��");
		}


	}
}
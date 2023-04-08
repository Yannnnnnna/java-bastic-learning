//彩票(lottery)
//1.产生一个随机的两位数 （int）Math.random() * 100 产生0~99之间的数
//2.提示用户输入两位数(guess)
//3.判断1、数字和顺序一样 10000；2、数字一样顺序不一样 3000 3、一个数字对了 1000
//判断方法  分离随机产生的数，%10，取最后一位，/10 取十位数(lotteryDigit1,lotteryDigit2)
//			先正序判断，再逆序判断，再一个一个判断，都没有输出没中奖
//			
//修改变成三位数
import java.util.Scanner;
public class Lottery{
	public static void main(String[] args){
		//产生一个数字
		int lottery = (int)(Math.random() * 1000);
		//用户输入猜测的数字
		System.out.println("请输入数字：");
		Scanner input = new Scanner(System.in);
		int guess = input.nextInt();

		//提取随机数
		int lotteryDigit1 = lottery % 10;
		int lotteryDigit2 = lottery / 10 % 10;
		int lotteryDigit3 = lottery / 100;
		//提取用户输入的数
		int guessDigit1 = guess % 10;
		int guessDigit2 = guess / 10 % 10;
		int guessDigit3 = guess / 100
		//显示随机数为
		System.out.println("产生的随机数为： " + lottery);

		//判断
		if(lottery == guess){
			System.out.println("全部猜中，获得一万元");
		}else if((lotteryDigit1 == guessDigit2 || lotteryDigit1 == guessDigit3) 
				&& (lotteryDigit2 == guessDigit1 || lotteryDigit2 == guessDigit3)
				&& (lotteryDigit3 == guessDigit1 || lotteryDigit3 == guessDigit2)){
			System.out.println("猜中所有数字，但顺序不对，获得3000元");
		}else if(lotteryDigit1 == guessDigit2 
				|| lotteryDigit1 == guessDigit1
				|| lotteryDigit2 == guessDigit1
				|| lotteryDigit2 == guessDigit2){
			System.out.println("猜中一个数字，获得1000元");
		}else{
			System.out.println("一个都没有猜对，抱歉。");
		}


	}
}
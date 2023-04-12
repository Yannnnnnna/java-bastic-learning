//数学：五角数
//五角数为（公式） 主函数传入一个n 
//方法计算值并返回

public class Exercise01{

public static void main(String[] args) {
		Math five = new Math();
		int count = 0;
		for(int i = 1; i <= 100; i++){
			System.out.print(five.getPentagonalNumber(i) + "\t");
			count++;
			if(count == 10){
				System.out.println();
				count -= 10;
			}
		}

	}
}
class Math{
	public static int getPentagonalNumber(int n){
		return n * (3 * n - 1) / 2;
	}
}
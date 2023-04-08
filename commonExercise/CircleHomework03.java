public class CircleHomework03{
	public static void main(String[] args){
		int number = 153;
		int one = number / 100;
		int two = (number - one * 100) / 10;//n%100/10
		int three = number - (number / 10 * 10);//n%10
		if(number == (one * one * one) + (two * two *two) + (three * three * three)){
			System.out.println("这是水仙数");
		}else {
			System.out.println("这不是水仙数");
		}
	}
}
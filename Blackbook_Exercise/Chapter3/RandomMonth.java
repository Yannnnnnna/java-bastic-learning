//随机月份
public class RandomMonth{
	public static void main(String[] args){
		//随机产生1~12之间的整数程序
		int month = (int)(Math.random() * 12 + 1);
		switch(month){
			case 1: System.out.println("一月");
			break;
			case 2: System.out.println("2月");
			break;
			case 3: System.out.println("3月");
			break;
			case 4: System.out.println("4月");
			break;
			case 5: System.out.println("5月");
			break;
			case 6: System.out.println("6月");
			break;
			case 7: System.out.println("7月");
			break;
			case 8: System.out.println("8月");
			break;
			case 9: System.out.println("9月");
			break;
			case 10: System.out.println("10月");
			break;
			case 11: System.out.println("11月");
			break;
			case 12: System.out.println("12月");
			break;

		}
	}
}
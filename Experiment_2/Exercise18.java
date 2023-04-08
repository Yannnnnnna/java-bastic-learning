//财务应用程序：求出销售总额
//需要提成：30000-5000=25000
//前两个销售额可获得提成 5000*0.08 + 5000 * 0.1 = 900
//第三个销售额需要（25000-900）/ 0.12
//求出值再加上一万销售额
public class Exercise18{
	public static void main(String[] args){
		double SALARY = 5000;
		double wish = 30000;
		double under_class = 5000 * 0.08 + 5000 * 0.1;
		double inneed = wish - SALARY - under_class;
		double sales = inneed / 0.12;


		double total = sales + 10000;
		
		
		System.out.println(total);
				
	
	}
}
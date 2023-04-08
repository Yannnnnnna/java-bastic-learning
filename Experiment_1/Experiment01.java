public class Experiment01{
	public static void main(String[] args){
		int a = 1;//定义一个变量储存a的值
		System.out.println("a\t" + "a^2\t" + "a^3");//输出表头
		for(; a <= 4; a++){
			System.out.println(a + "\t" + a * a + "\t" + a * a * a);
			//利用for循环输出值，运用制表符
		}


	}
}
//英尺和米之间的转换
//一个类，两个方法，输出表格


public class Exercise03{

public static void main(String[] args) {
		Foot_Meters cal = new Foot_Meters();

		System.out.print("英尺\t米\t\t米\t英尺\n");
		System.out.println("-----------------------------------");

		for(double foot = 1.0, meter = 20.0; foot <= 10; foot++, meter += 5){
			System.out.print(foot + "\t" + cal.footToMeter(foot) + "\t\t" 
				+ meter + "\t" + cal.meterToFoot(meter) + "\n");
		}
		

	}
}
class Foot_Meters{
	public static double footToMeter(double foot){
		return 0.305 * foot;
	}
	public static double meterToFoot(double meter){
		return 3.279 * meter;
	}
}
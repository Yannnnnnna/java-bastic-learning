//Ӣ�ߺ���֮���ת��
//һ���࣬����������������


public class Exercise03{

public static void main(String[] args) {
		Foot_Meters cal = new Foot_Meters();

		System.out.print("Ӣ��\t��\t\t��\tӢ��\n");
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
//ǧ����Ӣ��֮���ת��

public class Exercise09{
	public static void main(String[] args){
		
		System.out.println("Ӣ��\tǧ��\tǧ��\tӢ��\n");
		int acre = 1;
		int km = 20;

		for(; acre <= 10 && km <= 65; acre++, km += 5){
			System.out.println(acre + "\t" + acre * 1.609 + "\t" + km + "\t"+ km / 1.609 + "\n");
		}
	}
}
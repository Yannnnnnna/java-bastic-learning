

public class If03{
	public static void main (String[] args){
		int year = 2023;
		
		if(year%400 == 0 || (year%4 == 0 && year%100 != 0)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

		
	}
}
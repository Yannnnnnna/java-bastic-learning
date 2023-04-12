//ÏÔÊ¾×Ö·û

public class Exercise04{

public static void main(String[] args) {
		Print charprint = new Print();
		charprint.printChars('1', 'Z', 10);

	}
}
class Print{
	public static void printChars(char ch1, char ch2, int numberPerLine){
		int count = 0;
		for(char i = ch1; i <= ch2; i++){
			System.out.print(i + " ");
			count++;
			if(count == numberPerLine){
				System.out.println();
				count -= numberPerLine;
			}
		}
	}
}
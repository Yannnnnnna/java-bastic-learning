public class CircleHomework01{
	public static void main(String[] args){

		double cash = 100000;
		int time = 0;
		while(cash > 50000 ){
			cash = cash - (cash * 0.05);
			time++;
		}

		while(cash <= 50000){
			cash -= 1000;
			if(cash <= 0){
				break;
			}
			time++;

		}
				
		System.out.println("һ��������" + time + "��·��" );
				
			

		

	}

}
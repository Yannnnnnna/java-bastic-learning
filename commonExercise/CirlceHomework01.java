//�������ٴ�·��
public class CircleHomework01{
	public static void main(String[] args){

		double cash = 100000;
		int time = 0;
		while(cash > 50000 ){
			cash = cash - (cash * 0.05);//cash *= 0.95
			time++;
		}

		while(cash <= 50000){
			cash -= 1000;
			if(cash <= 0){
				break;
			}
			time++;

		}
				
		System.out.println("һ��������" + time + "��·��" );//���Ҳ��62���Լ�д�ģ�
		
		// double money = 100000;
		// int count = 0
		// while(true){
		// 	if(money > 50000){
		// 		money *= 0.95;
		// 		count++;
		// 	}else if(money >= 1000){
		// 		money -= 1000;
		// 		count++;
		// 	}else{
		// 		break;
		// 	}
		// }
		// System.out.println("һ��������" + count + "��·��" );//��ʦд�ģ����Ϊ62
	}

}
//经过多少次路口
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
				
		System.out.println("一共经过了" + time + "次路口" );//输出也是62（自己写的）
		
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
		// System.out.println("一共经过了" + count + "次路口" );//老师写的，输出为62
	}

}
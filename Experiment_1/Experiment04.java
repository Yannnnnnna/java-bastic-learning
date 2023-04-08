//进行人口估算

public class Experiment04{
	public static void main(String[] args){
		 int pop = 312032486;
		 

		for(int year = 1; year <= 5; year ++){//输出每年的人数
			//7 13 45的公因数是91，每91秒人加1
			//一年有60 * 60 * 24 * 365 = 31536000
			//总秒数除以91就是一年增加的人数
			pop = pop + (31536000 / 91);
			
		System.out.println("未来第" + year + "年的人口数是" + pop );
			
		}
	}
}

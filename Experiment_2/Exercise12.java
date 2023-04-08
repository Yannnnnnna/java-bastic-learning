//打印金字塔形的数字
//1.第一层一个，第二层三个。。。第n层，n+2个
//2.每层，第一个2的0次方，第二个2的1次方，。。。。第n个2的n-1次方
//空格每层n-1个

public class Exercise12{
	public static void main(String[] args){
		
		for(int i = 1; i <= 8; i++){//每层

			//金字塔前面空格
			for(int j = 1; j <= 8 - i;j++){
				System.out.print("\t");
			}
			//输出每行数字
			int k = 1;
			if(k <= i){ 
				for(; k <= i; k++){
				int result1 = (int)Math.pow(2,(k - 1));
				System.out.print(result1 + "\t");
				}
			}
			
			if(k > i && k <= (2 * i - 1)){
				for(; k >= 0; k--){
				int result2 = (int)Math.pow(2,(k - 3));
				System.out.print(result2 + "\t"); 
					if(k - 3 == 0){
						break;
					}
				}
			
			}
			System.out.println();//换行

		}
		
				
	
	}
}
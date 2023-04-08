//显示日历
//1.提示用户输入年份  第一天是星期几
//2.循环输出表头
//3.输出一到31
//4.从星期几开始，就输出几个空格
import java.util.Scanner;
public class Exercise15{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		//输入年份
		System.out.print("请输入年份，和那一年的第一天是星期几： ");
		int year = input.nextInt();
		int week_day = input.nextInt();
		
		int count = week_day;


			//循环输出表头月份
			for(int i = 1; i <= 12; i++){
				String month = " ";
				switch (i){
					case 1: month = "一月";
							break;
					case 2: month = "二月";
							break;
					case 3: month = "三月";
							break;
					case 4: month = "四月";
							break;
					case 5: month = "五月";
							break;
					case 6: month = "六月";
							break;
					case 7: month = "七月";
							break;
					case 8: month = "八月";
							break;
					case 9: month = "九月";
							break;
					case 10: month = "十月";
							break;
					case 11: month = "十一月";
							break;
					case 12: month = "十二月";
							break;
				
				}
				//输出表头
				System.out.println("\t\t\t" + month + " " + year);
				System.out.println("-----------------------------------------------------");
				System.out.print("Sun\tMOn\tTue\tWed\tThu\tFri\tSat\n");
				
				//输出空格
					
				for(int k = 1; k <= count; k++){
					System.out.print("\t");
					
				}
				//输出日期
				//1,3,5,7,8,10,12为31天
				//2月判断是不是闰年
				//4，6，9，11为30天
				switch (i){
					case 1: case 3:case 5:case 7:case 8:case 10:case 12:
						for(int j = 1; j <= 31; j++){
							System.out.print(j + "\t");
							count++;
						
							if(count == 7 ){
							System.out.println();
							count -= 7;
							}
						
						}
						System.out.println();
						continue;
					

					case 2:
					if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
						for(int j = 1; j <= 29; j++){
							System.out.print(j + "\t");
							count++;
					
							if(count == 7 ){
								System.out.println();
								count -= 7;
							}
					
						}
						System.out.println();
						continue;
					}else{
						for(int j = 1; j <= 28; j++){
							System.out.print(j + "\t");
							count++;
					
							if(count == 7 ){
								System.out.println();
								count -= 7;
							}
					
						}
						System.out.println();
						continue;
					}
					
					case 4: case 6: case 9: case 11:
						for(int j = 1; j <= 30; j++){
							System.out.print(j + "\t");
							count++;
					
							if(count == 7 ){
								System.out.println();
								count -= 7;
							}
					
						}
						System.out.println();
						continue;
					 
				}
			}
		
		
				
	
	}
}
				
//��ʾ����
//1.��ʾ�û��������  ��һ�������ڼ�
//2.ѭ�������ͷ
//3.���һ��31
//4.�����ڼ���ʼ������������ո�
import java.util.Scanner;
public class Exercise15{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		//�������
		System.out.print("��������ݣ�����һ��ĵ�һ�������ڼ��� ");
		int year = input.nextInt();
		int week_day = input.nextInt();
		
		int count = week_day;


			//ѭ�������ͷ�·�
			for(int i = 1; i <= 12; i++){
				String month = " ";
				switch (i){
					case 1: month = "һ��";
							break;
					case 2: month = "����";
							break;
					case 3: month = "����";
							break;
					case 4: month = "����";
							break;
					case 5: month = "����";
							break;
					case 6: month = "����";
							break;
					case 7: month = "����";
							break;
					case 8: month = "����";
							break;
					case 9: month = "����";
							break;
					case 10: month = "ʮ��";
							break;
					case 11: month = "ʮһ��";
							break;
					case 12: month = "ʮ����";
							break;
				
				}
				//�����ͷ
				System.out.println("\t\t\t" + month + " " + year);
				System.out.println("-----------------------------------------------------");
				System.out.print("Sun\tMOn\tTue\tWed\tThu\tFri\tSat\n");
				
				//����ո�
					
				for(int k = 1; k <= count; k++){
					System.out.print("\t");
					
				}
				//�������
				//1,3,5,7,8,10,12Ϊ31��
				//2���ж��ǲ�������
				//4��6��9��11Ϊ30��
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
				
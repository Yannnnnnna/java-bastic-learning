//找出两个分数最高的学生
import java.util.Scanner;
public class Exercise10{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		//获取学生的个数
		System.out.print("请输入学生个数: ");
		int student = input.nextInt();
		//创建两个数组分别储存名字和成绩
		int[] score = new int[student];
		String[] name = new String[student];
		//输入名字和分数
		for(int i = 0; i < student; i++){
			System.out.println("请输入第" + (i + 1) + "个学生的名字: ");
			String studentname = input.next();
			name[i] = studentname;
			System.out.println("请输入第" + (i + 1) + "个学生的分数: ");
			int studentscore = input.nextInt();
			score[i] = studentscore;
		}
		//找出score里的最大值
		int max = score[0];
		int j = 0;
		for(; j < student - 1; j++){
			if(score[j + 1] > score[j]){
				max = score[j + 1];
			}
		}
		System.out.print("最高分的学生是：" + name[j]);
		//找出分数第二大的学生
		int k =0;
		int undermax = score[0];
		for(; k < student - 1; k++){
			if(k + 1 == j){
				k --;
				continue;
			}else if(score[k + 1] > score[k]){
				undermax = score[j + 1];
			}
		}
		System.out.print("第二高分的学生是：" + name[k]);

		
	}
}
//�ҳ�����������ߵ�ѧ��
import java.util.Scanner;
public class Exercise10{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		//��ȡѧ���ĸ���
		System.out.print("������ѧ������: ");
		int student = input.nextInt();
		//������������ֱ𴢴����ֺͳɼ�
		int[] score = new int[student];
		String[] name = new String[student];
		//�������ֺͷ���
		for(int i = 0; i < student; i++){
			System.out.println("�������" + (i + 1) + "��ѧ��������: ");
			String studentname = input.next();
			name[i] = studentname;
			System.out.println("�������" + (i + 1) + "��ѧ���ķ���: ");
			int studentscore = input.nextInt();
			score[i] = studentscore;
		}
		//�ҳ�score������ֵ
		int max = score[0];
		int j = 0;
		for(; j < student - 1; j++){
			if(score[j + 1] > score[j]){
				max = score[j + 1];
			}
		}
		System.out.print("��߷ֵ�ѧ���ǣ�" + name[j]);
		//�ҳ������ڶ����ѧ��
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
		System.out.print("�ڶ��߷ֵ�ѧ���ǣ�" + name[k]);

		
	}
}
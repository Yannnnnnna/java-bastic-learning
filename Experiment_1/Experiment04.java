//�����˿ڹ���

public class Experiment04{
	public static void main(String[] args){
		 int pop = 312032486;
		 

		for(int year = 1; year <= 5; year ++){//���ÿ�������
			//7 13 45�Ĺ�������91��ÿ91���˼�1
			//һ����60 * 60 * 24 * 365 = 31536000
			//����������91����һ�����ӵ�����
			pop = pop + (31536000 / 91);
			
		System.out.println("δ����" + year + "����˿�����" + pop );
			
		}
	}
}

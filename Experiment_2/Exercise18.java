//����Ӧ�ó�����������ܶ�
//��Ҫ��ɣ�30000-5000=25000
//ǰ�������۶�ɻ����� 5000*0.08 + 5000 * 0.1 = 900
//���������۶���Ҫ��25000-900��/ 0.12
//���ֵ�ټ���һ�����۶�
public class Exercise18{
	public static void main(String[] args){
		double SALARY = 5000;
		double wish = 30000;
		double under_class = 5000 * 0.08 + 5000 * 0.1;
		double inneed = wish - SALARY - under_class;
		double sales = inneed / 0.12;


		double total = sales + 10000;
		
		
		System.out.println(total);
				
	
	}
}
//��ӡ�������ε�����
//1.��һ��һ�����ڶ���������������n�㣬n+2��
//2.ÿ�㣬��һ��2��0�η����ڶ���2��1�η�������������n��2��n-1�η�
//�ո�ÿ��n-1��

public class Exercise12{
	public static void main(String[] args){
		
		for(int i = 1; i <= 8; i++){//ÿ��

			//������ǰ��ո�
			for(int j = 1; j <= 8 - i;j++){
				System.out.print("\t");
			}
			//���ÿ������
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
			System.out.println();//����

		}
		
				
	
	}
}
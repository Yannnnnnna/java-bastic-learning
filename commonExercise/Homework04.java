//˼· ������������ + ��λ
//1.��ȷ���������Ӧ�ò��뵽�ĸ�����
//2.Ȼ������

//�ȶ���ԭ����

//����arr���飬 �������insertNum<=arr[i],˵�� i ����Ҫ���뵽λ��
//ʹ�� index ���� index = i;
//����������û�з���insertNum<=arr[i],˵�� index= arr.length
//������ӵ�arr�����



public class Homework04{
	public static void main(String[] args){
		int[] arr = {10, 12, 45, 90};
		int insertNum = 23;
		int index = -1; //index����Ҫ�����λ��
		//System.out.println("a\t" + "a^2\t" + "a^3");//�����ͷ
		for(int i = 0; i < arr.length; i++){
			if(insertNum <= arr[i]){
				index = i;
				break;
			}
		}
		if(index == -1){
			index = arr.length;
		}
		int newarr[] = new int [arr.length + 1];
		for(int j = 0, k = 0; j < newarr.length; j++){
			if(j == index){
				newarr[j] = insertNum;

			}else{
				
					newarr[j] = arr[k];
					k++;
			}
			
		}
		arr = newarr;
		for(int i = 0; i < newarr.length; i++){
			System.out.println(arr[i] + " ");
		}

	}
}
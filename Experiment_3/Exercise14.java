//��ӡ��ͬ����
//1.����ʮ����
//2.���㲻ͬ�����м���
//3.�����ͬ����

import java.util.Scanner;
public class Exercise14{
	public static void main(String[] args) {
        //����һ�������鴢�������ֵ
        int arr[] = new int[10];
        //����ʮ������
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        //����һ���������治�ظ�������
        int count = 0;
        //������ж�
        for(int i = 0; i < 10; i++){
        	int nextInput = input.nextInt();
        	//���費���ظ�������
        	boolean bool = true;
        	//�������鿴�Ƿ��ظ�
        	for(int j = 0; j < i; j++){
        		//����ظ��Ѽ����Ϊfalse
        		if(arr[j] == nextInput){
        			bool = false;
        		}
        	}
        	//������ظ���������һ��ͬʱ��ֵ��������
        	if(bool){
        		count++;
        		arr[count - 1] = nextInput;
        	}

        }
        //������ظ����ָ���
        System.out.println("The number of distinct numbers is " + count);
        System.out.print("The distinct numbers are: ");
        //������ظ������֣���countǰ����Ч����
        for (int i = 0 ; i < count ; i++){
            System.out.print(arr[i] + " ");
        }


    }
}
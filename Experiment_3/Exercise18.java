//�����ظ�
//����һ��������¼���ظ��ĸ���
//����һ�����鴢�������ʮ����
//��������۲��ظ��ĸ���
//���÷��������ظ�������ӡ����

import java.util.Scanner;
public class Exercise18{
	public static void main(String[] args) {
        System.out.println("������ʮ�����֣�");
        //����ʮ������
        Scanner input = new Scanner(System.in);
        int arr[] = new int[10];
        for(int i = 0; i < 10; i++){
            int num = input.nextInt();
            arr[i] = num;
        }
        //���ö���
       int numbers[] = eliminateDuplicates(arr);
       //���������
       for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
       }


    }
    public static int[] eliminateDuplicates(int[] list){
        //�����ظ��ĸ���
        int count = 0;
        for(int i = 0; i < 10; i++){
            //�ж�ǰ���Ƿ�����ͬ����
            for(int j = 0; j < i; j++){
                //�������ͬ������������һ������ѭ��
                if(list[i] == list[j]){
                    count++;
                    break;
                }
            }
        }
        //����һ�������������治ͬ������
        int numbers[] = new int[10 - count];
        for(int i = 0,j = 0; i < 10 - count; i++, j++){
            //һ������������һ���ʹ���
            for(int k = 0; k < i; k++){
                if(list[j] == numbers[k]){
                    j++;
                }
            }
            numbers[i] = list[j];

        }
    return numbers;        
      
        
      
        
    }
        
} 
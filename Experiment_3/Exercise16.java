//�ҳ���СԪ�ص��±�
//����һ�����飬����ʮ����
//�������飬�ҳ���СԪ�ص��±�

import java.util.Scanner;
public class Exercise16{
	public static void main(String[] args) {
        //����һ�������鴢�������ֵ
        double arr[] = new double[10];
        //����ʮ������
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        
        //����
        for(int i = 0; i < 10; i++){
        	double num = input.nextDouble();
            arr[i] = num;
        	
        }
        int index = indexOfSmsllestElement(arr);
        	
        
        System.out.println("��Сֵ�±�Ϊ�� " + index);
        System.out.println("��СֵΪ�� " + arr[index]);
       
       


    }
    public static int indexOfSmsllestElement(double[] arrary){
        int index = 0;
        double min = arrary[0];
        for(int i = 0; i < arrary.length; i++){
            if(arrary[i] < min){
                index = i;
                min = arrary[i];
            }
        }
        return index;
    }
}
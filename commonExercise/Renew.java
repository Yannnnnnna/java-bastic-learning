//复习
public class Renew{
	public static void main(String[] args){
		//基本数据类型和String类型的互相转换
		
		//基本数据类型转String： 基本类型的值 + ""
	// 	int n1 = 100;
	// 	double n2 = 3.4;
	// 	float n3 = 1.2f;
	// 	boolean n4 = true;

	// 	String str1 = n1 + "";  //String要开头大写
	// 	String str2 = n2 + "";
	// 	String str3 = n3 + "";
	// 	String str4 = n4 + "";

	// 	System.out.println(str1 + "" + str2 + str3 + str4 );


	// 	//String 类型转基本数据类型
	// 	String s5 = "123";

	// 	int num1 = Integer.parseInt(s5);
	// 	double num2 = Double.parseDouble(s5);
	// 	System.out.println(num1 + num2);
	
	// //三元运算符
	// 	int a = 10;
	// 	int b = 20;
	// 	int result = a < b ? ++a : b++;
	// 	System.out.println(result);
	 

	 // //打印金字塔
		//  for( int i = 1; i <= 5; i++){
		//  	for(int k = 1; k <= 5 - i; k++){
		//  		System.out.print(" ");
		//  	}
		//  	for(int j = 1; j <= i * 2 - 1; j++){
		//  		if(1 == j || 5 == i || j == i * 2 - 1){
		//  			System.out.print("*");
		//  		}else {
		//  			System.out.print(" ");
		//  		}
		 		
		//  	}
		//  	System.out.print("\n");
		//  }

	// //找最大值
	// 	//思路：1.先假设max = arr[0] 2.如果后一个数比max大，就让它=max
	// 	int arr []= {22, 44, 56, -67, 29, 444, 900};
	// 	int max = arr[0];
	// 	int maxIndex = 0;
	// 	for(int i = 0; i < arr.length; i++){
	// 		if(max < arr[i]){
	// 			max = arr[i];
	// 			maxIndex = i;
	// 		}
			
	// 	}
	// 	System.out.print("最大值为：" + max + "最大值下标为：" + maxIndex);
	
// //冒泡排序
// //思路：1.先定义一个临时变量来进行交换 2.比较，如果前面一个大于后面一个，就进行交换 
// //		3.要进行length-1次循环
// 		int temp = 0;
// 		int arr[] = {24, 69, 80, 57, 13};
// 		for(int i = 0; i < arr.length - 1; i++){
			
// 			for(int j = 0; j < arr.length - 1 - i; j++){//遍历数组时时<  不是<=!!!!
// 				if(arr[j] > arr[j + 1]){
// 					temp = arr[j];
// 					arr[j] = arr[j + 1];
// 					arr[j + 1] = temp;
// 				}
// 			}
// 		}
// 		for(int k = 0; k < arr.length; k++){
// 			System.out.print(arr[k] + " ");//输出数组的值时是 i < arr.length
// 		}
		
		
		
		
	 }	
}
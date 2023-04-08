//思路 本质数组扩容 + 定位
//1.先确定添加数组应该插入到哪个索引
//2.然后扩容

//先定义原数组

//遍历arr数组， 如果发现insertNum<=arr[i],说明 i 就是要插入到位置
//使用 index 保留 index = i;
//如果遍历完后，没有发现insertNum<=arr[i],说明 index= arr.length
//即：添加到arr的最后



public class Homework04{
	public static void main(String[] args){
		int[] arr = {10, 12, 45, 90};
		int insertNum = 23;
		int index = -1; //index就是要插入的位置
		//System.out.println("a\t" + "a^2\t" + "a^3");//输出表头
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
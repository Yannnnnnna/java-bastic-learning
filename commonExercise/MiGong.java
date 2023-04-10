public class MiGong{
	public static void main(String[] args){
		//ππΩ®√‘π¨
		int arr[][] = new int[8][7];
		for(int i = 0; i <8; i++){
			for(int j = 0; j < 7; j++){
				arr[0][j] = 1;
				arr[7][j] = 1;
				arr[j][0] = 1;
				arr[j][6] = 1;
			}
		}

		arr[3][1] = 1;
		arr[3][2] = 1;
		A way = new A();
		way.findway(arr, 1, 1);

		//¥Ú”°√‘π¨
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 7; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}



	}
}

class A{
	public boolean findway(int arr[][], int i, int j){
		if(arr[6][5] == 2){
			return true;
		}else{
			if(arr[i][j] == 0){
				arr[i][j] = 2;

				if(findway(arr, i + 1, j)){
					return true;
				}else if(findway(arr, i, j + 1)){
					return true;
				}else if(findway(arr, i - 1, j)){
					return true;
				}else if(findway(arr, i, j - 1)){
					return true;
				}else{
					arr[i][j] = 3;
					return false;
				}
			}
			else{
				return false;
			}
		}

	}
}

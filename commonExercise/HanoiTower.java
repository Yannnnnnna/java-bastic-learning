public class HanoiTower {
//��дһ��main ����
public static void main(String[] args) {
		Tower result = new Tower();
		result.move(2, 'a', 'b', 'c');

	}
}
class Tower{
	public void move(int num, char A, char B, char C){
		if(num == 1){
			System.out.println(A + "->" + C);
		}else{
			move(num - 1, A, C, B);
			System.out.println(A + "->" + C);
			move(num - 1, B, A, C);



		}
	}
}
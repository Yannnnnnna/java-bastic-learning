//递归的使用
public class RecursionExercise01{
	public static void main(String[] args){
		
		
		//求斐波那契数列
		A f1 =new A();
		System.out.print(f1.ff(6));
	}

}
 
class A{
	public int ff(int n){
		
		if(n == 1 || n == 2){
			return  1;
		}else {
			return ff(n - 1) + ff(n - 2);
		}
	}
}

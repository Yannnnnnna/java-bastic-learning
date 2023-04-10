public class OverLoadExercise {
//编写一个main 方法
public static void main(String[] args) {
		Methods me = new Methods();
		me.m(5);
		me.m(3,4);
		me.m("YES");

	}
}
class Methods{
	
		public void m(int a){
			System.out.println(a * a);
		}
		public void m(int a, int b){
			System.out.println(a * b);
		}
		public void m(String a){
			System.out.println(a);
		}
	
}
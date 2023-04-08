public class Method01{
	public static void main(String[] args){
		Person p1 = new Person();//创建一个新类
		p1.speak();//调用方法
		Person p2 = new Person();
		p2.age = 20;
		p2.name = "JACK";
		p1.cal01();
		
		Person p3 = p2;//对象赋值不需要创建一个新对象，赋值本身就是在创建
		System.out.println(p2.age + " " + p2.name + " " 
			+ p2.age + "\n");

		int returnRes = p1.getSum(5, 6);
		System.out.println("结果为" + returnRes);

	}
}

class Person{//这是一个类
	int age;
	String name;
	public void speak(){//这是一个方法
		System.out.println("I am a good man.");
	}
	public void cal01(){
		int sum = 0;

		for(int i = 1; i <= 1000; i++){
			sum += i;
			
		}
		System.out.println("结果为=" + sum);
	}

	public int getSum(int num1, int num2){
		int res = num1 + num2;
		return res;
	}
	
	

}
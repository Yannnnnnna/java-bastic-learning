public class Method01{
	public static void main(String[] args){
		Person p1 = new Person();//����һ������
		p1.speak();//���÷���
		Person p2 = new Person();
		p2.age = 20;
		p2.name = "JACK";
		p1.cal01();
		
		Person p3 = p2;//����ֵ����Ҫ����һ���¶��󣬸�ֵ��������ڴ���
		System.out.println(p2.age + " " + p2.name + " " 
			+ p2.age + "\n");

		int returnRes = p1.getSum(5, 6);
		System.out.println("���Ϊ" + returnRes);

	}
}

class Person{//����һ����
	int age;
	String name;
	public void speak(){//����һ������
		System.out.println("I am a good man.");
	}
	public void cal01(){
		int sum = 0;

		for(int i = 1; i <= 1000; i++){
			sum += i;
			
		}
		System.out.println("���Ϊ=" + sum);
	}

	public int getSum(int num1, int num2){
		int res = num1 + num2;
		return res;
	}
	
	

}
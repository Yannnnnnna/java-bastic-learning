//import java.util.Scanner;
//
//public class Exception_ {
//    public static void main(String[] args) {
////        int num1 = 0;
////        int num2 = 10;
////
////        try {
////            int res = num1 / num2;
////        } catch (Exception e) {
////            throw new RuntimeException(e);
////        }
//        Scanner scanner = new Scanner(System.in);
//        int num = 0;
//        System.out.println("请输入：");
//        while(true){
//            try {
//                num = Integer.parseInt(scanner.next());     //判断输入的是否为数字，如果是就赋值退出程序
//                                                            //如果输入非法字符，则捕获错误，给出提示，重新开始
//                break;
//            }catch (Exception e){
//                System.out.println("你的输入有误请重新输入：");
//            }
//        }
//
//        System.out.println(num);
//
//
//    }
//}
class Person {
    public Person() {

        System.out.println("创建一个Person");

    }
}

class Employee extends Person {

    int age;

    public Employee(int age) {

        System.out.println("创建了一个Employee");

        setAge(age);

        System.out.println("年龄为：" + age);

    }

    public void setAge(int age) throws IllegalArgumentException {
        if (age >= 0) this.age = age;
        else throw new IllegalArgumentException("年龄不能为负数");
    }
}

public class Exception_ {
    public static void main(String[] args) {
        try {
            Employee emp1 = new Employee(10);
            Employee emp2 = new Employee(-1);
        } catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        finally{

            System.out.println("继续....");

        }

        System.out.println("任务完成！");

    }
}
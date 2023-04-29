import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if(quadraticEquation.getDiscriminant()>0){
            System.out.println(quadraticEquation.getRoot1() + " " + quadraticEquation.getRoot2());
        }else if(quadraticEquation.getDiscriminant() == 0){
            System.out.println(quadraticEquation.getRoot1());
        }else{
            System.out.println("The equation has no roots.");
        }

    }
}

class QuadraticEquation{
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {//构造方法
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //三个get方法

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    //返回判别式
    public double getDiscriminant(){
        return b * b - 4 * a * c;
    }
    public double getRoot1(){
        return (- b + getDiscriminant()) / (2 *a);
    }
    public double getRoot2(){
        return (-b - getDiscriminant()) / (2 * a);
    }
}
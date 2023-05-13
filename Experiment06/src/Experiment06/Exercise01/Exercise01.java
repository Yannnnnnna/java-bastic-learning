package Experiment06.Exercise01;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        System.out.println("请输入三角形的信息：");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入三条边：");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();
        System.out.println("请输入颜色：");
        String color = scanner.next();
        System.out.println("请输入是否填充：");
        Boolean filled = scanner.nextBoolean();

        Triangle triangle = new Triangle(color, filled, side1, side2, side3);
        System.out.println(triangle.toString() + " \n" + triangle.getArea() + "\n" + triangle.getPerimeter());
    }

}


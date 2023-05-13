package Experiment06.Exercise01;

import Experiment06.Exercise01.GeometricObject;

public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    //默认构造器

    public Triangle() {
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }
    //带指定值的构造方法
    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    //三个数据的访问器

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea(){    //返回面积
        double s = (side1 + side2 + side1) / 2;

        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    public double getPerimeter(){   //返回周长
        return side1 + side2 + side3;
    }
    public String toString(){
        return super.toString() + "\nExperiment06.Exercise01.Triangle: side1 = " + side1 + " side2 = " + side2 + " side3= " + side3;
    }
}

package Experiment06.Exercise15;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入多边形的点数：");
        int point = input.nextInt();

        double[] x = new double[point];
        double[] y = new double[point];

        System.out.println("请输入点：");
        for (int i = 0; i < point; i++) {
            x[i] = input.nextDouble();
            y[i] = input.nextDouble();
        }
        System.out.println("面积为：" + getArea(x, y));

    }

    private static double getArea(double[] x, double[] y) {
        double area = 0;
        for (int i = 0; i < x.length; i++) {
            int j = (i + 1) % x.length;
            area += x[i] * y[j] - y[i] * x[j];  //实际计算出来 p0(x0,y0), p1(), p2() 面积为x1y2-y2x1
        }
        area /= 2;
        return Math.abs(area);
    }
}
/*计算凸多边形面积可以使用向量叉积的方法。具体步骤如下：
    这个计算凸多边形面积的方法基于向量叉积的性质，即向量叉积的模长等于两个向量所张成的平行四边形的面积。
    对于凸多边形而言，可以将其分成若干个三角形，每个三角形的面积都可以通过向量叉积的方法计算得出，
    最终将所有三角形的面积相加即可得到凸多边形的面积。*/
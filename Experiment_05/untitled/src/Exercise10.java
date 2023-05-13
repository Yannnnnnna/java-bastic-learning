public class Exercise10 {
    public static void main(String[] args) {
        Triangle2D t1 = new Triangle2D(new MyPoint(2.5, 2),
                new MyPoint(4.2, 3),
                new MyPoint(5, 3.5));

        System.out.println("面积为：" + t1.getArea() + " 周长为：" + t1.getPerimeter());

        System.out.println(t1.contains(new MyPoint(3, 3)));

        System.out.println(t1.contains(new Triangle2D(new MyPoint(2.9, 2),
                new MyPoint(4, 1),
                new MyPoint(1, 3.4))));

        System.out.println(t1.overlaps(new Triangle2D(new MyPoint(2, 5.5),
                new MyPoint(4, -3),
                new MyPoint(2, 6.5))));
    }
}

class Triangle2D {
    MyPoint p1 = new MyPoint();
    MyPoint p2 = new MyPoint();
    MyPoint p3 = new MyPoint();

    public Triangle2D() {
        p1 = new MyPoint(0, 0);
        p2 = new MyPoint(1, 1);
        p2 = new MyPoint(2, 5);

    }

    public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double getArea() {//三角形面积
        // 海伦公式 S = sqrt(s * (s - a) * (s - b) * (s - c))
        //其中，s是半周长，即：s = (a + b + c) / 2
        double a = p1.distance(p2);
        double b = p2.distance(p3);
        double c = p3.distance(p1);
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double getPerimeter() {//三角形周长
        return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
    }

    public boolean contains(MyPoint p) {//给定的点是否在三角形内
        //重心坐标法
        /*重心坐标法是通过计算点与三角形各顶点的距离比值来判断该点是否在三角形内部。
        假设三角形的三个顶点分别为A(x1, y1)、B(x2, y2)、C(x3, y3)，
        点P(x, y)到三个顶点的距离分别为d1、d2、d3，则点P的重心坐标为(alpha, beta, gamma)，
        其中：
        alpha = d1 / (d1 + d2 + d3)
        beta = d2 / (d1 + d2 + d3)
        gamma = d3 / (d1 + d2 + d3)
        如果alpha、beta、gamma均大于等于0且小于等于1，
        则点P在三角形ABC内部；否则，点P不在三角形ABC内部。
        alpha = ((y2 - y3) * (x - x3) + (x3 - x2) * (y - y3)) / ((y2 - y3) * (x1 - x3) + (x3 - x2) * (y1 - y3))*/
        double x = p.getX();
        double y = p.getY();
        double x1 = p1.getX();
        double y1 = p1.getY();
        double x2 = p2.getX();
        double y2 = p2.getY();
        double x3 = p3.getX();
        double y3 = p3.getY();
        double alpha = ((y2 - y3) * (x - x3) + (x3 - x2) * (y - y3)) / ((y2 - y3) * (x1 - x3) + (x3 - x2) * (y1 - y3));
        double beta = ((y3 - y1) * (x - x3) + (x1 - x3) * (y - y3)) / ((y2 - y3) * (x1 - x3) + (x3 - x2) * (y1 - y3));
        double gamma = 1 - alpha - beta;
        return alpha >= 0 && beta >= 0 && gamma >= 0;
    }

    public boolean contains(Triangle2D t) {//给定的三角形是否在三角形内
        //判断三个点是否都在三角形内
        return contains(t.getP1()) && contains(t.getP2()) && contains(t.getP3());//this.contains
    }

    public boolean overlaps(Triangle2D t) {//两个三角形是否重叠
        return (contains(t.p1) || contains(t.p2) || contains(t.p3))
                && !(contains(t.getP1()) && contains(t.getP2()) && contains(t.getP3()));
    }

    public MyPoint getP1() {
        return p1;
    }

    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }

    public MyPoint getP2() {
        return p2;
    }

    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }

    public MyPoint getP3() {
        return p3;
    }

    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }
}
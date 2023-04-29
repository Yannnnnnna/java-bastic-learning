public class Exercises03 {
    public static void main(String[] args) {
        MyPoint myPoint1 = new MyPoint();
        MyPoint myPoint2 = new MyPoint(10, 30.5);
        System.out.println("法1：两点之间的距离为：" + myPoint1.distance(myPoint2));
        System.out.println("法2：两点之间的距离为：" + myPoint1.distance(myPoint2.getX(), myPoint2.getY()));

    }
}

class MyPoint {
    private double x;
    private double y;

    //两个get方法
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    //构造方法

    public MyPoint() {
        x = 0;
        y = 0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //创建方法求距离
    public double distance(MyPoint myPoint) {
        return Math.sqrt(Math.pow(myPoint.x - this.x, 2) + Math.pow(myPoint.y - this.y, 2));
    }
    public double distance(double x, double y){
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
    }
}

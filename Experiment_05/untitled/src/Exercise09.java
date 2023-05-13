public class Exercise09 {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);
        System.out.println("面积为：" + c1.getArea() + " 周长为：" + c1.getPerimeter());
        System.out.println(c1.contains(3,3));
        System.out.println(c1.contains(new Circle2D(4,5,10.5)));
        System.out.println(c1.overlaps(new Circle2D(3,5,2.3)));
    }
}

class Circle2D {
    private double x;
    private double y;
    private double radius;

    public Circle2D() {
        x = 0;
        y = 0;
        radius = 1;
    }

    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    //判断点是否在圆内
    public boolean contains(int x, int y) {
        return (Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2)) < radius);
    }
    //判断给定的是否在这个圆内
    public boolean contains(Circle2D circle){
        double d = Math.sqrt(Math.pow(x - circle.x, 2) + Math.pow(y - circle.y, 2));
        return (d < Math.abs(radius - circle.radius));
    }
    //判断两个圆是否重叠
    public boolean overlaps(Circle2D circle){
        double d = Math.sqrt(Math.pow(x - circle.x, 2) + Math.pow(y - circle.y, 2));
        return (d < (radius + circle.radius) && d > Math.abs(radius - circle.radius));
    }


    public double getX() {
        return x;
    }


    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }
}
public class Exercise09 {
    public static void main(String[] args) {
        RegularPolygon regularPolygon = new RegularPolygon();
        RegularPolygon regularPolygon1 = new RegularPolygon(6,4);
        RegularPolygon regularPolygon2 = new RegularPolygon(10, 4, 5.6,7.8);
        System.out.println(regularPolygon.getPerimeter() + " " + regularPolygon.getArea());
        System.out.println(regularPolygon1.getPerimeter() + " " + regularPolygon1.getArea());
        System.out.println(regularPolygon2.getPerimeter() + " " + regularPolygon2.getArea());
    }
}
class RegularPolygon{
    private int n;
    private double side;
    private double x;
    private double y;
    //无参构造方法
    public RegularPolygon(){
        n = 3;
        side = 1;
        x = 0;
        y = 0;

    }
    //所有数据的访问器和修改器
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;

    }
    //中心在（0，0）的构造方法
    public RegularPolygon(int n, double side){
        this.n = n;
        this.side = side;
    }
    public RegularPolygon(int n , double side, double x, double y){
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }
    //返回周长
    public double getPerimeter(){
        return side * n;
    }
    //返回多边形面积
    public double getArea(){
        return (n * side * side) / (4 * Math.tan(Math.PI / n));
    }
}

public class Exercise11 {
    public static void main(String[] args) {
        MyRectangle2D r1 = new MyRectangle2D(2,2,5.5,4.9);
        System.out.println("周长为：" + r1.getPerimeter() + " 面积为：" + r1.getArea());
        System.out.println(r1.contains(3,3));
        System.out.println(r1.contains(new MyRectangle2D(4,5,10.5,3.2)));
        System.out.println(r1.overlaps(new MyRectangle2D(3,5,2.3,5.4)));
    }
}
class MyRectangle2D{
    public double x;
    public double y;
    private double width;
    private double height;

    public MyRectangle2D() {//无参构造方法
        x = 0;
        y = 0;
        width = 1;
        height = 1;
    }

    public MyRectangle2D(double x, double y, double width, double height) {//带指定值的构造方法
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){//返回面积
        return width * height;
    }
    public double getPerimeter(){//返回周长
        return (width + height) * 2;
    }
    public boolean contains(double x, double y){//判断点是否在矩形内
        return x > this.x - width / 2 && x < this.x + width / 2
                && y > this.y - height / 2 && y < this.y + height / 2;
    }
    public boolean contains(MyRectangle2D r){//判断矩形是否在矩形内
        //判断四个点是否都在矩形内
        double x = r.x;
        double y = r.y;
        double wid = r.getWidth() / 2;
        double len = r.getHeight() / 2;
        return r.contains(x - wid, y+len) //左上角
                && r.contains(x - wid, y - len)//左下角
                && r.contains(x + wid, y + len)//右上角
                && r.contains(x + wid, y - len);//右下角

    }
    public boolean overlaps(MyRectangle2D r){
        //判断四个点是否都在矩形内
        double x = r.x;
        double y = r.y;
        double wid = r.getWidth() / 2;
        double len = r.getHeight() / 2;
        return (r.contains(x - wid, y+len) //左上角
                || r.contains(x - wid, y - len)//左下角
                || r.contains(x + wid, y + len)//右上角
                || r.contains(x + wid, y - len)) //右下角
                && !(r.overlaps(r));
    }
}

public class Exercise01 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(40, 4);
        System.out.println(rectangle1.width + " " + rectangle1.height + " "
                + rectangle1.getArea() + " " + rectangle1.getPerimeter());
        Rectangle rectangle2 = new Rectangle(35.9, 3.5);
        System.out.println(rectangle2.width + " " + rectangle2.height + " "
                + rectangle2.getArea() + " " + rectangle2.getPerimeter());
    }
}
class Rectangle{
    double height = 1;
    double width = 1;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
    public double getArea(){
        return this.height * this.width;
    }
    public double getPerimeter(){
        return (this.height + this.width) * 2;
    }
}

package Experiment06.Exercise01;

public class GeometricObject {
    private String color = "white";     //形状颜色
    private boolean filled;     //是否填充
    private java.util.Date dateCreated; //对象创建的日期

    //无参构造器和有参构造器
    public GeometricObject() {
        dateCreated = new java.util.Date();
    }
    public GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    //颜色和填充的修改和获取方法
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    //日期的获取方法
    public java.util.Date getDateCreated() {
        return dateCreated;
    }
    //返回信息
    public String toString(){
        return "created on " + dateCreated + "\ncolor: " +
                " and filled: " + filled;
    }
}

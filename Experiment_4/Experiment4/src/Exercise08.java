public class Exercise08 {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println(fan1.toString());

        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan1.setRadius(5);
        fan1.setColor("blue");
        fan1.setOn(false);
        System.out.println(fan1.toString());
    }
}
class Fan{
    public static final int SLOW = 1;//风速
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed;//风速
    private boolean on;//开关
    private double radius;//半径
    String color;//风扇颜色

    //访问器和构造器
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //默认构造器
    public Fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";

    }
    //描述风扇的字符串
    public String toString(){
        if(on){
            return "速度为：" + speed + " 颜色为：" + color + " 半径为：" + radius;
        }else{
            return "fan is off" + " 颜色为：" + color + " 半径为：" + radius;
        }
    }
}

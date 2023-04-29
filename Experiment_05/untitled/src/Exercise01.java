
import java.util.Date;

public class Exercise01 {
    public static void main(String[] args) {
        Time time1 = new Time();
        Time time2 = new Time(555550000);

        System.out.println(time1.getHour() + "小时 " + time1.getMinute()
                + "分钟 " + time1.getSecond() + "秒");
        System.out.println(time2.getHour() + "小时 " + time2.getMinute()
                + "分钟 " + time2.getSecond() + "秒");

    }
}
class Time{
    private long hour;
    private long minute;
    private long second;

    public Time() {
        long t = System.currentTimeMillis() / 1000;
        second = t % 60;
        t /= 60;
        minute = t % 60;
        t /= 60;
        hour = t % 24;//用取余是因为还有天数
    }
    public Time(long elapseTime){
        setTime(elapseTime);
    }

    public Time(long hour, long minute, long second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    //get方法

    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }
    //设置时间，显示小时，分钟，和秒
    public void setTime(long elapseTime){
        second = elapseTime % 60;
        elapseTime /= 60;
        minute = elapseTime % 60;
        elapseTime /= 60;
        hour = elapseTime % 24;
    }
}


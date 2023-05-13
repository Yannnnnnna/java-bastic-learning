import java.util.Calendar;

public class Exercise12 {
    public static void main(String[] args) {
        MyDate myDate = new MyDate();
        System.out.println("年：" + myDate.getYear() + " 月：" + (myDate.getMonth() + 1) + " 日：" + myDate.getDay());
        MyDate myDate1 = new MyDate(34355555133101L);
        System.out.println("年：" + myDate1.getYear() + " 月：" + (myDate1.getMonth() + 1) + " 日：" + myDate1.getDay());
    }
}

class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {//当前日期
        Calendar calendar = Calendar.getInstance();
        this.year = calendar.get(Calendar.YEAR);
        this.month = calendar.get(Calendar.MONTH);
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
    }
    public MyDate(long elapsedTime) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(elapsedTime);
        this.year = calendar.get(Calendar.YEAR);
        this.month = calendar.get(Calendar.MONTH);
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(long elapsedTime) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(elapsedTime);
        this.year = calendar.get(Calendar.YEAR);
        this.month = calendar.get(Calendar.MONTH); // 月份从0开始
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
    }
}
//实现年月日的代码
/*public class MyDate {
    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;
    private int second;

    public MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setDate(long elapsedTime) {
        // 将毫秒数转换为秒数
        long seconds = elapsedTime / 1000;

        // 计算秒数对应的时间
        second = (int) (seconds % 60);
        seconds /= 60;
        minute = (int) (seconds % 60);
        seconds /= 60;
        hour = (int) (seconds % 24);
        seconds /= 24;

        // 计算日期
        int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        int totalDays = (int) seconds;
        int y = 1970;
        while (true) {
            int daysOfYear = 365;
            if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
                daysOfYear = 366;
            }
            if (totalDays >= daysOfYear) {
                totalDays -= daysOfYear;
                y++;
            } else {
                break;
            }
        }
        year = y;

        int m = 0;
        for (int i = 0; i < 12; i++) {
            int daysInThisMonth = daysInMonth[i];
            if (i == 1 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
                daysInThisMonth = 29;
            }
            if (totalDays >= daysInThisMonth) {
                totalDays -= daysInThisMonth;
                m++;
            } else {
                break;
            }
        }
        month = m;

        day = totalDays + 1; // 注意日期从1开始计数
    }
}*/

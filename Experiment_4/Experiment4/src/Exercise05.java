import java.util.GregorianCalendar;

public class Exercise05 {
    public static void main(String[] args) {
        //当前的时间
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        int year = gregorianCalendar.get(GregorianCalendar.YEAR);
        int month = gregorianCalendar.get(GregorianCalendar.MONTH) + 1;
        int day = gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH);
        System.out.println(year + "年" + month + "月" + day + "日");
        //改变后的时间
        gregorianCalendar.setTimeInMillis(1234567898765L);
         year = gregorianCalendar.get(GregorianCalendar.YEAR);
         month = gregorianCalendar.get(GregorianCalendar.MONTH) + 1;
         day = gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH);
        System.out.println(year + "年" + month + "月" + day + "日");

    }
}

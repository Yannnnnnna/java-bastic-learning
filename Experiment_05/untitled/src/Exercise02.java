public class Exercise02 {
    public static void main(String[] args) {
        MyInteger myInteger1 = new MyInteger(24);
        System.out.println(myInteger1.getValue() + "是否为偶数：" + myInteger1.isEven()
                + " 是否为奇数：" + myInteger1.isOdd() + " 是否为素数: " + myInteger1.isPrime());

        int num = 23;
        System.out.println(num + "是否为偶数：" + MyInteger.isEven(num)
                + " 是否为奇数：" + MyInteger.isOdd(num) + " 是否为素数: " + MyInteger.isPrime(num));

        MyInteger myInteger2 = new MyInteger(55);
        System.out.println(myInteger2.getValue() + "是否为偶数：" + MyInteger.isEven(myInteger2)
                + " 是否为奇数：" + MyInteger.isOdd(myInteger2) + " 是否为素数: " + MyInteger.isPrime(myInteger2));

        //值相等
        MyInteger myInteger3 = new MyInteger(34);
        System.out.println(myInteger3.equal(num) + " " + myInteger3.equal(myInteger2));
        //转换
        char []ch = {'0', '1','2','3'};
        String str = "1234";
        System.out.println(MyInteger.parseInt(ch));
        System.out.println(MyInteger.parseInt(str));
    }
}

class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return (value % 2 == 0) ? true : false;
    }

    public boolean isOdd() {
        return (value % 2 == 1) ? true : false;
    }

    public boolean isPrime() {
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(int value) {
        return (value % 2 == 0) ? true : false;
    }

    public static boolean isOdd(int value) {
        return (value % 2 == 1) ? true : false;
    }

    public static boolean isPrime(int value) {
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(MyInteger myInteger) {
        return (myInteger.value % 2 == 0) ? true : false;
    }

    public static boolean isOdd(MyInteger myInteger) {
        return (myInteger.value % 2 == 1) ? true : false;
    }

    public static boolean isPrime(MyInteger myInteger) {
        for (int i = 2; i <= Math.sqrt(myInteger.value); i++) {
            if (myInteger.value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean equal(int n) {
        return this.value == n;
    }

    public boolean equal(MyInteger myInteger) {
        return myInteger.value == this.value;
    }

    public static int parseInt(char[] arr) {
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            str += arr[i];
        }
        return parseInt(str);
    }

    public static int parseInt(String str) {
        int result = 0;
        char ch = '0';
        for (int i = 0; i < str.length(); i++) {
            result = result * 10 + (str.charAt(i) - ch);
        }
        return result;
    }
}
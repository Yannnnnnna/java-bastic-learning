public class Exercise20 {
    public static void main(String[] args) {

    }
}

class MyString {
    public char[] chars;

    public MyString(char[] chars) {
         this.chars= new char[chars.length];
        System.arraycopy(chars, 0, this.chars, 0, chars.length);
    }

    public char charAt(int index) {
        return chars[index];
    }

    public int length() {
        return chars.length;
    }

    public MyString substring(int begin, int end) {
        int length = end - begin;
        char[] result = new char[length];
        System.arraycopy(chars, begin, result, 0, end - begin);
        return new MyString(result);
    }

    public MyString toLowercase() {
        char[] low = new char[chars.length];
        System.arraycopy(low, 0, chars, 0, chars.length);
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                low[i] += 32;
            }
        }
        return new MyString(low);
    }

    public boolean equals(MyString s) {

        if (s == null || chars.length != s.length()) {
            return false;
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != s.chars[i]) {
                return false;
            }
        }
        return true;
    }
    public static MyString valueOf(int i){
        if (i == 0) {
            return new MyString(new char[]{'0'});
        }
        boolean isNegative = false;
        if (i < 0) {
            isNegative = true;
            i = -i;
        }
        boolean negative = false;
        if (i < 0) {
            negative = true;
            i = -i;
        }
        int temp = i;
        int length = 0;
        //判断是几位数
        while (temp > 0) {
            length++;
            temp /= 10;
        }
        //按照位数创建数组，将值倒叙输入
        char[] digits = new char[length];
        for (int j = length - 1; j >= 0; j--) {
            digits[j] = (char) ('0' + (i % 10));
            i /= 10;
        }
        //如果是负数，在开头添加负号
        if (negative) {
            char[] result = new char[length + 1];
            result[0] = '-';
            System.arraycopy(digits, 0, result, 1, length);
            return new MyString(result);
        } else {
            return new MyString(digits);
        }
    }


}

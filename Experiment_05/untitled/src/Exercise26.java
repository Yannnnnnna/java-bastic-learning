public class Exercise26 {
    public static void main(String[] args) {

    }
}
class MyStringBuilder2{
    char []value;
    int count;

    public MyStringBuilder2() {
        value = new char[16];
        count = 0;
    }
    public MyStringBuilder2(char[] chars){
        value = chars;
        count = chars.length;
    }
    public MyStringBuilder2(String s){
        value = new char[count + s.length()];
        count = s.length();
        System.arraycopy(value, 0, s.toCharArray(), 0, count);
    }
    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s){
        /*在指定位置插入另一个字符串。首先确保 value 数组足够容纳插入的字符串，
        然后将 value 中 offset 之后的字符向后移动 s.length() 个位置，
        最后将 s 复制到 value 中 offset 的位置，更新 count 并返回当前实例。*/
        if(s.length() + count > value.length){
            expandCapacity(s.length() + count);
        }
        System.arraycopy(value, offset, value, offset + s.length(), s.length());
        System.arraycopy(s.value, 0, value, offset, s.length());
        return this;
    }
    public MyStringBuilder2 reverse(){
        char temp = 'a';
        for (int i = 0, j = count - 1; i < j; i++, j--) {
            temp = value[i];
            value[i] = value[j];
            value[j] = temp;
        }
        return this;
    }
    public MyStringBuilder2 subString(int begin){
        char[] subString = new char[count - begin];
        System.arraycopy(value, begin, subString ,0, subString.length);
        return new MyStringBuilder2(subString.toString());
    }
    public MyStringBuilder2 toUpperCase(){
        char[] chars = new char[count];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = Character.toUpperCase(value[i]);
        }
        return new MyStringBuilder2(chars.toString());
    }
    public int length(){
        return count;
    }
    private void expandCapacity(int minlength) {
        int len = count * 2 + 2;
        if (len < minlength) {
            len = minlength;
        }
        char[] newTemp = new char[len];
        System.arraycopy(newTemp, count, value, 0, count);
        count = newTemp.length;
        value = newTemp;

    }
}

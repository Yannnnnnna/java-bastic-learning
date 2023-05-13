public class Exercise25 {
    public static void main(String[] args) {

    }
}

class MyStringBuilder1 {
    char[] temp;
    int count;

    public MyStringBuilder1(String s) {
        temp = new char[count + s.length()];
        count = s.length();
        System.arraycopy(temp, 0, s.toCharArray(), 0, count);

    }

    public int length() {
        return count;
    }

    public MyStringBuilder1 append(MyStringBuilder1 s) {
        int newLength = s.length() + count;
        if (newLength > temp.length) {
            expandCapacity(newLength);
        }
        System.arraycopy(s.temp, 0, temp, count, s.length());
        count += s.length();
        return this;//来返回当前对象的引用
    }

    public MyStringBuilder1 append(int i) {
        String str = Integer.toString(i);
        int len = str.length();
        if (count + len > temp.length) {
            expandCapacity(count + len);
        }
        System.arraycopy(str.toCharArray(), 0, temp, count, len);
        //str.getChars(0, len, value, count);
        return this;
    }
    public char charAt(int index){
        return temp[index];
    }
    public MyStringBuilder1 toLowerCase(){

        String str = "";
        for (int i = 0; i < count; i++) {
            str += Character.toLowerCase(temp[i]);
        }
        MyStringBuilder1 toLower = new MyStringBuilder1(str);
        return toLower;
    }
    public MyStringBuilder1 subString(int begin,int end){
        String str = "";
        for (int i = begin; i <= end ; i++) {
            str += temp[i];
        }
        return  new MyStringBuilder1(str);
    }
    public String toString(){
        return String.valueOf(temp);
    }


    private void expandCapacity(int minlength) {
        int len = count * 2 + 2;
        if (len < minlength) {
            len = minlength;
        }
        char[] newTemp = new char[len];
        System.arraycopy(newTemp, count, temp, 0, count);
        count = newTemp.length;
        temp = newTemp;

    }
}

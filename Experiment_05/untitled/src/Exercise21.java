public class Exercise21 {
    public static void main(String[] args) {

    }
}
class MyString2{
    public String value;
    public MyString2(String s){
        this.value = s;
    }
    public int compare(String s){
        //先判断每个字符是不是一样，不一样返回这两个字符的差值
        int length;
        if(s.length() > value.length()){
            length = value.length();
        }else{
            length = s.length();
        }
        for (int i = 0; i < length; i++) {
            if(value.charAt(i) != s.charAt(i)){
                return value.charAt(i) - s.charAt(i);
            }
        }
        return value.length() - s.length();
    }
    public MyString2 subString(int begin){
        String str = "";
        for (int i = begin; i < value.length(); i++) {
            str += value.charAt(i);
        }
        return new MyString2(str);
    }
    public MyString2 toUpperCase(){
        String str = "";
        for (int i = 0; i < value.length(); i++) {
            char ch = value.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                str += ch - 32;
            }
            str += ch;
        }
        return new MyString2(str);
    }
    public char[] toChars(){
        char[] ch = new char[value.length()];
        for (int i = 0; i < ch.length; i++) {
            ch[i] = value.charAt(i);
        }
        return ch;
    }
    public static MyString2 valueOf(boolean b){
        String s = "";
        if(b){
            s = "true";
        }else {
            s = "false";
        }
        return new MyString2(s);
    }
}
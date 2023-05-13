public class Exercise22 {
    public static void main(String[] args) {

    }
}

class MyCharacter {
    char ch;

    public MyCharacter(char ch) {
        this.ch = ch;
    }

    public boolean isLetter() {
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isDigit(){
        if(ch >= '0' && ch <= '9'){
            return true;
        }else {
            return false;
        }
    }
    public boolean isWhitespace(){
        int num = (int)ch;
        return num == 32 || num == 9 || num == 10 || num == 13;
    }
    public boolean isUpperCase(){
        return ch >= 'A' && ch <= 'Z';
    }
    public boolean isLowerCase(){
        return ch >= 'a' && ch <= 'z';
    }
    public static char toUpperCase(char ch){
        return (char)(ch - 32);
    }
    public static char toLowerCase(char ch){
        return (char)(ch + 32);
    }
    public static String toString(char ch){
        String s = "" + ch;
        return s;
    }
}

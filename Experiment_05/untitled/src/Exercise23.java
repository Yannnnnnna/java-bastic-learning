public class Exercise23 {
    public static void main(String[] args) {
        String s = "apple,banana,orange";
        String[] str = split(s, ",");
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }

    }
    public static  String[] split(String s, String regex){
        int count= 1;
        int index = 0;
        //查找从指定位置第一个目标风格符出现的位子
        while ((index = s.indexOf(regex,index)) != -1){
            count++;
            index += regex.length();//更新index以便下一次查找
        }
        String[] str = new String[count + count - 1];
        count = 0;
        index = 0;
        while (index < s.length()){
            int nextIndex = s.indexOf(regex, index);
            if(nextIndex == -1){
                nextIndex = s.length() - 1;
            }
            str[count] = s.substring(index, nextIndex);//储存子串
            count++;//str[count++]先使用再++
            if(count < str.length - 1){
                str[count] = regex;
                count++;
            }

            index = nextIndex + regex.length();//从下一个分割符开始查找

        }
        return str;
    }
}

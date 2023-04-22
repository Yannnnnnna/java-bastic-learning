import java.util.Arrays;
import java.util.Scanner;

//游戏：猜字游戏
public class Exercise25 {
    public static void main(String[] args) {
        String[] questionBank = {"ability", "cake", "women", "may", "feel", "insecure", "troubled", "about", "appearance"};
        //随机产生一个单词
        int random = (int) (Math.random() * questionBank.length);
        char[] word = questionBank[random].toCharArray();//将字符串转化位字符数组
        //创建一个人储存*号的数组
        char[] star = new char[word.length];
        //初始化
        Arrays.fill(star, '*');

        //调用猜测函数
        guess(star, word);
    }

    public static void guess(char[] star, char[] word) {
        int count = 0;
        while(!isIdentical(star, word, count)){
            //输入猜测的数字
            System.out.print("(Guess) Enter a litter in word ");
            print(star);
            System.out.print(" >");
            Scanner input = new Scanner(System.in);
            char litter = input.next().charAt(0);
            //判断输入是否在单词内并对错误进行计数
            int num = isInWord(star, word, litter, count);
            if(num != -1){
                count = num;
            }
        }

    }
    //打印结果
    public static void print(char[] star){
        for (int i = 0; i < star.length; i++) {
            System.out.print(star[i]);
        }
    }

    //判断输入的数字是否在单词中，是的话就显示出来
    public static int isInWord(char[] star, char[] word, char guess, int count) {
        boolean bool = false;
        //判断字母是否已经显示出来了
        for (int i = 0; i < star.length; i++) {
            if (guess == star[i]) {
                System.out.println(guess + " is already in the word");
                return -1;
            }
        }
        //判断是否猜中 将猜中的数字赋给*对应的位置
        for (int i = 0; i < word.length; i++) {
            if (guess == word[i]) {
                bool = true;
                star[i] = guess;
            }
        }
        //没猜中，错误次数加一，输出猜错
        if (!bool) {
            count++;
            System.out.println(guess + "is not in the word.");
        }
        return count;
    }
    //判断是否全部猜出来了
    public static boolean isIdentical(char[] star, char[] word, int count){
        for (int i = 0; i < star.length; i++) {
            if(star[i] != word[i]){
                return false;
            }
        }
        System.out.print("The word is ");
        print(star);
        System.out.printf(". You missed %d time.", count);
        return true;
    }
}

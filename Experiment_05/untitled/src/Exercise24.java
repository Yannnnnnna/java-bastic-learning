import java.util.Scanner;

public class Exercise24 {
    public static void main(String[] args) {
        System.out.println("请输入算式：");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        calculator(s);
    }

    public static void calculator(String s) {
        //字符串查找' '
        String[] arr = {"", "", ""};

        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                arr[1] = String.valueOf(ch);
                index = i;
                break;
            }
        }

        for (int i = 0; i < s.length(); i++) {

            if (Character.isDigit(s.charAt(i)) && i < index){
                arr[0] += s.charAt(i);
            } else if (Character.isDigit(s.charAt(i)) && i > index) {
                arr[2] += s.charAt(i);
            }
        }
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[2]);
        int result = 0;
        switch (arr[1]) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
        }
        System.out.printf("%d %s %d = %d\n", a, arr[1], b, result);
    }
}

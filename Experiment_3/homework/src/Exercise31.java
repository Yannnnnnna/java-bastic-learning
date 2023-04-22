import java.util.Scanner;

//四子连
public class Exercise31 {
    public static void main(String[] args) {
        //初始化数组
        char[][] arr = new char[6][7];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = ' ';
            }
        }
        print(arr);
        while (true) {
            playChess(arr, 'R');
            if(isWin(arr, 'R') != 'C'){
                break;
            }
            playChess(arr, 'Y');
            if(isWin(arr, 'Y') != 'C'){
                break;
            }
        }

    }

    //打印棋盘
    public static void print(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("|");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println("---------------");
    }

    //下棋
    public static void playChess(char[][] arr, char player) {
        Scanner input = new Scanner(System.in);
        if (player == 'R') {
            while (true) {
                System.out.println("Drop a red disk at column (0-6):");
                int choice = input.nextInt();
                if (play(arr, choice, 'R')) {
                    print(arr);
                    break;
                }
            }

        } else if (player == 'Y') {
            while (true) {
                System.out.println("Drop a yellow disk at column (0-6):");
                int choice = input.nextInt();
                if (play(arr, choice, 'Y')) {
                    print(arr);
                    break;
                }
            }

        }


    }

    //判断加下棋
    public static boolean play(char[][] arr, int column, char player) {
        boolean bool = false;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i][column] == ' ') {
                arr[i][column] = player;
                bool = true;
                return true;
            }
        }
        if (!bool) {
            System.out.println("这个柱子已满，请重新输入");
        }
        return false;
    }

    //判断输赢
    public static char isWin(char[][] arr, char player) {
        //先判断行
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < arr.length - 4; j++) {
                if (arr[i][j] == arr[i][j + 1] && arr[i][j + 1] == arr[i][j + 2]
                        && arr[i][j + 2] == arr[i][j + 3] && arr[i][j] != ' ') {
                    System.out.println(player + "赢");
                    return player;
                }
            }
        }
        //判断列
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length - 4; j++) {
                if (arr[j][i] == arr[j + 1][i] && arr[j + 1][i] == arr[j + 2][i]
                        && arr[j + 2][i] == arr[j + 3][i] && arr[j][i] != ' ') {
                    System.out.println(player + "赢");
                    return player;
                }
            }
        }
        //判断对角线
        for (int i = arr.length - 1; i >= arr.length -(arr.length - 4); i--) {
            for (int j = 0; j <= arr[i].length - 4; j++) {
                if (arr[i][j] == arr[i - 1][j + 1] && arr[i - 1][j + 1] == arr[i - 2][j + 2]
                        && arr[i - 2][j + 2] == arr[i - 3][j + 3] && arr[i][j] != ' '){
                    System.out.println(player + "赢");
                    print(arr);
                    return player;
                }
            }
        }
        for (int i = arr.length - 1; i >=arr.length -(arr.length - 4); i--) {
            for (int j = arr[i].length -1; j >= arr[i].length - 4; j--) {
                if (arr[i][j] == arr[i - 1][j - 1] && arr[i - 1][j - 1] == arr[i - 2][j - 2]
                        && arr[i - 2][j - 2] == arr[i - 3][j - 3] && arr[i][j] != ' '){
                    System.out.println(player + "赢");
                    print(arr);
                    return player;
                }
            }
        }
        if(isFull(arr)){
            System.out.println("平局");
            print(arr);
            return 'Q';
        }
        return 'C';
    }
    public static boolean isFull(char [][]arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == ' '){
                    return false;
                }
            }
        }
        return true;
    }
}

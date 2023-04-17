//游戏：豆机
/*
    1.随机数产生0~1，0代表左边，1代表右边
    2.创建一个变量记录有几个格子（需要下落的次数=格子减一），和豆子的个数

*/

import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入小球的个数：");
        int num_ball = input.nextInt();
        System.out.println("请输入格子数：");
        int bean_machine = input.nextInt();
        //记录小球下落的情况
        String[] ball = new String[num_ball];
        for (int i = 0; i < ball.length; i++) {
            ball[i] = "";
            for (int j = 0; j < bean_machine - 1; j++) {
                ball[i] += random();

            }
        }
        //输出小球下落的情况
        for (int i = 0; i < ball.length; i++) {
            System.out.println(ball[i]);
        }
        //输出小球在箱子里的情况
        int slots[] = ballInMachine(ball, bean_machine);
        for (int i = 0; i < slots.length; i++) {
            System.out.print(slots[i]);

        }
        //打印小球
        print(slots, num_ball, bean_machine);
    }

    //产生随机L和R
    public static char random() {
        int dir = (int) (Math.random() * 2);
        if (dir == 1) {
            return 'R';
        } else {
            return 'L';
        }
    }

    //统计小球落入箱子的情况
    public static int[] ballInMachine(String[] ball, int bean_machine) {
        int slots[] = new int[bean_machine];
        //记录每个小球落入箱子的情况
        for (int i = 0; i < ball.length; i++) {
            int count = 0;
            for (int j = 0; j < slots.length - 1; j++) {
                if (ball[i].charAt(j) == 'R') {
                    count++;
                }

            }
            slots[count]++;
        }
        return slots;
    }

    //打印小球在箱子里的情况
    public static void print(int[] slots, int num_ball, int bean_machine) {
        char[][] print = new char[num_ball][bean_machine];
        for (int i = 0; i < bean_machine - 1; i++) {
            if (slots[i] != 0) {
                for (int j = num_ball - 1; j >= num_ball - slots[i]; j--) {
                    print[j][i] = '0';
                }
            } else {
                for (int j = 0; j < num_ball; j++) {
                    print[j][i] = ' ';
                }
            }
        }

        for (int i = 0; i < num_ball; i++) {
            for (int j = 0; j < bean_machine; j++) {
                System.out.print(print[i][j]);
            }
            System.out.println();
        }
    }
}

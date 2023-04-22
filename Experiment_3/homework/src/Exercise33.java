import java.util.Scanner;

//严格相同的数组
public class Exercise33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][]m1 = new int[3][3];
        int [][]m2 = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m1[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m2[i][j] = input.nextInt();


            }
        }
        if(equals(m1, m2)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }

    public static boolean equals(int[][] m1, int[][] m2) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (m1[i][j] != m2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}

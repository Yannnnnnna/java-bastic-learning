import java.util.Scanner;

//最大块
public class Exercise35 {
    public static void main(String[] args) {
        //输入matrix的宽度
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows in the matrix: ");
        int row = input.nextInt();
        //输入数组数据
        System.out.println("Enter the matrix row by row: ");
        int[][] matrix = new int[row][row];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        int[] result = findLargestBlock(matrix);
        System.out.printf("The maximum square submatrix is at (%d, %d) with size %d",
                result[0], result[1], result[2]);


    }

    public static int[] findLargestBlock(int[][] m) {
        int[] arr = new int[3];
        for (int square_Length = m.length;  square_Length > 0; square_Length--) {
            for (int j = 0; j < m.length - square_Length; j++) {
                for (int k = 0; k < m.length - square_Length; k++) {
                    if (isSquare(m, j, k, square_Length)) {
                        arr[0] = j;
                        arr[1] = k;
                        arr[2] = square_Length;
                       return arr;
                    }
                }
            }
        }
        return arr;
    }

    public static boolean isSquare(int[][] matrix, int a, int b, int length) {
        for (int i = a; i < a + length; i++) {
            for (int j = b; j < b + length; j++) {
                if (matrix[i][j] != 1) {
                    return false;
                }
            }
        }
        return true;
    }
}

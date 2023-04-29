import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in the array:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double[][] arr = new double[a][b];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scanner.nextDouble();
            }
        }
        Location location = Location.locateLargest(arr);
        System.out.printf("The location of the largest element is %.2f at (%d , %d)",
                location.maxValue , location.row, location.column);
    }
}

class Location {
    public int row;
    public int column;
    public double maxValue;

    public Location() {

    }

    public Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    //编写方法返回二维数组中的最大值
    public static Location locateLargest(double[][] a) {
        int maxRow = 0;
        int maxColumn = 0;
        double maxValue = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > maxValue) {
                    maxValue = a[i][j];
                    maxRow = i;
                    maxColumn = j;
                }
            }
        }
        return new Location(maxRow, maxColumn, maxValue);
    }

}

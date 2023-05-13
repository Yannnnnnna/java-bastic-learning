import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter five points: ");
        double[][] point = new double[5][2];
        for (int i = 0; i < point.length; i++) {
            for (int j = 0; j < point[i].length; j++) {
                point[i][j] = scanner.nextDouble();
            }
        }
        MyRectangle2D r = getRectangle(point);
        System.out.printf("The bounding rectangle's center (%.2f, %.2f), width %.2f, height %.2f\n",
                r.x, r.y, r.getWidth(), r.getHeight());

    }

    public static MyRectangle2D getRectangle(double[][] point) {
        double widMin = point[0][0];
        double widMax = point[0][0];
        for (int i = 0; i < point.length; i++) {
            if (point[i][0] < widMin) widMin = point[i][0];
            if (point[i][0] > widMax) widMax = point[i][0];
        }
        double width = Math.abs(widMax - widMin);

        double higMin = point[0][1];
        double higMax = point[0][1];
        for (int i = 0; i < point.length; i++) {
            if (point[i][1] < higMin) higMin = point[i][1];
            if (point[i][1] > higMax) higMax = point[i][1];
        }
        double height = Math.abs(higMax - higMin);
        double x = 0.5 * (widMax + widMin);
        double y = 0.5 * (higMax + higMin);
        return new MyRectangle2D(x, y, width, height);
    }
}

import java.math.BigDecimal;
import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = scanner.nextInt();
        BigDecimal e = new BigDecimal("1");
        for (int i = 1; i <= n; i++) {
            e = e.add(BigDecimal.ONE.divide(factorial(i), 25, BigDecimal.ROUND_HALF_UP));
        }
        System.out.println(e);


    }
    public static BigDecimal factorial(long n ){
        BigDecimal result = BigDecimal.ONE;
        for (long i = 1; i <= n; i++) {
            result = result.multiply(new BigDecimal(i + ""));

        }
        return result;
    }
}

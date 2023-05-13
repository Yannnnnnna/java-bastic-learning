import java.math.BigInteger;

public class Exercise17 {
    public static void main(String[] args) {
        BigInteger two = BigInteger.valueOf(2);
        for (int i = 2; i <= 100; i++) {
            if(isPrimeMin(i)){
                if(isPrimeMin(i)){
                    System.out.printf("%d\t\t", i);
                    System.out.println(two.pow(i).subtract(BigInteger.ONE));
                }
            }
        }
    }
    public static boolean isPrime(int n){
        BigInteger two = BigInteger.valueOf(2);
        return ((two.pow(n)).subtract(BigInteger.ONE)).isProbablePrime(100);
    }
    public static boolean isPrimeMin(int n){
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
